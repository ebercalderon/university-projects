package model;

public class AirlineUser extends User {

    private Airline airline;

    /**
     * El método constructor de un objeto de usuario de aerolínea
     */
    public AirlineUser(String name, String lastName, long id, String email, String password, Airline airline) {
        super(name, lastName, id, email, password, UserRole.AEROLINEA);
        this.airline = airline;
    }

    public Airline getAirline() {
        return this.airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

}
