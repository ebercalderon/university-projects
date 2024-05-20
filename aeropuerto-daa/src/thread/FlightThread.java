package thread;

import controller.node.NodeFlightController;
import javafx.application.Platform;
import model.Flight;
import model.FlightState;
import route.Route;

import java.io.IOException;

public class FlightThread extends Thread {
    private final String IO_MESSAGE = "Hey ocurrió una excepción IO, no te preocupes";
    private final int LIMIT_JOURNEY = 100;
    private final int SCALE = 1000000;
    private Flight flight;
    private NodeFlightController nf;

    /**
     * El método constructor de un hilo de vuelo
     */
    public FlightThread(Flight flight, NodeFlightController nf) {
        this.flight = flight;
        this.nf = nf;
    }

    /**
     * 
     * Método que necesita la clase de hilos para iniciar eficientemente la concurrencia en el
     * programa
     */
    @Override
    public void run() {
        while (flight.getFlightStatus() == FlightState.VOLANDO) {
            flight.setPosition((SCALE / flight.getDuration()));
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    if (flight.getProgress() < LIMIT_JOURNEY) {
                        nf.setFlightProgress(flight);
                    } else {
                        if (nf.getDController().getRoute() == Route.ACTIVE_FLIGHTS) {
                            try {
                                nf.getDController().loadView(Route.ACTIVE_FLIGHTS);
                            } catch (IOException e) {
                                nf.getDController().alert(Route.ERROR, IO_MESSAGE);
                            }
                        }
                        flight.setFlightStatus(FlightState.HECHO);
                    }
                }
            });
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
