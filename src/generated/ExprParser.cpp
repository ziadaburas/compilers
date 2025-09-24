
// Generated from d:/compilersLectures/lect4/grammer/Expr.g4 by ANTLR 4.13.1


#include "ExprListener.h"
#include "ExprVisitor.h"

#include "ExprParser.h"


using namespace antlrcpp;
using namespace antlr_generated;

using namespace antlr4;

namespace {

struct ExprParserStaticData final {
  ExprParserStaticData(std::vector<std::string> ruleNames,
                        std::vector<std::string> literalNames,
                        std::vector<std::string> symbolicNames)
      : ruleNames(std::move(ruleNames)), literalNames(std::move(literalNames)),
        symbolicNames(std::move(symbolicNames)),
        vocabulary(this->literalNames, this->symbolicNames) {}

  ExprParserStaticData(const ExprParserStaticData&) = delete;
  ExprParserStaticData(ExprParserStaticData&&) = delete;
  ExprParserStaticData& operator=(const ExprParserStaticData&) = delete;
  ExprParserStaticData& operator=(ExprParserStaticData&&) = delete;

  std::vector<antlr4::dfa::DFA> decisionToDFA;
  antlr4::atn::PredictionContextCache sharedContextCache;
  const std::vector<std::string> ruleNames;
  const std::vector<std::string> literalNames;
  const std::vector<std::string> symbolicNames;
  const antlr4::dfa::Vocabulary vocabulary;
  antlr4::atn::SerializedATNView serializedATN;
  std::unique_ptr<antlr4::atn::ATN> atn;
};

::antlr4::internal::OnceFlag exprParserOnceFlag;
#if ANTLR4_USE_THREAD_LOCAL_CACHE
static thread_local
#endif
ExprParserStaticData *exprParserStaticData = nullptr;

void exprParserInitialize() {
#if ANTLR4_USE_THREAD_LOCAL_CACHE
  if (exprParserStaticData != nullptr) {
    return;
  }
#else
  assert(exprParserStaticData == nullptr);
#endif
  auto staticData = std::make_unique<ExprParserStaticData>(
    std::vector<std::string>{
      "program", "toplevelStatement", "declaration", "functionDeclaration", 
      "parameterList", "parameter", "type", "compoundStatement", "statement", 
      "variableDeclaration", "returnStatement", "ifStatement", "whileStatement", 
      "expression", "logicalOrExpression", "logicalAndExpression", "equalityExpression", 
      "relationalExpression", "additiveExpression", "multiplicativeExpression", 
      "unaryExpression", "primaryExpression", "boolLiteral", "argumentList"
    },
    std::vector<std::string>{
      "", "'\\u0635\\u062D\\u064A\\u062D'", "'\\u0639\\u0634\\u0631\\u064A'", 
      "'\\u0646\\u0635'", "'\\u0645\\u0646\\u0637\\u0642\\u064A'", "'\\u0641\\u0631\\u0627\\u063A'", 
      "'\\u0627\\u0630\\u0627'", "'\\u0648\\u0627\\u0644\\u0627'", "'\\u0637\\u0627\\u0644\\u0645\\u0627'", 
      "'\\u0623\\u0639\\u062F'", "'\\u0635\\u062D'", "'\\u062E\\u0637\\u0623'", 
      "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'=='", "'!='", "'<'", "'>'", 
      "'<='", "'>='", "'&&'", "'||'", "'!'", "';'", "','", "'('", "')'", 
      "'{'", "'}'"
    },
    std::vector<std::string>{
      "", "KW_INT", "KW_DOUBLE", "KW_STRING", "KW_BOOL", "KW_VOID", "KW_IF", 
      "KW_ELSE", "KW_WHILE", "KW_RETURN", "KW_TRUE", "KW_FALSE", "ADD", 
      "SUB", "MUL", "DIV", "MOD", "ASSIGN", "EQ", "NEQ", "LT", "GT", "LE", 
      "GE", "LOGICAL_AND", "LOGICAL_OR", "NOT", "SEMI", "COMMA", "OPEN_PAREN", 
      "CLOSE_PAREN", "OPEN_BRACE", "CLOSE_BRACE", "STRING_LITERAL", "ID", 
      "INT_LITERAL", "DOUBLE_LITERAL", "WS", "COMMENT", "MULTILINE_COMMENT"
    }
  );
  static const int32_t serializedATNSegment[] = {
  	4,1,39,223,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,2,
  	7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,2,14,7,
  	14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,7,20,2,21,7,
  	21,2,22,7,22,2,23,7,23,1,0,5,0,50,8,0,10,0,12,0,53,9,0,1,0,1,0,1,1,1,
  	1,3,1,59,8,1,1,2,1,2,1,2,1,2,3,2,65,8,2,1,3,1,3,1,3,1,3,3,3,71,8,3,1,
  	3,1,3,1,3,1,4,1,4,1,4,5,4,79,8,4,10,4,12,4,82,9,4,1,5,1,5,1,5,1,6,1,6,
  	1,7,1,7,5,7,91,8,7,10,7,12,7,94,9,7,1,7,1,7,1,8,1,8,1,8,1,8,1,8,1,8,1,
  	8,1,8,1,8,1,8,1,8,1,8,3,8,110,8,8,1,9,1,9,1,9,1,9,3,9,116,8,9,1,10,1,
  	10,3,10,120,8,10,1,11,1,11,1,11,1,11,1,11,1,11,1,11,3,11,129,8,11,1,12,
  	1,12,1,12,1,12,1,12,1,12,1,13,1,13,1,13,1,13,3,13,141,8,13,1,14,1,14,
  	1,14,5,14,146,8,14,10,14,12,14,149,9,14,1,15,1,15,1,15,5,15,154,8,15,
  	10,15,12,15,157,9,15,1,16,1,16,1,16,5,16,162,8,16,10,16,12,16,165,9,16,
  	1,17,1,17,1,17,5,17,170,8,17,10,17,12,17,173,9,17,1,18,1,18,1,18,5,18,
  	178,8,18,10,18,12,18,181,9,18,1,19,1,19,1,19,5,19,186,8,19,10,19,12,19,
  	189,9,19,1,20,1,20,1,20,3,20,194,8,20,1,21,1,21,1,21,1,21,1,21,1,21,1,
  	21,1,21,3,21,204,8,21,1,21,1,21,1,21,1,21,1,21,3,21,211,8,21,1,22,1,22,
  	1,23,1,23,1,23,5,23,218,8,23,10,23,12,23,221,9,23,1,23,0,0,24,0,2,4,6,
  	8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,0,7,1,0,1,
  	5,1,0,18,19,1,0,20,23,1,0,12,13,1,0,14,16,2,0,12,13,26,26,1,0,10,11,228,
  	0,51,1,0,0,0,2,58,1,0,0,0,4,64,1,0,0,0,6,66,1,0,0,0,8,75,1,0,0,0,10,83,
  	1,0,0,0,12,86,1,0,0,0,14,88,1,0,0,0,16,109,1,0,0,0,18,111,1,0,0,0,20,
  	117,1,0,0,0,22,121,1,0,0,0,24,130,1,0,0,0,26,140,1,0,0,0,28,142,1,0,0,
  	0,30,150,1,0,0,0,32,158,1,0,0,0,34,166,1,0,0,0,36,174,1,0,0,0,38,182,
  	1,0,0,0,40,193,1,0,0,0,42,210,1,0,0,0,44,212,1,0,0,0,46,214,1,0,0,0,48,
  	50,3,2,1,0,49,48,1,0,0,0,50,53,1,0,0,0,51,49,1,0,0,0,51,52,1,0,0,0,52,
  	54,1,0,0,0,53,51,1,0,0,0,54,55,5,0,0,1,55,1,1,0,0,0,56,59,3,6,3,0,57,
  	59,3,16,8,0,58,56,1,0,0,0,58,57,1,0,0,0,59,3,1,0,0,0,60,65,3,6,3,0,61,
  	62,3,18,9,0,62,63,5,27,0,0,63,65,1,0,0,0,64,60,1,0,0,0,64,61,1,0,0,0,
  	65,5,1,0,0,0,66,67,3,12,6,0,67,68,5,34,0,0,68,70,5,29,0,0,69,71,3,8,4,
  	0,70,69,1,0,0,0,70,71,1,0,0,0,71,72,1,0,0,0,72,73,5,30,0,0,73,74,3,14,
  	7,0,74,7,1,0,0,0,75,80,3,10,5,0,76,77,5,28,0,0,77,79,3,10,5,0,78,76,1,
  	0,0,0,79,82,1,0,0,0,80,78,1,0,0,0,80,81,1,0,0,0,81,9,1,0,0,0,82,80,1,
  	0,0,0,83,84,3,12,6,0,84,85,5,34,0,0,85,11,1,0,0,0,86,87,7,0,0,0,87,13,
  	1,0,0,0,88,92,5,31,0,0,89,91,3,16,8,0,90,89,1,0,0,0,91,94,1,0,0,0,92,
  	90,1,0,0,0,92,93,1,0,0,0,93,95,1,0,0,0,94,92,1,0,0,0,95,96,5,32,0,0,96,
  	15,1,0,0,0,97,98,3,18,9,0,98,99,5,27,0,0,99,110,1,0,0,0,100,101,3,26,
  	13,0,101,102,5,27,0,0,102,110,1,0,0,0,103,104,3,20,10,0,104,105,5,27,
  	0,0,105,110,1,0,0,0,106,110,3,22,11,0,107,110,3,24,12,0,108,110,3,14,
  	7,0,109,97,1,0,0,0,109,100,1,0,0,0,109,103,1,0,0,0,109,106,1,0,0,0,109,
  	107,1,0,0,0,109,108,1,0,0,0,110,17,1,0,0,0,111,112,3,12,6,0,112,115,5,
  	34,0,0,113,114,5,17,0,0,114,116,3,26,13,0,115,113,1,0,0,0,115,116,1,0,
  	0,0,116,19,1,0,0,0,117,119,5,9,0,0,118,120,3,26,13,0,119,118,1,0,0,0,
  	119,120,1,0,0,0,120,21,1,0,0,0,121,122,5,6,0,0,122,123,5,29,0,0,123,124,
  	3,26,13,0,124,125,5,30,0,0,125,128,3,16,8,0,126,127,5,7,0,0,127,129,3,
  	16,8,0,128,126,1,0,0,0,128,129,1,0,0,0,129,23,1,0,0,0,130,131,5,8,0,0,
  	131,132,5,29,0,0,132,133,3,26,13,0,133,134,5,30,0,0,134,135,3,16,8,0,
  	135,25,1,0,0,0,136,137,5,34,0,0,137,138,5,17,0,0,138,141,3,26,13,0,139,
  	141,3,28,14,0,140,136,1,0,0,0,140,139,1,0,0,0,141,27,1,0,0,0,142,147,
  	3,30,15,0,143,144,5,25,0,0,144,146,3,30,15,0,145,143,1,0,0,0,146,149,
  	1,0,0,0,147,145,1,0,0,0,147,148,1,0,0,0,148,29,1,0,0,0,149,147,1,0,0,
  	0,150,155,3,32,16,0,151,152,5,24,0,0,152,154,3,32,16,0,153,151,1,0,0,
  	0,154,157,1,0,0,0,155,153,1,0,0,0,155,156,1,0,0,0,156,31,1,0,0,0,157,
  	155,1,0,0,0,158,163,3,34,17,0,159,160,7,1,0,0,160,162,3,34,17,0,161,159,
  	1,0,0,0,162,165,1,0,0,0,163,161,1,0,0,0,163,164,1,0,0,0,164,33,1,0,0,
  	0,165,163,1,0,0,0,166,171,3,36,18,0,167,168,7,2,0,0,168,170,3,36,18,0,
  	169,167,1,0,0,0,170,173,1,0,0,0,171,169,1,0,0,0,171,172,1,0,0,0,172,35,
  	1,0,0,0,173,171,1,0,0,0,174,179,3,38,19,0,175,176,7,3,0,0,176,178,3,38,
  	19,0,177,175,1,0,0,0,178,181,1,0,0,0,179,177,1,0,0,0,179,180,1,0,0,0,
  	180,37,1,0,0,0,181,179,1,0,0,0,182,187,3,40,20,0,183,184,7,4,0,0,184,
  	186,3,40,20,0,185,183,1,0,0,0,186,189,1,0,0,0,187,185,1,0,0,0,187,188,
  	1,0,0,0,188,39,1,0,0,0,189,187,1,0,0,0,190,191,7,5,0,0,191,194,3,40,20,
  	0,192,194,3,42,21,0,193,190,1,0,0,0,193,192,1,0,0,0,194,41,1,0,0,0,195,
  	211,5,35,0,0,196,211,5,36,0,0,197,211,3,44,22,0,198,211,5,33,0,0,199,
  	211,5,34,0,0,200,201,5,34,0,0,201,203,5,29,0,0,202,204,3,46,23,0,203,
  	202,1,0,0,0,203,204,1,0,0,0,204,205,1,0,0,0,205,211,5,30,0,0,206,207,
  	5,29,0,0,207,208,3,26,13,0,208,209,5,30,0,0,209,211,1,0,0,0,210,195,1,
  	0,0,0,210,196,1,0,0,0,210,197,1,0,0,0,210,198,1,0,0,0,210,199,1,0,0,0,
  	210,200,1,0,0,0,210,206,1,0,0,0,211,43,1,0,0,0,212,213,7,6,0,0,213,45,
  	1,0,0,0,214,219,3,26,13,0,215,216,5,28,0,0,216,218,3,26,13,0,217,215,
  	1,0,0,0,218,221,1,0,0,0,219,217,1,0,0,0,219,220,1,0,0,0,220,47,1,0,0,
  	0,221,219,1,0,0,0,21,51,58,64,70,80,92,109,115,119,128,140,147,155,163,
  	171,179,187,193,203,210,219
  };
  staticData->serializedATN = antlr4::atn::SerializedATNView(serializedATNSegment, sizeof(serializedATNSegment) / sizeof(serializedATNSegment[0]));

  antlr4::atn::ATNDeserializer deserializer;
  staticData->atn = deserializer.deserialize(staticData->serializedATN);

  const size_t count = staticData->atn->getNumberOfDecisions();
  staticData->decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    staticData->decisionToDFA.emplace_back(staticData->atn->getDecisionState(i), i);
  }
  exprParserStaticData = staticData.release();
}

}

