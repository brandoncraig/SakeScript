/* Generated By:JJTree&JavaCC: Do not edit this line. ParserConstants.java */
package bsh;

public interface ParserConstants {

  int EOF = 0;
  int NONPRINTABLE = 6;
  int SINGLE_LINE_COMMENT = 7;
  int HASH_BANG_COMMENT = 8;
  int MULTI_LINE_COMMENT = 9;
  int ABSTRACT = 10;
  int BOOLEAN = 11;
  int BREAK = 12;
  int CLASS = 13;
  int BYTE = 14;
  int CASE = 15;
  int CATCH = 16;
  int CHAR = 17;
  int CONST = 18;
  int CONTINUE = 19;
  int _DEFAULT = 20;
  int DO = 21;
  int DOUBLE = 22;
  int ELSE = 23;
  int ENUM = 24;
  int EXTENDS = 25;
  int FALSE = 26;
  int FINAL = 27;
  int FINALLY = 28;
  int FLOAT = 29;
  int FOR = 30;
  int GOTO = 31;
  int IF = 32;
  int IMPLEMENTS = 33;
  int IMPORT = 34;
  int INSTANCEOF = 35;
  int INT = 36;
  int INTERFACE = 37;
  int LONG = 38;
  int NATIVE = 39;
  int NEW = 40;
  int NULL = 41;
  int PACKAGE = 42;
  int PRIVATE = 43;
  int PROTECTED = 44;
  int PUBLIC = 45;
  int RETURN = 46;
  int SHORT = 47;
  int STATIC = 48;
  int STRICTFP = 49;
  int SWITCH = 50;
  int SYNCHRONIZED = 51;
  int TRANSIENT = 52;
  int THROW = 53;
  int THROWS = 54;
  int TRUE = 55;
  int TRY = 56;
  int VOID = 57;
  int VOLATILE = 58;
  int WHILE = 59;
  int FACT = 60;
  int QUERY = 61;
  int INTEGER_LITERAL = 62;
  int DECIMAL_LITERAL = 63;
  int HEX_LITERAL = 64;
  int OCTAL_LITERAL = 65;
  int FLOATING_POINT_LITERAL = 66;
  int EXPONENT = 67;
  int CHARACTER_LITERAL = 68;
  int STRING_LITERAL = 69;
  int LONG_STRING_LITERAL = 70;
  int FORMAL_COMMENT = 71;
  int IDENTIFIER = 72;
  int LETTER = 73;
  int DIGIT = 74;
  int LPAREN = 75;
  int RPAREN = 76;
  int LBRACE = 77;
  int RBRACE = 78;
  int LBRACKET = 79;
  int RBRACKET = 80;
  int SEMICOLON = 81;
  int COMMA = 82;
  int DOT = 83;
  int ASSIGN = 84;
  int GT = 85;
  int GTX = 86;
  int LT = 87;
  int LTX = 88;
  int BANG = 89;
  int TILDE = 90;
  int HOOK = 91;
  int COLON = 92;
  int EQ = 93;
  int LE = 94;
  int LEX = 95;
  int GE = 96;
  int GEX = 97;
  int NE = 98;
  int BOOL_OR = 99;
  int BOOL_ORX = 100;
  int BOOL_AND = 101;
  int BOOL_ANDX = 102;
  int INCR = 103;
  int DECR = 104;
  int PLUS = 105;
  int MINUS = 106;
  int STAR = 107;
  int SLASH = 108;
  int BIT_AND = 109;
  int BIT_ANDX = 110;
  int BIT_OR = 111;
  int BIT_ORX = 112;
  int XOR = 113;
  int MOD = 114;
  int LSHIFT = 115;
  int LSHIFTX = 116;
  int RSIGNEDSHIFT = 117;
  int RSIGNEDSHIFTX = 118;
  int RUNSIGNEDSHIFT = 119;
  int RUNSIGNEDSHIFTX = 120;
  int PLUSASSIGN = 121;
  int MINUSASSIGN = 122;
  int STARASSIGN = 123;
  int SLASHASSIGN = 124;
  int ANDASSIGN = 125;
  int ANDASSIGNX = 126;
  int ORASSIGN = 127;
  int ORASSIGNX = 128;
  int XORASSIGN = 129;
  int MODASSIGN = 130;
  int LSHIFTASSIGN = 131;
  int LSHIFTASSIGNX = 132;
  int RSIGNEDSHIFTASSIGN = 133;
  int RSIGNEDSHIFTASSIGNX = 134;
  int RUNSIGNEDSHIFTASSIGN = 135;
  int RUNSIGNEDSHIFTASSIGNX = 136;

