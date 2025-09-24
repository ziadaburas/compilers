// Generated from d:/compilersLectures/lect4/grammer/MyLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, CONSTANT=2, TYPE=3, VARIABLE=4, PROCEDURE=5, LIST=6, RECORD=7, 
		OF=8, BY_VALUE=9, BY_REFERENCE=10, INTEGER_T=11, REAL_T=12, BOOLEAN_T=13, 
		CHAR_T=14, STRING_T=15, READ=16, PRINT=17, IF=18, ELSE=19, FOR=20, TO=21, 
		STEP=22, WHILE=23, DO=24, REPEAT=25, UNTIL=26, TRUE=27, FALSE=28, PLUS=29, 
		MINUS=30, MUL=31, DIV=32, INT_DIV=33, MOD=34, POW=35, AND=36, OR=37, NOT=38, 
		EQUAL=39, EQ=40, NEQ=41, GT=42, LT=43, GTE=44, LTE=45, DOT=46, COMMA=47, 
		SEMI_COLON=48, COLON=49, L_PAREN=50, R_PAREN=51, L_BRACE=52, R_BRACE=53, 
		L_BRACKET=54, R_BRACKET=55, IDENTIFIER=56, INTEGER_LITERAL=57, REAL_LITERAL=58, 
		CHAR_LITERAL=59, STRING_LITERAL=60, WS=61;
	public static final int
		RULE_program = 0, RULE_program_block = 1, RULE_definitions_part = 2, RULE_constants_definition = 3, 
		RULE_constant_def = 4, RULE_types_definition = 5, RULE_type_def = 6, RULE_composite_type = 7, 
		RULE_list_type = 8, RULE_record_type = 9, RULE_field_list = 10, RULE_field_def = 11, 
		RULE_variables_definition = 12, RULE_variable_def = 13, RULE_variable_group = 14, 
		RULE_procedures_definition = 15, RULE_procedure_def = 16, RULE_procedure_header = 17, 
		RULE_procedure_block = 18, RULE_formal_parameter_list = 19, RULE_parameter_def = 20, 
		RULE_data_type = 21, RULE_statement_list = 22, RULE_statement = 23, RULE_assignment_stmt = 24, 
		RULE_input_stmt = 25, RULE_output_stmt = 26, RULE_print_list = 27, RULE_print_element = 28, 
		RULE_procedure_call_stmt = 29, RULE_actual_parameter_list = 30, RULE_actual_parameter = 31, 
		RULE_if_stmt = 32, RULE_loop_stmt = 33, RULE_for_loop = 34, RULE_while_loop = 35, 
		RULE_repeat_until_loop = 36, RULE_expression = 37, RULE_atom = 38, RULE_variable_access = 39, 
		RULE_selector = 40, RULE_indexer = 41, RULE_field_selector = 42, RULE_constant_value = 43, 
		RULE_literal = 44, RULE_boolean_literal = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "program_block", "definitions_part", "constants_definition", 
			"constant_def", "types_definition", "type_def", "composite_type", "list_type", 
			"record_type", "field_list", "field_def", "variables_definition", "variable_def", 
			"variable_group", "procedures_definition", "procedure_def", "procedure_header", 
			"procedure_block", "formal_parameter_list", "parameter_def", "data_type", 
			"statement_list", "statement", "assignment_stmt", "input_stmt", "output_stmt", 
			"print_list", "print_element", "procedure_call_stmt", "actual_parameter_list", 
			"actual_parameter", "if_stmt", "loop_stmt", "for_loop", "while_loop", 
			"repeat_until_loop", "expression", "atom", "variable_access", "selector", 
			"indexer", "field_selector", "constant_value", "literal", "boolean_literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\u0628\\u0631\\u0646\\u0627\\u0645\\u062C'", "'\\u062B\\u0627\\u0628\\u062A'", 
			"'\\u0646\\u0648\\u0639'", "'\\u0645\\u062A\\u063A\\u064A\\u0631'", "'\\u0627\\u062C\\u0631\\u0627\\u0621'", 
			"'\\u0642\\u0627\\u0626\\u0645\\u0629'", "'\\u0633\\u062C\\u0644'", "'\\u0645\\u0646'", 
			"'\\u0628\\u0627\\u0644\\u0642\\u064A\\u0645\\u0629'", "'\\u0628\\u0627\\u0644\\u0645\\u0631\\u062C\\u0639'", 
			"'\\u0635\\u062D\\u064A\\u062D'", "'\\u062D\\u0642\\u064A\\u0642\\u064A'", 
			"'\\u0645\\u0646\\u0637\\u0642\\u064A'", "'\\u062D\\u0631\\u0641\\u064A'", 
			"'\\u062E\\u064A\\u0637_\\u0631\\u0645\\u0632\\u064A'", "'\\u0627\\u0642\\u0631\\u0627'", 
			"'\\u0627\\u0637\\u0628\\u0639'", "'\\u0627\\u0630\\u0627'", "'\\u0648\\u0627\\u0644\\u0627'", 
			"'\\u0643\\u0631\\u0631'", "'\\u0627\\u0644\\u0649'", "'\\u0627\\u0636\\u0641'", 
			"'\\u0637\\u0627\\u0644\\u0645\\u0627'", "'\\u0627\\u0633\\u062A\\u0645\\u0631'", 
			"'\\u0627\\u0639\\u062F'", "'\\u062D\\u062A\\u0649'", "'\\u0635\\u062D'", 
			"'\\u062E\\u0637\\u0623'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'%'", 
			"'^'", "'&&'", "'||'", "'!'", "'='", "'=='", "'!='", "'>'", "'<'", "'>='", 
			"'<='", "'.'", "'\\u0648'", "'\\u061B'", "':'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "CONSTANT", "TYPE", "VARIABLE", "PROCEDURE", "LIST", 
			"RECORD", "OF", "BY_VALUE", "BY_REFERENCE", "INTEGER_T", "REAL_T", "BOOLEAN_T", 
			"CHAR_T", "STRING_T", "READ", "PRINT", "IF", "ELSE", "FOR", "TO", "STEP", 
			"WHILE", "DO", "REPEAT", "UNTIL", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", 
			"DIV", "INT_DIV", "MOD", "POW", "AND", "OR", "NOT", "EQUAL", "EQ", "NEQ", 
			"GT", "LT", "GTE", "LTE", "DOT", "COMMA", "SEMI_COLON", "COLON", "L_PAREN", 
			"R_PAREN", "L_BRACE", "R_BRACE", "L_BRACKET", "R_BRACKET", "IDENTIFIER", 
			"INTEGER_LITERAL", "REAL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Token program_name;
		public TerminalNode PROGRAM() { return getToken(MyLangParser.PROGRAM, 0); }
		public TerminalNode SEMI_COLON() { return getToken(MyLangParser.SEMI_COLON, 0); }
		public Program_blockContext program_block() {
			return getRuleContext(Program_blockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MyLangParser.DOT, 0); }
		public TerminalNode EOF() { return getToken(MyLangParser.EOF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyLangParser.IDENTIFIER, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(PROGRAM);
			setState(93);
			((ProgramContext)_localctx).program_name = match(IDENTIFIER);
			setState(94);
			match(SEMI_COLON);
			setState(95);
			program_block();
			setState(96);
			match(DOT);
			setState(97);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Program_blockContext extends ParserRuleContext {
		public Definitions_partContext definitions_part() {
			return getRuleContext(Definitions_partContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Program_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterProgram_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitProgram_block(this);
		}
	}

	public final Program_blockContext program_block() throws RecognitionException {
		Program_blockContext _localctx = new Program_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			definitions_part();
			setState(100);
			statement_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Definitions_partContext extends ParserRuleContext {
		public Definitions_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions_part; }
	 
		public Definitions_partContext() { }
		public void copyFrom(Definitions_partContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProcDefinitionContext extends Definitions_partContext {
		public Procedures_definitionContext procedures_definition() {
			return getRuleContext(Procedures_definitionContext.class,0);
		}
		public ProcDefinitionContext(Definitions_partContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterProcDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitProcDefinition(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstDefinitionContext extends Definitions_partContext {
		public Constants_definitionContext constants_definition() {
			return getRuleContext(Constants_definitionContext.class,0);
		}
		public ConstDefinitionContext(Definitions_partContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterConstDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitConstDefinition(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDefinitionContext extends Definitions_partContext {
		public Variables_definitionContext variables_definition() {
			return getRuleContext(Variables_definitionContext.class,0);
		}
		public VarDefinitionContext(Definitions_partContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterVarDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitVarDefinition(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeDefinitionContext extends Definitions_partContext {
		public Types_definitionContext types_definition() {
			return getRuleContext(Types_definitionContext.class,0);
		}
		public TypeDefinitionContext(Definitions_partContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitTypeDefinition(this);
		}
	}

	public final Definitions_partContext definitions_part() throws RecognitionException {
		Definitions_partContext _localctx = new Definitions_partContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definitions_part);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTANT:
				_localctx = new ConstDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				constants_definition();
				}
				break;
			case TYPE:
				_localctx = new TypeDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				types_definition();
				}
				break;
			case VARIABLE:
				_localctx = new VarDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				variables_definition();
				}
				break;
			case PROCEDURE:
				_localctx = new ProcDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				procedures_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constants_definitionContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(MyLangParser.CONSTANT, 0); }
		public List<Constant_defContext> constant_def() {
			return getRuleContexts(Constant_defContext.class);
		}
		public Constant_defContext constant_def(int i) {
			return getRuleContext(Constant_defContext.class,i);
		}
		public Constants_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constants_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterConstants_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitConstants_definition(this);
		}
	}

	public final Constants_definitionContext constants_definition() throws RecognitionException {
		Constants_definitionContext _localctx = new Constants_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constants_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(CONSTANT);
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				constant_def();
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_defContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyLangParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(MyLangParser.EQUAL, 0); }
		public Constant_valueContext constant_value() {
			return getRuleContext(Constant_valueContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyLangParser.SEMI_COLON, 0); }
		public Constant_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterConstant_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitConstant_def(this);
		}
	}

	public final Constant_defContext constant_def() throws RecognitionException {
		Constant_defContext _localctx = new Constant_defContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constant_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IDENTIFIER);
			setState(115);
			match(EQUAL);
			setState(116);
			constant_value();
			setState(117);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Types_definitionContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(MyLangParser.TYPE, 0); }
		public List<Type_defContext> type_def() {
			return getRuleContexts(Type_defContext.class);
		}
		public Type_defContext type_def(int i) {
			return getRuleContext(Type_defContext.class,i);
		}
		public Types_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterTypes_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitTypes_definition(this);
		}
	}

	public final Types_definitionContext types_definition() throws RecognitionException {
		Types_definitionContext _localctx = new Types_definitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_types_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(TYPE);
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				type_def();
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_defContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyLangParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(MyLangParser.EQUAL, 0); }
		public Composite_typeContext composite_type() {
			return getRuleContext(Composite_typeContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyLangParser.SEMI_COLON, 0); }
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterType_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitType_def(this);
		}
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(IDENTIFIER);
			setState(126);
			match(EQUAL);
			setState(127);
			composite_type();
			setState(128);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Composite_typeContext extends ParserRuleContext {
		public List_typeContext list_type() {
			return getRuleContext(List_typeContext.class,0);
		}
		public Record_typeContext record_type() {
			return getRuleContext(Record_typeContext.class,0);
		}
		public Composite_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composite_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterComposite_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitComposite_type(this);
		}
	}

	public final Composite_typeContext composite_type() throws RecognitionException {
		Composite_typeContext _localctx = new Composite_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_composite_type);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				list_type();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				record_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_typeContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(MyLangParser.LIST, 0); }
		public TerminalNode L_BRACKET() { return getToken(MyLangParser.L_BRACKET, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(MyLangParser.INTEGER_LITERAL, 0); }
		public TerminalNode R_BRACKET() { return getToken(MyLangParser.R_BRACKET, 0); }
		public TerminalNode OF() { return getToken(MyLangParser.OF, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterList_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitList_type(this);
		}
	}

	public final List_typeContext list_type() throws RecognitionException {
		List_typeContext _localctx = new List_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_list_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(LIST);
			setState(135);
			match(L_BRACKET);
			setState(136);
			match(INTEGER_LITERAL);
			setState(137);
			match(R_BRACKET);
			setState(138);
			match(OF);
			setState(139);
			data_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Record_typeContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(MyLangParser.RECORD, 0); }
		public TerminalNode L_BRACE() { return getToken(MyLangParser.L_BRACE, 0); }
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(MyLangParser.R_BRACE, 0); }
		public Record_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterRecord_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitRecord_type(this);
		}
	}

	public final Record_typeContext record_type() throws RecognitionException {
		Record_typeContext _localctx = new Record_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_record_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(RECORD);
			setState(142);
			match(L_BRACE);
			setState(143);
			field_list();
			setState(144);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Field_listContext extends ParserRuleContext {
		public List<Field_defContext> field_def() {
			return getRuleContexts(Field_defContext.class);
		}
		public Field_defContext field_def(int i) {
			return getRuleContext(Field_defContext.class,i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(MyLangParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(MyLangParser.SEMI_COLON, i);
		}
		public Field_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterField_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitField_list(this);
		}
	}

	public final Field_listContext field_list() throws RecognitionException {
		Field_listContext _localctx = new Field_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_field_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			field_def();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI_COLON) {
				{
				{
				setState(147);
				match(SEMI_COLON);
				setState(148);
				field_def();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Field_defContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyLangParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(MyLangParser.COLON, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyLangParser.COMMA, i);
		}
		public Field_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterField_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitField_def(this);
		}
	}

	public final Field_defContext field_def() throws RecognitionException {
		Field_defContext _localctx = new Field_defContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_field_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(IDENTIFIER);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(155);
				match(COMMA);
				setState(156);
				match(IDENTIFIER);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(COLON);
			setState(163);
			data_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variables_definitionContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(MyLangParser.VARIABLE, 0); }
		public List<Variable_defContext> variable_def() {
			return getRuleContexts(Variable_defContext.class);
		}
		public Variable_defContext variable_def(int i) {
			return getRuleContext(Variable_defContext.class,i);
		}
		public Variables_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterVariables_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitVariables_definition(this);
		}
	}

	public final Variables_definitionContext variables_definition() throws RecognitionException {
		Variables_definitionContext _localctx = new Variables_definitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variables_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(VARIABLE);
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
				variable_def();
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_defContext extends ParserRuleContext {
		public Variable_groupContext variable_group() {
			return getRuleContext(Variable_groupContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyLangParser.SEMI_COLON, 0); }
		public Variable_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterVariable_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitVariable_def(this);
		}
	}

	public final Variable_defContext variable_def() throws RecognitionException {
		Variable_defContext _localctx = new Variable_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			variable_group();
			setState(172);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_groupContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyLangParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(MyLangParser.COLON, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyLangParser.COMMA, i);
		}
		public Variable_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterVariable_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitVariable_group(this);
		}
	}

	public final Variable_groupContext variable_group() throws RecognitionException {
		Variable_groupContext _localctx = new Variable_groupContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(IDENTIFIER);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(175);
				match(COMMA);
				setState(176);
				match(IDENTIFIER);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(COLON);
			setState(183);
			data_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Procedures_definitionContext extends ParserRuleContext {
		public List<Procedure_defContext> procedure_def() {
			return getRuleContexts(Procedure_defContext.class);
		}
		public Procedure_defContext procedure_def(int i) {
			return getRuleContext(Procedure_defContext.class,i);
		}
		public Procedures_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedures_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterProcedures_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitProcedures_definition(this);
		}
	}

	public final Procedures_definitionContext procedures_definition() throws RecognitionException {
		Procedures_definitionContext _localctx = new Procedures_definitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_procedures_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				procedure_def();
				}
				}
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROCEDURE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Procedure_defContext extends ParserRuleContext {
		public Procedure_headerContext procedure_header() {
			return getRuleContext(Procedure_headerContext.class,0);
		}
		public Procedure_blockContext procedure_block() {
			return getRuleContext(Procedure_blockContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MyLangParser.SEMI_COLON, 0); }
		public Procedure_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterProcedure_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitProcedure_def(this);
		}
	}

	public final Procedure_defContext procedure_def() throws RecognitionException {
		Procedure_defContext _localctx = new Procedure_defContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_procedure_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			procedure_header();
			setState(191);
			procedure_block();
			setState(192);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Procedure_headerContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(MyLangParser.PROCEDURE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyLangParser.IDENTIFIER, 0); }
		public TerminalNode L_PAREN() { return getToken(MyLangParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(MyLangParser.R_PAREN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(MyLangParser.SEMI_COLON, 0); }
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Procedure_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterProcedure_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitProcedure_header(this);
		}
	}

	public final Procedure_headerContext procedure_header() throws RecognitionException {
		Procedure_headerContext _localctx = new Procedure_headerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_procedure_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(PROCEDURE);
			setState(195);
			match(IDENTIFIER);
			setState(196);
			match(L_PAREN);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72057594037929472L) != 0)) {
				{
				setState(197);
				formal_parameter_list();
				}
			}

			setState(200);
			match(R_PAREN);
			setState(201);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Procedure_blockContext extends ParserRuleContext {
		public Program_blockContext program_block() {
			return getRuleContext(Program_blockContext.class,0);
		}
		public Procedure_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterProcedure_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitProcedure_block(this);
		}
	}

	public final Procedure_blockContext procedure_block() throws RecognitionException {
		Procedure_blockContext _localctx = new Procedure_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_procedure_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			program_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Formal_parameter_listContext extends ParserRuleContext {
		public List<Parameter_defContext> parameter_def() {
			return getRuleContexts(Parameter_defContext.class);
		}
		public Parameter_defContext parameter_def(int i) {
			return getRuleContext(Parameter_defContext.class,i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(MyLangParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(MyLangParser.SEMI_COLON, i);
		}
		public Formal_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterFormal_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitFormal_parameter_list(this);
		}
	}

	public final Formal_parameter_listContext formal_parameter_list() throws RecognitionException {
		Formal_parameter_listContext _localctx = new Formal_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_formal_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			parameter_def();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI_COLON) {
				{
				{
				setState(206);
				match(SEMI_COLON);
				setState(207);
				parameter_def();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_defContext extends ParserRuleContext {
		public Variable_groupContext variable_group() {
			return getRuleContext(Variable_groupContext.class,0);
		}
		public TerminalNode BY_VALUE() { return getToken(MyLangParser.BY_VALUE, 0); }
		public TerminalNode BY_REFERENCE() { return getToken(MyLangParser.BY_REFERENCE, 0); }
		public Parameter_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterParameter_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitParameter_def(this);
		}
	}

	public final Parameter_defContext parameter_def() throws RecognitionException {
		Parameter_defContext _localctx = new Parameter_defContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameter_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY_VALUE || _la==BY_REFERENCE) {
				{
				setState(213);
				_la = _input.LA(1);
				if ( !(_la==BY_VALUE || _la==BY_REFERENCE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(216);
			variable_group();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INTEGER_T() { return getToken(MyLangParser.INTEGER_T, 0); }
		public TerminalNode REAL_T() { return getToken(MyLangParser.REAL_T, 0); }
		public TerminalNode BOOLEAN_T() { return getToken(MyLangParser.BOOLEAN_T, 0); }
		public TerminalNode CHAR_T() { return getToken(MyLangParser.CHAR_T, 0); }
		public TerminalNode STRING_T() { return getToken(MyLangParser.STRING_T, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyLangParser.IDENTIFIER, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 72057594037991424L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_listContext extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(MyLangParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(MyLangParser.R_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(MyLangParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(MyLangParser.SEMI_COLON, i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(L_BRACE);
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(221);
				statement();
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(222);
						match(SEMI_COLON);
						setState(223);
						statement();
						}
						} 
					}
					setState(228);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI_COLON) {
					{
					setState(229);
					match(SEMI_COLON);
					}
				}

				}
				break;
			}
			setState(234);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public Input_stmtContext input_stmt() {
			return getRuleContext(Input_stmtContext.class,0);
		}
		public Output_stmtContext output_stmt() {
			return getRuleContext(Output_stmtContext.class,0);
		}
		public Procedure_call_stmtContext procedure_call_stmt() {
			return getRuleContext(Procedure_call_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Loop_stmtContext loop_stmt() {
			return getRuleContext(Loop_stmtContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statement);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				input_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				output_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				procedure_call_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				if_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(241);
				loop_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				statement_list();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_stmtContext extends ParserRuleContext {
		public Variable_accessContext variable_access() {
			return getRuleContext(Variable_accessContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MyLangParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterAssignment_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitAssignment_stmt(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignment_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			variable_access();
			setState(247);
			match(EQUAL);
			setState(248);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Input_stmtContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(MyLangParser.READ, 0); }
		public TerminalNode L_PAREN() { return getToken(MyLangParser.L_PAREN, 0); }
		public Variable_accessContext variable_access() {
			return getRuleContext(Variable_accessContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MyLangParser.R_PAREN, 0); }
		public Input_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterInput_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitInput_stmt(this);
		}
	}

	public final Input_stmtContext input_stmt() throws RecognitionException {
		Input_stmtContext _localctx = new Input_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_input_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(READ);
			setState(251);
			match(L_PAREN);
			setState(252);
			variable_access();
			setState(253);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Output_stmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MyLangParser.PRINT, 0); }
		public TerminalNode L_PAREN() { return getToken(MyLangParser.L_PAREN, 0); }
		public Print_listContext print_list() {
			return getRuleContext(Print_listContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MyLangParser.R_PAREN, 0); }
		public Output_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterOutput_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitOutput_stmt(this);
		}
	}

	public final Output_stmtContext output_stmt() throws RecognitionException {
		Output_stmtContext _localctx = new Output_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_output_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(PRINT);
			setState(256);
			match(L_PAREN);
			setState(257);
			print_list();
			setState(258);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_listContext extends ParserRuleContext {
		public List<Print_elementContext> print_element() {
			return getRuleContexts(Print_elementContext.class);
		}
		public Print_elementContext print_element(int i) {
			return getRuleContext(Print_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyLangParser.COMMA, i);
		}
		public Print_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterPrint_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitPrint_list(this);
		}
	}

	public final Print_listContext print_list() throws RecognitionException {
		Print_listContext _localctx = new Print_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_print_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			print_element();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(261);
				match(COMMA);
				setState(262);
				print_element();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_elementContext extends ParserRuleContext {
		public Variable_accessContext variable_access() {
			return getRuleContext(Variable_accessContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Print_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterPrint_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitPrint_element(this);
		}
	}

	public final Print_elementContext print_element() throws RecognitionException {
		Print_elementContext _localctx = new Print_elementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_print_element);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				variable_access();
				}
				break;
			case TRUE:
			case FALSE:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Procedure_call_stmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyLangParser.IDENTIFIER, 0); }
		public TerminalNode L_PAREN() { return getToken(MyLangParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(MyLangParser.R_PAREN, 0); }
		public Actual_parameter_listContext actual_parameter_list() {
			return getRuleContext(Actual_parameter_listContext.class,0);
		}
		public Procedure_call_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_call_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterProcedure_call_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitProcedure_call_stmt(this);
		}
	}

	public final Procedure_call_stmtContext procedure_call_stmt() throws RecognitionException {
		Procedure_call_stmtContext _localctx = new Procedure_call_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_procedure_call_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(IDENTIFIER);
			setState(273);
			match(L_PAREN);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2234911591973781504L) != 0)) {
				{
				setState(274);
				actual_parameter_list();
				}
			}

			setState(277);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Actual_parameter_listContext extends ParserRuleContext {
		public List<Actual_parameterContext> actual_parameter() {
			return getRuleContexts(Actual_parameterContext.class);
		}
		public Actual_parameterContext actual_parameter(int i) {
			return getRuleContext(Actual_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyLangParser.COMMA, i);
		}
		public Actual_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterActual_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitActual_parameter_list(this);
		}
	}

	public final Actual_parameter_listContext actual_parameter_list() throws RecognitionException {
		Actual_parameter_listContext _localctx = new Actual_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_actual_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			actual_parameter();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(280);
				match(COMMA);
				setState(281);
				actual_parameter();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Actual_parameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Actual_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterActual_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitActual_parameter(this);
		}
	}

	public final Actual_parameterContext actual_parameter() throws RecognitionException {
		Actual_parameterContext _localctx = new Actual_parameterContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_actual_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(MyLangParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(MyLangParser.IF, i);
		}
		public List<TerminalNode> L_PAREN() { return getTokens(MyLangParser.L_PAREN); }
		public TerminalNode L_PAREN(int i) {
			return getToken(MyLangParser.L_PAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> R_PAREN() { return getTokens(MyLangParser.R_PAREN); }
		public TerminalNode R_PAREN(int i) {
			return getToken(MyLangParser.R_PAREN, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(MyLangParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(MyLangParser.ELSE, i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_if_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(IF);
			setState(290);
			match(L_PAREN);
			setState(291);
			expression(0);
			setState(292);
			match(R_PAREN);
			setState(293);
			statement();
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(294);
					match(ELSE);
					setState(295);
					match(IF);
					setState(296);
					match(L_PAREN);
					setState(297);
					expression(0);
					setState(298);
					match(R_PAREN);
					setState(299);
					statement();
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(306);
				match(ELSE);
				setState(307);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_stmtContext extends ParserRuleContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Repeat_until_loopContext repeat_until_loop() {
			return getRuleContext(Repeat_until_loopContext.class,0);
		}
		public Loop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterLoop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitLoop_stmt(this);
		}
	}

	public final Loop_stmtContext loop_stmt() throws RecognitionException {
		Loop_stmtContext _localctx = new Loop_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_loop_stmt);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				for_loop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				while_loop();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				repeat_until_loop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public Token loop_variable;
		public ExpressionContext start_expr;
		public ExpressionContext end_expr;
		public ExpressionContext step_expr;
		public TerminalNode FOR() { return getToken(MyLangParser.FOR, 0); }
		public TerminalNode L_PAREN() { return getToken(MyLangParser.L_PAREN, 0); }
		public TerminalNode EQUAL() { return getToken(MyLangParser.EQUAL, 0); }
		public TerminalNode TO() { return getToken(MyLangParser.TO, 0); }
		public TerminalNode R_PAREN() { return getToken(MyLangParser.R_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MyLangParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STEP() { return getToken(MyLangParser.STEP, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(FOR);
			setState(316);
			match(L_PAREN);
			setState(317);
			((For_loopContext)_localctx).loop_variable = match(IDENTIFIER);
			setState(318);
			match(EQUAL);
			setState(319);
			((For_loopContext)_localctx).start_expr = expression(0);
			setState(320);
			match(TO);
			setState(321);
			((For_loopContext)_localctx).end_expr = expression(0);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(322);
				match(STEP);
				setState(323);
				((For_loopContext)_localctx).step_expr = expression(0);
				}
			}

			setState(326);
			match(R_PAREN);
			setState(327);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MyLangParser.WHILE, 0); }
		public TerminalNode L_PAREN() { return getToken(MyLangParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MyLangParser.R_PAREN, 0); }
		public TerminalNode DO() { return getToken(MyLangParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(WHILE);
			setState(330);
			match(L_PAREN);
			setState(331);
			expression(0);
			setState(332);
			match(R_PAREN);
			setState(333);
			match(DO);
			setState(334);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Repeat_until_loopContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(MyLangParser.REPEAT, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(MyLangParser.UNTIL, 0); }
		public TerminalNode L_PAREN() { return getToken(MyLangParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MyLangParser.R_PAREN, 0); }
		public Repeat_until_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_until_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterRepeat_until_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitRepeat_until_loop(this);
		}
	}

	public final Repeat_until_loopContext repeat_until_loop() throws RecognitionException {
		Repeat_until_loopContext _localctx = new Repeat_until_loopContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_repeat_until_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(REPEAT);
			setState(337);
			statement();
			setState(338);
			match(UNTIL);
			setState(339);
			match(L_PAREN);
			setState(340);
			expression(0);
			setState(341);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(MyLangParser.AND, 0); }
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitAndExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(MyLangParser.POW, 0); }
		public PowerExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterPowerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitPowerExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivModExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(MyLangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MyLangParser.DIV, 0); }
		public TerminalNode INT_DIV() { return getToken(MyLangParser.INT_DIV, 0); }
		public TerminalNode MOD() { return getToken(MyLangParser.MOD, 0); }
		public MulDivModExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterMulDivModExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitMulDivModExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(MyLangParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitNotExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GT() { return getToken(MyLangParser.GT, 0); }
		public TerminalNode LT() { return getToken(MyLangParser.LT, 0); }
		public TerminalNode GTE() { return getToken(MyLangParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(MyLangParser.LTE, 0); }
		public TerminalNode EQ() { return getToken(MyLangParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MyLangParser.NEQ, 0); }
		public RelationalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitRelationalExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnarySignExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(MyLangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MyLangParser.MINUS, 0); }
		public UnarySignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterUnarySignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitUnarySignExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomExprContext extends ExpressionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitAtomExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MyLangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MyLangParser.MINUS, 0); }
		public AddSubExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitAddSubExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(MyLangParser.OR, 0); }
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitOrExpr(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				{
				_localctx = new UnarySignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(344);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(345);
				expression(3);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(346);
				match(NOT);
				setState(347);
				expression(2);
				}
				break;
			case TRUE:
			case FALSE:
			case L_PAREN:
			case IDENTIFIER:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(348);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(369);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(351);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(352);
						match(POW);
						setState(353);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new MulDivModExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(354);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(355);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(356);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(357);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(358);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(359);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(360);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(361);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 69269232549888L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(362);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(363);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(364);
						match(AND);
						setState(365);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(366);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(367);
						match(OR);
						setState(368);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public Variable_accessContext variable_access() {
			return getRuleContext(Variable_accessContext.class,0);
		}
		public Constant_valueContext constant_value() {
			return getRuleContext(Constant_valueContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(MyLangParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MyLangParser.R_PAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_atom);
		try {
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				variable_access();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				constant_value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				match(L_PAREN);
				setState(377);
				expression(0);
				setState(378);
				match(R_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_accessContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyLangParser.IDENTIFIER, 0); }
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public Variable_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterVariable_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitVariable_access(this);
		}
	}

	public final Variable_accessContext variable_access() throws RecognitionException {
		Variable_accessContext _localctx = new Variable_accessContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variable_access);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(IDENTIFIER);
			setState(386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(383);
					selector();
					}
					} 
				}
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public IndexerContext indexer() {
			return getRuleContext(IndexerContext.class,0);
		}
		public Field_selectorContext field_selector() {
			return getRuleContext(Field_selectorContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_selector);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				indexer();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				field_selector();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexerContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(MyLangParser.L_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(MyLangParser.R_BRACKET, 0); }
		public IndexerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterIndexer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitIndexer(this);
		}
	}

	public final IndexerContext indexer() throws RecognitionException {
		IndexerContext _localctx = new IndexerContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_indexer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(L_BRACKET);
			setState(394);
			expression(0);
			setState(395);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Field_selectorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(MyLangParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyLangParser.IDENTIFIER, 0); }
		public Field_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterField_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitField_selector(this);
		}
	}

	public final Field_selectorContext field_selector() throws RecognitionException {
		Field_selectorContext _localctx = new Field_selectorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_field_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(DOT);
			setState(398);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_valueContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MyLangParser.IDENTIFIER, 0); }
		public Constant_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterConstant_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitConstant_value(this);
		}
	}

	public final Constant_valueContext constant_value() throws RecognitionException {
		Constant_valueContext _localctx = new Constant_valueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constant_value);
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(MyLangParser.INTEGER_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(MyLangParser.REAL_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(MyLangParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(MyLangParser.STRING_LITERAL, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_literal);
		try {
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				match(INTEGER_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				match(REAL_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(407);
				match(STRING_LITERAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(408);
				boolean_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MyLangParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MyLangParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitBoolean_literal(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 37:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001=\u019e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002k\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0004\u0003o\b\u0003\u000b\u0003\f\u0003p\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0004\u0005"+
		"z\b\u0005\u000b\u0005\f\u0005{\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0085\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u0096\b\n\n\n\f\n\u0099"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u009e\b\u000b\n\u000b"+
		"\f\u000b\u00a1\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0004\f\u00a8\b\f\u000b\f\f\f\u00a9\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00b2\b\u000e\n\u000e\f\u000e\u00b5"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f\u00bb"+
		"\b\u000f\u000b\u000f\f\u000f\u00bc\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00c7\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00d1\b\u0013\n\u0013"+
		"\f\u0013\u00d4\t\u0013\u0001\u0014\u0003\u0014\u00d7\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u00e1\b\u0016\n\u0016\f\u0016\u00e4\t\u0016\u0001"+
		"\u0016\u0003\u0016\u00e7\b\u0016\u0003\u0016\u00e9\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00f5\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0108\b\u001b"+
		"\n\u001b\f\u001b\u010b\t\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u010f"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0114\b\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u011b\b\u001e\n\u001e\f\u001e\u011e\t\u001e\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0005 \u012e\b \n \f \u0131\t \u0001 \u0001 \u0003 \u0135\b "+
		"\u0001!\u0001!\u0001!\u0003!\u013a\b!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0145\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0003%\u015e\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0005%\u0172\b%\n%\f%\u0175\t%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0003&\u017d\b&\u0001\'\u0001\'\u0005\'\u0181\b\'\n\'\f\'\u0184"+
		"\t\'\u0001(\u0001(\u0003(\u0188\b(\u0001)\u0001)\u0001)\u0001)\u0001*"+
		"\u0001*\u0001*\u0001+\u0001+\u0003+\u0193\b+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u019a\b,\u0001-\u0001-\u0001-\u0000\u0001J.\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\u0000\u0006\u0001\u0000\t\n\u0002\u0000"+
		"\u000b\u000f88\u0001\u0000\u001d\u001e\u0001\u0000\u001f\"\u0001\u0000"+
		"(-\u0001\u0000\u001b\u001c\u01a1\u0000\\\u0001\u0000\u0000\u0000\u0002"+
		"c\u0001\u0000\u0000\u0000\u0004j\u0001\u0000\u0000\u0000\u0006l\u0001"+
		"\u0000\u0000\u0000\br\u0001\u0000\u0000\u0000\nw\u0001\u0000\u0000\u0000"+
		"\f}\u0001\u0000\u0000\u0000\u000e\u0084\u0001\u0000\u0000\u0000\u0010"+
		"\u0086\u0001\u0000\u0000\u0000\u0012\u008d\u0001\u0000\u0000\u0000\u0014"+
		"\u0092\u0001\u0000\u0000\u0000\u0016\u009a\u0001\u0000\u0000\u0000\u0018"+
		"\u00a5\u0001\u0000\u0000\u0000\u001a\u00ab\u0001\u0000\u0000\u0000\u001c"+
		"\u00ae\u0001\u0000\u0000\u0000\u001e\u00ba\u0001\u0000\u0000\u0000 \u00be"+
		"\u0001\u0000\u0000\u0000\"\u00c2\u0001\u0000\u0000\u0000$\u00cb\u0001"+
		"\u0000\u0000\u0000&\u00cd\u0001\u0000\u0000\u0000(\u00d6\u0001\u0000\u0000"+
		"\u0000*\u00da\u0001\u0000\u0000\u0000,\u00dc\u0001\u0000\u0000\u0000."+
		"\u00f4\u0001\u0000\u0000\u00000\u00f6\u0001\u0000\u0000\u00002\u00fa\u0001"+
		"\u0000\u0000\u00004\u00ff\u0001\u0000\u0000\u00006\u0104\u0001\u0000\u0000"+
		"\u00008\u010e\u0001\u0000\u0000\u0000:\u0110\u0001\u0000\u0000\u0000<"+
		"\u0117\u0001\u0000\u0000\u0000>\u011f\u0001\u0000\u0000\u0000@\u0121\u0001"+
		"\u0000\u0000\u0000B\u0139\u0001\u0000\u0000\u0000D\u013b\u0001\u0000\u0000"+
		"\u0000F\u0149\u0001\u0000\u0000\u0000H\u0150\u0001\u0000\u0000\u0000J"+
		"\u015d\u0001\u0000\u0000\u0000L\u017c\u0001\u0000\u0000\u0000N\u017e\u0001"+
		"\u0000\u0000\u0000P\u0187\u0001\u0000\u0000\u0000R\u0189\u0001\u0000\u0000"+
		"\u0000T\u018d\u0001\u0000\u0000\u0000V\u0192\u0001\u0000\u0000\u0000X"+
		"\u0199\u0001\u0000\u0000\u0000Z\u019b\u0001\u0000\u0000\u0000\\]\u0005"+
		"\u0001\u0000\u0000]^\u00058\u0000\u0000^_\u00050\u0000\u0000_`\u0003\u0002"+
		"\u0001\u0000`a\u0005.\u0000\u0000ab\u0005\u0000\u0000\u0001b\u0001\u0001"+
		"\u0000\u0000\u0000cd\u0003\u0004\u0002\u0000de\u0003,\u0016\u0000e\u0003"+
		"\u0001\u0000\u0000\u0000fk\u0003\u0006\u0003\u0000gk\u0003\n\u0005\u0000"+
		"hk\u0003\u0018\f\u0000ik\u0003\u001e\u000f\u0000jf\u0001\u0000\u0000\u0000"+
		"jg\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000"+
		"\u0000k\u0005\u0001\u0000\u0000\u0000ln\u0005\u0002\u0000\u0000mo\u0003"+
		"\b\u0004\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q\u0007\u0001\u0000\u0000"+
		"\u0000rs\u00058\u0000\u0000st\u0005\'\u0000\u0000tu\u0003V+\u0000uv\u0005"+
		"0\u0000\u0000v\t\u0001\u0000\u0000\u0000wy\u0005\u0003\u0000\u0000xz\u0003"+
		"\f\u0006\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u000b\u0001\u0000\u0000"+
		"\u0000}~\u00058\u0000\u0000~\u007f\u0005\'\u0000\u0000\u007f\u0080\u0003"+
		"\u000e\u0007\u0000\u0080\u0081\u00050\u0000\u0000\u0081\r\u0001\u0000"+
		"\u0000\u0000\u0082\u0085\u0003\u0010\b\u0000\u0083\u0085\u0003\u0012\t"+
		"\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u000f\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0006\u0000"+
		"\u0000\u0087\u0088\u00056\u0000\u0000\u0088\u0089\u00059\u0000\u0000\u0089"+
		"\u008a\u00057\u0000\u0000\u008a\u008b\u0005\b\u0000\u0000\u008b\u008c"+
		"\u0003*\u0015\u0000\u008c\u0011\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"\u0007\u0000\u0000\u008e\u008f\u00054\u0000\u0000\u008f\u0090\u0003\u0014"+
		"\n\u0000\u0090\u0091\u00055\u0000\u0000\u0091\u0013\u0001\u0000\u0000"+
		"\u0000\u0092\u0097\u0003\u0016\u000b\u0000\u0093\u0094\u00050\u0000\u0000"+
		"\u0094\u0096\u0003\u0016\u000b\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0015\u0001\u0000\u0000\u0000"+
		"\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009f\u00058\u0000\u0000\u009b"+
		"\u009c\u0005/\u0000\u0000\u009c\u009e\u00058\u0000\u0000\u009d\u009b\u0001"+
		"\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"1\u0000\u0000\u00a3\u00a4\u0003*\u0015\u0000\u00a4\u0017\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a7\u0005\u0004\u0000\u0000\u00a6\u00a8\u0003\u001a\r\u0000"+
		"\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u0019\u0001\u0000\u0000\u0000\u00ab\u00ac\u0003\u001c\u000e\u0000"+
		"\u00ac\u00ad\u00050\u0000\u0000\u00ad\u001b\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b3\u00058\u0000\u0000\u00af\u00b0\u0005/\u0000\u0000\u00b0\u00b2\u0005"+
		"8\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u00051\u0000\u0000\u00b7\u00b8\u0003*\u0015\u0000"+
		"\u00b8\u001d\u0001\u0000\u0000\u0000\u00b9\u00bb\u0003 \u0010\u0000\u00ba"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u001f\u0001\u0000\u0000\u0000\u00be\u00bf\u0003\"\u0011\u0000\u00bf\u00c0"+
		"\u0003$\u0012\u0000\u00c0\u00c1\u00050\u0000\u0000\u00c1!\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0005\u0005\u0000\u0000\u00c3\u00c4\u00058\u0000"+
		"\u0000\u00c4\u00c6\u00052\u0000\u0000\u00c5\u00c7\u0003&\u0013\u0000\u00c6"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u00053\u0000\u0000\u00c9\u00ca"+
		"\u00050\u0000\u0000\u00ca#\u0001\u0000\u0000\u0000\u00cb\u00cc\u0003\u0002"+
		"\u0001\u0000\u00cc%\u0001\u0000\u0000\u0000\u00cd\u00d2\u0003(\u0014\u0000"+
		"\u00ce\u00cf\u00050\u0000\u0000\u00cf\u00d1\u0003(\u0014\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\'\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d7\u0007"+
		"\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003"+
		"\u001c\u000e\u0000\u00d9)\u0001\u0000\u0000\u0000\u00da\u00db\u0007\u0001"+
		"\u0000\u0000\u00db+\u0001\u0000\u0000\u0000\u00dc\u00e8\u00054\u0000\u0000"+
		"\u00dd\u00e2\u0003.\u0017\u0000\u00de\u00df\u00050\u0000\u0000\u00df\u00e1"+
		"\u0003.\u0017\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e7\u00050\u0000\u0000\u00e6\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e9\u0001\u0000"+
		"\u0000\u0000\u00e8\u00dd\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u00055\u0000"+
		"\u0000\u00eb-\u0001\u0000\u0000\u0000\u00ec\u00f5\u00030\u0018\u0000\u00ed"+
		"\u00f5\u00032\u0019\u0000\u00ee\u00f5\u00034\u001a\u0000\u00ef\u00f5\u0003"+
		":\u001d\u0000\u00f0\u00f5\u0003@ \u0000\u00f1\u00f5\u0003B!\u0000\u00f2"+
		"\u00f5\u0003,\u0016\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00ec"+
		"\u0001\u0000\u0000\u0000\u00f4\u00ed\u0001\u0000\u0000\u0000\u00f4\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f4\u00ef\u0001\u0000\u0000\u0000\u00f4\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5/\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0003N\'\u0000\u00f7\u00f8\u0005\'\u0000"+
		"\u0000\u00f8\u00f9\u0003J%\u0000\u00f91\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0005\u0010\u0000\u0000\u00fb\u00fc\u00052\u0000\u0000\u00fc\u00fd"+
		"\u0003N\'\u0000\u00fd\u00fe\u00053\u0000\u0000\u00fe3\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005\u0011\u0000\u0000\u0100\u0101\u00052\u0000\u0000"+
		"\u0101\u0102\u00036\u001b\u0000\u0102\u0103\u00053\u0000\u0000\u01035"+
		"\u0001\u0000\u0000\u0000\u0104\u0109\u00038\u001c\u0000\u0105\u0106\u0005"+
		"/\u0000\u0000\u0106\u0108\u00038\u001c\u0000\u0107\u0105\u0001\u0000\u0000"+
		"\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a7\u0001\u0000\u0000\u0000"+
		"\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010f\u0003N\'\u0000\u010d"+
		"\u010f\u0003X,\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010d\u0001"+
		"\u0000\u0000\u0000\u010f9\u0001\u0000\u0000\u0000\u0110\u0111\u00058\u0000"+
		"\u0000\u0111\u0113\u00052\u0000\u0000\u0112\u0114\u0003<\u001e\u0000\u0113"+
		"\u0112\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0001\u0000\u0000\u0000\u0115\u0116\u00053\u0000\u0000\u0116;\u0001"+
		"\u0000\u0000\u0000\u0117\u011c\u0003>\u001f\u0000\u0118\u0119\u0005/\u0000"+
		"\u0000\u0119\u011b\u0003>\u001f\u0000\u011a\u0118\u0001\u0000\u0000\u0000"+
		"\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0001\u0000\u0000\u0000\u011d=\u0001\u0000\u0000\u0000\u011e"+
		"\u011c\u0001\u0000\u0000\u0000\u011f\u0120\u0003J%\u0000\u0120?\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0005\u0012\u0000\u0000\u0122\u0123\u0005"+
		"2\u0000\u0000\u0123\u0124\u0003J%\u0000\u0124\u0125\u00053\u0000\u0000"+
		"\u0125\u012f\u0003.\u0017\u0000\u0126\u0127\u0005\u0013\u0000\u0000\u0127"+
		"\u0128\u0005\u0012\u0000\u0000\u0128\u0129\u00052\u0000\u0000\u0129\u012a"+
		"\u0003J%\u0000\u012a\u012b\u00053\u0000\u0000\u012b\u012c\u0003.\u0017"+
		"\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u0126\u0001\u0000\u0000"+
		"\u0000\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0134\u0001\u0000\u0000"+
		"\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u0013\u0000"+
		"\u0000\u0133\u0135\u0003.\u0017\u0000\u0134\u0132\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0001\u0000\u0000\u0000\u0135A\u0001\u0000\u0000\u0000\u0136"+
		"\u013a\u0003D\"\u0000\u0137\u013a\u0003F#\u0000\u0138\u013a\u0003H$\u0000"+
		"\u0139\u0136\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000"+
		"\u0139\u0138\u0001\u0000\u0000\u0000\u013aC\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0005\u0014\u0000\u0000\u013c\u013d\u00052\u0000\u0000\u013d\u013e"+
		"\u00058\u0000\u0000\u013e\u013f\u0005\'\u0000\u0000\u013f\u0140\u0003"+
		"J%\u0000\u0140\u0141\u0005\u0015\u0000\u0000\u0141\u0144\u0003J%\u0000"+
		"\u0142\u0143\u0005\u0016\u0000\u0000\u0143\u0145\u0003J%\u0000\u0144\u0142"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146"+
		"\u0001\u0000\u0000\u0000\u0146\u0147\u00053\u0000\u0000\u0147\u0148\u0003"+
		".\u0017\u0000\u0148E\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u0017\u0000"+
		"\u0000\u014a\u014b\u00052\u0000\u0000\u014b\u014c\u0003J%\u0000\u014c"+
		"\u014d\u00053\u0000\u0000\u014d\u014e\u0005\u0018\u0000\u0000\u014e\u014f"+
		"\u0003.\u0017\u0000\u014fG\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u0019"+
		"\u0000\u0000\u0151\u0152\u0003.\u0017\u0000\u0152\u0153\u0005\u001a\u0000"+
		"\u0000\u0153\u0154\u00052\u0000\u0000\u0154\u0155\u0003J%\u0000\u0155"+
		"\u0156\u00053\u0000\u0000\u0156I\u0001\u0000\u0000\u0000\u0157\u0158\u0006"+
		"%\uffff\uffff\u0000\u0158\u0159\u0007\u0002\u0000\u0000\u0159\u015e\u0003"+
		"J%\u0003\u015a\u015b\u0005&\u0000\u0000\u015b\u015e\u0003J%\u0002\u015c"+
		"\u015e\u0003L&\u0000\u015d\u0157\u0001\u0000\u0000\u0000\u015d\u015a\u0001"+
		"\u0000\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e\u0173\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\n\t\u0000\u0000\u0160\u0161\u0005#\u0000"+
		"\u0000\u0161\u0172\u0003J%\t\u0162\u0163\n\b\u0000\u0000\u0163\u0164\u0007"+
		"\u0003\u0000\u0000\u0164\u0172\u0003J%\t\u0165\u0166\n\u0007\u0000\u0000"+
		"\u0166\u0167\u0007\u0002\u0000\u0000\u0167\u0172\u0003J%\b\u0168\u0169"+
		"\n\u0006\u0000\u0000\u0169\u016a\u0007\u0004\u0000\u0000\u016a\u0172\u0003"+
		"J%\u0007\u016b\u016c\n\u0005\u0000\u0000\u016c\u016d\u0005$\u0000\u0000"+
		"\u016d\u0172\u0003J%\u0006\u016e\u016f\n\u0004\u0000\u0000\u016f\u0170"+
		"\u0005%\u0000\u0000\u0170\u0172\u0003J%\u0005\u0171\u015f\u0001\u0000"+
		"\u0000\u0000\u0171\u0162\u0001\u0000\u0000\u0000\u0171\u0165\u0001\u0000"+
		"\u0000\u0000\u0171\u0168\u0001\u0000\u0000\u0000\u0171\u016b\u0001\u0000"+
		"\u0000\u0000\u0171\u016e\u0001\u0000\u0000\u0000\u0172\u0175\u0001\u0000"+
		"\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000"+
		"\u0000\u0000\u0174K\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000"+
		"\u0000\u0176\u017d\u0003N\'\u0000\u0177\u017d\u0003V+\u0000\u0178\u0179"+
		"\u00052\u0000\u0000\u0179\u017a\u0003J%\u0000\u017a\u017b\u00053\u0000"+
		"\u0000\u017b\u017d\u0001\u0000\u0000\u0000\u017c\u0176\u0001\u0000\u0000"+
		"\u0000\u017c\u0177\u0001\u0000\u0000\u0000\u017c\u0178\u0001\u0000\u0000"+
		"\u0000\u017dM\u0001\u0000\u0000\u0000\u017e\u0182\u00058\u0000\u0000\u017f"+
		"\u0181\u0003P(\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0181\u0184\u0001"+
		"\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001"+
		"\u0000\u0000\u0000\u0183O\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000"+
		"\u0000\u0000\u0185\u0188\u0003R)\u0000\u0186\u0188\u0003T*\u0000\u0187"+
		"\u0185\u0001\u0000\u0000\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0188"+
		"Q\u0001\u0000\u0000\u0000\u0189\u018a\u00056\u0000\u0000\u018a\u018b\u0003"+
		"J%\u0000\u018b\u018c\u00057\u0000\u0000\u018cS\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0005.\u0000\u0000\u018e\u018f\u00058\u0000\u0000\u018fU"+
		"\u0001\u0000\u0000\u0000\u0190\u0193\u0003X,\u0000\u0191\u0193\u00058"+
		"\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0191\u0001\u0000"+
		"\u0000\u0000\u0193W\u0001\u0000\u0000\u0000\u0194\u019a\u00059\u0000\u0000"+
		"\u0195\u019a\u0005:\u0000\u0000\u0196\u019a\u0005;\u0000\u0000\u0197\u019a"+
		"\u0005<\u0000\u0000\u0198\u019a\u0003Z-\u0000\u0199\u0194\u0001\u0000"+
		"\u0000\u0000\u0199\u0195\u0001\u0000\u0000\u0000\u0199\u0196\u0001\u0000"+
		"\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u0199\u0198\u0001\u0000"+
		"\u0000\u0000\u019aY\u0001\u0000\u0000\u0000\u019b\u019c\u0007\u0005\u0000"+
		"\u0000\u019c[\u0001\u0000\u0000\u0000 jp{\u0084\u0097\u009f\u00a9\u00b3"+
		"\u00bc\u00c6\u00d2\u00d6\u00e2\u00e6\u00e8\u00f4\u0109\u010e\u0113\u011c"+
		"\u012f\u0134\u0139\u0144\u015d\u0171\u0173\u017c\u0182\u0187\u0192\u0199";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}