ExprParser::ExprParser(TokenStream *input) : ExprParser(input, antlr4::atn::ParserATNSimulatorOptions()) {}

ExprParser::ExprParser(TokenStream *input, const antlr4::atn::ParserATNSimulatorOptions &options) : Parser(input) {
  ExprParser::initialize();
  _interpreter = new atn::ParserATNSimulator(this, *exprParserStaticData->atn, exprParserStaticData->decisionToDFA, exprParserStaticData->sharedContextCache, options);
}

ExprParser::~ExprParser() {
  delete _interpreter;
}

const atn::ATN& ExprParser::getATN() const {
  return *exprParserStaticData->atn;
}

std::string ExprParser::getGrammarFileName() const {
  return "Expr.g4";
}

const std::vector<std::string>& ExprParser::getRuleNames() const {
  return exprParserStaticData->ruleNames;
}

const dfa::Vocabulary& ExprParser::getVocabulary() const {
  return exprParserStaticData->vocabulary;
}

antlr4::atn::SerializedATNView ExprParser::getSerializedATN() const {
  return exprParserStaticData->serializedATN;
}


//----------------- ProgramContext ------------------------------------------------------------------

ExprParser::ProgramContext::ProgramContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ExprParser::ProgramContext::EOF() {
  return getToken(ExprParser::EOF, 0);
}

std::vector<ExprParser::ToplevelStatementContext *> ExprParser::ProgramContext::toplevelStatement() {
  return getRuleContexts<ExprParser::ToplevelStatementContext>();
}

ExprParser::ToplevelStatementContext* ExprParser::ProgramContext::toplevelStatement(size_t i) {
  return getRuleContext<ExprParser::ToplevelStatementContext>(i);
}


size_t ExprParser::ProgramContext::getRuleIndex() const {
  return ExprParser::RuleProgram;
}

void ExprParser::ProgramContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterProgram(this);
}

void ExprParser::ProgramContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitProgram(this);
}


std::any ExprParser::ProgramContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitProgram(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::ProgramContext* ExprParser::program() {
  ProgramContext *_localctx = _tracker.createInstance<ProgramContext>(_ctx, getState());
  enterRule(_localctx, 0, ExprParser::RuleProgram);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(51);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & 131600498558) != 0)) {
      setState(48);
      toplevelStatement();
      setState(53);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(54);
    match(ExprParser::EOF);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ToplevelStatementContext ------------------------------------------------------------------

ExprParser::ToplevelStatementContext::ToplevelStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

ExprParser::FunctionDeclarationContext* ExprParser::ToplevelStatementContext::functionDeclaration() {
  return getRuleContext<ExprParser::FunctionDeclarationContext>(0);
}

ExprParser::StatementContext* ExprParser::ToplevelStatementContext::statement() {
  return getRuleContext<ExprParser::StatementContext>(0);
}


size_t ExprParser::ToplevelStatementContext::getRuleIndex() const {
  return ExprParser::RuleToplevelStatement;
}

void ExprParser::ToplevelStatementContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterToplevelStatement(this);
}

