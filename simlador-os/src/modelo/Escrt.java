package modelo;

import control.*;
import java.io.File;
import java.io.IOException;
import vista.*;
import java.sql.SQLException;
import javax.swing.JFrame;

public class Escrt {

    private boolean estadoMI;
    private boolean estadoPR;
    final String dirHome = System.getProperty("user.dir") + File.separator + "Mi_PC";
    final String dirPapelera = System.getProperty("user.dir") + File.separator + "Papelera";

    public void abrirExplorador(Usuario US) throws IOException {
        DcargarEX probando = new DcargarEX(dirHome, "", "");
        probando.setVisible(true);
    }

    public void abrirPapelera(Usuario US) throws IOException {
        EcargarPA probando = new EcargarPA(dirPapelera);
        probando.setVisible(true);
    }

    public void abrirCalculadora() {
        VentanCal VC = new VentanCal();
        VC.setVisible(true);
    }

    public void abrirJuego() {
        VentanaInicial VJ = new VentanaInicial();
        VJ.setVisible(true);
    }

    public void abrirNav() {
//        System.out.println("navegador abriendo");
        new EcargarNa().setVisible(true);
    }

    public void abrirEditor() {
        EditorTexto xd = new EditorTexto();
        xd.setVisible(true);
    }

    public void apagar(CcargarES ES) {
        System.exit(0);
    }

    public void abrirMenuInicio(CcargarES ES) {
        if (estadoMI) {//true = apagado, listo para prender
            ES.panelMenuInicio.setVisible(true);
            estadoMI = false;
        } else if (estadoMI == false) {//false = prendido, listo para apagar
            ES.panelMenuInicio.setVisible(false);
            ES.panelProgramas.setVisible(false);
            estadoMI = true;
            estadoPR = true;
        }
    }

    public void apagarTodosMenus(CcargarES ES) {
        ES.panelMenuInicio.setVisible(false);
        ES.panelProgramas.setVisible(false);
        estadoMI = true;
        estadoPR = true;

    }

    public void abrirProgramas(CcargarES ES) {
        if (estadoPR) {//true = apagado, listo para prender
            ES.panelProgramas.setVisible(true);
            estadoPR = false;
        } else if (estadoPR == false) {//false = prendido, listo para apagar
            ES.panelProgramas.setVisible(false);
            estadoPR = true;
        }
    }

    public void cerrarSesion(CcargarES ES) throws SQLException {
        ES.dispose();
        BcargarSE IS = new BcargarSE();
        Sesion MIS = new Sesion();
        Usuario US = new Usuario();
        Sesionn CIS = new Sesionn(IS, MIS, US);
        CIS.iniciar();
    }

    public void abrirPaint() {
        Paint miVentana = new Paint();
        miVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        miVentana.setVisible(true);
        miVentana.setAlwaysOnTop(true);
        miVentana.setResizable(false);
    }

    public void administrar() throws IOException, SQLException {
        EcargarAU aver = new EcargarAU();
        aver.setVisible(true);
    }

}
