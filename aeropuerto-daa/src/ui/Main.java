package ui;

import com.sun.javafx.application.LauncherImpl;
import controller.AirportController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.Airport;
import route.Route;

import java.io.IOException;

public class Main extends Application {
    private final int RENDER_COMPONENTES = 3000;
    private AirportController airportController;
    private Airport airport;

    public Main() {
        airport = new Airport();
        airportController = new AirportController(airport);
    }

    public static void main(String[] args) {
        LauncherImpl.launchApplication(Main.class, Splash.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource(Route.MAINPANE.getRoute()));
        fxmlloader.setController(airportController);
        Parent root = fxmlloader.load();
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
        airportController.renderScreen(Route.LOGIN);
    }

    @Override
    public void init() throws IOException, InterruptedException {
        Thread.sleep(RENDER_COMPONENTES);
    }
}
