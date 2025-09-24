#include "ExprBaseVisitor.h" 
#include "../CompilerResultsHandler.h"
#include <string>
#include <vector>
#include <unordered_map>
#include <any> 
#include <iostream> 

using namespace antlr_generated;
using namespace antlr4;
using namespace std;

enum LangType {
    INT_TYPE, BOOL_TYPE, DOUBLE_TYPE, STRING_TYPE,
    INVALID_TYPE
};


struct Symbol {
    string name;  
    LangType type;  
    size_t lineDefined;
    
    Symbol() = default; 

    Symbol(string name, LangType type, size_t line)
        : name(move(name)), type(type), lineDefined(line) {}
};

class SemanticAnalyzer : public ExprBaseVisitor {
private:
    vector<unordered_map<string, Symbol>> scopes;
    CompilerResultsHandler& resultsHandler;
        
    

    void enterScope() { scopes.emplace_back(); }
    void exitScope() { if (!scopes.empty()) scopes.pop_back(); }

    bool addSymbol(const Symbol& symbol) {


        if (scopes.empty()) return false;
        
        auto& currentScope = scopes.back();

        
        if (currentScope.count(symbol.name)) {
            return false; 
        }
        currentScope[symbol.name] = symbol; 
        resultsHandler.addSymbol(symbol.name, typeToString(symbol.type), symbol.lineDefined);
        return true;
    }
    
     Symbol* getSymbol(string name) { 
        for (int i = scopes.size() - 1; i >= 0; --i) {
             auto& scope = scopes[i];
            auto it = scope.find(name);
            if (it != scope.end()) {
                return &(it->second);
            }
        }
        return nullptr;
    }
    


    string typeToString(LangType type) {
        switch (type) {
            case LangType::INT_TYPE:    return "صحيح";
            case LangType::DOUBLE_TYPE: return "عشري";
            case LangType::BOOL_TYPE:   return "منطقي";
            case LangType::STRING_TYPE: return "نص"; 
            default:                    return "unknown";
        }
    }

    void reportError(Token* token,  string message) {
        size_t line = token->getLine();
        size_t charPositionInLine = token->getCharPositionInLine();
        string fullMessage = "Semantic Error (Line " + to_string(line) + ":" +
                                  to_string(charPositionInLine) + "): " + message;
        resultsHandler.addError(fullMessage);
    }
    void reportError(ParserRuleContext* ctx,  string message) {
        reportError(ctx->start, message);
    }
    

    LangType getTypeEnum(ExprParser::TypeContext* ctx) {
        if (ctx->KW_INT()) return LangType::INT_TYPE;
        if (ctx->KW_DOUBLE()) return LangType::DOUBLE_TYPE;
        if (ctx->KW_BOOL()) return LangType::BOOL_TYPE;
        if (ctx->KW_STRING()) return LangType::STRING_TYPE;
        return LangType::INVALID_TYPE; 
    }
    
    bool isTypeCompatible(LangType expected, LangType actual) {
        if (expected == actual) return true;
        if (expected == LangType::DOUBLE_TYPE && actual == LangType::INT_TYPE) return true; 
        return false;
    }

    LangType getArithmeticResultType(LangType type1, LangType type2) {
        if (type1 == INVALID_TYPE || type2 == INVALID_TYPE) return INVALID_TYPE;
        if (type1 == DOUBLE_TYPE || type2 == DOUBLE_TYPE) return DOUBLE_TYPE;
        if (type1 == INT_TYPE && type2 == INT_TYPE) return INT_TYPE;
        return INVALID_TYPE;
    }

public:
    SemanticAnalyzer() : resultsHandler(CompilerResultsHandler::getInstance()) {
        enterScope();
    }

    
    any visitProgram(ExprParser::ProgramContext* ctx) override {
        return visitChildren(ctx);
    }

    
    any visitCompoundStatement(ExprParser::CompoundStatementContext* ctx) override {
        enterScope();
        visitChildren(ctx);
        exitScope();
        return {};
    }

