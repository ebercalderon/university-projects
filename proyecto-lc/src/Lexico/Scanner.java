package Lexico;

//Esta clase se usa para averiguar cuál es la palabra reservada. llamando de Gui.java.
 

import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;

public class Scanner {
                
	private String text; //guarda el texto
	private Vector<Token> tokens;  
	/*private static final String[] KEYWORD = {"if", "else", "while", "switch", 
	"case", "return", "int", "float", "void", "char", "string", "boolean", 
	"true", "false", "print"}*/ 
	static Collection <String> KeywordCollection = Arrays.asList(new String [] {"if", "else", "while", "switch", 
			"case", "return", "int", "float", "void", "char", "string", "boolean", 
			"true", "false", "print", "default"}); //convirtiendo la palabra clave de la matriz de cadenas a un vector para una mejor búsqueda y un código limpio 
	private static final Vector KEYWORD = new Vector(KeywordCollection);
                            //utilizado para los caracteres segun su escritura
	static Collection <String> AtoFCollection = Arrays.asList(new String[]{"A", "a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "f"});
	static Collection <String> GtoZCollection = Arrays.asList(new String[]{"G", "g", "H", "h", "I", "i", "J", "j", "K", "k", "L", "l","M", "m", "N", "n", "O", "o", "P", "p", "Q", "q", "R", "r", "S", "s", "T", "t", "U", "u", "V", "v", "W", "w", "X", "x", "Y", "y", "Z", "z"});
	private static final Vector AtoF = new Vector(AtoFCollection);
	private static final Vector GtoZ = new Vector(GtoZCollection);
	//se muestran las columnas de la Tabla de Estados y, por lo tanto, la definición de la constante entera para ellas
	private static final int ZERO      =  8;
	private static final int ONE       =  9;
	private static final int B         =  4;
	private static final int OTHER     =  17;
	private static final int DELIMITER =  18;
	private static final int ERROR     =  25;
	private static final int STOP      = -2;
	private static final int TWO_SEVEN = 10;
	private static final int EIGHT_NINE = 11;
	private static final int A_F = 7;
	private static final int G_Z = 12;
	private static final int X = 5;
	private static final int E = 6;
	private static final int SINGLE_QUOTE = 0;
	private static final int DOUBLE_QUOTE = 3;
	private static final int DOLLAR = 1;
	private static final int UNDERSCORE = 2;
	private static final int PERIOD = 13;
	private static final int WHITESPACE = 14;
	private static final int ESCAPECHAR = 15;
	private static final int PlusMinus = 16;

	private int singleQuoteCount = 0;
	private int doubleQuoteCount = 0;

	private boolean checkForDelimOper = true;
	
	private String currentString;// contiene la palabra actual, excepto el carácter actual  
	
	Token currentToken = null;  // currentToken está actualmente implementado para el operador

	//Tabla de estados
	private static final int[][] stateTable = { 
		/*		   {'}     {$}    {_}    {"}    {b}    {x}    {e}    {A-F}  {0}    {1}  {2-7}  {8-9}  {G-Z}   {.}  {" "}    {\}   {+-} {OTHER}{Delimiter}*/
		/*S0*/	{   1,     6, 	   6, 	  3,     6, 	6,     6,     6,     7,     8,     8,     8,     6,    13, ERROR, ERROR, ERROR, ERROR, STOP}, 
		/*S1*/	{ERROR,     2, 	   2,     2,     2,     2,     2,     2,     2,     2,     2,     2, 	 2,     2,     2,    15,     2,     2,    2}, 
		/*S2*/	{   16,    23,    23,    23,    23,    23,    23,    23,    23,    23,    23,    23,    23,    23,    23,    22,    23,    23,   23},
		/*S3*/	{    3,     3,     3,     5,     3,     3,     3,     3,     3,     3,     3,     3,     3,     3,     3,     4,     3,     3,    3},
		/*S4*/	{    3,     3,     3,     3,     3,     3,     3,     3,     3,     3,     3,     3,     3,     3,     3,     3,     3,     3,    3},
		/*S5*/	{ STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP, STOP},
		/*S6*/	{    6,     6,     6, ERROR,     6,     6,     6,     6,     6,     6,     6,     6,     6, ERROR, ERROR, ERROR, ERROR, ERROR, STOP},
		/*S7*/	{ERROR, ERROR, ERROR, ERROR,     9,    10,    19, ERROR,    17,    17,    17, ERROR, ERROR,    12, ERROR, ERROR, ERROR, ERROR, STOP},
		/*S8*/	{ERROR, ERROR, ERROR, ERROR, ERROR, ERROR,    19, ERROR,     8,     8,     8,     8, ERROR,    12, ERROR, ERROR, ERROR, ERROR, STOP},
		/*S9*/	{ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR,    14,    14, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, STOP},
		/*S10*/	{ERROR, ERROR, ERROR, ERROR,    11, ERROR,    11,    11,    11,    11,    11,    11, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, STOP},
		/*S11*/	{ERROR, ERROR, ERROR, ERROR,    11, ERROR,    11,    11,    11,    11,    11,    11, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, STOP},
		/*S12*/	{ERROR, ERROR, ERROR, ERROR, ERROR, ERROR,    19, ERROR,    18,    18,    18,    18, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, STOP},
		/*S13*/	{ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR,    18,    18,    18,    18, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, STOP},
		/*S14*/	{ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR,    14,    14, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, STOP},
		/*S15*/	{    2,     2, 	   2,     2,     2,     2,     2,     2,     2,     2,     2,     2, 	 2,     2,     2,     2,     2,     2,    2},
		/*S16*/	{ STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP, STOP},
		/*S17*/	{ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR,    17,    17,    17, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, STOP},
		/*S18*/	{ERROR, ERROR, ERROR, ERROR, ERROR, ERROR,    19, ERROR,    18,    18,    18,    18, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, STOP},
		/*S19*/	{ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR,    21,    21,    21,    21, ERROR, ERROR, ERROR, ERROR,    20, ERROR, STOP},
		/*S20*/	{ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR,    21,    21,    21,    21, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, STOP},
		/*S21*/	{ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR,    21,    21,    21,    21, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, STOP},
		/*S22*/	{   23,    23,    23,    23,    23,    23,    23,    23,    23,    23,    23,    23,    23,    23,    23,    23,    23,    23,   23},
		/*S23*/	{   24,    23,    23,    23,    23,    23,    23,    23,    23,    23,    23,    23,    23,    23,    23,    22,    23,    23,   23},
		/*S24*/	{ STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP,  STOP, STOP},
		/*SEr*/	{ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, ERROR, STOP}
	};

	//Constructor
	public Scanner(String text) {
		this.text = text;
	}

	//Ejecutar
	public void run () {
		tokens = new Vector<Token>();
		String line;
		int counterOfLines= 1;
		//  Salto de linea
		do {
			int eolAt = text.indexOf('\n');
			if (eolAt >= 0) {
				line = text.substring(0,eolAt); 
				if (text.length()>0) text = text.substring(eolAt+1);  
			} else {
				line = text;
				text = "";
			}
                        System.out.println(counterOfLines + " : " + line);
			splitLine (counterOfLines, line);
                        
			counterOfLines++;
		} while ( !text.equals("") );   
	}

	//Salto de linea
	private void splitLine(int row, String line) {
		int state = 0;
		int index = 0;
		char currentChar;
		String string="";
		currentString = "";
		checkForDelimOper = true;
		singleQuoteCount = 0;
		doubleQuoteCount = 0;

		if (line.equals("")) return;
		
		int go; 
		do 
		{  
			currentChar = line.charAt(index);
                        System.out.println("char: " + currentChar);
			//lógica para romper la palabra pasada si " o " ocurre
			if(!currentString.isEmpty() && (currentChar =='\'' || currentChar == '"') && singleQuoteCount == 0 && doubleQuoteCount == 0)
			{
				break;
			}
			else
			{
				go = calculateNextState(state, currentChar);  
                                System.out.println("go: " + go);
				if( go != STOP ) {
					string = string + currentChar;
					currentString = string;
                                        System.out.println("string: " + currentString);
					//para apoyar el '\' como un error. Este es un caso especial con mi lógica
					if(state == 1 && go == ERROR)
					{
						index++;
						break;
					}
					state = go;
					
                                        //lógica para romper la palabra al completarse la cadena y el carácter, es decir, en la segunda ocurrencia de "and" respectivamente
					if(state == 16 || state == 5 || state == 24)
					{
						index++;
						break;
					}
				}
                                System.out.println(index);
				index++;        
			}

		} while (index < line.length() && go != STOP);

		if (state == 16) 
		{
			tokens.add(new Token(string, "CHARACTER", row, 1));
		}
		else if (state == 5) 
		{
			tokens.add(new Token(string, "STRING", row, 1));
		}
		else if (state == 6)
		{
			if(KEYWORD.contains(string))
				tokens.add(new Token(string, "KEYWORD", row, 1));
			else
				tokens.add(new Token(string, "IDENTIFIER", row, 1));
		}
		else if (state == 7) 
		{
			tokens.add(new Token(string, "INTEGER", row, 1));
		}
		else if (state == 8) 
		{
			tokens.add(new Token(string, "INTEGER", row, 1));
		}
		else if (state == 11) 
		{
			tokens.add(new Token(string, "HEXADECIMAL", row, 1));
		}
		else if (state == 12 || state == 18 || state == 21) 
		{
			tokens.add(new Token(string, "FLOAT", row, 1));
		}
		else if (state == 14) 
		{
			tokens.add(new Token(string, "BINARY", row, 1));
		}
		else if (state == 17) 
		{
			tokens.add(new Token(string, "OCTAL", row, 1));
		}
		else if(state == 25 || state == 1 || state == 2 || state ==3 || state == 4 || state == 9 || state == 10 
				|| state == 15 || state == 16 || state == 20 || state == 22 || state == 23 || state == 24)
		{
			tokens.add(new Token(string, "ERROR", row, 1));
		}
		
	//Si el estado es uno de los siguientes, entonces el string o el caracter no terminan con "and" respectivamente. Por lo tanto, no busca el delimitador y el operador ya que son parte de la palabra errónea 	
                if(state == 22 || state == 23 || state == 3)
		{
			checkForDelimOper = false;
		}

		// caracter actual
		if( isDelimiter(currentChar) && checkForDelimOper)
			tokens.add(new Token(currentChar+"", "DELIMITER", row, 1));
		else if (isOperator(currentChar) && checkForDelimOper)
		{
			Token tempToken = new Token(currentChar+"", "OPERATOR", row, 1); 
			//logica para == y != 
			if(!tokens.isEmpty())
				currentToken = tokens.lastElement();
			if(currentToken != null && (currentToken.getLexema().equals("=") || currentToken.getLexema().equals("!")) && tempToken.getLexema().equals("="))
			{
				if(currentToken.getLexema().equals("="))
					currentToken.setLexema("==");
				else if(currentToken.getLexema().equals("!"))
					currentToken.setLexema("!=");
			}
			else
			{
				tokens.add(tempToken);
			}
		}
		// loop
                System.out.println("aquiii: " + line.substring(index));
		if (index < line.length()) 
			splitLine(row, line.substring(index));
	}

	// calcula estado
	private int calculateNextState(int state, char currentChar) 
	{
		if((currentChar == '+' || currentChar == '-') && state == 19)/* Para respaldar  float de tipo 2e2, 2e+2, 2e-2 que tiene + y - o nada después de e. Esto tiene que ser puesto antes de la llamada de isOperador() que es seguida más tarde de if else  */
		{
			return stateTable[state][PlusMinus];
		}
		else if (isSpace(currentChar)  || isDelimiter(currentChar)  || 
				isOperator(currentChar) /*|| isQuotationMark(currentChar)*/ ) //  esto está comentado, de lo contrario la cadena y el carácter no serían soportados
			return stateTable[state][DELIMITER];

		if (currentChar == ' ')
			return stateTable [state][WHITESPACE];
		else if (currentChar == '\'')
		{
			singleQuoteCount++;
			return stateTable [state][SINGLE_QUOTE];
		}
		else if(currentChar == '\\')
			return stateTable[state][ESCAPECHAR];
		else if (currentChar == '$')
			return stateTable [state][DOLLAR];    
		else if (currentChar == '_')
			return stateTable [state][UNDERSCORE];
		else if (currentChar == '"')
		{
			doubleQuoteCount++;
			return stateTable [state][DOUBLE_QUOTE];
		}
		else if (currentChar == 'b' || currentChar == 'B')
			return stateTable [state][B];
		else if (currentChar == 'x' || currentChar == 'X')
			return stateTable [state][X];
		else if (currentChar == 'e' || currentChar == 'E')
			return stateTable [state][E];
		else if (AtoF.contains(currentChar+""))
			return stateTable [state][A_F];
		else if (GtoZ.contains(currentChar+""))
			return stateTable [state][G_Z];
		else if (currentChar == '.')
			return stateTable [state][PERIOD];
		else if (currentChar == '0')
			return stateTable [state][ZERO];
		else if (currentChar == '1')
			return stateTable [state][ONE];
		else if (currentChar == '2' || currentChar == '3' || currentChar == '4'|| currentChar == '5'|| currentChar == '6'|| currentChar == '7')
			return stateTable [state][TWO_SEVEN];
		else if (currentChar == '8' || currentChar =='9')
			return stateTable [state][EIGHT_NINE];
		return stateTable [state][OTHER];
	}

	// si es delimitador
	private boolean isDelimiter(char c) {
		char [] delimiters = {':', ';', '}','{', '[',']','(',')',','}; //Añadido un nuevo carácter de línea como delimitador
		for (int x=0; x<delimiters.length; x++) {
			if (c == delimiters[x]) return true;      
		}
		return false;
	}

	// es operador
	private boolean isOperator(char o) {
		// == y != debe ser manejado en splitLine
		char [] operators = {'+', '-', '*','/','<','>','=','!','&','|'};
		for (int x=0; x<operators.length; x++) {
			if (o == operators[x]) return true;      
		}
		return false;
	}

	// isQuotationMark
	private boolean isQuotationMark(char o) {
		char [] quote = {'"', '\''};
		for (int x=0; x<quote.length; x++) {
			if (o == quote[x]) return true;      
		}
		return false;
	}

	// es espacio
	private boolean isSpace(char o) {
		return o == ' ' || o == '\t';
	}

	// obtener tokens
	public Vector<Token> getTokens() {
		return tokens;
	}
}
