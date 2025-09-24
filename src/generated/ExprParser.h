
// Generated from d:/compilersLectures/lect4/grammer/Expr.g4 by ANTLR 4.13.1

#pragma once


#include "antlr4-runtime.h"


namespace antlr_generated {


class  ExprParser : public antlr4::Parser {
public:
  enum {
    KW_INT = 1, KW_DOUBLE = 2, KW_STRING = 3, KW_BOOL = 4, KW_VOID = 5, 
    KW_IF = 6, KW_ELSE = 7, KW_WHILE = 8, KW_RETURN = 9, KW_TRUE = 10, KW_FALSE = 11, 
    ADD = 12, SUB = 13, MUL = 14, DIV = 15, MOD = 16, ASSIGN = 17, EQ = 18, 
    NEQ = 19, LT = 20, GT = 21, LE = 22, GE = 23, LOGICAL_AND = 24, LOGICAL_OR = 25, 
    NOT = 26, SEMI = 27, COMMA = 28, OPEN_PAREN = 29, CLOSE_PAREN = 30, 
    OPEN_BRACE = 31, CLOSE_BRACE = 32, STRING_LITERAL = 33, ID = 34, INT_LITERAL = 35, 
    DOUBLE_LITERAL = 36, WS = 37, COMMENT = 38, MULTILINE_COMMENT = 39
  };

  enum {
    RuleProgram = 0, RuleToplevelStatement = 1, RuleDeclaration = 2, RuleFunctionDeclaration = 3, 
    RuleParameterList = 4, RuleParameter = 5, RuleType = 6, RuleCompoundStatement = 7, 
    RuleStatement = 8, RuleVariableDeclaration = 9, RuleReturnStatement = 10, 
    RuleIfStatement = 11, RuleWhileStatement = 12, RuleExpression = 13, 
    RuleLogicalOrExpression = 14, RuleLogicalAndExpression = 15, RuleEqualityExpression = 16, 
    RuleRelationalExpression = 17, RuleAdditiveExpression = 18, RuleMultiplicativeExpression = 19, 
    RuleUnaryExpression = 20, RulePrimaryExpression = 21, RuleBoolLiteral = 22, 
    RuleArgumentList = 23
  };

  explicit ExprParser(antlr4::TokenStream *input);

  ExprParser(antlr4::TokenStream *input, const antlr4::atn::ParserATNSimulatorOptions &options);

  ~ExprParser() override;

  std::string getGrammarFileName() const override;

  const antlr4::atn::ATN& getATN() const override;

  const std::vector<std::string>& getRuleNames() const override;

  const antlr4::dfa::Vocabulary& getVocabulary() const override;

  antlr4::atn::SerializedATNView getSerializedATN() const override;


  class ProgramContext;
  class ToplevelStatementContext;
  class DeclarationContext;
  class FunctionDeclarationContext;
  class ParameterListContext;
  class ParameterContext;
  class TypeContext;
  class CompoundStatementContext;
  class StatementContext;
  class VariableDeclarationContext;
  class ReturnStatementContext;
  class IfStatementContext;
  class WhileStatementContext;
  class ExpressionContext;
  class LogicalOrExpressionContext;
  class LogicalAndExpressionContext;
  class EqualityExpressionContext;
  class RelationalExpressionContext;
  class AdditiveExpressionContext;
  class MultiplicativeExpressionContext;
  class UnaryExpressionContext;
  class PrimaryExpressionContext;
  class BoolLiteralContext;
  class ArgumentListContext; 