    any visitVariableDeclaration(ExprParser::VariableDeclarationContext* ctx) override {
        
        LangType varType = getTypeEnum(ctx->type());
        string varName = ctx->ID()->getText();
        
        Symbol varSymbol(varName, varType, ctx->start->getLine());
        if (!addSymbol(varSymbol)) {
            reportError(ctx, "Variable '" + varName + "' redefinition in the current scope.");
            return {};
        }

        if (ctx->expression()) {
            LangType initializerType = any_cast<LangType>(visit(ctx->expression()));
            if (!isTypeCompatible(varType, initializerType)) {
                reportError(ctx, "Type mismatch for variable '" + varName + "'. Expected '" + typeToString(varType) + "', got '" + typeToString(initializerType) + "'.");
            }
        }
        return {};
    }

    
    any visitIDCall(ExprParser::IDCallContext *ctx) override {
        string idName = ctx->ID()->getText();
        const Symbol* symbol = getSymbol(idName);

        if (!symbol) {
            reportError(ctx->ID()->getSymbol(), "Undeclared identifier '" + idName + "'.");
            return INVALID_TYPE;
        }
        return symbol->type; 
    }
    
    
    any visitAssignmentExpression(ExprParser::AssignmentExpressionContext* ctx) override {
        string varName = ctx->ID()->getText();
        const Symbol* varSymbol = getSymbol(varName); 

        if (!varSymbol) {
            reportError(ctx->ID()->getSymbol(), "Undeclared identifier '" + varName + "'.");
            return INVALID_TYPE;
        }

        LangType exprType = any_cast<LangType>(visit(ctx->expression()));
        if (!isTypeCompatible(varSymbol->type, exprType)) {
            reportError(ctx, "Type mismatch in assignment to '" + varName + "'. Expected '" + typeToString(varSymbol->type) + "', got '" + typeToString(exprType) + "'.");
        }
        return varSymbol->type;
    }
    
    
    any visitIntLiteral(ExprParser::IntLiteralContext* ctx) override { return LangType::INT_TYPE; }
    any visitDoubleLiteral(ExprParser::DoubleLiteralContext* ctx) override { return LangType::DOUBLE_TYPE; }
    any visitBoolLiteral(ExprParser::BoolLiteralContext* ctx) override { return LangType::BOOL_TYPE; }
    any visitStringLiteral(ExprParser::StringLiteralContext *ctx) override { return LangType::STRING_TYPE; }



