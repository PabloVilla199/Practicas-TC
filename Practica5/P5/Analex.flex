//* --------------------------Sección de código de usuario ------------------------*/ 

import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;

%% 

/* -----------------Sección de opciones y declaraciones -----------------*/ 

/* Nombre de la clase generada para el analizador léxico*/ 
%class analex 

/* Posibilitar acceso al número de carácter, la columna y la fila actual de análisis*/ 
%public
%standalone
%unicode
%char
%line
%column

/* Habilitar la compatibilidad con el interfaz CUP para el generador sintáctico */
%cup

%{ /*  Declaraciones */
	/* Constructor que carga la fábrica de símbolos */
	public analex(java.io.Reader in, ComplexSymbolFactory sf){
		this(in);
		symbolFactory = sf;
    }
    ComplexSymbolFactory symbolFactory;

	/* Crear un nuevo objeto Symbol con informacion sobre el token actual sin valor */
	private Symbol symbol(String name, int sym) {
		return symbolFactory.newSymbol(name, sym, new Location(yyline+1,yycolumn+1,yychar), new Location(yyline+1,yycolumn+yylength(),yychar+yylength()));
	}

	/* Ídem con valor */
	private Symbol symbol(String name, int sym, Object val) {
		Location left = new Location(yyline+1,yycolumn+1,yychar);
		Location right= new Location(yyline+1,yycolumn+yylength(),yychar+yylength());
		return symbolFactory.newSymbol(name, sym, left, right, val);
	}
%}

/* Reconocimiento correcto del fin de archivo */
%eofval{
     return symbolFactory.newSymbol("EOF", sym.EOF, new Location(yyline+1,yycolumn+1,yychar), new Location(yyline+1,yycolumn+1,yychar+1));
%eofval}

%%

"lista_espacios" {return symbol("LISTA_ESPACIOS",sym.L_ESPACIO);}
"lista_tipos" {return symbol("LISTA_TIPOS",sym.L_TIPOS);}
"lista_eventos" {return symbol("LISTA_EVENTOS",sym.L_EVENTOS);}

/* Operadores */
== {return symbol("IGUAL",sym.IGUAL);}
, {return symbol("COMA",sym.COMA);}
; {return symbol("PUNTO_Y_COMA",sym.PUNTOCOMA);}
"{" {return symbol("LLAVE_APERTURA",sym.LLAVE_APR);}
"}" {return symbol("LLAVE_FINAL",sym.LLAVE_FIN);}

/* Texto */
[A-ZÁÉÍÓÚ] [a-záéíóú0-9]+ _ [a-záéíóú0-9]+ {return symbol("NOMBRE_ESPACIOS",sym.NOM_ESPACIOS,yytext());}
[A-ZÁÉÍÓÚ] [a-zA-ZáéíóúÁÉÍÓÚ_]+ {return symbol("NOMBRE_TIPOS",sym.NOM_TIPOS,yytext());}
[a-zA-ZÁÉÍÓÚáéíóú]+(\s[a-zA-ZÁÉÍÓÚáéíóú]+)+ {return symbol("NOMBRE_EVENTOS",sym.NOM_EVE,yytext());}

/* Fecha y hora */
(0[0-9] | 1[0-9] | 2[0-9] | 3[0-1]) "/" (0[1-9] | 1[0-2]) "/" [0-9]+ {return symbol("FECHA",sym.FECHA,yytext());}
(0[0-9] | 1[0-9] | 2[0-3]) : [0-5] [0-9] {return symbol("HORA",sym.HORA,yytext());}

\r|\n|\s {}
. {System.out.println("Token No Valido <" +yytext()+ ">linea: " + (yyline+1) + " columna: " + (yycolumn+1));} 
