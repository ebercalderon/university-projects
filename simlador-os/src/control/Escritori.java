package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.*;
import vista.*;

public class Escritori implements ActionListener {

    private final Escrt ME;
    private final CcargarES ES;
    private final Usuario US;

    public Escritori(Escrt ME, CcargarES ES, Usuario US) {
        this.ME = ME;
        this.ES = ES;
        this.US = US;

        ES.btnInicio.addActionListener(this);

        ES.btnApagar.addActionListener(this);
        ES.btnCerrarSesion.addActionListener(this);
        ES.btnProgramas.addActionListener(this);
        ES.btnAdministrarUsuarios.addActionListener(this);

        ES.btnExplorador.addActionListener(this);
        ES.explorador.addActionListener(this);
        ES.btnPrExp.addActionListener(this);

        ES.btnPapelera.addActionListener(this);
        ES.papelera.addActionListener(this);
        ES.btnPrPap.addActionListener(this);

        ES.btnCalc.addActionListener(this);
        ES.calculadora.addActionListener(this);
        ES.btnPrCal.addActionListener(this);

        ES.btnJuego.addActionListener(this);
        ES.juego.addActionListener(this);
        ES.btnPrJue.addActionListener(this);

        ES.btnNavegador.addActionListener(this);
        ES.navegador.addActionListener(this);
        ES.btnPrNav.addActionListener(this);

        ES.btnPrEdit.addActionListener(this);
        ES.editor.addActionListener(this);
        ES.btnEditor.addActionListener(this);

        ES.btnPaint.addActionListener(this);
        ES.paint.addActionListener(this);
        ES.btnPrPaint.addActionListener(this);
    }

    public void iniciar() {
        ES.setLocationRelativeTo(null);
        ES.setVisible(true);
        ES.panelMenuInicio.setVisible(false);
        ES.panelProgramas.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //Boton Menu Inicio
        if (e.getSource() == ES.btnInicio) {
            ME.abrirMenuInicio(ES);
        }
        //Boton Programas
        if (e.getSource() == ES.btnProgramas) {
            ME.abrirProgramas(ES);
        }
        //Boton apagar
        if (e.getSource() == ES.btnApagar) {
            System.exit(0);
        }
        //Cerrar Sesion
        if (e.getSource() == ES.btnCerrarSesion) {
            try {
                ME.cerrarSesion(ES);
            } catch (SQLException ex) {
            }
        }
        //Explorador
        if (e.getSource() == ES.btnExplorador || e.getSource() == ES.btnPrExp || e.getSource() == ES.explorador) {
            ME.apagarTodosMenus(ES);
            try {
                ME.abrirExplorador(US);
            } catch (IOException ex) {
            }
        }
        //Papelera
        if (e.getSource() == ES.btnPapelera || e.getSource() == ES.btnPrPap || e.getSource() == ES.papelera) {
            ME.apagarTodosMenus(ES);
            try {
                ME.abrirPapelera(US);
            } catch (IOException ex) {
            }
        }
        //Calculadora
        if (e.getSource() == ES.btnCalc || e.getSource() == ES.btnPrCal || e.getSource() == ES.calculadora) {
            ME.apagarTodosMenus(ES);
            ME.abrirCalculadora();
        }
        //Juego
        if (e.getSource() == ES.btnJuego || e.getSource() == ES.btnPrJue || e.getSource() == ES.juego) {
            ME.apagarTodosMenus(ES);
            ME.abrirJuego();
        }
        //Navegador
        if (e.getSource() == ES.btnNavegador || e.getSource() == ES.btnPrNav || e.getSource() == ES.navegador) {
            ME.apagarTodosMenus(ES);
            ME.abrirNav();
        }
        //Editor
        if (e.getSource() == ES.btnEditor || e.getSource() == ES.btnPrEdit || e.getSource() == ES.editor) {
            ME.apagarTodosMenus(ES);
            ME.abrirEditor();
        }
        //Paing
        if (e.getSource() == ES.btnPaint || e.getSource() == ES.btnPrPaint || e.getSource() == ES.paint) {
            ME.apagarTodosMenus(ES);
            ME.abrirPaint();
        }
        //Usuarios
        if (e.getSource() == ES.btnAdministrarUsuarios) {
            ME.apagarTodosMenus(ES);
            try {
                if (!US.getPermisos().equals("Invitado")){
                    ME.administrar();
                } else {
                    JOptionPane.showMessageDialog(null, "No tiene permisos");
                }
            } catch (IOException | SQLException ex) {
                Logger.getLogger(Escritori.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
