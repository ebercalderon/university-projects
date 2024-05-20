package Persistencia;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Serializador extends ObjectOutputStream {

    // Constructor que recibe OutputStream
    
    public Serializador(OutputStream out) throws IOException {
        super(out);
    }

    // Constructor sin parámetros
      
    protected Serializador() throws IOException, SecurityException {
        super();
    }

    // Redefinición del método de escribir la cabecera para que no haga nada.
     
    protected void writeStreamHeader() throws IOException {

    }
}