package model;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Flight implements Comparable<Flight>, Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String departureDate;
    private String departureHour;
    private String arrivalDate;
    private String arrivalHour;
    private Places origin;
    private Places destination;
    private Aircraft plane;
    private Track track;
    private List<Costumer> costumer;
    private FlightState flightStatus;
    private String takesOff; // Une la fecha y la hora de salida. Para la vista de la tabla.
    private String arrives; // Une la fecha y la hora de llegada. Para la vista de la tabla.
    private Airline airline;

    private long position;
    private int progress;
    private double slope;
    private double journey;
    private long duration;

    /**
     * El método constructor de un Objeto de Vuelo para importar objetos
     */
    public Flight(String id) {
        this.id = id;
    }

    /**
     * El método constructor de un objeto de vuelo
     */
    public Flight(String id, String departureDate, String departureHour, String arrivalDate, String arrivalHour,
            Places origin, Places destination, Track track, Airline airline, Aircraft aircraft) {
        this.id = id;
        this.departureDate = departureDate;
        this.departureHour = departureHour;
        this.arrivalDate = arrivalDate;
        this.arrivalHour = arrivalHour;
        this.origin = origin;
        this.destination = destination;
        this.track = track;
        costumer = new ArrayList<>();
        this.plane = aircraft;
        this.flightStatus = FlightState.AGENDADO;
        this.position = 125;
        this.progress = 0;
        this.airline = airline;
        updateFullDates();
        flightDuration();
    }

    /**
     * Concatena la fecha y la hora para los valores de despegue y llegada.
     */
    private void updateFullDates() {
        takesOff = departureDate + " - " + departureHour;
        arrives = arrivalDate + " - " + arrivalHour;
    }

    public String getDepartureDate() {
        return this.departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
        updateFullDates();
    }

    public Pilot getPilot() {
        return plane.getPilot();
    }

    public List<Costumer> getCostumer() {
        return this.costumer;
    }

    public void setCostumer(Costumer c) {
        costumer.add(c);
    }

    public String getDepartureHour() {
        return this.departureHour;
    }

    public void setDepartureHour(String departureHour) {
        this.departureHour = departureHour;
        updateFullDates();
    }

    public String getArrivalDate() {
        return this.arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
        updateFullDates();
    }

    public String getArrivalHour() {
        return this.arrivalHour;
    }

    public void setArrivalHour(String arrivalHour) {
        this.arrivalHour = arrivalHour;
        updateFullDates();
    }

    public Places getOrigin() {
        return this.origin;
    }

    public void setOrigin(Places origin) {
        this.origin = origin;
    }

    public Places getDestination() {
        return this.destination;
    }

    public void setDestination(Places destination) {
        this.destination = destination;
    }

    public Aircraft getPlane() {
        return this.plane;
    }

    public void setPlane(Aircraft plane) {
        this.plane = plane;
    }

    public Track getTrack() {
        return this.track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public FlightState getFlightStatus() {
        return this.flightStatus;
    }

    public void setFlightStatus(FlightState flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getDuration() {
        return duration;
    }

    public long getPosition() {
        return this.position;
    }

    public void setPosition(long increase) {
        position += increase;
    }

    public double getSlope() {
        return this.slope;
    }

    public void setSlope(double slope) {
        this.slope = slope;
    }

    public double getJourney() {
        return this.journey;
    }

    public void setJourney(double journey) {
        this.journey = journey;
    }

    public String getTakesOff() {
        return takesOff;
    }

    public void setTakesOff(String takesOff) {
        this.takesOff = takesOff;
    }

    public String getArrives() {
        return arrives;
    }

    public void setArrives(String arrives) {
        this.arrives = arrives;
    }

    /**
     * Obtiene cada uno de los enteros de la fecha y la hora para comparar en usos posteriores de la aplicación
     * (controladores).
     * 
     * @return array int para establecer la instancia localdate y obtener la duración del vuelo.
     */
    public int[] getDateFormat() {
        int[] render = new int[10];
        render[0] = Integer.parseInt(departureDate.split("-")[0]);
        render[1] = Integer.parseInt(departureDate.split("-")[1]);
        render[2] = Integer.parseInt(departureDate.split("-")[2]);
        render[3] = Integer.parseInt(departureHour.split(":")[0]);
        render[4] = Integer.parseInt(departureHour.split(":")[1]);
        render[5] = Integer.parseInt(arrivalDate.split("-")[0]);
        render[6] = Integer.parseInt(arrivalDate.split("-")[1]);
        render[7] = Integer.parseInt(arrivalDate.split("-")[2]);
        render[8] = Integer.parseInt(arrivalHour.split(":")[0]);
        render[9] = Integer.parseInt(arrivalHour.split(":")[1]);
        return render;
    }

    /**
     *
     */
    public void flightDuration() {
        int[] render = getDateFormat();
        LocalDateTime dep = LocalDateTime.of(render[0], render[1], render[2], render[3], render[4]);
        LocalDateTime arr = LocalDateTime.of(render[5], render[6], render[7], render[8], render[9]);
        Duration d = Duration.between(dep, arr);
        duration = Math.abs(d.getSeconds());
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    /**
     * Compara las fechas de dos vuelos.
     * 
     * @param other Vuelo para ser comparado.
     * @return Devuelve -1 si esta fecha es menor que la otra. Devuelve 1 si
     *         esta fecha es mayor. Devuelve 0 si ambas fechas son iguales.
     *
     */
    @Override
    public int compareTo(Flight other) {
        return departureDate.compareTo(other.getDepartureDate());
    }

    /**
     * Compara dos identificaciones de vuelos.
     * 
     * @param other Vuelo para ser comparado.
     * @return Devuelve -1 si este id es menor que el otro. Devuelve 1 si este
     *         es mayor. Devuelve 0 si ambos ids son iguales.
     *
     */
    public int compareById(Flight other) {
        return id.compareTo(other.getId());
    }

}
