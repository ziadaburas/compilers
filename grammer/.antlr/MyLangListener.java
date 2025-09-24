// Generated from d:/compilersLectures/lect4/grammer/MyLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLangParser}.
 */
public interface MyLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#program_block}.
	 * @param ctx the parse tree
	 */
	void enterProgram_block(MyLangParser.Program_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#program_block}.
	 * @param ctx the parse tree
	 */
	void exitProgram_block(MyLangParser.Program_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstDefinition}
	 * labeled alternative in {@link MyLangParser#definitions_part}.
	 * @param ctx the parse tree
	 */
	void enterConstDefinition(MyLangParser.ConstDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstDefinition}
	 * labeled alternative in {@link MyLangParser#definitions_part}.
	 * @param ctx the parse tree
	 */
	void exitConstDefinition(MyLangParser.ConstDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeDefinition}
	 * labeled alternative in {@link MyLangParser#definitions_part}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(MyLangParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeDefinition}
	 * labeled alternative in {@link MyLangParser#definitions_part}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(MyLangParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDefinition}
	 * labeled alternative in {@link MyLangParser#definitions_part}.
	 * @param ctx the parse tree
	 */
	void enterVarDefinition(MyLangParser.VarDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDefinition}
	 * labeled alternative in {@link MyLangParser#definitions_part}.
	 * @param ctx the parse tree
	 */
	void exitVarDefinition(MyLangParser.VarDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProcDefinition}
	 * labeled alternative in {@link MyLangParser#definitions_part}.
	 * @param ctx the parse tree
	 */
	void enterProcDefinition(MyLangParser.ProcDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProcDefinition}
	 * labeled alternative in {@link MyLangParser#definitions_part}.
	 * @param ctx the parse tree
	 */
	void exitProcDefinition(MyLangParser.ProcDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#constants_definition}.
	 * @param ctx the parse tree
	 */
	void enterConstants_definition(MyLangParser.Constants_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#constants_definition}.
	 * @param ctx the parse tree
	 */
	void exitConstants_definition(MyLangParser.Constants_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#constant_def}.
	 * @param ctx the parse tree
	 */
	void enterConstant_def(MyLangParser.Constant_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#constant_def}.
	 * @param ctx the parse tree
	 */
	void exitConstant_def(MyLangParser.Constant_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#types_definition}.
	 * @param ctx the parse tree
	 */
	void enterTypes_definition(MyLangParser.Types_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#types_definition}.
	 * @param ctx the parse tree
	 */
	void exitTypes_definition(MyLangParser.Types_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#type_def}.
	 * @param ctx the parse tree
	 */
	void enterType_def(MyLangParser.Type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#type_def}.
	 * @param ctx the parse tree
	 */
	void exitType_def(MyLangParser.Type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#composite_type}.
	 * @param ctx the parse tree
	 */
	void enterComposite_type(MyLangParser.Composite_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#composite_type}.
	 * @param ctx the parse tree
	 */
	void exitComposite_type(MyLangParser.Composite_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#list_type}.
	 * @param ctx the parse tree
	 */
	void enterList_type(MyLangParser.List_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#list_type}.
	 * @param ctx the parse tree
	 */
	void exitList_type(MyLangParser.List_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#record_type}.
	 * @param ctx the parse tree
	 */
	void enterRecord_type(MyLangParser.Record_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#record_type}.
	 * @param ctx the parse tree
	 */
	void exitRecord_type(MyLangParser.Record_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#field_list}.
	 * @param ctx the parse tree
	 */
	void enterField_list(MyLangParser.Field_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#field_list}.
	 * @param ctx the parse tree
	 */
	void exitField_list(MyLangParser.Field_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#field_def}.
	 * @param ctx the parse tree
	 */
	void enterField_def(MyLangParser.Field_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#field_def}.
	 * @param ctx the parse tree
	 */
	void exitField_def(MyLangParser.Field_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#variables_definition}.
	 * @param ctx the parse tree
	 */
	void enterVariables_definition(MyLangParser.Variables_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#variables_definition}.
	 * @param ctx the parse tree
	 */
	void exitVariables_definition(MyLangParser.Variables_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#variable_def}.
	 * @param ctx the parse tree
	 */
	void enterVariable_def(MyLangParser.Variable_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#variable_def}.
	 * @param ctx the parse tree
	 */
	void exitVariable_def(MyLangParser.Variable_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#variable_group}.
	 * @param ctx the parse tree
	 */
	void enterVariable_group(MyLangParser.Variable_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#variable_group}.
	 * @param ctx the parse tree
	 */
	void exitVariable_group(MyLangParser.Variable_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#procedures_definition}.
	 * @param ctx the parse tree
	 */
	void enterProcedures_definition(MyLangParser.Procedures_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#procedures_definition}.
	 * @param ctx the parse tree
	 */
	void exitProcedures_definition(MyLangParser.Procedures_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#procedure_def}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_def(MyLangParser.Procedure_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#procedure_def}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_def(MyLangParser.Procedure_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#procedure_header}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_header(MyLangParser.Procedure_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#procedure_header}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_header(MyLangParser.Procedure_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#procedure_block}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_block(MyLangParser.Procedure_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#procedure_block}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_block(MyLangParser.Procedure_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterFormal_parameter_list(MyLangParser.Formal_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitFormal_parameter_list(MyLangParser.Formal_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#parameter_def}.
	 * @param ctx the parse tree
	 */
	void enterParameter_def(MyLangParser.Parameter_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#parameter_def}.
	 * @param ctx the parse tree
	 */
	void exitParameter_def(MyLangParser.Parameter_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(MyLangParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(MyLangParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(MyLangParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(MyLangParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(MyLangParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(MyLangParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInput_stmt(MyLangParser.Input_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInput_stmt(MyLangParser.Input_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#output_stmt}.
	 * @param ctx the parse tree
	 */
	void enterOutput_stmt(MyLangParser.Output_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#output_stmt}.
	 * @param ctx the parse tree
	 */
	void exitOutput_stmt(MyLangParser.Output_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#print_list}.
	 * @param ctx the parse tree
	 */
	void enterPrint_list(MyLangParser.Print_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#print_list}.
	 * @param ctx the parse tree
	 */
	void exitPrint_list(MyLangParser.Print_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#print_element}.
	 * @param ctx the parse tree
	 */
	void enterPrint_element(MyLangParser.Print_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#print_element}.
	 * @param ctx the parse tree
	 */
	void exitPrint_element(MyLangParser.Print_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#procedure_call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_call_stmt(MyLangParser.Procedure_call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#procedure_call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_call_stmt(MyLangParser.Procedure_call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#actual_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterActual_parameter_list(MyLangParser.Actual_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#actual_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitActual_parameter_list(MyLangParser.Actual_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#actual_parameter}.
	 * @param ctx the parse tree
	 */
	void enterActual_parameter(MyLangParser.Actual_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#actual_parameter}.
	 * @param ctx the parse tree
	 */
	void exitActual_parameter(MyLangParser.Actual_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(MyLangParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(MyLangParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLoop_stmt(MyLangParser.Loop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLoop_stmt(MyLangParser.Loop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(MyLangParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(MyLangParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(MyLangParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(MyLangParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#repeat_until_loop}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_until_loop(MyLangParser.Repeat_until_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#repeat_until_loop}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_until_loop(MyLangParser.Repeat_until_loopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(MyLangParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(MyLangParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpr(MyLangParser.PowerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpr(MyLangParser.PowerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivModExpr}
	 * labeled alternative in {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivModExpr(MyLangParser.MulDivModExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivModExpr}
	 * labeled alternative in {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivModExpr(MyLangParser.MulDivModExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(MyLangParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(MyLangParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(MyLangParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(MyLangParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnarySignExpr}
	 * labeled alternative in {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnarySignExpr(MyLangParser.UnarySignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnarySignExpr}
	 * labeled alternative in {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnarySignExpr(MyLangParser.UnarySignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(MyLangParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(MyLangParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(MyLangParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(MyLangParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(MyLangParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(MyLangParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(MyLangParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(MyLangParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#variable_access}.
	 * @param ctx the parse tree
	 */
	void enterVariable_access(MyLangParser.Variable_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#variable_access}.
	 * @param ctx the parse tree
	 */
	void exitVariable_access(MyLangParser.Variable_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(MyLangParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(MyLangParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#indexer}.
	 * @param ctx the parse tree
	 */
	void enterIndexer(MyLangParser.IndexerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#indexer}.
	 * @param ctx the parse tree
	 */
	void exitIndexer(MyLangParser.IndexerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#field_selector}.
	 * @param ctx the parse tree
	 */
	void enterField_selector(MyLangParser.Field_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#field_selector}.
	 * @param ctx the parse tree
	 */
	void exitField_selector(MyLangParser.Field_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#constant_value}.
	 * @param ctx the parse tree
	 */
	void enterConstant_value(MyLangParser.Constant_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#constant_value}.
	 * @param ctx the parse tree
	 */
	void exitConstant_value(MyLangParser.Constant_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MyLangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MyLangParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(MyLangParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(MyLangParser.Boolean_literalContext ctx);
}