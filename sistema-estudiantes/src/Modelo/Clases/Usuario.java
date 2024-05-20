package Modelo.Clases;

import Modelo.Clases.Persona;

/**
 *
 * @author Gonzalo
 */
public class Usuario extends Persona  {

    private String username;
    private String password;
    private String modo;

    public Usuario() {
        super();
        this.username = " ";
        this.password = " ";
        this.modo = " ";
    }

    public Usuario(String username, String password, String modo, String dni, String nombre, String apellido, String nacimiento, String celular, String genero) {
        super(dni, nombre, apellido, nacimiento, celular, genero);
        this.username = username;
        this.password = password;
        this.modo = modo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

}
