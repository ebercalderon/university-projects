package modelo;

//import controladorPrincipal.ControladorEscritorio;
import static Persistencia.Datos.cargarUsuarios;
import control.*;
import java.util.ArrayList;
import vista.*;
//import vistaPrincipal.Escritorio;

public class Sesion {

    CcargarES ES = new CcargarES();
    Escrt ME = new Escrt();
    Escritori CE;

    public void apagar(BcargarSE IS) {
        System.exit(0);
    }

    public boolean buscarUsuario(Usuario usuario) {
        ArrayList<Usuario> usuarios = cargarUsuarios();

        try {

            for (int i = 0; i < usuarios.size(); i++) {
                if (usuario.getClave().equals(usuarios.get(i).getClave()) && usuario.getNombre().equals(usuarios.get(i).getNombre())) {
                    usuario.setPermisos(usuarios.get(i).getPermisos());
                    return true;
                }
            }
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }

        return false;
    }

    public void iniciarSesion(BcargarSE IS, Usuario US) {
        //guardar clave y contraseña para verificar
        US.setClave(String.valueOf(IS.cajaConstraseña.getPassword()));
        US.setNombre(String.valueOf(IS.nombreUsuario.getText()));

        if (buscarUsuario(US)) {
            //Iniciar el escritorio
            System.out.println("Credenciales: " + US.getNombre() + "|" + US.getClave() + "|" + US.getPermisos());
            CE = new Escritori(ME, ES, US);
            CE.iniciar();
            IS.dispose();

            //Asignar el nombre de usuario al menu inicio
            ES.usuario.setText(US.getNombre());
        } else {
            IS.mensajeError.setText("CLAVE incorrecta. Inténtenlo de nuevo");
            IS.cajaConstraseña.setText("");
        }
    }

    public void registrarUsuario(BcargarSE IS) {
        IS.panelRegistro.setVisible(true);

    }

    public boolean aceptarRegistro(BcargarSE IS, Usuario US) {
        //guardar clave y contraseña para verificar
        US.setNombre(String.valueOf(IS.cajaRegistrarUsuario.getText()));
        US.setClave(String.valueOf(IS.cajaRegistrarContraseña.getPassword()));

        try {
            System.out.println("En proceso...");
            return true;
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;
        }
    }

    public void actualizarComboBox(BcargarSE IS) {
        ArrayList<Usuario> usuarios = cargarUsuarios();

        IS.comboUsuarios.removeAllItems();
        //IS.comboUsuarios.addItem("Invitado");

        try {

            for (int i = 0; i < usuarios.size(); i++) {
                IS.comboUsuarios.addItem(usuarios.get(i).getNombre());
                if (usuarios.get(i).getNombre().equals("Invitado")) {
                    IS.cajaConstraseña.setText("123");
                }
            }
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }

    public void cambiarUsuario(BcargarSE IS) {
        IS.mensajeError.setText("");
        String user = IS.comboUsuarios.getSelectedItem().toString();
        IS.nombreUsuario.setText(user);
        if (IS.comboUsuarios.getSelectedItem().toString().equals("Invitado")) {
            IS.cajaConstraseña.setText("123");
        } else {
            IS.cajaConstraseña.setText("");
        }
    }

}