void ExprParser::ToplevelStatementContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitToplevelStatement(this);
}


std::any ExprParser::ToplevelStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitToplevelStatement(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::ToplevelStatementContext* ExprParser::toplevelStatement() {
  ToplevelStatementContext *_localctx = _tracker.createInstance<ToplevelStatementContext>(_ctx, getState());
  enterRule(_localctx, 2, ExprParser::RuleToplevelStatement);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(58);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(56);
      functionDeclaration();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(57);
      statement();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- DeclarationContext ------------------------------------------------------------------

ExprParser::DeclarationContext::DeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

ExprParser::FunctionDeclarationContext* ExprParser::DeclarationContext::functionDeclaration() {
  return getRuleContext<ExprParser::FunctionDeclarationContext>(0);
}

ExprParser::VariableDeclarationContext* ExprParser::DeclarationContext::variableDeclaration() {
  return getRuleContext<ExprParser::VariableDeclarationContext>(0);
}

tree::TerminalNode* ExprParser::DeclarationContext::SEMI() {
  return getToken(ExprParser::SEMI, 0);
}


size_t ExprParser::DeclarationContext::getRuleIndex() const {
  return ExprParser::RuleDeclaration;
}

void ExprParser::DeclarationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterDeclaration(this);
}

void ExprParser::DeclarationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitDeclaration(this);
}


std::any ExprParser::DeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitDeclaration(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::DeclarationContext* ExprParser::declaration() {
  DeclarationContext *_localctx = _tracker.createInstance<DeclarationContext>(_ctx, getState());
  enterRule(_localctx, 4, ExprParser::RuleDeclaration);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(64);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(60);
      functionDeclaration();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(61);
      variableDeclaration();
      setState(62);
      match(ExprParser::SEMI);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionDeclarationContext ------------------------------------------------------------------

ExprParser::FunctionDeclarationContext::FunctionDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

ExprParser::TypeContext* ExprParser::FunctionDeclarationContext::type() {
  return getRuleContext<ExprParser::TypeContext>(0);
}

tree::TerminalNode* ExprParser::FunctionDeclarationContext::ID() {
  return getToken(ExprParser::ID, 0);
}

tree::TerminalNode* ExprParser::FunctionDeclarationContext::OPEN_PAREN() {
  return getToken(ExprParser::OPEN_PAREN, 0);
}

tree::TerminalNode* ExprParser::FunctionDeclarationContext::CLOSE_PAREN() {
  return getToken(ExprParser::CLOSE_PAREN, 0);
}

ExprParser::CompoundStatementContext* ExprParser::FunctionDeclarationContext::compoundStatement() {
  return getRuleContext<ExprParser::CompoundStatementContext>(0);
}

ExprParser::ParameterListContext* ExprParser::FunctionDeclarationContext::parameterList() {
  return getRuleContext<ExprParser::ParameterListContext>(0);
}


size_t ExprParser::FunctionDeclarationContext::getRuleIndex() const {
  return ExprParser::RuleFunctionDeclaration;
}

void ExprParser::FunctionDeclarationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionDeclaration(this);
}

void ExprParser::FunctionDeclarationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionDeclaration(this);
}


std::any ExprParser::FunctionDeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitFunctionDeclaration(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::FunctionDeclarationContext* ExprParser::functionDeclaration() {
  FunctionDeclarationContext *_localctx = _tracker.createInstance<FunctionDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 6, ExprParser::RuleFunctionDeclaration);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(66);
    type();
    setState(67);
    match(ExprParser::ID);
    setState(68);
    match(ExprParser::OPEN_PAREN);
    setState(70);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & 62) != 0)) {
      setState(69);
      parameterList();
    }
    setState(72);
    match(ExprParser::CLOSE_PAREN);
    setState(73);
    compoundStatement();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ParameterListContext ------------------------------------------------------------------

ExprParser::ParameterListContext::ParameterListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<ExprParser::ParameterContext *> ExprParser::ParameterListContext::parameter() {
  return getRuleContexts<ExprParser::ParameterContext>();
}

ExprParser::ParameterContext* ExprParser::ParameterListContext::parameter(size_t i) {
  return getRuleContext<ExprParser::ParameterContext>(i);
}

std::vector<tree::TerminalNode *> ExprParser::ParameterListContext::COMMA() {
  return getTokens(ExprParser::COMMA);
}

tree::TerminalNode* ExprParser::ParameterListContext::COMMA(size_t i) {
  return getToken(ExprParser::COMMA, i);
}


size_t ExprParser::ParameterListContext::getRuleIndex() const {
  return ExprParser::RuleParameterList;
}

void ExprParser::ParameterListContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterParameterList(this);
}

void ExprParser::ParameterListContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitParameterList(this);
}


std::any ExprParser::ParameterListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitParameterList(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::ParameterListContext* ExprParser::parameterList() {
  ParameterListContext *_localctx = _tracker.createInstance<ParameterListContext>(_ctx, getState());
  enterRule(_localctx, 8, ExprParser::RuleParameterList);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(75);
    parameter();
    setState(80);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == ExprParser::COMMA) {
      setState(76);
      match(ExprParser::COMMA);
      setState(77);
      parameter();
      setState(82);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ParameterContext ------------------------------------------------------------------

ExprParser::ParameterContext::ParameterContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

ExprParser::TypeContext* ExprParser::ParameterContext::type() {
  return getRuleContext<ExprParser::TypeContext>(0);
}

tree::TerminalNode* ExprParser::ParameterContext::ID() {
  return getToken(ExprParser::ID, 0);
}


size_t ExprParser::ParameterContext::getRuleIndex() const {
  return ExprParser::RuleParameter;
}

void ExprParser::ParameterContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterParameter(this);
}

void ExprParser::ParameterContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitParameter(this);
}


std::any ExprParser::ParameterContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitParameter(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::ParameterContext* ExprParser::parameter() {
  ParameterContext *_localctx = _tracker.createInstance<ParameterContext>(_ctx, getState());
  enterRule(_localctx, 10, ExprParser::RuleParameter);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(83);
    type();
    setState(84);
    match(ExprParser::ID);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TypeContext ------------------------------------------------------------------

ExprParser::TypeContext::TypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ExprParser::TypeContext::KW_INT() {
  return getToken(ExprParser::KW_INT, 0);
}

tree::TerminalNode* ExprParser::TypeContext::KW_DOUBLE() {
  return getToken(ExprParser::KW_DOUBLE, 0);
}

tree::TerminalNode* ExprParser::TypeContext::KW_BOOL() {
  return getToken(ExprParser::KW_BOOL, 0);
}

tree::TerminalNode* ExprParser::TypeContext::KW_VOID() {
  return getToken(ExprParser::KW_VOID, 0);
}

tree::TerminalNode* ExprParser::TypeContext::KW_STRING() {
  return getToken(ExprParser::KW_STRING, 0);
}


size_t ExprParser::TypeContext::getRuleIndex() const {
  return ExprParser::RuleType;
}

void ExprParser::TypeContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterType(this);
}

void ExprParser::TypeContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitType(this);
}


std::any ExprParser::TypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitType(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::TypeContext* ExprParser::type() {
  TypeContext *_localctx = _tracker.createInstance<TypeContext>(_ctx, getState());
  enterRule(_localctx, 12, ExprParser::RuleType);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(86);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & 62) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CompoundStatementContext ------------------------------------------------------------------

ExprParser::CompoundStatementContext::CompoundStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ExprParser::CompoundStatementContext::OPEN_BRACE() {
  return getToken(ExprParser::OPEN_BRACE, 0);
}

tree::TerminalNode* ExprParser::CompoundStatementContext::CLOSE_BRACE() {
  return getToken(ExprParser::CLOSE_BRACE, 0);
}

std::vector<ExprParser::StatementContext *> ExprParser::CompoundStatementContext::statement() {
  return getRuleContexts<ExprParser::StatementContext>();
}

ExprParser::StatementContext* ExprParser::CompoundStatementContext::statement(size_t i) {
  return getRuleContext<ExprParser::StatementContext>(i);
}


size_t ExprParser::CompoundStatementContext::getRuleIndex() const {
  return ExprParser::RuleCompoundStatement;
}

void ExprParser::CompoundStatementContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCompoundStatement(this);
}

