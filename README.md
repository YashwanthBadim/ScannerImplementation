# ScannerImplementation
This is a project in which i have implemented a Scanner in Java programming language. The input string is present in data/sample.txt file and once the program is run, the input string is parsed and the output is printed as a Parsetree. 

Output:
Hello World from Main
File to parse : data/sample.txt
Stack 			Input Tokens			 Action Lookup			 Action Value			 value of LHS		 	length of RHS			 temp stack			 goto lookup			 goto value		 	stack action 			parse tree stack

0				id+id*id$					[0,id]					S5																														push id5				 id
0id5				+id*id$					[5,+]					R6					F					1					0					[0,F]					3					 push F3				 [ F id ]
0F3				+id*id$					[3,+]					R4					T					1					0					[0,T]					2					 push T2				 [ T [ F id ] ]
0T2				+id*id$					[2,+]					R2					E					1					0					[0,E]					1					 push E1				 [ E [ T [ F id ] ] ]
0E1				+id*id$					[1,+]					S6																														push +6				 [ E [ T [ F id ] ] ]
0E1+6				id*id$					[6,id]					S5																														push id5				 id [ E [ T [ F id ] ] ]
0E1+6id5				*id$					[5,*]					R6					F					1					0E1+6					[6,F]					3					 push F3				 [ F id ] [ E [ T [ F id ] ] ]
0E1+6F3				*id$					[3,*]					R4					T					1					0E1+6					[6,T]					9					 push T9				 [ T [ F id ] ] [ E [ T [ F id ] ] ]
0E1+6T9				*id$					[9,*]					S7																														push *7				 [ T [ F id ] ] [ E [ T [ F id ] ] ]
0E1+6T9*7				id$					[7,id]					S5																														push id5				 id [ T [ F id ] ] [ E [ T [ F id ] ] ]
0E1+6T9*7id5				$					[5,$]					R6					F					1					0E1+6T9*7					[7,F]					10					 push F10				 [ F id ] [ T [ F id ] ] [ E [ T [ F id ] ] ]
0E1+6T9*7F10				$					[10,$]					R3					T					3					0E1+6					[6,T]					9					 push T9				 [ T [ T [ F id ] ] * [ F id ] ] [ E [ T [ F id ] ] ]
0E1+6T9				$					[9,$]					R1					E					3					0					[0,E]					1					 push E1				 [ E [ E [ T [ F id ] ] ] + [ T [ T [ F id ] ] * [ F id ] ] ]
0E1				$						 [1,$] 				 accept 																																		 [ E [ E [ T [ F id ] ] ] + [ T [ T [ F id ] ] * [ F id ] ] ]
Parse Tree:
E
 E
  T
   F
    id
 +
  T
   T
    F
     id
  *
   F
    id
$
