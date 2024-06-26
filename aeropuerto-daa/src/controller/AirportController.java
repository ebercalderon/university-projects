package controller;

import com.jfoenix.controls.JFXAlert;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialogLayout;
import controller.login.LoginController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Airport;
import route.Route;

import java.io.IOException;

public class AirportController {

    @FXML
    private Circle btnCloseLogin;

    @FXML
    private Circle btnMinimize;

    @FXML
    private Pane mainPane;

    private LoginController loginController;
    private DashboardController dashboardController;
    private Airport airport;

    public AirportController(Airport airport) {
        this.airport = airport;
        loginController = new LoginController(airport, this);
        dashboardController = new DashboardController(airport, this);
    }

    /**
     * @param event
     */
    @FXML
    public void handleMouseClick(MouseEvent event) {
        if (event.getSource() == btnCloseLogin) {
            airport.saveData();
            System.exit(0);
        } else if (event.getSource() == btnMinimize) {
            getWindow().setIconified(true);
        }
    }

    /**
     * @return Escenario
     */
    public Stage getWindow() {
        return (Stage) mainPane.getScene().getWindow();
    }

    /**
     * @param route
     * @throws IOException
     * @throws InterruptedException
     */
    public void renderScreen(Route route) throws IOException, InterruptedException {
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource(route.getRoute()));
        fxmlloader.setController(setController(route));
        Parent root = fxmlloader.load();
        mainPane.getChildren().setAll(root);
    }

    /**
     * @param route
     * @return Objeto
     */
    public Object setController(Route route) {
        switch (route) {
            case DASHBOARD:
                return dashboardController;
            case LOGIN:
                return loginController;
            default:
                return null;
        }
    }

    /**
     * Crea alertas del sistema aeroportuario
     * 
     * @param message
     * @param alertType
     */
    public void createAlert(String message, Route alertType) {
        JFXAlert<String> newAlert = new JFXAlert<>();
        newAlert.initModality(Modality.APPLICATION_MODAL);
        newAlert.setOverlayClose(false);
        // RENDERIZACIÓN DE GIFS
        ImageView gif = new ImageView(new Image(alertType.getRoute()));
        gif.setFitHeight(50);
        gif.setFitWidth(75);
        // ALERTA-CONTENIDO
        JFXDialogLayout layout = new JFXDialogLayout();
        layout.getStylesheets().add(Route.ALERT.getRoute());
        layout.setHeading(new Label("Alertas del aeropuerto"));
        layout.setBody(new HBox(8, new Label(message), gif));
        // ACCIONES
        JFXButton cancelButton = new JFXButton("OK");
        cancelButton.setButtonType(JFXButton.ButtonType.RAISED);
        cancelButton.setCancelButton(true);
        cancelButton.setStyle(Route.ALERT.getRoute());
        cancelButton.setOnAction(closeEvent -> newAlert.hideWithAnimation());
        layout.setActions(cancelButton);
        // PENDIENTE
        Stage stage = (Stage) newAlert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image("file:" + Route.ICON.getRoute()));
        newAlert.setContent(layout);
        newAlert.showAndWait();
    }
}