void ExprParser::CompoundStatementContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCompoundStatement(this);
}


std::any ExprParser::CompoundStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitCompoundStatement(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::CompoundStatementContext* ExprParser::compoundStatement() {
  CompoundStatementContext *_localctx = _tracker.createInstance<CompoundStatementContext>(_ctx, getState());
  enterRule(_localctx, 14, ExprParser::RuleCompoundStatement);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(88);
    match(ExprParser::OPEN_BRACE);
    setState(92);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & 131600498558) != 0)) {
      setState(89);
      statement();
      setState(94);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(95);
    match(ExprParser::CLOSE_BRACE);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StatementContext ------------------------------------------------------------------

ExprParser::StatementContext::StatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t ExprParser::StatementContext::getRuleIndex() const {
  return ExprParser::RuleStatement;
}

void ExprParser::StatementContext::copyFrom(StatementContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- IfStmtContext ------------------------------------------------------------------

ExprParser::IfStatementContext* ExprParser::IfStmtContext::ifStatement() {
  return getRuleContext<ExprParser::IfStatementContext>(0);
}

ExprParser::IfStmtContext::IfStmtContext(StatementContext *ctx) { copyFrom(ctx); }

void ExprParser::IfStmtContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIfStmt(this);
}
void ExprParser::IfStmtContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIfStmt(this);
}

std::any ExprParser::IfStmtContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitIfStmt(this);
  else
    return visitor->visitChildren(this);
}
//----------------- VariableDeclStmtContext ------------------------------------------------------------------

ExprParser::VariableDeclarationContext* ExprParser::VariableDeclStmtContext::variableDeclaration() {
  return getRuleContext<ExprParser::VariableDeclarationContext>(0);
}

tree::TerminalNode* ExprParser::VariableDeclStmtContext::SEMI() {
  return getToken(ExprParser::SEMI, 0);
}

ExprParser::VariableDeclStmtContext::VariableDeclStmtContext(StatementContext *ctx) { copyFrom(ctx); }

void ExprParser::VariableDeclStmtContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableDeclStmt(this);
}
void ExprParser::VariableDeclStmtContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableDeclStmt(this);
}

std::any ExprParser::VariableDeclStmtContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitVariableDeclStmt(this);
  else
    return visitor->visitChildren(this);
}
//----------------- WhileStmtContext ------------------------------------------------------------------

ExprParser::WhileStatementContext* ExprParser::WhileStmtContext::whileStatement() {
  return getRuleContext<ExprParser::WhileStatementContext>(0);
}

ExprParser::WhileStmtContext::WhileStmtContext(StatementContext *ctx) { copyFrom(ctx); }

void ExprParser::WhileStmtContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterWhileStmt(this);
}
void ExprParser::WhileStmtContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitWhileStmt(this);
}

std::any ExprParser::WhileStmtContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitWhileStmt(this);
  else
    return visitor->visitChildren(this);
}
//----------------- CompoundStmtContext ------------------------------------------------------------------

ExprParser::CompoundStatementContext* ExprParser::CompoundStmtContext::compoundStatement() {
  return getRuleContext<ExprParser::CompoundStatementContext>(0);
}

ExprParser::CompoundStmtContext::CompoundStmtContext(StatementContext *ctx) { copyFrom(ctx); }

void ExprParser::CompoundStmtContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCompoundStmt(this);
}
void ExprParser::CompoundStmtContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCompoundStmt(this);
}

std::any ExprParser::CompoundStmtContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitCompoundStmt(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ReturnStmtContext ------------------------------------------------------------------

ExprParser::ReturnStatementContext* ExprParser::ReturnStmtContext::returnStatement() {
  return getRuleContext<ExprParser::ReturnStatementContext>(0);
}

tree::TerminalNode* ExprParser::ReturnStmtContext::SEMI() {
  return getToken(ExprParser::SEMI, 0);
}

ExprParser::ReturnStmtContext::ReturnStmtContext(StatementContext *ctx) { copyFrom(ctx); }

void ExprParser::ReturnStmtContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterReturnStmt(this);
}
void ExprParser::ReturnStmtContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitReturnStmt(this);
}

std::any ExprParser::ReturnStmtContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitReturnStmt(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ExpressionStmtContext ------------------------------------------------------------------

ExprParser::ExpressionContext* ExprParser::ExpressionStmtContext::expression() {
  return getRuleContext<ExprParser::ExpressionContext>(0);
}

tree::TerminalNode* ExprParser::ExpressionStmtContext::SEMI() {
  return getToken(ExprParser::SEMI, 0);
}

ExprParser::ExpressionStmtContext::ExpressionStmtContext(StatementContext *ctx) { copyFrom(ctx); }

void ExprParser::ExpressionStmtContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterExpressionStmt(this);
}
void ExprParser::ExpressionStmtContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitExpressionStmt(this);
}

std::any ExprParser::ExpressionStmtContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitExpressionStmt(this);
  else
    return visitor->visitChildren(this);
}
ExprParser::StatementContext* ExprParser::statement() {
  StatementContext *_localctx = _tracker.createInstance<StatementContext>(_ctx, getState());
  enterRule(_localctx, 16, ExprParser::RuleStatement);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(109);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case ExprParser::KW_INT:
      case ExprParser::KW_DOUBLE:
      case ExprParser::KW_STRING:
      case ExprParser::KW_BOOL:
      case ExprParser::KW_VOID: {
        _localctx = _tracker.createInstance<ExprParser::VariableDeclStmtContext>(_localctx);
        enterOuterAlt(_localctx, 1);
        setState(97);
        variableDeclaration();
        setState(98);
        match(ExprParser::SEMI);
        break;
      }

      case ExprParser::KW_TRUE:
      case ExprParser::KW_FALSE:
      case ExprParser::ADD:
      case ExprParser::SUB:
      case ExprParser::NOT:
      case ExprParser::OPEN_PAREN:
      case ExprParser::STRING_LITERAL:
      case ExprParser::ID:
      case ExprParser::INT_LITERAL:
      case ExprParser::DOUBLE_LITERAL: {
        _localctx = _tracker.createInstance<ExprParser::ExpressionStmtContext>(_localctx);
        enterOuterAlt(_localctx, 2);
        setState(100);
        expression();
        setState(101);
        match(ExprParser::SEMI);
        break;
      }

      case ExprParser::KW_RETURN: {
        _localctx = _tracker.createInstance<ExprParser::ReturnStmtContext>(_localctx);
        enterOuterAlt(_localctx, 3);
        setState(103);
        returnStatement();
        setState(104);
        match(ExprParser::SEMI);
        break;
      }

      case ExprParser::KW_IF: {
        _localctx = _tracker.createInstance<ExprParser::IfStmtContext>(_localctx);
        enterOuterAlt(_localctx, 4);
        setState(106);
        ifStatement();
        break;
      }

      case ExprParser::KW_WHILE: {
        _localctx = _tracker.createInstance<ExprParser::WhileStmtContext>(_localctx);
        enterOuterAlt(_localctx, 5);
        setState(107);
        whileStatement();
        break;
      }

      case ExprParser::OPEN_BRACE: {
        _localctx = _tracker.createInstance<ExprParser::CompoundStmtContext>(_localctx);
        enterOuterAlt(_localctx, 6);
        setState(108);
        compoundStatement();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableDeclarationContext ------------------------------------------------------------------

ExprParser::VariableDeclarationContext::VariableDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

ExprParser::TypeContext* ExprParser::VariableDeclarationContext::type() {
  return getRuleContext<ExprParser::TypeContext>(0);
}

tree::TerminalNode* ExprParser::VariableDeclarationContext::ID() {
  return getToken(ExprParser::ID, 0);
}

tree::TerminalNode* ExprParser::VariableDeclarationContext::ASSIGN() {
  return getToken(ExprParser::ASSIGN, 0);
}

ExprParser::ExpressionContext* ExprParser::VariableDeclarationContext::expression() {
  return getRuleContext<ExprParser::ExpressionContext>(0);
}


size_t ExprParser::VariableDeclarationContext::getRuleIndex() const {
  return ExprParser::RuleVariableDeclaration;
}

void ExprParser::VariableDeclarationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableDeclaration(this);
}

void ExprParser::VariableDeclarationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableDeclaration(this);
}


