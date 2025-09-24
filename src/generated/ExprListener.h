
// Generated from d:/compilersLectures/lect4/grammer/Expr.g4 by ANTLR 4.13.1

#pragma once


#include "antlr4-runtime.h"
#include "ExprParser.h"


namespace antlr_generated {

/**
 * This interface defines an abstract listener for a parse tree produced by ExprParser.
 */
class  ExprListener : public antlr4::tree::ParseTreeListener {
public:

  virtual void enterProgram(ExprParser::ProgramContext *ctx) = 0;
  virtual void exitProgram(ExprParser::ProgramContext *ctx) = 0;

  virtual void enterToplevelStatement(ExprParser::ToplevelStatementContext *ctx) = 0;
  virtual void exitToplevelStatement(ExprParser::ToplevelStatementContext *ctx) = 0;

  virtual void enterDeclaration(ExprParser::DeclarationContext *ctx) = 0;
  virtual void exitDeclaration(ExprParser::DeclarationContext *ctx) = 0;

  virtual void enterFunctionDeclaration(ExprParser::FunctionDeclarationContext *ctx) = 0;
  virtual void exitFunctionDeclaration(ExprParser::FunctionDeclarationContext *ctx) = 0;

  virtual void enterParameterList(ExprParser::ParameterListContext *ctx) = 0;
  virtual void exitParameterList(ExprParser::ParameterListContext *ctx) = 0;

  virtual void enterParameter(ExprParser::ParameterContext *ctx) = 0;
  virtual void exitParameter(ExprParser::ParameterContext *ctx) = 0;

  virtual void enterType(ExprParser::TypeContext *ctx) = 0;
  virtual void exitType(ExprParser::TypeContext *ctx) = 0;

  virtual void enterCompoundStatement(ExprParser::CompoundStatementContext *ctx) = 0;
  virtual void exitCompoundStatement(ExprParser::CompoundStatementContext *ctx) = 0;

  virtual void enterVariableDeclStmt(ExprParser::VariableDeclStmtContext *ctx) = 0;
  virtual void exitVariableDeclStmt(ExprParser::VariableDeclStmtContext *ctx) = 0;

  virtual void enterExpressionStmt(ExprParser::ExpressionStmtContext *ctx) = 0;
  virtual void exitExpressionStmt(ExprParser::ExpressionStmtContext *ctx) = 0;

  virtual void enterReturnStmt(ExprParser::ReturnStmtContext *ctx) = 0;
  virtual void exitReturnStmt(ExprParser::ReturnStmtContext *ctx) = 0;

  virtual void enterIfStmt(ExprParser::IfStmtContext *ctx) = 0;
  virtual void exitIfStmt(ExprParser::IfStmtContext *ctx) = 0;

  virtual void enterWhileStmt(ExprParser::WhileStmtContext *ctx) = 0;
  virtual void exitWhileStmt(ExprParser::WhileStmtContext *ctx) = 0;

  virtual void enterCompoundStmt(ExprParser::CompoundStmtContext *ctx) = 0;
  virtual void exitCompoundStmt(ExprParser::CompoundStmtContext *ctx) = 0;

  virtual void enterVariableDeclaration(ExprParser::VariableDeclarationContext *ctx) = 0;
  virtual void exitVariableDeclaration(ExprParser::VariableDeclarationContext *ctx) = 0;

  virtual void enterReturnStatement(ExprParser::ReturnStatementContext *ctx) = 0;
  virtual void exitReturnStatement(ExprParser::ReturnStatementContext *ctx) = 0;

  virtual void enterIfStatement(ExprParser::IfStatementContext *ctx) = 0;
  virtual void exitIfStatement(ExprParser::IfStatementContext *ctx) = 0;

  virtual void enterWhileStatement(ExprParser::WhileStatementContext *ctx) = 0;
  virtual void exitWhileStatement(ExprParser::WhileStatementContext *ctx) = 0;

