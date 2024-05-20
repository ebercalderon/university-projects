package Estructuras;

import java.util.ArrayList;
import Entidades.Empleado;
import java.io.Serializable;

public class ArregloEmpleado implements Serializable {

    public ArrayList<Empleado> empleados;

    public ArregloEmpleado() {
        this.empleados = new ArrayList();
    }

    public String[][] getEmpleado() {
        String[][] result = new String[this.empleados.size()][3];
        int i = 0;
        for (Empleado emp : this.empleados) {
            if (emp != null) {
                result[i][0] = emp.getNombre();
                result[i][1] = emp.getApellido();
                result[i][2] = emp.getDni();
                i++;
            }
        }
        return result;
    }

    public String[] get_Titulo_Empleado() {
        String result[] = new String[3];
        result[0] = "Nombres";
        result[1] = "Apellidos";
        result[2] = "DNI";
        return result;
    }

    public Empleado validar(String usu, String pass) {
        Empleado result = null;
        for (Empleado emp : this.empleados) {
            if (emp.ingresar(usu, pass)) {
                result = emp;
                break;
            }
        }
        return result;
    }

    public boolean agregar(Empleado emp) {
        return this.empleados.add(emp);
    }
}
