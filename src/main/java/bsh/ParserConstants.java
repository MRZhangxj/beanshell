/* Generated By:JJTree&JavaCC: Do not edit this line. ParserConstants.java */
/*****************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one                *
 * or more contributor license agreements.  See the NOTICE file              *
 * distributed with this work for additional information                     *
 * regarding copyright ownership.  The ASF licenses this file                *
 * to you under the Apache License, Version 2.0 (the                         *
 * "License"); you may not use this file except in compliance                *
 * with the License.  You may obtain a copy of the License at                *
 *                                                                           *
 *     http://www.apache.org/licenses/LICENSE-2.0                            *
 *                                                                           *
 * Unless required by applicable law or agreed to in writing,                *
 * software distributed under the License is distributed on an               *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY                    *
 * KIND, either express or implied.  See the License for the                 *
 * specific language governing permissions and limitations                   *
 * under the License.                                                        *
 *                                                                           *
 *                                                                           *
 * This file is part of the BeanShell Java Scripting distribution.           *
 * Documentation and updates may be found at http://www.beanshell.org/       *
 * Patrick Niemeyer (pat@pat.net)                                            *
 * Author of Learning Java, O'Reilly & Associates                            *
 *                                                                           *
 *****************************************************************************/
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
  int INTEGER_LITERAL = 60;
  int DECIMAL_LITERAL = 61;
  int HEX_LITERAL = 62;
  int OCTAL_LITERAL = 63;
  int FLOATING_POINT_LITERAL = 64;
  int EXPONENT = 65;
  int CHARACTER_LITERAL = 66;
  int STRING_LITERAL = 67;
  int FORMAL_COMMENT = 68;
  int IDENTIFIER = 69;
  int LETTER = 70;
  int DIGIT = 71;
  int LPAREN = 72;
  int RPAREN = 73;
  int LBRACE = 74;
  int RBRACE = 75;
  int LBRACKET = 76;
  int RBRACKET = 77;
  int SEMICOLON = 78;
  int COMMA = 79;
  int DOT = 80;
  int ASSIGN = 81;
  int GT = 82;
  int GTX = 83;
  int LT = 84;
  int LTX = 85;
  int BANG = 86;
  int TILDE = 87;
  int HOOK = 88;
  int COLON = 89;
  int EQ = 90;
  int LE = 91;
  int LEX = 92;
  int GE = 93;
  int GEX = 94;
  int NE = 95;
  int BOOL_OR = 96;
  int BOOL_ORX = 97;
  int BOOL_AND = 98;
  int BOOL_ANDX = 99;
  int INCR = 100;
  int DECR = 101;
  int PLUS = 102;
  int MINUS = 103;
  int STAR = 104;
  int SLASH = 105;
  int BIT_AND = 106;
  int BIT_ANDX = 107;
  int BIT_OR = 108;
  int BIT_ORX = 109;
  int XOR = 110;
  int MOD = 111;
  int LSHIFT = 112;
  int LSHIFTX = 113;
  int RSIGNEDSHIFT = 114;
  int RSIGNEDSHIFTX = 115;
  int RUNSIGNEDSHIFT = 116;
  int RUNSIGNEDSHIFTX = 117;
  int PLUSASSIGN = 118;
  int MINUSASSIGN = 119;
  int STARASSIGN = 120;
  int SLASHASSIGN = 121;
  int ANDASSIGN = 122;
  int ANDASSIGNX = 123;
  int ORASSIGN = 124;
  int ORASSIGNX = 125;
  int XORASSIGN = 126;
  int MODASSIGN = 127;
  int LSHIFTASSIGN = 128;
  int LSHIFTASSIGNX = 129;
  int RSIGNEDSHIFTASSIGN = 130;
  int RSIGNEDSHIFTASSIGNX = 131;
  int RUNSIGNEDSHIFTASSIGN = 132;
  int RUNSIGNEDSHIFTASSIGNX = 133;

  int DEFAULT = 0;

  String[] tokenImage = {
/* 0 */  "<EOF>",
/* 1 */  "\" \"",
/* 2 */  "\"\\t\"",
/* 3 */  "\"\\r\"",
/* 4 */  "\"\\f\"",
/* 5 */  "\"\\n\"",
/* 6 */  "<NONPRINTABLE>",
/* 7 */  "<SINGLE_LINE_COMMENT>",
/* 8 */  "<HASH_BANG_COMMENT>",
/* 9 */  "<MULTI_LINE_COMMENT>",
/* 10 */  "\"abstract\"",
/* 11 */  "\"boolean\"",
/* 12 */  "\"break\"",
/* 13 */  "\"class\"",
/* 14 */  "\"byte\"",
/* 15 */  "\"case\"",
/* 16 */  "\"catch\"",
/* 17 */  "\"char\"",
/* 18 */  "\"const\"",
/* 19 */  "\"continue\"",
/* 20 */  "\"default\"",
/* 21 */  "\"do\"",
/* 22 */  "\"double\"",
/* 23 */  "\"else\"",
/* 24 */  "\"enum\"",
/* 25 */  "\"extends\"",
/* 26 */  "\"false\"",
/* 27 */  "\"final\"",
/* 28 */  "\"finally\"",
/* 29 */  "\"float\"",
/* 30 */  "\"for\"",
/* 31 */  "\"goto\"",
/* 32 */  "\"if\"",
/* 33 */  "\"implements\"",
/* 34 */  "\"import\"",
/* 35 */  "\"instanceof\"",
/* 36 */  "\"int\"",
/* 37 */  "\"interface\"",
/* 38 */  "\"long\"",
/* 39 */  "\"native\"",
/* 40 */  "\"new\"",
/* 41 */  "\"null\"",
/* 42 */  "\"package\"",
/* 43 */  "\"private\"",
/* 44 */  "\"protected\"",
/* 45 */  "\"public\"",
/* 46 */  "\"return\"",
/* 47 */  "\"short\"",
/* 48 */  "\"static\"",
/* 49 */  "\"strictfp\"",
/* 50 */  "\"switch\"",
/* 51 */  "\"synchronized\"",
/* 52 */  "\"transient\"",
/* 53 */  "\"throw\"",
/* 54 */  "\"throws\"",
/* 55 */  "\"true\"",
/* 56 */  "\"try\"",
/* 57 */  "\"void\"",
/* 58 */  "\"volatile\"",
/* 59 */  "\"while\"",
/* 60 */  "<INTEGER_LITERAL>",
/* 61 */  "<DECIMAL_LITERAL>",
/* 62 */  "<HEX_LITERAL>",
/* 63 */  "<OCTAL_LITERAL>",
/* 64 */  "<FLOATING_POINT_LITERAL>",
/* 65 */  "<EXPONENT>",
/* 66 */  "<CHARACTER_LITERAL>",
/* 67 */  "<STRING_LITERAL>",
/* 68 */  "<FORMAL_COMMENT>",
/* 69 */  "<IDENTIFIER>",
/* 70 */  "<LETTER>",
/* 71 */  "<DIGIT>",
/* 72 */  "\"(\"",
/* 73 */  "\")\"",
/* 74 */  "\"{\"",
/* 75 */  "\"}\"",
/* 76 */  "\"[\"",
/* 77 */  "\"]\"",
/* 78 */  "\";\"",
/* 79 */  "\",\"",
/* 80 */  "\".\"",
/* 81 */  "\"=\"",
/* 82 */  "\">\"",
/* 83 */  "\"@gt\"",
/* 84 */  "\"<\"",
/* 85 */  "\"@lt\"",
/* 86 */  "\"!\"",
/* 87 */  "\"~\"",
/* 88 */  "\"?\"",
/* 89 */  "\":\"",
/* 90 */  "\"==\"",
/* 91 */  "\"<=\"",
/* 92 */  "\"@lteq\"",
/* 93 */  "\">=\"",
/* 94 */  "\"@gteq\"",
/* 95 */  "\"!=\"",
/* 96 */  "\"||\"",
/* 97 */  "\"@or\"",
/* 98 */  "\"&&\"",
/* 99 */  "\"@and\"",
/* 100 */  "\"++\"",
/* 101 */  "\"--\"",
/* 102 */  "\"+\"",
/* 103 */  "\"-\"",
/* 104 */  "\"*\"",
/* 105 */  "\"/\"",
/* 106 */  "\"&\"",
/* 107 */  "\"@bitwise_and\"",
/* 108 */  "\"|\"",
/* 109 */  "\"@bitwise_or\"",
/* 110 */  "\"^\"",
/* 111 */  "\"%\"",
/* 112 */  "\"<<\"",
/* 113 */  "\"@left_shift\"",
/* 114 */  "\">>\"",
/* 115 */  "\"@right_shift\"",
/* 116 */  "\">>>\"",
/* 117 */  "\"@right_unsigned_shift\"",
/* 118 */  "\"+=\"",
/* 119 */  "\"-=\"",
/* 120 */  "\"*=\"",
/* 121 */  "\"/=\"",
/* 122 */  "\"&=\"",
/* 123 */  "\"@and_assign\"",
/* 124 */  "\"|=\"",
/* 125 */  "\"@or_assign\"",
/* 126 */  "\"^=\"",
/* 127 */  "\"%=\"",
/* 128 */  "\"<<=\"",
/* 129 */  "\"@left_shift_assign\"",
/* 130 */  "\">>=\"",
/* 131 */  "\"@right_shift_assign\"",
/* 132 */  "\">>>=\"",
/* 133 */  "\"@right_unsigned_shift_assign\""
  };

}