std::any ExprParser::VariableDeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitVariableDeclaration(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::VariableDeclarationContext* ExprParser::variableDeclaration() {
  VariableDeclarationContext *_localctx = _tracker.createInstance<VariableDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 18, ExprParser::RuleVariableDeclaration);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(111);
    type();
    setState(112);
    match(ExprParser::ID);
    setState(115);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == ExprParser::ASSIGN) {
      setState(113);
      match(ExprParser::ASSIGN);
      setState(114);
      expression();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ReturnStatementContext ------------------------------------------------------------------

ExprParser::ReturnStatementContext::ReturnStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ExprParser::ReturnStatementContext::KW_RETURN() {
  return getToken(ExprParser::KW_RETURN, 0);
}

ExprParser::ExpressionContext* ExprParser::ReturnStatementContext::expression() {
  return getRuleContext<ExprParser::ExpressionContext>(0);
}


size_t ExprParser::ReturnStatementContext::getRuleIndex() const {
  return ExprParser::RuleReturnStatement;
}

void ExprParser::ReturnStatementContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterReturnStatement(this);
}

void ExprParser::ReturnStatementContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitReturnStatement(this);
}


std::any ExprParser::ReturnStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitReturnStatement(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::ReturnStatementContext* ExprParser::returnStatement() {
  ReturnStatementContext *_localctx = _tracker.createInstance<ReturnStatementContext>(_ctx, getState());
  enterRule(_localctx, 20, ExprParser::RuleReturnStatement);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(117);
    match(ExprParser::KW_RETURN);
    setState(119);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & 129453014016) != 0)) {
      setState(118);
      expression();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IfStatementContext ------------------------------------------------------------------

ExprParser::IfStatementContext::IfStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ExprParser::IfStatementContext::KW_IF() {
  return getToken(ExprParser::KW_IF, 0);
}

tree::TerminalNode* ExprParser::IfStatementContext::OPEN_PAREN() {
  return getToken(ExprParser::OPEN_PAREN, 0);
}

ExprParser::ExpressionContext* ExprParser::IfStatementContext::expression() {
  return getRuleContext<ExprParser::ExpressionContext>(0);
}

tree::TerminalNode* ExprParser::IfStatementContext::CLOSE_PAREN() {
  return getToken(ExprParser::CLOSE_PAREN, 0);
}

std::vector<ExprParser::StatementContext *> ExprParser::IfStatementContext::statement() {
  return getRuleContexts<ExprParser::StatementContext>();
}

ExprParser::StatementContext* ExprParser::IfStatementContext::statement(size_t i) {
  return getRuleContext<ExprParser::StatementContext>(i);
}

tree::TerminalNode* ExprParser::IfStatementContext::KW_ELSE() {
  return getToken(ExprParser::KW_ELSE, 0);
}


size_t ExprParser::IfStatementContext::getRuleIndex() const {
  return ExprParser::RuleIfStatement;
}

void ExprParser::IfStatementContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIfStatement(this);
}

void ExprParser::IfStatementContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIfStatement(this);
}


std::any ExprParser::IfStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitIfStatement(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::IfStatementContext* ExprParser::ifStatement() {
  IfStatementContext *_localctx = _tracker.createInstance<IfStatementContext>(_ctx, getState());
  enterRule(_localctx, 22, ExprParser::RuleIfStatement);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(121);
    match(ExprParser::KW_IF);
    setState(122);
    match(ExprParser::OPEN_PAREN);
    setState(123);
    expression();
    setState(124);
    match(ExprParser::CLOSE_PAREN);
    setState(125);
    statement();
    setState(128);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx)) {
    case 1: {
      setState(126);
      match(ExprParser::KW_ELSE);
      setState(127);
      statement();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- WhileStatementContext ------------------------------------------------------------------

ExprParser::WhileStatementContext::WhileStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ExprParser::WhileStatementContext::KW_WHILE() {
  return getToken(ExprParser::KW_WHILE, 0);
}

tree::TerminalNode* ExprParser::WhileStatementContext::OPEN_PAREN() {
  return getToken(ExprParser::OPEN_PAREN, 0);
}

ExprParser::ExpressionContext* ExprParser::WhileStatementContext::expression() {
  return getRuleContext<ExprParser::ExpressionContext>(0);
}

tree::TerminalNode* ExprParser::WhileStatementContext::CLOSE_PAREN() {
  return getToken(ExprParser::CLOSE_PAREN, 0);
}

ExprParser::StatementContext* ExprParser::WhileStatementContext::statement() {
  return getRuleContext<ExprParser::StatementContext>(0);
}


size_t ExprParser::WhileStatementContext::getRuleIndex() const {
  return ExprParser::RuleWhileStatement;
}

void ExprParser::WhileStatementContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterWhileStatement(this);
}

void ExprParser::WhileStatementContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitWhileStatement(this);
}


std::any ExprParser::WhileStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitWhileStatement(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::WhileStatementContext* ExprParser::whileStatement() {
  WhileStatementContext *_localctx = _tracker.createInstance<WhileStatementContext>(_ctx, getState());
  enterRule(_localctx, 24, ExprParser::RuleWhileStatement);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(130);
    match(ExprParser::KW_WHILE);
    setState(131);
    match(ExprParser::OPEN_PAREN);
    setState(132);
    expression();
    setState(133);
    match(ExprParser::CLOSE_PAREN);
    setState(134);
    statement();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExpressionContext ------------------------------------------------------------------

ExprParser::ExpressionContext::ExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t ExprParser::ExpressionContext::getRuleIndex() const {
  return ExprParser::RuleExpression;
}

void ExprParser::ExpressionContext::copyFrom(ExpressionContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- LogicalOrExprContext ------------------------------------------------------------------

ExprParser::LogicalOrExpressionContext* ExprParser::LogicalOrExprContext::logicalOrExpression() {
  return getRuleContext<ExprParser::LogicalOrExpressionContext>(0);
}

ExprParser::LogicalOrExprContext::LogicalOrExprContext(ExpressionContext *ctx) { copyFrom(ctx); }

void ExprParser::LogicalOrExprContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLogicalOrExpr(this);
}
void ExprParser::LogicalOrExprContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLogicalOrExpr(this);
}

std::any ExprParser::LogicalOrExprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitLogicalOrExpr(this);
  else
    return visitor->visitChildren(this);
}
//----------------- AssignmentExpressionContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::AssignmentExpressionContext::ID() {
  return getToken(ExprParser::ID, 0);
}

tree::TerminalNode* ExprParser::AssignmentExpressionContext::ASSIGN() {
  return getToken(ExprParser::ASSIGN, 0);
}

ExprParser::ExpressionContext* ExprParser::AssignmentExpressionContext::expression() {
  return getRuleContext<ExprParser::ExpressionContext>(0);
}

ExprParser::AssignmentExpressionContext::AssignmentExpressionContext(ExpressionContext *ctx) { copyFrom(ctx); }

void ExprParser::AssignmentExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAssignmentExpression(this);
}
void ExprParser::AssignmentExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAssignmentExpression(this);
}

std::any ExprParser::AssignmentExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitAssignmentExpression(this);
  else
    return visitor->visitChildren(this);
}
ExprParser::ExpressionContext* ExprParser::expression() {
  ExpressionContext *_localctx = _tracker.createInstance<ExpressionContext>(_ctx, getState());
  enterRule(_localctx, 26, ExprParser::RuleExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(140);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx)) {
    case 1: {
      _localctx = _tracker.createInstance<ExprParser::AssignmentExpressionContext>(_localctx);
      enterOuterAlt(_localctx, 1);
      setState(136);
      match(ExprParser::ID);
      setState(137);
      match(ExprParser::ASSIGN);
      setState(138);
      expression();
      break;
    }

    case 2: {
      _localctx = _tracker.createInstance<ExprParser::LogicalOrExprContext>(_localctx);
      enterOuterAlt(_localctx, 2);
      setState(139);
      logicalOrExpression();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LogicalOrExpressionContext ------------------------------------------------------------------

ExprParser::LogicalOrExpressionContext::LogicalOrExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<ExprParser::LogicalAndExpressionContext *> ExprParser::LogicalOrExpressionContext::logicalAndExpression() {
  return getRuleContexts<ExprParser::LogicalAndExpressionContext>();
}

ExprParser::LogicalAndExpressionContext* ExprParser::LogicalOrExpressionContext::logicalAndExpression(size_t i) {
  return getRuleContext<ExprParser::LogicalAndExpressionContext>(i);
}

std::vector<tree::TerminalNode *> ExprParser::LogicalOrExpressionContext::LOGICAL_OR() {
  return getTokens(ExprParser::LOGICAL_OR);
}

tree::TerminalNode* ExprParser::LogicalOrExpressionContext::LOGICAL_OR(size_t i) {
  return getToken(ExprParser::LOGICAL_OR, i);
}


size_t ExprParser::LogicalOrExpressionContext::getRuleIndex() const {
  return ExprParser::RuleLogicalOrExpression;
}

void ExprParser::LogicalOrExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLogicalOrExpression(this);
}

void ExprParser::LogicalOrExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLogicalOrExpression(this);
}


