
package Entidades;

public class Mensaje {
    private String emisor;
    private String textoEmisor;

    public Mensaje(String emisor, String textoEmisor) {
        this.emisor = emisor;
        this.textoEmisor = textoEmisor;
    }

    public String getTextoEmisor() {
        return textoEmisor;
    }

    public String getEmisor() {
        return emisor;
    }


}
