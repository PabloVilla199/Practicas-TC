%%
%class Analex
%public
%standalone
%line
%column
%unicode
%{
%}
%eof{
	System.out.println("");
	System.out.println("Ha terminado el analizador");
%eof}

%%

"lista_espacios" {System.out.println("Token: LISTA_ESPACIOS, Lexema: " + yytext());}
"lista_tipos" {System.out.println("Token: LISTA_TIPOS, Lexema: " + yytext());}
"lista_eventos" {System.out.println("Token: LISTA_EVENTOS, Lexema: " + yytext());}

/*Operadores*/

== {System.out.println("Token: IGUAL, Lexema: " +yytext());}
, {System.out.println("Tokem: COMA , lexema: " +yytext());}
; {System.out.println("Tokem: PUNTO_COMA , lexema: " +yytext());}
"{" {System.out.println("Tokem: LLAVE_ABRIR , lexema: " +yytext());}
"}" {System.out.println("Tokem: LLAVE_CERRAR , lexema: " +yytext());}

/*TEXTO*/
[A-ZÁÉÍÓÚ] [a-záéíóú0-9]+ _ [a-záéíóú0-9]+ {System.out.println("Token: NOMBRE_ESPACIOS, Lexema: " + yytext());}
[A-ZÁÉÍÓÚ] [a-zA-ZáéíóúÁÉÍÓÚ_]+ {System.out.println("Token: NOMBRE_TIPOS, Lexema: " + yytext());}
[A-ZÁÉÍÓÚ] [a-zA-ZáéíóúÁÉÍÓÚ]+ {System.out.println("Token: NOMBRE_EVENTOS, Lexema: " + yytext());}

/*FECHA Y HORA*/
(0[0-9] | 1[0-9] | 2[0-9] | 3[0-1]) "/" (0[1-9] | 1[0-2]) "/" [0-9]+ {System.out.println("Token: FECHA, Lexema: " + yytext());}
(0[0-9] | 1[0-9] | 2[0-3]) : [0-5] [0-9] {System.out.println("Token: HORA, Lexema: " + yytext());} 


\r|\n|\s {}
. {System.out.println("Error; carácter no válido '" + yytext() + "' ubicado en la linea " + yyline + " y en la columna " + yycolumn);} 