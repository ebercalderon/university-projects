package model;

import java.util.ArrayList;
import java.util.List;

public class Advisor extends Collaborator implements Comparable<Advisor> {

    private List<Costumer> costumers;
    private Advisor parent;
    private Advisor right;
    private Advisor left;

    /**
     * El método constructor de un objeto Asesor
     */
    public Advisor(String name, String lastName, long id, Airline airline) {
        super(name, lastName, id, airline, "Asesor");
        costumers = new ArrayList<>();
    }

    @Override
    public int getReport() {
        return costumers.size();
    }

    public List<Costumer> getCostumers() {
        return this.costumers;
    }

    public void setCostumers(Costumer c) {
        this.costumers.add(c);
    }

    public Advisor getRight() {
        return right;
    }

    public void setRight(Advisor right) {
        this.right = right;
    }

    public Advisor getLeft() {
        return left;
    }

    public void setLeft(Advisor left) {
        this.left = left;
    }

    public Advisor getParent() {
        return parent;
    }

    public void setParent(Advisor parent) {
        this.parent = parent;
    }

    /**
     * Compara dos identificadores de asesores.
     * 
     * @param advisor Asesor con el que hay que compararse.
     * @return Devuelve -1 si este id es menor que el otro. Devuelve 1 si este id es mayor. Devuelve 0 si ambos ids son iguales.
     *
     */
    @Override
    public int compareTo(Advisor advisor) {
        int result = -1;
        if (this.getId() == advisor.getId()) {
            result = 0;
        } else if (this.getId() > advisor.getId()) {
            result = 1;
        }
        return result;
    }

    /**
     * Devuelve una representación de String del objeto.
     *
     * @return Devuelve una representación de String del objeto.
     */
    @Override
    public String toString() {
        return super.getName();
    }
}
