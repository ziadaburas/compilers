// MyLang.g4
grammar Expr;

// Parser Rules


program: toplevelStatement* EOF;


toplevelStatement:
	functionDeclaration  
	| statement  ;

declaration:
	functionDeclaration
	| variableDeclaration SEMI ;

functionDeclaration:
	type ID OPEN_PAREN (parameterList)? CLOSE_PAREN compoundStatement;

parameterList: parameter (COMMA parameter)*;

parameter: type ID;

type: KW_INT | KW_DOUBLE | KW_BOOL | KW_VOID | KW_STRING;

compoundStatement: OPEN_BRACE (statement)* CLOSE_BRACE;

statement:
	variableDeclaration SEMI	# VariableDeclStmt
	| expression SEMI			# ExpressionStmt
	| returnStatement SEMI		# ReturnStmt
	| ifStatement				# IfStmt
	| whileStatement			# WhileStmt
	| compoundStatement			# CompoundStmt;

variableDeclaration: type ID (ASSIGN expression)?;

returnStatement: KW_RETURN (expression)?;

ifStatement:
	KW_IF OPEN_PAREN expression CLOSE_PAREN statement (
		KW_ELSE statement
	)?;

whileStatement:
	KW_WHILE OPEN_PAREN expression CLOSE_PAREN statement;


expression:
	ID ASSIGN expression	# AssignmentExpression
	| logicalOrExpression	# LogicalOrExpr;

logicalOrExpression:
	logicalAndExpression (LOGICAL_OR logicalAndExpression)*;

logicalAndExpression:
	equalityExpression (LOGICAL_AND equalityExpression)*;

equalityExpression:
	relationalExpression ((EQ | NEQ) relationalExpression)*;

relationalExpression:
	additiveExpression  ((LT | GT | LE | GE) additiveExpression)*;

additiveExpression:
	multiplicativeExpression (
		(ADD | SUB) multiplicativeExpression
	)*;

multiplicativeExpression:
	unaryExpression ((MUL | DIV | MOD) unaryExpression)*;

unaryExpression: (NOT | SUB | ADD) unaryExpression	# UnaryOperation
	| primaryExpression								# PrimaryExpr;

primaryExpression:
	INT_LITERAL										# IntLiteral
	| DOUBLE_LITERAL								# DoubleLiteral
	| boolLiteral									# BoolLiteralExpr 
	| STRING_LITERAL								# StringLiteral
	| ID											# IDCall
	| ID OPEN_PAREN (argumentList)? CLOSE_PAREN		# FunctIonCall
	| OPEN_PAREN expression CLOSE_PAREN				# ParenthesizedExpression;

boolLiteral: KW_TRUE | KW_FALSE;

argumentList: expression (COMMA expression)*;


// --- Lexer Rules (Tokens) ---

// Keywords (كل الكلمات المفتاحية الأصلية عادت)
KW_INT     : 'صحيح' ;
KW_DOUBLE  : 'عشري' ;
KW_STRING  : 'نص' ;
KW_BOOL    : 'منطقي' ;
KW_VOID    : 'فراغ' ;
KW_IF      : 'اذا' ;
KW_ELSE    : 'والا' ;
KW_WHILE   : 'طالما' ;
KW_RETURN  : 'أعد' ;
KW_TRUE    : 'صح' ;
KW_FALSE   : 'خطأ' ;



ADD: '+'; SUB: '-'; MUL: '*'; DIV: '/'; MOD: '%';
ASSIGN: '='; EQ: '=='; NEQ: '!='; LT: '<'; GT: '>'; LE: '<='; GE: '>=';
LOGICAL_AND: '&&'; LOGICAL_OR: '||'; NOT: '!';
SEMI: ';'; COMMA: ','; OPEN_PAREN: '('; CLOSE_PAREN: ')'; OPEN_BRACE: '{'; CLOSE_BRACE: '}';

// Identifiers and Literals
STRING_LITERAL: '"' (~["\\] | '\\' .)* '"';
ID:[a-zA-Z_\u0600-\u06FF] [a-zA-Z_0-9\u0600-\u06FF]*;
INT_LITERAL: [0-9]+;
DOUBLE_LITERAL: [0-9]+ '.' [0-9]* | '.' [0-9]+;



// Whitespace and Comments (بدون تغيير)
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;