    any visitParenthesizedExpression(ExprParser::ParenthesizedExpressionContext* ctx) override { return visit(ctx->expression()); }
    any visitLogicalOrExpression(ExprParser::LogicalOrExpressionContext* ctx) override {
        LangType type1 = any_cast<LangType>(visit(ctx->logicalAndExpression(0)));
        if (ctx->LOGICAL_OR().empty()) {
            return type1;
        }
        for (size_t i = 1; i < ctx->logicalAndExpression().size(); ++i) {
            LangType type2 = any_cast<LangType>(visit(ctx->logicalAndExpression(i)));
            if (type1 != BOOL_TYPE || type2 != BOOL_TYPE) {
                reportError(ctx, "Logical OR operator '||' can only be applied to 'bool' types. Got '" + typeToString(type1) + "' and '" + typeToString(type2) + "'.");
                return INVALID_TYPE;
            }
            type1 = BOOL_TYPE; 
        }
        return type1;
    }
    any visitLogicalAndExpression(ExprParser::LogicalAndExpressionContext* ctx) override {
        LangType type1 = any_cast<LangType>(visit(ctx->equalityExpression(0)));
        if (ctx->LOGICAL_AND().empty()) {
            return type1;
        }
        for (size_t i = 1; i < ctx->equalityExpression().size(); ++i) {
            LangType type2 = any_cast<LangType>(visit(ctx->equalityExpression(i)));
            if (type1 != BOOL_TYPE || type2 != BOOL_TYPE) {
                reportError(ctx, "Logical AND operator '&&' can only be applied to 'bool' types. Got '" + typeToString(type1) + "' and '" + typeToString(type2) + "'.");
                return INVALID_TYPE;
            }
            type1 = BOOL_TYPE;
        }
        return type1;
    }
    any visitEqualityExpression(ExprParser::EqualityExpressionContext* ctx) override { 
        LangType type1 = any_cast<LangType>(visit(ctx->relationalExpression(0)));
        if (ctx->EQ().empty() && ctx->NEQ().empty()) {
            return type1;
        }
        LangType finalType = BOOL_TYPE;
        for (size_t i = 1; i < ctx->relationalExpression().size(); ++i) {
            LangType type2 = any_cast<LangType>(visit(ctx->relationalExpression(i)));
            if (!isTypeCompatible(type1, type2) && !isTypeCompatible(type2, type1)) {
                reportError(ctx, "Type mismatch for equality operator. Cannot compare '" + typeToString(type1) + "' with '" + typeToString(type2) + "'.");
                finalType = INVALID_TYPE; 
            }
            type1 = type2;
        }
        return finalType;
    }
    any visitRelationalExpression(ExprParser::RelationalExpressionContext* ctx) override { 
        LangType type1 = any_cast<LangType>(visit(ctx->additiveExpression(0)));
        if (ctx->LT().empty() && ctx->GT().empty() && ctx->LE().empty() && ctx->GE().empty()) {
            return type1;
        }
        LangType finalType = BOOL_TYPE;
        for (size_t i = 1; i < ctx->additiveExpression().size(); ++i) {
            LangType type2 = any_cast<LangType>(visit(ctx->additiveExpression(i)));
            if (!((type1 == INT_TYPE || type1 == DOUBLE_TYPE) && (type2 == INT_TYPE || type2 == DOUBLE_TYPE))) {
                reportError(ctx, "Relational operator can only be applied to numeric types. Got '" + typeToString(type1) + "' and '" + typeToString(type2) + "'.");
                finalType = INVALID_TYPE;
            }
            type1 = type2;
        }
        return finalType;
    }
    any visitAdditiveExpression(ExprParser::AdditiveExpressionContext* ctx) override { /* No change needed */ 
        LangType resultType = any_cast<LangType>(visit(ctx->multiplicativeExpression(0)));
        if (ctx->ADD().empty() && ctx->SUB().empty()) {
            return resultType;
        }
        for (size_t i = 1; i < ctx->multiplicativeExpression().size(); ++i) {
            LangType nextType = any_cast<LangType>(visit(ctx->multiplicativeExpression(i)));
            resultType = getArithmeticResultType(resultType, nextType);
            if (resultType == INVALID_TYPE) {
                reportError(ctx, "Arithmetic operator can only be applied to numeric types.");
                return INVALID_TYPE;
            }
        }
        return resultType;
    }
    any visitMultiplicativeExpression(ExprParser::MultiplicativeExpressionContext* ctx) override { 
        LangType resultType = any_cast<LangType>(visit(ctx->unaryExpression(0)));
        if (ctx->MUL().empty() && ctx->DIV().empty() && ctx->MOD().empty()) {
            return resultType;
        }
        for (size_t i = 1; i < ctx->unaryExpression().size(); ++i) {
            LangType nextType = any_cast<LangType>(visit(ctx->unaryExpression(i)));
            if (ctx->MOD(i-1)) { 
                if (resultType != INT_TYPE || nextType != INT_TYPE) {
                    reportError(ctx, "Modulo operator '%' can only be applied to 'int' types.");
                    return INVALID_TYPE;
                }
            }
            resultType = getArithmeticResultType(resultType, nextType);
            if (resultType == INVALID_TYPE) {
                reportError(ctx, "Arithmetic operator can only be applied to numeric types.");
                return INVALID_TYPE;
            }
        }
        return resultType;
    }
    any visitUnaryOperation(ExprParser::UnaryOperationContext* ctx) override { 
        LangType operandType = any_cast<LangType>(visit(ctx->unaryExpression()));
        if (ctx->NOT()) {
            if (operandType != BOOL_TYPE) {
                reportError(ctx, "Logical NOT operator '!' can only be applied to 'bool' type. Got '" + typeToString(operandType) + "'.");
                return INVALID_TYPE;
            }
            return BOOL_TYPE;
        } else if (ctx->ADD() || ctx->SUB()) {
            if (!(operandType == INT_TYPE || operandType == DOUBLE_TYPE)) {
                reportError(ctx, "Unary '+' or '-' operator can only be applied to numeric types. Got '" + typeToString(operandType) + "'.");
                return INVALID_TYPE;
            }
            return operandType;
        }
        
        return INVALID_TYPE; 
    }
};

