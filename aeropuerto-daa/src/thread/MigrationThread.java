package thread;

import controller.view.IndicatorsController;
import exeption.CovidException;
import exeption.MinorException;
import exeption.WantedException;
import javafx.application.Platform;
import javafx.scene.chart.BarChart;
import model.Costumer;
import model.Migration;
import route.Route;

public class MigrationThread extends Thread {
    private final int PERSON_DURATION = 2000;
    private final String ERROR_MESSAGE = "Hey una excepción interrumpida ocurrió, no te preocupes";
    private IndicatorsController iController;
    private Migration migration;
    private BarChart<String, Number> bc;

    /**
     * The constructor method of a Migration Thread
     */
    public MigrationThread(IndicatorsController iController, Migration migration, BarChart<String, Number> bc) {
        this.iController = iController;
        this.migration = migration;
        this.bc = bc;
    }

    /**
     * 
     * Método que necesita la clase de hilos para iniciar eficientemente la concurrencia en el
     * programa
     */
    @Override
    public void run() {
        for (Costumer c : migration.getFlight().getCostumer()) {
            try {
                Thread.sleep(PERSON_DURATION);
            } catch (InterruptedException e) {
                iController.getDController().alert(Route.ERROR, ERROR_MESSAGE);
            }
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    try {
                        migration.costumerTypes(c);
                    } catch (WantedException e) {
                        c.setNotifications(e.getMessage());
                    } catch (CovidException e) {
                        c.setNotifications(e.getMessage());
                    } catch (MinorException e) {
                        c.setNotifications(e.getMessage());
                    }
                    iController.setChart(migration, bc);
                }
            });
        }
        migration.airportCharges();
    }

}