std::any ExprParser::LogicalOrExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitLogicalOrExpression(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::LogicalOrExpressionContext* ExprParser::logicalOrExpression() {
  LogicalOrExpressionContext *_localctx = _tracker.createInstance<LogicalOrExpressionContext>(_ctx, getState());
  enterRule(_localctx, 28, ExprParser::RuleLogicalOrExpression);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(142);
    logicalAndExpression();
    setState(147);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == ExprParser::LOGICAL_OR) {
      setState(143);
      match(ExprParser::LOGICAL_OR);
      setState(144);
      logicalAndExpression();
      setState(149);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LogicalAndExpressionContext ------------------------------------------------------------------

ExprParser::LogicalAndExpressionContext::LogicalAndExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<ExprParser::EqualityExpressionContext *> ExprParser::LogicalAndExpressionContext::equalityExpression() {
  return getRuleContexts<ExprParser::EqualityExpressionContext>();
}

ExprParser::EqualityExpressionContext* ExprParser::LogicalAndExpressionContext::equalityExpression(size_t i) {
  return getRuleContext<ExprParser::EqualityExpressionContext>(i);
}

std::vector<tree::TerminalNode *> ExprParser::LogicalAndExpressionContext::LOGICAL_AND() {
  return getTokens(ExprParser::LOGICAL_AND);
}

tree::TerminalNode* ExprParser::LogicalAndExpressionContext::LOGICAL_AND(size_t i) {
  return getToken(ExprParser::LOGICAL_AND, i);
}


size_t ExprParser::LogicalAndExpressionContext::getRuleIndex() const {
  return ExprParser::RuleLogicalAndExpression;
}

void ExprParser::LogicalAndExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLogicalAndExpression(this);
}

void ExprParser::LogicalAndExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLogicalAndExpression(this);
}


std::any ExprParser::LogicalAndExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitLogicalAndExpression(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::LogicalAndExpressionContext* ExprParser::logicalAndExpression() {
  LogicalAndExpressionContext *_localctx = _tracker.createInstance<LogicalAndExpressionContext>(_ctx, getState());
  enterRule(_localctx, 30, ExprParser::RuleLogicalAndExpression);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(150);
    equalityExpression();
    setState(155);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == ExprParser::LOGICAL_AND) {
      setState(151);
      match(ExprParser::LOGICAL_AND);
      setState(152);
      equalityExpression();
      setState(157);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- EqualityExpressionContext ------------------------------------------------------------------

ExprParser::EqualityExpressionContext::EqualityExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<ExprParser::RelationalExpressionContext *> ExprParser::EqualityExpressionContext::relationalExpression() {
  return getRuleContexts<ExprParser::RelationalExpressionContext>();
}

ExprParser::RelationalExpressionContext* ExprParser::EqualityExpressionContext::relationalExpression(size_t i) {
  return getRuleContext<ExprParser::RelationalExpressionContext>(i);
}

std::vector<tree::TerminalNode *> ExprParser::EqualityExpressionContext::EQ() {
  return getTokens(ExprParser::EQ);
}

tree::TerminalNode* ExprParser::EqualityExpressionContext::EQ(size_t i) {
  return getToken(ExprParser::EQ, i);
}

std::vector<tree::TerminalNode *> ExprParser::EqualityExpressionContext::NEQ() {
  return getTokens(ExprParser::NEQ);
}

tree::TerminalNode* ExprParser::EqualityExpressionContext::NEQ(size_t i) {
  return getToken(ExprParser::NEQ, i);
}


size_t ExprParser::EqualityExpressionContext::getRuleIndex() const {
  return ExprParser::RuleEqualityExpression;
}

void ExprParser::EqualityExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterEqualityExpression(this);
}

void ExprParser::EqualityExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitEqualityExpression(this);
}


std::any ExprParser::EqualityExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitEqualityExpression(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::EqualityExpressionContext* ExprParser::equalityExpression() {
  EqualityExpressionContext *_localctx = _tracker.createInstance<EqualityExpressionContext>(_ctx, getState());
  enterRule(_localctx, 32, ExprParser::RuleEqualityExpression);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(158);
    relationalExpression();
    setState(163);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == ExprParser::EQ

    || _la == ExprParser::NEQ) {
      setState(159);
      _la = _input->LA(1);
      if (!(_la == ExprParser::EQ

      || _la == ExprParser::NEQ)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(160);
      relationalExpression();
      setState(165);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- RelationalExpressionContext ------------------------------------------------------------------

ExprParser::RelationalExpressionContext::RelationalExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<ExprParser::AdditiveExpressionContext *> ExprParser::RelationalExpressionContext::additiveExpression() {
  return getRuleContexts<ExprParser::AdditiveExpressionContext>();
}

ExprParser::AdditiveExpressionContext* ExprParser::RelationalExpressionContext::additiveExpression(size_t i) {
  return getRuleContext<ExprParser::AdditiveExpressionContext>(i);
}

std::vector<tree::TerminalNode *> ExprParser::RelationalExpressionContext::LT() {
  return getTokens(ExprParser::LT);
}

tree::TerminalNode* ExprParser::RelationalExpressionContext::LT(size_t i) {
  return getToken(ExprParser::LT, i);
}

std::vector<tree::TerminalNode *> ExprParser::RelationalExpressionContext::GT() {
  return getTokens(ExprParser::GT);
}

tree::TerminalNode* ExprParser::RelationalExpressionContext::GT(size_t i) {
  return getToken(ExprParser::GT, i);
}

std::vector<tree::TerminalNode *> ExprParser::RelationalExpressionContext::LE() {
  return getTokens(ExprParser::LE);
}

tree::TerminalNode* ExprParser::RelationalExpressionContext::LE(size_t i) {
  return getToken(ExprParser::LE, i);
}

std::vector<tree::TerminalNode *> ExprParser::RelationalExpressionContext::GE() {
  return getTokens(ExprParser::GE);
}

tree::TerminalNode* ExprParser::RelationalExpressionContext::GE(size_t i) {
  return getToken(ExprParser::GE, i);
}


size_t ExprParser::RelationalExpressionContext::getRuleIndex() const {
  return ExprParser::RuleRelationalExpression;
}

void ExprParser::RelationalExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterRelationalExpression(this);
}

void ExprParser::RelationalExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitRelationalExpression(this);
}


std::any ExprParser::RelationalExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitRelationalExpression(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::RelationalExpressionContext* ExprParser::relationalExpression() {
  RelationalExpressionContext *_localctx = _tracker.createInstance<RelationalExpressionContext>(_ctx, getState());
  enterRule(_localctx, 34, ExprParser::RuleRelationalExpression);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(166);
    additiveExpression();
    setState(171);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & 15728640) != 0)) {
      setState(167);
      _la = _input->LA(1);
      if (!((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & 15728640) != 0))) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(168);
      additiveExpression();
      setState(173);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AdditiveExpressionContext ------------------------------------------------------------------

ExprParser::AdditiveExpressionContext::AdditiveExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<ExprParser::MultiplicativeExpressionContext *> ExprParser::AdditiveExpressionContext::multiplicativeExpression() {
  return getRuleContexts<ExprParser::MultiplicativeExpressionContext>();
}

ExprParser::MultiplicativeExpressionContext* ExprParser::AdditiveExpressionContext::multiplicativeExpression(size_t i) {
  return getRuleContext<ExprParser::MultiplicativeExpressionContext>(i);
}

std::vector<tree::TerminalNode *> ExprParser::AdditiveExpressionContext::ADD() {
  return getTokens(ExprParser::ADD);
}

tree::TerminalNode* ExprParser::AdditiveExpressionContext::ADD(size_t i) {
  return getToken(ExprParser::ADD, i);
}

std::vector<tree::TerminalNode *> ExprParser::AdditiveExpressionContext::SUB() {
  return getTokens(ExprParser::SUB);
}

tree::TerminalNode* ExprParser::AdditiveExpressionContext::SUB(size_t i) {
  return getToken(ExprParser::SUB, i);
}


