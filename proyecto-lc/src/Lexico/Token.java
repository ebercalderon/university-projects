package Lexico;

public class Token {

  private String lexema;
  private String descripcion;
  private int token;
  private int linea;
  

  public Token(String lexema, String descripcion, int token, int linea) {
    this.lexema = lexema;
    this.descripcion = descripcion;
    this.token = token;
    this.linea = linea;
  }

  public Token(int token, String lexema, String descripcion) {
    this.lexema = lexema;
    this.descripcion = descripcion;
    this.token = token;
  }

  public String getLexema() {
    return lexema;
  }

  public void setLexema(String lexema) {
    this.lexema = lexema;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  
    public int getToken() {
    return token;
  }

  public void setToken(int token) {
    this.token = token;
  }

  public int getLinea() {
    return linea;
  }

  public void setLinea(int linea) {
    this.linea = linea;
  }
  
}
  