  virtual void enterAssignmentExpression(ExprParser::AssignmentExpressionContext *ctx) = 0;
  virtual void exitAssignmentExpression(ExprParser::AssignmentExpressionContext *ctx) = 0;

  virtual void enterLogicalOrExpr(ExprParser::LogicalOrExprContext *ctx) = 0;
  virtual void exitLogicalOrExpr(ExprParser::LogicalOrExprContext *ctx) = 0;

  virtual void enterLogicalOrExpression(ExprParser::LogicalOrExpressionContext *ctx) = 0;
  virtual void exitLogicalOrExpression(ExprParser::LogicalOrExpressionContext *ctx) = 0;

  virtual void enterLogicalAndExpression(ExprParser::LogicalAndExpressionContext *ctx) = 0;
  virtual void exitLogicalAndExpression(ExprParser::LogicalAndExpressionContext *ctx) = 0;

  virtual void enterEqualityExpression(ExprParser::EqualityExpressionContext *ctx) = 0;
  virtual void exitEqualityExpression(ExprParser::EqualityExpressionContext *ctx) = 0;

  virtual void enterRelationalExpression(ExprParser::RelationalExpressionContext *ctx) = 0;
  virtual void exitRelationalExpression(ExprParser::RelationalExpressionContext *ctx) = 0;

  virtual void enterAdditiveExpression(ExprParser::AdditiveExpressionContext *ctx) = 0;
  virtual void exitAdditiveExpression(ExprParser::AdditiveExpressionContext *ctx) = 0;

  virtual void enterMultiplicativeExpression(ExprParser::MultiplicativeExpressionContext *ctx) = 0;
  virtual void exitMultiplicativeExpression(ExprParser::MultiplicativeExpressionContext *ctx) = 0;

  virtual void enterUnaryOperation(ExprParser::UnaryOperationContext *ctx) = 0;
  virtual void exitUnaryOperation(ExprParser::UnaryOperationContext *ctx) = 0;

  virtual void enterPrimaryExpr(ExprParser::PrimaryExprContext *ctx) = 0;
  virtual void exitPrimaryExpr(ExprParser::PrimaryExprContext *ctx) = 0;

  virtual void enterIntLiteral(ExprParser::IntLiteralContext *ctx) = 0;
  virtual void exitIntLiteral(ExprParser::IntLiteralContext *ctx) = 0;

  virtual void enterDoubleLiteral(ExprParser::DoubleLiteralContext *ctx) = 0;
  virtual void exitDoubleLiteral(ExprParser::DoubleLiteralContext *ctx) = 0;

  virtual void enterBoolLiteralExpr(ExprParser::BoolLiteralExprContext *ctx) = 0;
  virtual void exitBoolLiteralExpr(ExprParser::BoolLiteralExprContext *ctx) = 0;

  virtual void enterStringLiteral(ExprParser::StringLiteralContext *ctx) = 0;
  virtual void exitStringLiteral(ExprParser::StringLiteralContext *ctx) = 0;

  virtual void enterIDCall(ExprParser::IDCallContext *ctx) = 0;
  virtual void exitIDCall(ExprParser::IDCallContext *ctx) = 0;

  virtual void enterFunctIonCall(ExprParser::FunctIonCallContext *ctx) = 0;
  virtual void exitFunctIonCall(ExprParser::FunctIonCallContext *ctx) = 0;

  virtual void enterParenthesizedExpression(ExprParser::ParenthesizedExpressionContext *ctx) = 0;
  virtual void exitParenthesizedExpression(ExprParser::ParenthesizedExpressionContext *ctx) = 0;

  virtual void enterBoolLiteral(ExprParser::BoolLiteralContext *ctx) = 0;
  virtual void exitBoolLiteral(ExprParser::BoolLiteralContext *ctx) = 0;

  virtual void enterArgumentList(ExprParser::ArgumentListContext *ctx) = 0;
  virtual void exitArgumentList(ExprParser::ArgumentListContext *ctx) = 0;


};

}  // namespace antlr_generated
