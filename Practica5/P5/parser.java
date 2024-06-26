
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParserException;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\022\000\002\002\006\000\002\002\004\000\002\002" +
    "\006\000\002\002\006\000\002\006\002\000\002\003\005" +
    "\000\002\007\002\000\002\003\006\000\002\003\002\000" +
    "\002\010\002\000\002\004\005\000\002\004\005\000\002" +
    "\004\002\000\002\011\002\000\002\012\002\000\002\013" +
    "\002\000\002\005\022\000\002\005\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\010\004\004\005\007\006\006\001\002\000" +
    "\004\012\044\001\002\000\004\002\043\001\002\000\004" +
    "\012\020\001\002\000\004\012\010\001\002\000\006\013" +
    "\ufff5\015\011\001\002\000\010\010\014\013\ufff8\015\ufff8" +
    "\001\002\000\004\013\013\001\002\000\004\002\uffff\001" +
    "\002\000\006\013\ufff5\015\011\001\002\000\006\013\ufff5" +
    "\015\011\001\002\000\004\013\ufff7\001\002\000\004\013" +
    "\ufff6\001\002\000\006\013\ufff0\016\021\001\002\000\004" +
    "\007\024\001\002\000\004\013\023\001\002\000\004\002" +
    "\ufffe\001\002\000\004\015\025\001\002\000\004\007\ufff4" +
    "\001\002\000\004\007\027\001\002\000\004\014\030\001" +
    "\002\000\004\007\ufff3\001\002\000\004\007\032\001\002" +
    "\000\004\017\033\001\002\000\004\020\034\001\002\000" +
    "\004\007\035\001\002\000\004\017\036\001\002\000\004" +
    "\020\037\001\002\000\004\011\040\001\002\000\006\013" +
    "\ufff2\016\ufff2\001\002\000\006\013\ufff0\016\021\001\002" +
    "\000\004\013\ufff1\001\002\000\004\002\000\001\002\000" +
    "\006\013\ufff9\014\045\001\002\000\010\010\ufffb\013\ufffd" +
    "\014\ufffd\001\002\000\004\013\047\001\002\000\004\002" +
    "\001\001\002\000\004\010\053\001\002\000\006\013\ufff9" +
    "\014\045\001\002\000\004\013\ufffc\001\002\000\006\013" +
    "\ufff9\014\045\001\002\000\004\013\ufffa\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\004\011\001\001\000\004\010\014\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\016\001\001\000\004" +
    "\004\015\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\005\021\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\011\025\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\012\030" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\013\040\001\001\000\004\005" +
    "\041\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\003\045\001\001\000\006\006\050\007\047\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\003\051\001\001\000\002\001\001\000\004\003\053\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




ArrayList<String> L_espacios = new ArrayList<>;
ArrayList<String> L_tipos = new ArrayList<>;

public Class Evento{
  	string nombre;
	Date inicio;
	Date fin;
 
public evento(String nombre, Date inicio, Date fin){
	this.nombre = nomre;
	this.inicio = inicio;
	this.fin = fin;

}

}
ArrayList<Evento> Eventos = new ArrayList<>;

public void insertar_espacio(String nombre){

	if(L_espacio.contains(nombre)){
	  System.out.Println("Error el espacio ya ha sido introducido");
	}
	L_espacios.add(nombre);
}

public void insertar_tipo(String nombre){

	if(L_espacio.contains(nombre)){
	  System.out.Println("Error el tipo ya ha sido introducido");
	}
	L_tipos.add(nombre);
}



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // S ::= LIST_ESPACIO LLAVE_APR ESPACIOS LLAVE_FIN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= S EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // S ::= LIST_TIPOS LLAVE_APR TIPOS LLAVE_FIN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // S ::= LIST_EVENTOS LLAVE_APR EVENTOS LLAVE_FIN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // NT$0 ::= 
            {
              Object RESULT =null;
		int n_espacioleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n_espacioright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n_espacio = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
insertar_espacio(n_espacio) 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // ESPACIOS ::= NOM_ESPACIOS NT$0 ESPACIOS 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int n_espacioleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int n_espacioright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String n_espacio = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ESPACIOS",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // NT$1 ::= 
            {
              Object RESULT =null;
		int n_espacioleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n_espacioright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n_espacio = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
insertar_espacio(n_espacio) 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$1",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // ESPACIOS ::= NOM_ESPACIOS NT$1 COMA ESPACIOS 
            {
              Object RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int n_espacioleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int n_espacioright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String n_espacio = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ESPACIOS",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // ESPACIOS ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ESPACIOS",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // NT$2 ::= 
            {
              Object RESULT =null;
		int n_tipoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n_tiporight = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n_tipo = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
insertar_tipo(n_tipo) 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$2",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // TIPOS ::= NOM_TIPOS NT$2 TIPOS 
            {
              Object RESULT =null;
              // propagate RESULT from NT$2
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int n_tipoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int n_tiporight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String n_tipo = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPOS",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // TIPOS ::= NOM_TIPOS COMA TIPOS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPOS",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // TIPOS ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPOS",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // NT$3 ::= 
            {
              Object RESULT =null;
		int n_tipoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n_tiporight = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n_tipo = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
 
    if(!L_tipos.contains(n_tipo)){
	System.out.println("error nombre no reconocido");
   }

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$3",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // NT$4 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int n_tipoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int n_tiporight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String n_tipo = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int n_espaciosleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n_espaciosright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n_espacios = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
 
   if(!L_espacios.contains(n_espacios)){
	System.out.println("error nombre no reconocido");
   }


              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$4",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // NT$5 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;
		int n_tipoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)).left;
		int n_tiporight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)).right;
		String n_tipo = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-11)).value;
		int n_espaciosleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).left;
		int n_espaciosright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).right;
		String n_espacios = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-8)).value;
		int idInicioleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int idInicioright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		String idInicio = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int idHoraInicioleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int idHoraInicioright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String idHoraInicio = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int idFinleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int idFinright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String idFin = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int idHoraFinleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int idHoraFinright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String idHoraFin = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

try {

 SimpleDateFormat fecha = new SimpleDateFormat("dd/mm/aaaa hh:nn");
 Date inicio = fecha.parse(idInicio + " " + idHoraInicio);
 Date fin = fecha.parse(idFin + " " + idHoraFin);
 
 
 if(fin.before(inicio)){
   System.out.println("error fecha no valida);
}
else{
     System.out.println("fecha valida");
}

}catch(ParseException e) {
	System.out.println("Error mal ");	
}


              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$5",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // EVENTOS ::= NOM_EVENTOS IGUAL NOM_TIPOS NT$3 IGUAL NOM_ESPACIOS NT$4 IGUAL FECHA HORA IGUAL FECHA HORA PUNTOCOMA NT$5 EVENTOS 
            {
              Object RESULT =null;
              // propagate RESULT from NT$5
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int n_tipoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-13)).left;
		int n_tiporight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-13)).right;
		String n_tipo = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-13)).value;
		int n_espaciosleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)).left;
		int n_espaciosright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)).right;
		String n_espacios = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-10)).value;
		int idInicioleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).left;
		int idInicioright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).right;
		String idInicio = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;
		int idHoraInicioleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int idHoraInicioright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		String idHoraInicio = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int idFinleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int idFinright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String idFin = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int idHoraFinleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int idHoraFinright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String idHoraFin = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EVENTOS",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-15)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // EVENTOS ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EVENTOS",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
