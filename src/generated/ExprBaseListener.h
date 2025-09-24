
// Generated from d:/compilersLectures/lect4/grammer/Expr.g4 by ANTLR 4.13.1

#pragma once


#include "antlr4-runtime.h"
#include "ExprListener.h"


namespace antlr_generated {

/**
 * This class provides an empty implementation of ExprListener,
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
class  ExprBaseListener : public ExprListener {
public:

  virtual void enterProgram(ExprParser::ProgramContext * /*ctx*/) override { }
  virtual void exitProgram(ExprParser::ProgramContext * /*ctx*/) override { }

  virtual void enterToplevelStatement(ExprParser::ToplevelStatementContext * /*ctx*/) override { }
  virtual void exitToplevelStatement(ExprParser::ToplevelStatementContext * /*ctx*/) override { }

  virtual void enterDeclaration(ExprParser::DeclarationContext * /*ctx*/) override { }
  virtual void exitDeclaration(ExprParser::DeclarationContext * /*ctx*/) override { }

  virtual void enterFunctionDeclaration(ExprParser::FunctionDeclarationContext * /*ctx*/) override { }
  virtual void exitFunctionDeclaration(ExprParser::FunctionDeclarationContext * /*ctx*/) override { }

  virtual void enterParameterList(ExprParser::ParameterListContext * /*ctx*/) override { }
  virtual void exitParameterList(ExprParser::ParameterListContext * /*ctx*/) override { }

  virtual void enterParameter(ExprParser::ParameterContext * /*ctx*/) override { }
  virtual void exitParameter(ExprParser::ParameterContext * /*ctx*/) override { }

  virtual void enterType(ExprParser::TypeContext * /*ctx*/) override { }
  virtual void exitType(ExprParser::TypeContext * /*ctx*/) override { }

  virtual void enterCompoundStatement(ExprParser::CompoundStatementContext * /*ctx*/) override { }
  virtual void exitCompoundStatement(ExprParser::CompoundStatementContext * /*ctx*/) override { }

  virtual void enterVariableDeclStmt(ExprParser::VariableDeclStmtContext * /*ctx*/) override { }
  virtual void exitVariableDeclStmt(ExprParser::VariableDeclStmtContext * /*ctx*/) override { }

  virtual void enterExpressionStmt(ExprParser::ExpressionStmtContext * /*ctx*/) override { }
  virtual void exitExpressionStmt(ExprParser::ExpressionStmtContext * /*ctx*/) override { }

  virtual void enterReturnStmt(ExprParser::ReturnStmtContext * /*ctx*/) override { }
  virtual void exitReturnStmt(ExprParser::ReturnStmtContext * /*ctx*/) override { }

  virtual void enterIfStmt(ExprParser::IfStmtContext * /*ctx*/) override { }
  virtual void exitIfStmt(ExprParser::IfStmtContext * /*ctx*/) override { }

  virtual void enterWhileStmt(ExprParser::WhileStmtContext * /*ctx*/) override { }
  virtual void exitWhileStmt(ExprParser::WhileStmtContext * /*ctx*/) override { }

  virtual void enterCompoundStmt(ExprParser::CompoundStmtContext * /*ctx*/) override { }
  virtual void exitCompoundStmt(ExprParser::CompoundStmtContext * /*ctx*/) override { }

  virtual void enterVariableDeclaration(ExprParser::VariableDeclarationContext * /*ctx*/) override { }
  virtual void exitVariableDeclaration(ExprParser::VariableDeclarationContext * /*ctx*/) override { }

  virtual void enterReturnStatement(ExprParser::ReturnStatementContext * /*ctx*/) override { }
  virtual void exitReturnStatement(ExprParser::ReturnStatementContext * /*ctx*/) override { }

  virtual void enterIfStatement(ExprParser::IfStatementContext * /*ctx*/) override { }
  virtual void exitIfStatement(ExprParser::IfStatementContext * /*ctx*/) override { }

  virtual void enterWhileStatement(ExprParser::WhileStatementContext * /*ctx*/) override { }
  virtual void exitWhileStatement(ExprParser::WhileStatementContext * /*ctx*/) override { }

  virtual void enterAssignmentExpression(ExprParser::AssignmentExpressionContext * /*ctx*/) override { }
  virtual void exitAssignmentExpression(ExprParser::AssignmentExpressionContext * /*ctx*/) override { }

  virtual void enterLogicalOrExpr(ExprParser::LogicalOrExprContext * /*ctx*/) override { }
  virtual void exitLogicalOrExpr(ExprParser::LogicalOrExprContext * /*ctx*/) override { }

  virtual void enterLogicalOrExpression(ExprParser::LogicalOrExpressionContext * /*ctx*/) override { }
  virtual void exitLogicalOrExpression(ExprParser::LogicalOrExpressionContext * /*ctx*/) override { }

  virtual void enterLogicalAndExpression(ExprParser::LogicalAndExpressionContext * /*ctx*/) override { }
  virtual void exitLogicalAndExpression(ExprParser::LogicalAndExpressionContext * /*ctx*/) override { }

  virtual void enterEqualityExpression(ExprParser::EqualityExpressionContext * /*ctx*/) override { }
  virtual void exitEqualityExpression(ExprParser::EqualityExpressionContext * /*ctx*/) override { }

  virtual void enterRelationalExpression(ExprParser::RelationalExpressionContext * /*ctx*/) override { }
  virtual void exitRelationalExpression(ExprParser::RelationalExpressionContext * /*ctx*/) override { }

  virtual void enterAdditiveExpression(ExprParser::AdditiveExpressionContext * /*ctx*/) override { }
  virtual void exitAdditiveExpression(ExprParser::AdditiveExpressionContext * /*ctx*/) override { }

  virtual void enterMultiplicativeExpression(ExprParser::MultiplicativeExpressionContext * /*ctx*/) override { }
  virtual void exitMultiplicativeExpression(ExprParser::MultiplicativeExpressionContext * /*ctx*/) override { }

  virtual void enterUnaryOperation(ExprParser::UnaryOperationContext * /*ctx*/) override { }
  virtual void exitUnaryOperation(ExprParser::UnaryOperationContext * /*ctx*/) override { }

  virtual void enterPrimaryExpr(ExprParser::PrimaryExprContext * /*ctx*/) override { }
  virtual void exitPrimaryExpr(ExprParser::PrimaryExprContext * /*ctx*/) override { }

  virtual void enterIntLiteral(ExprParser::IntLiteralContext * /*ctx*/) override { }
  virtual void exitIntLiteral(ExprParser::IntLiteralContext * /*ctx*/) override { }

  virtual void enterDoubleLiteral(ExprParser::DoubleLiteralContext * /*ctx*/) override { }
  virtual void exitDoubleLiteral(ExprParser::DoubleLiteralContext * /*ctx*/) override { }

  virtual void enterBoolLiteralExpr(ExprParser::BoolLiteralExprContext * /*ctx*/) override { }
  virtual void exitBoolLiteralExpr(ExprParser::BoolLiteralExprContext * /*ctx*/) override { }

  virtual void enterStringLiteral(ExprParser::StringLiteralContext * /*ctx*/) override { }
  virtual void exitStringLiteral(ExprParser::StringLiteralContext * /*ctx*/) override { }

  virtual void enterIDCall(ExprParser::IDCallContext * /*ctx*/) override { }
  virtual void exitIDCall(ExprParser::IDCallContext * /*ctx*/) override { }

  virtual void enterFunctIonCall(ExprParser::FunctIonCallContext * /*ctx*/) override { }
  virtual void exitFunctIonCall(ExprParser::FunctIonCallContext * /*ctx*/) override { }

  virtual void enterParenthesizedExpression(ExprParser::ParenthesizedExpressionContext * /*ctx*/) override { }
  virtual void exitParenthesizedExpression(ExprParser::ParenthesizedExpressionContext * /*ctx*/) override { }

  virtual void enterBoolLiteral(ExprParser::BoolLiteralContext * /*ctx*/) override { }
  virtual void exitBoolLiteral(ExprParser::BoolLiteralContext * /*ctx*/) override { }

  virtual void enterArgumentList(ExprParser::ArgumentListContext * /*ctx*/) override { }
  virtual void exitArgumentList(ExprParser::ArgumentListContext * /*ctx*/) override { }


  virtual void enterEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void exitEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void visitTerminal(antlr4::tree::TerminalNode * /*node*/) override { }
  virtual void visitErrorNode(antlr4::tree::ErrorNode * /*node*/) override { }

};

}  // namespace antlr_generated
