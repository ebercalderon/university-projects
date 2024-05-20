
package project;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import control.Sesionn;
import java.io.IOException;
import java.sql.SQLException;
import modelo.Sesion;
import modelo.Usuario;
import vista.AcargarSO;
import vista.BcargarSE;
import vista.EcargarNa;

public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, InterruptedException, IOException {
        // TODO code application logic here
        AcargarSO cargSO = new AcargarSO();
        cargSO.setVisible(true);
        Thread.sleep(1800);
        BcargarSE IS = new BcargarSE();
        Sesion MIS = new Sesion();
        Usuario US = new Usuario();
        Sesionn CIS = new Sesionn(IS, MIS, US);
        CIS.iniciar();

        NativeInterface.open();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EcargarNa();
            }
        });
        NativeInterface.runEventPump();
    }
}
