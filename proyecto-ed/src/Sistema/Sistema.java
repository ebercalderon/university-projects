/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import Entidades.*;
import Estructuras.*;

public class Sistema {
        public static ArregloEmpleado empleado = new ArregloEmpleado();
        public static ArbolGeneral empcargo = new ArbolGeneral(new Empleado("Usuario01", "123", "Dulce", "Huamani", "75183220",0, "Cocinero"));
        public static Empleado empleadoActual;
        public static Cliente cliente = new Cliente();
        public static ListaBebidas bebidas = new ListaBebidas();
        public static ListaBrasas brasas = new ListaBrasas();
        public static ListaCartas cartas = new ListaCartas();
        public static ListaEnsaladas ensaladas = new ListaEnsaladas();
        public static ListaEntradas entradas = new ListaEntradas();
        public static ListaGuarniciones guarniciones = new ListaGuarniciones(); 
        
        //public static final String FILE_EMPLEADOS = "empleados.txt";
        public static final String FILE_BEBIDAS = "bebidas.txt";
        
        
}
