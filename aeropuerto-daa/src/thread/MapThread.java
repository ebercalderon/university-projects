package thread;

import controller.view.ActiveFlightsController;
import javafx.application.Platform;
import model.Flight;
import model.FlightState;
import route.Route;

public class MapThread extends Thread {
    private Flight flight;
    private ActiveFlightsController aController;
    private int node;
    private final String INTERRUPTED_MESSAGE = "Hey una excepción interrumpida ocurrió, no te preocupes";
    private final int LIMIT_JOURNEY = 100;

    /**
     * El método constructor de un Map Thread
     */
    public MapThread(Flight flight, ActiveFlightsController aController, int node) {
        this.flight = flight;
        this.aController = aController;
        this.node = node;
    }

    /**
     * 
     * Método que necesita la clase de hilos para iniciar eficientemente la concurrencia en el
     * programa
     */
    @Override
    public void run() {
        if (flight.getFlightStatus() == FlightState.VOLANDO) {
            try {
                Thread.sleep(2003);
            } catch (InterruptedException e) {
                aController.getDController().alert(Route.ERROR, INTERRUPTED_MESSAGE);
            }
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    if (flight.getProgress() <= LIMIT_JOURNEY) {
                        aController.setAircraft(flight, node);
                    } else {
                        flight.setFlightStatus(FlightState.HECHO);
                    }
                }
            });
            run();
        }
    }
}