  class  ProgramContext : public antlr4::ParserRuleContext {
  public:
    ProgramContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *EOF();
    std::vector<ToplevelStatementContext *> toplevelStatement();
    ToplevelStatementContext* toplevelStatement(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ProgramContext* program();

  class  ToplevelStatementContext : public antlr4::ParserRuleContext {
  public:
    ToplevelStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionDeclarationContext *functionDeclaration();
    StatementContext *statement();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ToplevelStatementContext* toplevelStatement();

  class  DeclarationContext : public antlr4::ParserRuleContext {
  public:
    DeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionDeclarationContext *functionDeclaration();
    VariableDeclarationContext *variableDeclaration();
    antlr4::tree::TerminalNode *SEMI();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  DeclarationContext* declaration();

  class  FunctionDeclarationContext : public antlr4::ParserRuleContext {
  public:
    FunctionDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TypeContext *type();
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *OPEN_PAREN();
    antlr4::tree::TerminalNode *CLOSE_PAREN();
    CompoundStatementContext *compoundStatement();
    ParameterListContext *parameterList();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionDeclarationContext* functionDeclaration();

  class  ParameterListContext : public antlr4::ParserRuleContext {
  public:
    ParameterListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ParameterContext *> parameter();
    ParameterContext* parameter(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ParameterListContext* parameterList();

  class  ParameterContext : public antlr4::ParserRuleContext {
  public:
    ParameterContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TypeContext *type();
    antlr4::tree::TerminalNode *ID();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ParameterContext* parameter();

  class  TypeContext : public antlr4::ParserRuleContext {
  public:
    TypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KW_INT();
    antlr4::tree::TerminalNode *KW_DOUBLE();
    antlr4::tree::TerminalNode *KW_BOOL();
    antlr4::tree::TerminalNode *KW_VOID();
    antlr4::tree::TerminalNode *KW_STRING();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeContext* type();

  class  CompoundStatementContext : public antlr4::ParserRuleContext {
  public:
    CompoundStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OPEN_BRACE();
    antlr4::tree::TerminalNode *CLOSE_BRACE();
    std::vector<StatementContext *> statement();
    StatementContext* statement(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CompoundStatementContext* compoundStatement();

  class  StatementContext : public antlr4::ParserRuleContext {
  public:
    StatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
   
    StatementContext() = default;
    void copyFrom(StatementContext *context);
    using antlr4::ParserRuleContext::copyFrom;

    virtual size_t getRuleIndex() const override;

   
  };

  class  IfStmtContext : public StatementContext {
  public:
    IfStmtContext(StatementContext *ctx);

    IfStatementContext *ifStatement();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  VariableDeclStmtContext : public StatementContext {
  public:
    VariableDeclStmtContext(StatementContext *ctx);

    VariableDeclarationContext *variableDeclaration();
    antlr4::tree::TerminalNode *SEMI();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  WhileStmtContext : public StatementContext {
  public:
    WhileStmtContext(StatementContext *ctx);

    WhileStatementContext *whileStatement();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  CompoundStmtContext : public StatementContext {
  public:
    CompoundStmtContext(StatementContext *ctx);

    CompoundStatementContext *compoundStatement();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  ReturnStmtContext : public StatementContext {
  public:
    ReturnStmtContext(StatementContext *ctx);

    ReturnStatementContext *returnStatement();
    antlr4::tree::TerminalNode *SEMI();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  ExpressionStmtContext : public StatementContext {
  public:
    ExpressionStmtContext(StatementContext *ctx);

    ExpressionContext *expression();
    antlr4::tree::TerminalNode *SEMI();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  StatementContext* statement();

  class  VariableDeclarationContext : public antlr4::ParserRuleContext {
  public:
    VariableDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TypeContext *type();
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *ASSIGN();
    ExpressionContext *expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableDeclarationContext* variableDeclaration();

  class  ReturnStatementContext : public antlr4::ParserRuleContext {
  public:
    ReturnStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KW_RETURN();
    ExpressionContext *expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ReturnStatementContext* returnStatement();

  class  IfStatementContext : public antlr4::ParserRuleContext {
  public:
    IfStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KW_IF();
    antlr4::tree::TerminalNode *OPEN_PAREN();
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *CLOSE_PAREN();
    std::vector<StatementContext *> statement();
    StatementContext* statement(size_t i);
    antlr4::tree::TerminalNode *KW_ELSE();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IfStatementContext* ifStatement();

  class  WhileStatementContext : public antlr4::ParserRuleContext {
  public:
    WhileStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KW_WHILE();
    antlr4::tree::TerminalNode *OPEN_PAREN();
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *CLOSE_PAREN();
    StatementContext *statement();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  WhileStatementContext* whileStatement();

  class  ExpressionContext : public antlr4::ParserRuleContext {
  public:
    ExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
   
    ExpressionContext() = default;
    void copyFrom(ExpressionContext *context);
    using antlr4::ParserRuleContext::copyFrom;

    virtual size_t getRuleIndex() const override;

   
  };

  class  LogicalOrExprContext : public ExpressionContext {
  public:
    LogicalOrExprContext(ExpressionContext *ctx);

    LogicalOrExpressionContext *logicalOrExpression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  AssignmentExpressionContext : public ExpressionContext {
  public:
    AssignmentExpressionContext(ExpressionContext *ctx);

    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *ASSIGN();
    ExpressionContext *expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  ExpressionContext* expression();

  class  LogicalOrExpressionContext : public antlr4::ParserRuleContext {
  public:
    LogicalOrExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<LogicalAndExpressionContext *> logicalAndExpression();
    LogicalAndExpressionContext* logicalAndExpression(size_t i);
    std::vector<antlr4::tree::TerminalNode *> LOGICAL_OR();
    antlr4::tree::TerminalNode* LOGICAL_OR(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LogicalOrExpressionContext* logicalOrExpression();

  class  LogicalAndExpressionContext : public antlr4::ParserRuleContext {
  public:
    LogicalAndExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<EqualityExpressionContext *> equalityExpression();
    EqualityExpressionContext* equalityExpression(size_t i);
    std::vector<antlr4::tree::TerminalNode *> LOGICAL_AND();
    antlr4::tree::TerminalNode* LOGICAL_AND(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LogicalAndExpressionContext* logicalAndExpression();

  class  EqualityExpressionContext : public antlr4::ParserRuleContext {
  public:
    EqualityExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<RelationalExpressionContext *> relationalExpression();
    RelationalExpressionContext* relationalExpression(size_t i);
    std::vector<antlr4::tree::TerminalNode *> EQ();
    antlr4::tree::TerminalNode* EQ(size_t i);
    std::vector<antlr4::tree::TerminalNode *> NEQ();
    antlr4::tree::TerminalNode* NEQ(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EqualityExpressionContext* equalityExpression();

  class  RelationalExpressionContext : public antlr4::ParserRuleContext {
  public:
    RelationalExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<AdditiveExpressionContext *> additiveExpression();
    AdditiveExpressionContext* additiveExpression(size_t i);
    std::vector<antlr4::tree::TerminalNode *> LT();
    antlr4::tree::TerminalNode* LT(size_t i);
    std::vector<antlr4::tree::TerminalNode *> GT();
    antlr4::tree::TerminalNode* GT(size_t i);
    std::vector<antlr4::tree::TerminalNode *> LE();
    antlr4::tree::TerminalNode* LE(size_t i);
    std::vector<antlr4::tree::TerminalNode *> GE();
    antlr4::tree::TerminalNode* GE(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  RelationalExpressionContext* relationalExpression();

  class  AdditiveExpressionContext : public antlr4::ParserRuleContext {
  public:
    AdditiveExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<MultiplicativeExpressionContext *> multiplicativeExpression();
    MultiplicativeExpressionContext* multiplicativeExpression(size_t i);
    std::vector<antlr4::tree::TerminalNode *> ADD();
    antlr4::tree::TerminalNode* ADD(size_t i);
    std::vector<antlr4::tree::TerminalNode *> SUB();
    antlr4::tree::TerminalNode* SUB(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AdditiveExpressionContext* additiveExpression();

  class  MultiplicativeExpressionContext : public antlr4::ParserRuleContext {
  public:
    MultiplicativeExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<UnaryExpressionContext *> unaryExpression();
    UnaryExpressionContext* unaryExpression(size_t i);
    std::vector<antlr4::tree::TerminalNode *> MUL();
    antlr4::tree::TerminalNode* MUL(size_t i);
    std::vector<antlr4::tree::TerminalNode *> DIV();
    antlr4::tree::TerminalNode* DIV(size_t i);
    std::vector<antlr4::tree::TerminalNode *> MOD();
    antlr4::tree::TerminalNode* MOD(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MultiplicativeExpressionContext* multiplicativeExpression();

  class  UnaryExpressionContext : public antlr4::ParserRuleContext {
  public:
    UnaryExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
   
    UnaryExpressionContext() = default;
    void copyFrom(UnaryExpressionContext *context);
    using antlr4::ParserRuleContext::copyFrom;

    virtual size_t getRuleIndex() const override;

   
  };

  class  UnaryOperationContext : public UnaryExpressionContext {
  public:
    UnaryOperationContext(UnaryExpressionContext *ctx);

    UnaryExpressionContext *unaryExpression();
    antlr4::tree::TerminalNode *NOT();
    antlr4::tree::TerminalNode *SUB();
    antlr4::tree::TerminalNode *ADD();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  PrimaryExprContext : public UnaryExpressionContext {
  public:
    PrimaryExprContext(UnaryExpressionContext *ctx);

    PrimaryExpressionContext *primaryExpression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  UnaryExpressionContext* unaryExpression();

  class  PrimaryExpressionContext : public antlr4::ParserRuleContext {
  public:
    PrimaryExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
   
    PrimaryExpressionContext() = default;
    void copyFrom(PrimaryExpressionContext *context);
    using antlr4::ParserRuleContext::copyFrom;

    virtual size_t getRuleIndex() const override;

   
  };

  class  BoolLiteralExprContext : public PrimaryExpressionContext {
  public:
    BoolLiteralExprContext(PrimaryExpressionContext *ctx);

    BoolLiteralContext *boolLiteral();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  ParenthesizedExpressionContext : public PrimaryExpressionContext {
  public:
    ParenthesizedExpressionContext(PrimaryExpressionContext *ctx);

    antlr4::tree::TerminalNode *OPEN_PAREN();
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *CLOSE_PAREN();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  FunctIonCallContext : public PrimaryExpressionContext {
  public:
    FunctIonCallContext(PrimaryExpressionContext *ctx);

    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *OPEN_PAREN();
    antlr4::tree::TerminalNode *CLOSE_PAREN();
    ArgumentListContext *argumentList();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  StringLiteralContext : public PrimaryExpressionContext {
  public:
    StringLiteralContext(PrimaryExpressionContext *ctx);

    antlr4::tree::TerminalNode *STRING_LITERAL();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  IDCallContext : public PrimaryExpressionContext {
  public:
    IDCallContext(PrimaryExpressionContext *ctx);

    antlr4::tree::TerminalNode *ID();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  IntLiteralContext : public PrimaryExpressionContext {
  public:
    IntLiteralContext(PrimaryExpressionContext *ctx);

    antlr4::tree::TerminalNode *INT_LITERAL();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  DoubleLiteralContext : public PrimaryExpressionContext {
  public:
    DoubleLiteralContext(PrimaryExpressionContext *ctx);

    antlr4::tree::TerminalNode *DOUBLE_LITERAL();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  PrimaryExpressionContext* primaryExpression();

  class  BoolLiteralContext : public antlr4::ParserRuleContext {
  public:
    BoolLiteralContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KW_TRUE();
    antlr4::tree::TerminalNode *KW_FALSE();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BoolLiteralContext* boolLiteral();

  class  ArgumentListContext : public antlr4::ParserRuleContext {
  public:
    ArgumentListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual std::any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArgumentListContext* argumentList();


  // By default the static state used to implement the parser is lazily initialized during the first
  // call to the constructor. You can call this function if you wish to initialize the static state
  // ahead of time.
  static void initialize();

private:
};

}  // namespace antlr_generated
