package Principal;

import Ventanas.Ingreso.Bienvenida;

/**
 *
 * @author Gonzalo
 */
public class Principal {
    
    /* Inicio del punto de vista general */
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {
            /* Constructor de carga de la ventana */
            Bienvenida inicio = new Bienvenida();
            inicio.setVisible(true);
        });

    }

}
