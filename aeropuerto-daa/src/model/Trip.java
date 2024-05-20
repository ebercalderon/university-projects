package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Trip implements Comparable<Trip>, Price, Serializable {

    private static final long serialVersionUID = 1L;
    private Ticket ticket;
    private Luggage rootLuggage; //Linked List
    private int tripPrice;
    private String id;
    private Seat flightSeat;
    private Trip father;
    private Trip left;
    private Trip right;

    /**
     * El método constructor utilizado para la prueba
     */
    public Trip(String id, Ticket ticket, Luggage rootLuggage, Seat flightSeat) {
        this.id = id;
        this.ticket = ticket;
        this.rootLuggage = rootLuggage;
        this.flightSeat = flightSeat;
        calculatePrice(1);
    }

    /**
     * El método constructor de un objeto Viaje
     */
    public Trip(String id, Ticket ticket, Seat flightSeat) {
        this.id = id;
        this.ticket = ticket;
        this.flightSeat = flightSeat;
        rootLuggage = null;
        calculatePrice(1);
    }

    /**
     * Calcula el precio del equipaje.
     * @return Integer representing luggage price.
     */
    public int luggagePrice() {
        int amount = 0;
        Luggage temp = rootLuggage;
        if (temp != null) {
            do {
                amount += temp.getLuggagePrice();
                temp = temp.getNextLuggage();
            } while (temp != null);
        }
        return amount;
    }

    public Ticket getTicket() {
        return this.ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Luggage getRootLuggage() {
        return this.rootLuggage;
    }

    public void setRootLuggage(Luggage rootLuggage) {
        this.rootLuggage = rootLuggage;
    }

    public int getTripPrice() {
        return this.tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = tripPrice;
    }

    public Trip getFather() {
        return father;
    }

    public void setFather(Trip father) {
        this.father = father;
    }

    public Trip getLeft() {
        return left;
    }

    public void setLeft(Trip left) {
        this.left = left;
    }

    public Trip getRight() {
        return right;
    }

    public void setRight(Trip right) {
        this.right = right;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Compara el precio de dos viajes.
     * @param other Viaje para ser comparado.
     * @return Devuelve -1 si este precio es menor que el otro. Devuelve 1 si este precio es mayor. Devuelve 0 si ambos precios son iguales.
     */
    public int compareByPrice(Trip other) {
        return this.tripPrice - other.tripPrice;
    }

    /**
     * Añade equipaje al viaje.
     * @param luggage Equipaje a añadir.
     */
    public void addLuggage(Luggage luggage) {
        if (rootLuggage == null) {
            setRootLuggage(luggage);
        } else {
            Luggage next = rootLuggage;
            do {
                if (next.getNextLuggage() == null) {
                    next.setNextLuggage(luggage);
                    luggage.setPreviousLuggage(next);
                } else {
                    next = next.getNextLuggage();
                }
            } while (next == null);
        }
        calculatePrice(1);
    }

    /**
     * Calcula el precio del viaje.
     * @param increase Cantidad de precio a aumentar.
     */
    @Override
    public void calculatePrice(int increase) {
        tripPrice = ticket.getFlightPrice() + luggagePrice();
    }

    /**
     * Devuelve una cadena con todos los asientos.
     * @return Devuelve una cadena con todos los asientos.
     */
    public String seatToString() {
        String letter = String.valueOf(flightSeat.getSeatLetter());
        int num = flightSeat.getSeatNumber();
        String ms = letter + num;
        return ms;
    }

    /**
     * Obtiene una lista de equipajes.
     * @return Devuelve una lista que contiene todos los equipajes.
     */
    public List<Luggage> getLuggages() {
        List<Luggage> tempList = new ArrayList<>();
        Luggage temp = getRootLuggage();
        while (temp != null) {
            tempList.add(temp);
            temp = temp.getNextLuggage();
        }
        return tempList;
    }

    public Seat getFlightSeat() {
        return flightSeat;
    }

    public void setFlightSeat(Seat flightSeat) {
        this.flightSeat = flightSeat;
    }

    /**
     * Compara los precios de dos viajes.
     * @param other Viaje para ser comparado.
     * @return Devuelve -1 si este precio es menor que el otro. Devuelve 1 si este precio es mayor. Devuelve 0 si ambos precios son iguales.
     */
    @Override
    public int compareTo(Trip other) {
        return tripPrice - other.getTripPrice();
    }

    /**
     * Compara dos fechas de viaje.
     * @param other Viaje para ser comparado.
     * @return Devuelve -1 si esta fecha es menor que la otra. Devuelve 1 si esta fecha es mayor. Devuelve 0 si ambas fechas son iguales.
     */
    public int compareByDate(Trip other) {
        return ticket.getFlight().getDepartureDate().compareTo(other.getTicket().getFlight().getDepartureDate());
    }

}
