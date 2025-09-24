
// Generated from d:/compilersLectures/lect4/grammer/Expr.g4 by ANTLR 4.13.1

#pragma once


#include "antlr4-runtime.h"
#include "ExprParser.h"


namespace antlr_generated {

/**
 * This class defines an abstract visitor for a parse tree
 * produced by ExprParser.
 */
class  ExprVisitor : public antlr4::tree::AbstractParseTreeVisitor {
public:

  /**
   * Visit parse trees produced by ExprParser.
   */
    virtual std::any visitProgram(ExprParser::ProgramContext *context) = 0;

    virtual std::any visitToplevelStatement(ExprParser::ToplevelStatementContext *context) = 0;

    virtual std::any visitDeclaration(ExprParser::DeclarationContext *context) = 0;

    virtual std::any visitFunctionDeclaration(ExprParser::FunctionDeclarationContext *context) = 0;

    virtual std::any visitParameterList(ExprParser::ParameterListContext *context) = 0;

    virtual std::any visitParameter(ExprParser::ParameterContext *context) = 0;

    virtual std::any visitType(ExprParser::TypeContext *context) = 0;

    virtual std::any visitCompoundStatement(ExprParser::CompoundStatementContext *context) = 0;

    virtual std::any visitVariableDeclStmt(ExprParser::VariableDeclStmtContext *context) = 0;

    virtual std::any visitExpressionStmt(ExprParser::ExpressionStmtContext *context) = 0;

    virtual std::any visitReturnStmt(ExprParser::ReturnStmtContext *context) = 0;

    virtual std::any visitIfStmt(ExprParser::IfStmtContext *context) = 0;

    virtual std::any visitWhileStmt(ExprParser::WhileStmtContext *context) = 0;

    virtual std::any visitCompoundStmt(ExprParser::CompoundStmtContext *context) = 0;

    virtual std::any visitVariableDeclaration(ExprParser::VariableDeclarationContext *context) = 0;

    virtual std::any visitReturnStatement(ExprParser::ReturnStatementContext *context) = 0;

    virtual std::any visitIfStatement(ExprParser::IfStatementContext *context) = 0;

    virtual std::any visitWhileStatement(ExprParser::WhileStatementContext *context) = 0;

    virtual std::any visitAssignmentExpression(ExprParser::AssignmentExpressionContext *context) = 0;

    virtual std::any visitLogicalOrExpr(ExprParser::LogicalOrExprContext *context) = 0;

    virtual std::any visitLogicalOrExpression(ExprParser::LogicalOrExpressionContext *context) = 0;

    virtual std::any visitLogicalAndExpression(ExprParser::LogicalAndExpressionContext *context) = 0;

    virtual std::any visitEqualityExpression(ExprParser::EqualityExpressionContext *context) = 0;

    virtual std::any visitRelationalExpression(ExprParser::RelationalExpressionContext *context) = 0;

    virtual std::any visitAdditiveExpression(ExprParser::AdditiveExpressionContext *context) = 0;

    virtual std::any visitMultiplicativeExpression(ExprParser::MultiplicativeExpressionContext *context) = 0;

    virtual std::any visitUnaryOperation(ExprParser::UnaryOperationContext *context) = 0;

    virtual std::any visitPrimaryExpr(ExprParser::PrimaryExprContext *context) = 0;

    virtual std::any visitIntLiteral(ExprParser::IntLiteralContext *context) = 0;

    virtual std::any visitDoubleLiteral(ExprParser::DoubleLiteralContext *context) = 0;

    virtual std::any visitBoolLiteralExpr(ExprParser::BoolLiteralExprContext *context) = 0;

    virtual std::any visitStringLiteral(ExprParser::StringLiteralContext *context) = 0;

    virtual std::any visitIDCall(ExprParser::IDCallContext *context) = 0;

    virtual std::any visitFunctIonCall(ExprParser::FunctIonCallContext *context) = 0;

    virtual std::any visitParenthesizedExpression(ExprParser::ParenthesizedExpressionContext *context) = 0;

    virtual std::any visitBoolLiteral(ExprParser::BoolLiteralContext *context) = 0;

    virtual std::any visitArgumentList(ExprParser::ArgumentListContext *context) = 0;


};

}  // namespace antlr_generated