  int DEFAULT = 0;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\r\"",
    "\"\\f\"",
    "\"\\n\"",
    "<NONPRINTABLE>",
    "<SINGLE_LINE_COMMENT>",
    "<HASH_BANG_COMMENT>",
    "<MULTI_LINE_COMMENT>",
    "\"abstract\"",
    "\"boolean\"",
    "\"break\"",
    "\"class\"",
    "\"byte\"",
    "\"case\"",
    "\"catch\"",
    "\"char\"",
    "\"const\"",
    "\"continue\"",
    "\"default\"",
    "\"do\"",
    "\"double\"",
    "\"else\"",
    "\"enum\"",
    "\"extends\"",
    "\"false\"",
    "\"final\"",
    "\"finally\"",
    "\"float\"",
    "\"for\"",
    "\"goto\"",
    "\"if\"",
    "\"implements\"",
    "\"import\"",
    "\"instanceof\"",
    "\"int\"",
    "\"interface\"",
    "\"long\"",
    "\"native\"",
    "\"new\"",
    "\"null\"",
    "\"package\"",
    "\"private\"",
    "\"protected\"",
    "\"public\"",
    "\"return\"",
    "\"short\"",
    "\"static\"",
    "\"strictfp\"",
    "\"switch\"",
    "\"synchronized\"",
    "\"transient\"",
    "\"throw\"",
    "\"throws\"",
    "\"true\"",
    "\"try\"",
    "\"void\"",
    "\"volatile\"",
    "\"while\"",
    "\"fact\"",
    "\"query\"",
    "<INTEGER_LITERAL>",
    "<DECIMAL_LITERAL>",
    "<HEX_LITERAL>",
    "<OCTAL_LITERAL>",
    "<FLOATING_POINT_LITERAL>",
    "<EXPONENT>",
    "<CHARACTER_LITERAL>",
    "<STRING_LITERAL>",
    "<LONG_STRING_LITERAL>",
    "<FORMAL_COMMENT>",
    "<IDENTIFIER>",
    "<LETTER>",
    "<DIGIT>",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\";\"",
    "\",\"",
    "\".\"",
    "\"=\"",
    "\">\"",
    "\"@gt\"",
    "\"<\"",
    "\"@lt\"",
    "\"!\"",
    "\"~\"",
    "\"?\"",
    "\":\"",
    "\"==\"",
    "\"<=\"",
    "\"@lteq\"",
    "\">=\"",
    "\"@gteq\"",
    "\"!=\"",
    "\"||\"",
    "\"@or\"",
    "\"&&\"",
    "\"@and\"",
    "\"++\"",
    "\"--\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"&\"",
    "\"@bitwise_and\"",
    "\"|\"",
    "\"@bitwise_or\"",
    "\"^\"",
    "\"%\"",
    "\"<<\"",
    "\"@left_shift\"",
    "\">>\"",
    "\"@right_shift\"",
    "\">>>\"",
    "\"@right_unsigned_shift\"",
    "\"+=\"",
    "\"-=\"",
    "\"*=\"",
    "\"/=\"",
    "\"&=\"",
    "\"@and_assign\"",
    "\"|=\"",
    "\"@or_assign\"",
    "\"^=\"",
    "\"%=\"",
    "\"<<=\"",
    "\"@left_shift_assign\"",
    "\">>=\"",
    "\"@right_shift_assign\"",
    "\">>>=\"",
    "\"@right_unsigned_shift_assign\"",
  };

}