size_t ExprParser::AdditiveExpressionContext::getRuleIndex() const {
  return ExprParser::RuleAdditiveExpression;
}

void ExprParser::AdditiveExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAdditiveExpression(this);
}

void ExprParser::AdditiveExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAdditiveExpression(this);
}


std::any ExprParser::AdditiveExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitAdditiveExpression(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::AdditiveExpressionContext* ExprParser::additiveExpression() {
  AdditiveExpressionContext *_localctx = _tracker.createInstance<AdditiveExpressionContext>(_ctx, getState());
  enterRule(_localctx, 36, ExprParser::RuleAdditiveExpression);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(174);
    multiplicativeExpression();
    setState(179);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == ExprParser::ADD

    || _la == ExprParser::SUB) {
      setState(175);
      _la = _input->LA(1);
      if (!(_la == ExprParser::ADD

      || _la == ExprParser::SUB)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(176);
      multiplicativeExpression();
      setState(181);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- MultiplicativeExpressionContext ------------------------------------------------------------------

ExprParser::MultiplicativeExpressionContext::MultiplicativeExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<ExprParser::UnaryExpressionContext *> ExprParser::MultiplicativeExpressionContext::unaryExpression() {
  return getRuleContexts<ExprParser::UnaryExpressionContext>();
}

ExprParser::UnaryExpressionContext* ExprParser::MultiplicativeExpressionContext::unaryExpression(size_t i) {
  return getRuleContext<ExprParser::UnaryExpressionContext>(i);
}

std::vector<tree::TerminalNode *> ExprParser::MultiplicativeExpressionContext::MUL() {
  return getTokens(ExprParser::MUL);
}

tree::TerminalNode* ExprParser::MultiplicativeExpressionContext::MUL(size_t i) {
  return getToken(ExprParser::MUL, i);
}

std::vector<tree::TerminalNode *> ExprParser::MultiplicativeExpressionContext::DIV() {
  return getTokens(ExprParser::DIV);
}

tree::TerminalNode* ExprParser::MultiplicativeExpressionContext::DIV(size_t i) {
  return getToken(ExprParser::DIV, i);
}

std::vector<tree::TerminalNode *> ExprParser::MultiplicativeExpressionContext::MOD() {
  return getTokens(ExprParser::MOD);
}

tree::TerminalNode* ExprParser::MultiplicativeExpressionContext::MOD(size_t i) {
  return getToken(ExprParser::MOD, i);
}


size_t ExprParser::MultiplicativeExpressionContext::getRuleIndex() const {
  return ExprParser::RuleMultiplicativeExpression;
}

void ExprParser::MultiplicativeExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterMultiplicativeExpression(this);
}

void ExprParser::MultiplicativeExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitMultiplicativeExpression(this);
}


std::any ExprParser::MultiplicativeExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitMultiplicativeExpression(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::MultiplicativeExpressionContext* ExprParser::multiplicativeExpression() {
  MultiplicativeExpressionContext *_localctx = _tracker.createInstance<MultiplicativeExpressionContext>(_ctx, getState());
  enterRule(_localctx, 38, ExprParser::RuleMultiplicativeExpression);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(182);
    unaryExpression();
    setState(187);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & 114688) != 0)) {
      setState(183);
      _la = _input->LA(1);
      if (!((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & 114688) != 0))) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(184);
      unaryExpression();
      setState(189);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- UnaryExpressionContext ------------------------------------------------------------------

ExprParser::UnaryExpressionContext::UnaryExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t ExprParser::UnaryExpressionContext::getRuleIndex() const {
  return ExprParser::RuleUnaryExpression;
}

void ExprParser::UnaryExpressionContext::copyFrom(UnaryExpressionContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- UnaryOperationContext ------------------------------------------------------------------

ExprParser::UnaryExpressionContext* ExprParser::UnaryOperationContext::unaryExpression() {
  return getRuleContext<ExprParser::UnaryExpressionContext>(0);
}

tree::TerminalNode* ExprParser::UnaryOperationContext::NOT() {
  return getToken(ExprParser::NOT, 0);
}

tree::TerminalNode* ExprParser::UnaryOperationContext::SUB() {
  return getToken(ExprParser::SUB, 0);
}

tree::TerminalNode* ExprParser::UnaryOperationContext::ADD() {
  return getToken(ExprParser::ADD, 0);
}

ExprParser::UnaryOperationContext::UnaryOperationContext(UnaryExpressionContext *ctx) { copyFrom(ctx); }

void ExprParser::UnaryOperationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterUnaryOperation(this);
}
void ExprParser::UnaryOperationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitUnaryOperation(this);
}

std::any ExprParser::UnaryOperationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitUnaryOperation(this);
  else
    return visitor->visitChildren(this);
}
//----------------- PrimaryExprContext ------------------------------------------------------------------

ExprParser::PrimaryExpressionContext* ExprParser::PrimaryExprContext::primaryExpression() {
  return getRuleContext<ExprParser::PrimaryExpressionContext>(0);
}

ExprParser::PrimaryExprContext::PrimaryExprContext(UnaryExpressionContext *ctx) { copyFrom(ctx); }

void ExprParser::PrimaryExprContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterPrimaryExpr(this);
}
void ExprParser::PrimaryExprContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitPrimaryExpr(this);
}

std::any ExprParser::PrimaryExprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitPrimaryExpr(this);
  else
    return visitor->visitChildren(this);
}
ExprParser::UnaryExpressionContext* ExprParser::unaryExpression() {
  UnaryExpressionContext *_localctx = _tracker.createInstance<UnaryExpressionContext>(_ctx, getState());
  enterRule(_localctx, 40, ExprParser::RuleUnaryExpression);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(193);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case ExprParser::ADD:
      case ExprParser::SUB:
      case ExprParser::NOT: {
        _localctx = _tracker.createInstance<ExprParser::UnaryOperationContext>(_localctx);
        enterOuterAlt(_localctx, 1);
        setState(190);
        _la = _input->LA(1);
        if (!((((_la & ~ 0x3fULL) == 0) &&
          ((1ULL << _la) & 67121152) != 0))) {
        _errHandler->recoverInline(this);
        }
        else {
          _errHandler->reportMatch(this);
          consume();
        }
        setState(191);
        unaryExpression();
        break;
      }

      case ExprParser::KW_TRUE:
      case ExprParser::KW_FALSE:
      case ExprParser::OPEN_PAREN:
      case ExprParser::STRING_LITERAL:
      case ExprParser::ID:
      case ExprParser::INT_LITERAL:
      case ExprParser::DOUBLE_LITERAL: {
        _localctx = _tracker.createInstance<ExprParser::PrimaryExprContext>(_localctx);
        enterOuterAlt(_localctx, 2);
        setState(192);
        primaryExpression();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- PrimaryExpressionContext ------------------------------------------------------------------

ExprParser::PrimaryExpressionContext::PrimaryExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t ExprParser::PrimaryExpressionContext::getRuleIndex() const {
  return ExprParser::RulePrimaryExpression;
}

void ExprParser::PrimaryExpressionContext::copyFrom(PrimaryExpressionContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- BoolLiteralExprContext ------------------------------------------------------------------

ExprParser::BoolLiteralContext* ExprParser::BoolLiteralExprContext::boolLiteral() {
  return getRuleContext<ExprParser::BoolLiteralContext>(0);
}

ExprParser::BoolLiteralExprContext::BoolLiteralExprContext(PrimaryExpressionContext *ctx) { copyFrom(ctx); }

void ExprParser::BoolLiteralExprContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBoolLiteralExpr(this);
}
void ExprParser::BoolLiteralExprContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBoolLiteralExpr(this);
}

std::any ExprParser::BoolLiteralExprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitBoolLiteralExpr(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ParenthesizedExpressionContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::ParenthesizedExpressionContext::OPEN_PAREN() {
  return getToken(ExprParser::OPEN_PAREN, 0);
}

ExprParser::ExpressionContext* ExprParser::ParenthesizedExpressionContext::expression() {
  return getRuleContext<ExprParser::ExpressionContext>(0);
}

tree::TerminalNode* ExprParser::ParenthesizedExpressionContext::CLOSE_PAREN() {
  return getToken(ExprParser::CLOSE_PAREN, 0);
}

ExprParser::ParenthesizedExpressionContext::ParenthesizedExpressionContext(PrimaryExpressionContext *ctx) { copyFrom(ctx); }

void ExprParser::ParenthesizedExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterParenthesizedExpression(this);
}
void ExprParser::ParenthesizedExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitParenthesizedExpression(this);
}

