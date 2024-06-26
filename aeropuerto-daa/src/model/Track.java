package model;

import java.io.Serializable;

public class Track implements Maintenance, Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private boolean inMaintenance;
    private String gate;
    private String state;
    private Track next;
    private Track prev;

    /**
     * El método constructor de un objeto Pista
     */
    public Track(int id, String gate) {
        this.id = id;
        this.gate = gate;
        inMaintenance = false;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        state = (inMaintenance) ? "INACTIVE" : "ACTIVE";
        return state;
    }

    public boolean isInMaintenance() {
        return this.inMaintenance;
    }

    public void setInMaintenance(boolean inMaintenance) {
        this.inMaintenance = inMaintenance;
    }

    public String getGate() {
        return this.gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    @Override
    public void inMaintenance() {
        inMaintenance = true;
    }

    public Track getNext() {
        return next;
    }

    public void setNext(Track next) {
        this.next = next;
    }

    public Track getPrev() {
        return prev;
    }

    public void setPrev(Track prev) {
        this.prev = prev;
    }

    /**
     * Devuelve una representación de String del objeto.
     * 
     * @return Devuelve una representación de String del objeto.
     */
    public String toString() {
        return gate;
    }

}
