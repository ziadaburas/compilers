
// Generated from d:/compilersLectures/lect4/grammer/Expr.g4 by ANTLR 4.13.1

#pragma once


#include "antlr4-runtime.h"


namespace antlr_generated {


class  ExprLexer : public antlr4::Lexer {
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

  explicit ExprLexer(antlr4::CharStream *input);

  ~ExprLexer() override;


  std::string getGrammarFileName() const override;

  const std::vector<std::string>& getRuleNames() const override;

  const std::vector<std::string>& getChannelNames() const override;

  const std::vector<std::string>& getModeNames() const override;

  const antlr4::dfa::Vocabulary& getVocabulary() const override;

  antlr4::atn::SerializedATNView getSerializedATN() const override;

  const antlr4::atn::ATN& getATN() const override;

  // By default the static state used to implement the lexer is lazily initialized during the first
  // call to the constructor. You can call this function if you wish to initialize the static state
  // ahead of time.
  static void initialize();

private:

  // Individual action functions triggered by action() above.

  // Individual semantic predicate functions triggered by sempred() above.

};

}  // namespace antlr_generated
