package model;

import exeption.CovidException;
import exeption.MinorException;
import exeption.WantedException;

import java.io.Serializable;

public class Migration implements Serializable, Supplier {

    private static final long serialVersionUID = 1L;
    private Flight flight;
    private int capital, approved, wanted, covid, minor;

    /**
     * El método constructor de un objeto de migración
     */
    public Migration(Flight flight) {
        this.flight = flight;
        capital = 0;
        approved = 0;
        wanted = 0;
        covid = 0;
        minor = 0;
    }

    public String getId() {
        return flight.getId();
    }

    public Flight getFlight() {
        return this.flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getCapital() {
        return this.capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public int getApproved() {
        return this.approved;
    }

    public void setApproved() {
        approved++;
    }

    public void setmin(int minor) {
        this.minor = minor;
    }

    public void setcov(int covid) {
        this.covid = covid;
    }

    public void setwant(int wanted) {
        this.wanted = wanted;
    }

    public void setapp(int approved) {
        this.approved = approved;
    }

    public int getWanted() {
        return this.wanted;
    }

    public void setWanted() {
        wanted++;
    }

    public int getCovid() {
        return this.covid;
    }

    public void setCovid() {
        covid++;
    }

    public int getMinor() {
        return this.minor;
    }

    public void setMinor() {
        minor++;
    }

    public int getReport() {
        return wanted + covid + minor + approved;
    }

    /**
     * Identifica el estado de los clientes para futuras decisiones.
     * 
     * @param c != null
     * @throws WantedException se capturará en el hilo para modificar las notificaciones
     *                         del cliente.
     * @throws CovidException se capturará en el hilo para modificar las notificaciones
     *                        del cliente.
     * @throws MinorException se capturará en el hilo para modificar las notificaciones
     *                        del cliente.
     */
    public void costumerTypes(Costumer c) throws WantedException, CovidException, MinorException {
        switch (c.getState()) {
            case "WANTED":
                setWanted();
                throw new WantedException();
            case "APPROVED":
                setApproved();
                break;
            case "COVID":
                setCovid();
                throw new CovidException();
            case "MINOR":
                setMinor();
                throw new MinorException();
            default:
                break;
        }
    }

    /**
     * Calcula y fija el capital.
     */
    @Override
    public void airportCharges() {
        capital = (wanted + covid + minor) * 10;
    }

}
