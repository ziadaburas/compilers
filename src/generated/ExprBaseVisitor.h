
// Generated from d:/compilersLectures/lect4/grammer/Expr.g4 by ANTLR 4.13.1

#pragma once


#include "antlr4-runtime.h"
#include "ExprVisitor.h"


namespace antlr_generated {

/**
 * This class provides an empty implementation of ExprVisitor, which can be
 * extended to create a visitor which only needs to handle a subset of the available methods.
 */
class  ExprBaseVisitor : public ExprVisitor {
public:

  virtual std::any visitProgram(ExprParser::ProgramContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitToplevelStatement(ExprParser::ToplevelStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitDeclaration(ExprParser::DeclarationContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitFunctionDeclaration(ExprParser::FunctionDeclarationContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitParameterList(ExprParser::ParameterListContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitParameter(ExprParser::ParameterContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitType(ExprParser::TypeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitCompoundStatement(ExprParser::CompoundStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitVariableDeclStmt(ExprParser::VariableDeclStmtContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitExpressionStmt(ExprParser::ExpressionStmtContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitReturnStmt(ExprParser::ReturnStmtContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitIfStmt(ExprParser::IfStmtContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitWhileStmt(ExprParser::WhileStmtContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitCompoundStmt(ExprParser::CompoundStmtContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitVariableDeclaration(ExprParser::VariableDeclarationContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitReturnStatement(ExprParser::ReturnStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitIfStatement(ExprParser::IfStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitWhileStatement(ExprParser::WhileStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitAssignmentExpression(ExprParser::AssignmentExpressionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitLogicalOrExpr(ExprParser::LogicalOrExprContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitLogicalOrExpression(ExprParser::LogicalOrExpressionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitLogicalAndExpression(ExprParser::LogicalAndExpressionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitEqualityExpression(ExprParser::EqualityExpressionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitRelationalExpression(ExprParser::RelationalExpressionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitAdditiveExpression(ExprParser::AdditiveExpressionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitMultiplicativeExpression(ExprParser::MultiplicativeExpressionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitUnaryOperation(ExprParser::UnaryOperationContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitPrimaryExpr(ExprParser::PrimaryExprContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitIntLiteral(ExprParser::IntLiteralContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitDoubleLiteral(ExprParser::DoubleLiteralContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitBoolLiteralExpr(ExprParser::BoolLiteralExprContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitStringLiteral(ExprParser::StringLiteralContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitIDCall(ExprParser::IDCallContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitFunctIonCall(ExprParser::FunctIonCallContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitParenthesizedExpression(ExprParser::ParenthesizedExpressionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitBoolLiteral(ExprParser::BoolLiteralContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitArgumentList(ExprParser::ArgumentListContext *ctx) override {
    return visitChildren(ctx);
  }


};

}  // namespace antlr_generated
