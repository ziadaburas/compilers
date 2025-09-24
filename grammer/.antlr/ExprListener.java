// Generated from d:/compilersLectures/lect4/grammer/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#toplevelStatement}.
	 * @param ctx the parse tree
	 */
	void enterToplevelStatement(ExprParser.ToplevelStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#toplevelStatement}.
	 * @param ctx the parse tree
	 */
	void exitToplevelStatement(ExprParser.ToplevelStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ExprParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ExprParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ExprParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ExprParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(ExprParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(ExprParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ExprParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ExprParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ExprParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ExprParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(ExprParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(ExprParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclStmt}
	 * labeled alternative in {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclStmt(ExprParser.VariableDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclStmt}
	 * labeled alternative in {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclStmt(ExprParser.VariableDeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStmt}
	 * labeled alternative in {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmt(ExprParser.ExpressionStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStmt}
	 * labeled alternative in {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmt(ExprParser.ExpressionStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(ExprParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(ExprParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(ExprParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(ExprParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(ExprParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(ExprParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStmt}
	 * labeled alternative in {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmt(ExprParser.CompoundStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStmt}
	 * labeled alternative in {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmt(ExprParser.CompoundStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ExprParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ExprParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ExprParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ExprParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ExprParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ExprParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ExprParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ExprParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(ExprParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(ExprParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpr(ExprParser.LogicalOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpr(ExprParser.LogicalOrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(ExprParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(ExprParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(ExprParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(ExprParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ExprParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ExprParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ExprParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ExprParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ExprParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ExprParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ExprParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ExprParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryOperation}
	 * labeled alternative in {@link ExprParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperation(ExprParser.UnaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryOperation}
	 * labeled alternative in {@link ExprParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperation(ExprParser.UnaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link ExprParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(ExprParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link ExprParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(ExprParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link ExprParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(ExprParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link ExprParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(ExprParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleLiteral}
	 * labeled alternative in {@link ExprParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(ExprParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleLiteral}
	 * labeled alternative in {@link ExprParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(ExprParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolLiteralExpr}
	 * labeled alternative in {@link ExprParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteralExpr(ExprParser.BoolLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolLiteralExpr}
	 * labeled alternative in {@link ExprParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteralExpr(ExprParser.BoolLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link ExprParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(ExprParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link ExprParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(ExprParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDCall}
	 * labeled alternative in {@link ExprParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIDCall(ExprParser.IDCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDCall}
	 * labeled alternative in {@link ExprParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIDCall(ExprParser.IDCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctIonCall}
	 * labeled alternative in {@link ExprParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctIonCall(ExprParser.FunctIonCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctIonCall}
	 * labeled alternative in {@link ExprParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctIonCall(ExprParser.FunctIonCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ExprParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(ExprParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ExprParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(ExprParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(ExprParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(ExprParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ExprParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ExprParser.ArgumentListContext ctx);
}