std::any ExprParser::ParenthesizedExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitParenthesizedExpression(this);
  else
    return visitor->visitChildren(this);
}
//----------------- FunctIonCallContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::FunctIonCallContext::ID() {
  return getToken(ExprParser::ID, 0);
}

tree::TerminalNode* ExprParser::FunctIonCallContext::OPEN_PAREN() {
  return getToken(ExprParser::OPEN_PAREN, 0);
}

tree::TerminalNode* ExprParser::FunctIonCallContext::CLOSE_PAREN() {
  return getToken(ExprParser::CLOSE_PAREN, 0);
}

ExprParser::ArgumentListContext* ExprParser::FunctIonCallContext::argumentList() {
  return getRuleContext<ExprParser::ArgumentListContext>(0);
}

ExprParser::FunctIonCallContext::FunctIonCallContext(PrimaryExpressionContext *ctx) { copyFrom(ctx); }

void ExprParser::FunctIonCallContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctIonCall(this);
}
void ExprParser::FunctIonCallContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctIonCall(this);
}

std::any ExprParser::FunctIonCallContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitFunctIonCall(this);
  else
    return visitor->visitChildren(this);
}
//----------------- StringLiteralContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::StringLiteralContext::STRING_LITERAL() {
  return getToken(ExprParser::STRING_LITERAL, 0);
}

ExprParser::StringLiteralContext::StringLiteralContext(PrimaryExpressionContext *ctx) { copyFrom(ctx); }

void ExprParser::StringLiteralContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterStringLiteral(this);
}
void ExprParser::StringLiteralContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitStringLiteral(this);
}

std::any ExprParser::StringLiteralContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitStringLiteral(this);
  else
    return visitor->visitChildren(this);
}
//----------------- IDCallContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::IDCallContext::ID() {
  return getToken(ExprParser::ID, 0);
}

ExprParser::IDCallContext::IDCallContext(PrimaryExpressionContext *ctx) { copyFrom(ctx); }

void ExprParser::IDCallContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIDCall(this);
}
void ExprParser::IDCallContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIDCall(this);
}

std::any ExprParser::IDCallContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitIDCall(this);
  else
    return visitor->visitChildren(this);
}
//----------------- IntLiteralContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::IntLiteralContext::INT_LITERAL() {
  return getToken(ExprParser::INT_LITERAL, 0);
}

ExprParser::IntLiteralContext::IntLiteralContext(PrimaryExpressionContext *ctx) { copyFrom(ctx); }

void ExprParser::IntLiteralContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIntLiteral(this);
}
void ExprParser::IntLiteralContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIntLiteral(this);
}

std::any ExprParser::IntLiteralContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitIntLiteral(this);
  else
    return visitor->visitChildren(this);
}
//----------------- DoubleLiteralContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::DoubleLiteralContext::DOUBLE_LITERAL() {
  return getToken(ExprParser::DOUBLE_LITERAL, 0);
}

ExprParser::DoubleLiteralContext::DoubleLiteralContext(PrimaryExpressionContext *ctx) { copyFrom(ctx); }

void ExprParser::DoubleLiteralContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterDoubleLiteral(this);
}
void ExprParser::DoubleLiteralContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitDoubleLiteral(this);
}

std::any ExprParser::DoubleLiteralContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitDoubleLiteral(this);
  else
    return visitor->visitChildren(this);
}
ExprParser::PrimaryExpressionContext* ExprParser::primaryExpression() {
  PrimaryExpressionContext *_localctx = _tracker.createInstance<PrimaryExpressionContext>(_ctx, getState());
  enterRule(_localctx, 42, ExprParser::RulePrimaryExpression);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(210);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 19, _ctx)) {
    case 1: {
      _localctx = _tracker.createInstance<ExprParser::IntLiteralContext>(_localctx);
      enterOuterAlt(_localctx, 1);
      setState(195);
      match(ExprParser::INT_LITERAL);
      break;
    }

    case 2: {
      _localctx = _tracker.createInstance<ExprParser::DoubleLiteralContext>(_localctx);
      enterOuterAlt(_localctx, 2);
      setState(196);
      match(ExprParser::DOUBLE_LITERAL);
      break;
    }

    case 3: {
      _localctx = _tracker.createInstance<ExprParser::BoolLiteralExprContext>(_localctx);
      enterOuterAlt(_localctx, 3);
      setState(197);
      boolLiteral();
      break;
    }

    case 4: {
      _localctx = _tracker.createInstance<ExprParser::StringLiteralContext>(_localctx);
      enterOuterAlt(_localctx, 4);
      setState(198);
      match(ExprParser::STRING_LITERAL);
      break;
    }

    case 5: {
      _localctx = _tracker.createInstance<ExprParser::IDCallContext>(_localctx);
      enterOuterAlt(_localctx, 5);
      setState(199);
      match(ExprParser::ID);
      break;
    }

    case 6: {
      _localctx = _tracker.createInstance<ExprParser::FunctIonCallContext>(_localctx);
      enterOuterAlt(_localctx, 6);
      setState(200);
      match(ExprParser::ID);
      setState(201);
      match(ExprParser::OPEN_PAREN);
      setState(203);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & 129453014016) != 0)) {
        setState(202);
        argumentList();
      }
      setState(205);
      match(ExprParser::CLOSE_PAREN);
      break;
    }

    case 7: {
      _localctx = _tracker.createInstance<ExprParser::ParenthesizedExpressionContext>(_localctx);
      enterOuterAlt(_localctx, 7);
      setState(206);
      match(ExprParser::OPEN_PAREN);
      setState(207);
      expression();
      setState(208);
      match(ExprParser::CLOSE_PAREN);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BoolLiteralContext ------------------------------------------------------------------

ExprParser::BoolLiteralContext::BoolLiteralContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ExprParser::BoolLiteralContext::KW_TRUE() {
  return getToken(ExprParser::KW_TRUE, 0);
}

tree::TerminalNode* ExprParser::BoolLiteralContext::KW_FALSE() {
  return getToken(ExprParser::KW_FALSE, 0);
}


size_t ExprParser::BoolLiteralContext::getRuleIndex() const {
  return ExprParser::RuleBoolLiteral;
}

void ExprParser::BoolLiteralContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBoolLiteral(this);
}

void ExprParser::BoolLiteralContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBoolLiteral(this);
}


std::any ExprParser::BoolLiteralContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitBoolLiteral(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::BoolLiteralContext* ExprParser::boolLiteral() {
  BoolLiteralContext *_localctx = _tracker.createInstance<BoolLiteralContext>(_ctx, getState());
  enterRule(_localctx, 44, ExprParser::RuleBoolLiteral);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(212);
    _la = _input->LA(1);
    if (!(_la == ExprParser::KW_TRUE

    || _la == ExprParser::KW_FALSE)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArgumentListContext ------------------------------------------------------------------

ExprParser::ArgumentListContext::ArgumentListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<ExprParser::ExpressionContext *> ExprParser::ArgumentListContext::expression() {
  return getRuleContexts<ExprParser::ExpressionContext>();
}

ExprParser::ExpressionContext* ExprParser::ArgumentListContext::expression(size_t i) {
  return getRuleContext<ExprParser::ExpressionContext>(i);
}

std::vector<tree::TerminalNode *> ExprParser::ArgumentListContext::COMMA() {
  return getTokens(ExprParser::COMMA);
}

tree::TerminalNode* ExprParser::ArgumentListContext::COMMA(size_t i) {
  return getToken(ExprParser::COMMA, i);
}


size_t ExprParser::ArgumentListContext::getRuleIndex() const {
  return ExprParser::RuleArgumentList;
}

void ExprParser::ArgumentListContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArgumentList(this);
}

void ExprParser::ArgumentListContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<ExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArgumentList(this);
}


std::any ExprParser::ArgumentListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitArgumentList(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::ArgumentListContext* ExprParser::argumentList() {
  ArgumentListContext *_localctx = _tracker.createInstance<ArgumentListContext>(_ctx, getState());
  enterRule(_localctx, 46, ExprParser::RuleArgumentList);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(214);
    expression();
    setState(219);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == ExprParser::COMMA) {
      setState(215);
      match(ExprParser::COMMA);
      setState(216);
      expression();
      setState(221);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

void ExprParser::initialize() {
#if ANTLR4_USE_THREAD_LOCAL_CACHE
  exprParserInitialize();
#else
  ::antlr4::internal::call_once(exprParserOnceFlag, exprParserInitialize);
#endif
}
