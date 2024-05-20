
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import modelo.Sesion;
import modelo.Usuario;
import vista.BcargarSE;


public class Sesionn implements ActionListener {

    private BcargarSE IS;
    private Sesion MIS;
//    private ControladorEscritorio CE;
    private Usuario US;

    public Sesionn(BcargarSE IS, Sesion MIS, Usuario US) {
        this.IS = IS;
        this.MIS = MIS;
        this.US = US;
        IS.btnApagar.addActionListener(this);
        IS.btnIniciar.addActionListener(this);
        IS.btnRegistrar.addActionListener(this);
        IS.cajaRegistrarUsuario.addActionListener(this);
        IS.cajaRegistrarContraseña.addActionListener(this);
        IS.btnAceptarRegistro.addActionListener(this);
        IS.btnCambiarUsuario.addActionListener(this);
    }

    public void iniciar() throws SQLException {
        IS.setLocationRelativeTo(null);
        IS.setVisible(true);
        IS.mensajeError.setText("");
        IS.panelRegistro.setVisible(false);
        MIS.actualizarComboBox(IS);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == IS.btnApagar) {//Boton apagar
            MIS.apagar(IS);
        }

        if (e.getSource() == IS.btnIniciar) {//Boton iniciarSesion
            MIS.iniciarSesion(IS, US);
        }

        if (e.getSource() == IS.btnRegistrar) {//Boton Registrar
            MIS.registrarUsuario(IS);
        }
        if(e.getSource() == IS.btnAceptarRegistro){
            if(MIS.aceptarRegistro(IS, US)){
                IS.mensajeError.setText("Usuario Registrado con Éxito.");
                IS.panelRegistro.setVisible(false);
            }
        }
        if(e.getSource() == IS.btnCambiarUsuario){
            MIS.cambiarUsuario(IS);
        }
    }
}
