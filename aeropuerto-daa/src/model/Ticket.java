package model;

import java.io.Serializable;

public class Ticket implements Serializable, Price {
    private static final long serialVersionUID = 1L;
    private final int STANDAR_PRICE = 80;
    private Flight flight;
    private Seat fligthSeat;
    private int flightPrice;

    /**
     * El método constructor de un Objeto Ticket
     */
    public Ticket(Flight flight, Seat fligthSeat, int flightPrice) {
        this.flight = flight;
        this.fligthSeat = fligthSeat;
        this.flightPrice = flightPrice;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Seat getFligthSeat() {
        return this.fligthSeat;
    }

    public void setFligthSeat(Seat fligthSeat) {
        this.fligthSeat = fligthSeat;
    }

    public int getFlightPrice() {
        return flightPrice;
    }

    public void setFlightPrice(int flightPrice) {
        this.flightPrice = flightPrice;
    }

    /**
     * Calcula el precio del billete.
     * @param increase Número entero que contiene el aumento.
     */
    @Override
    public void calculatePrice(int increase) {
        flightPrice = STANDAR_PRICE * (increase / 10000) + fligthSeat.getPrice();
    }

}
