package model;

import java.util.ArrayList;
import java.util.List;

public class Pilot extends Collaborator {

    private List<Flight> flight;

    /**
     * El método constructor de un Objeto Piloto
     */
    public Pilot(String name, String lastName, long id, Airline airline) {
        super(name, lastName, id, airline, "Piloto");
        flight = new ArrayList<>();
    }

    @Override
    public int getReport() {
        return flight.size();
    }

    public List<Flight> getFlight() {
        return this.flight;
    }

    /**
     * @param fl Vuelo por fijar.
     */
    public void setFlight(Flight fl) {
        if (flight.isEmpty()) {
            flight.add(fl);
        }
        boolean added = false;
        for (int i = 0; i < flight.size() && !added; i++) {
            if(!flight.get(i).getId().equals(fl.getId())){
                flight.add(fl);
                added = true;
            }
        }
    }

    /**
     * Elimina el vuelo de la lista de vuelos del piloto.
     * @param f Vuelo a eliminar.
     */
    public void removeFlight(Flight f) {
        flight.remove(f);
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
