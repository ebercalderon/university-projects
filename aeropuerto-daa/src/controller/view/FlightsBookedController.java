package controller.view;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import controller.DashboardController;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.util.Callback;
import model.Airport;
import model.Places;
import model.Trip;
import route.Route;

import java.util.ArrayList;
import java.util.List;



public class FlightsBookedController {
    private Airport airport;
    private DashboardController dController;
    private Trip selected;

    public FlightsBookedController(Airport airport, DashboardController dController) {
        this.airport = airport;
        this.dController = dController;
    }

    @FXML
    private JFXComboBox<String> destiny;

    @FXML
    private JFXDatePicker date;

    @FXML
    private Label filterInfo;

    @FXML
    private TableView<Trip> bookingsTable;

    @FXML
    private TableColumn<Trip, String> airlineT;

    @FXML
    private TableColumn<Trip, String> dateT;

    @FXML
    private TableColumn<Trip, String> placeT;

    @FXML
    private TableColumn<Trip, String> idT;

    @FXML
    private TableColumn<Trip, String> seatT;

    @FXML
    private TableColumn<Trip, String> costT;

    @FXML
    private TableColumn<Trip, String> actionT;

    @FXML
    public void filter(ActionEvent event) {
        if (date.getValue() == null || destiny.getValue().equals("Countries")) {
            dController.geAirportController().createAlert("Por favor, rellene el campo de país y fecha de inicio", Route.ERROR);
        } else {
            filterInfo.setText(
                    "Vuelos a " + destiny.getValue() + " Fecha de inicio de la búsqueda " + date.getValue().toString());
        }
    }

    public void initialize() {
        filterInfo.setText("");
        loadData();
        initializeTableView();     
    }

    public void loadData() {
        List<String> types1 = new ArrayList<>();
        int i = 0;

        do {
            if (Places.values()[i].name() != null) {
                types1.add(Places.values()[i].name());
                i++;
            }

        } while (i < Places.values().length);

        ObservableList<String> optionsComboBox1 = FXCollections.observableArrayList(types1);
        destiny.setValue("Countries");
        destiny.setItems(optionsComboBox1);

        renderActions();
    }

    public void initializeTableView() {
        ObservableList<Trip> userTrips = FXCollections.observableList(airport.getLogged().getTrips());

        idT.setCellValueFactory(new PropertyValueFactory<Trip, String>("id"));
        airlineT.setCellValueFactory(new Callback<CellDataFeatures<Trip, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(CellDataFeatures<Trip, String> data) {
                return new ReadOnlyStringWrapper(data.getValue().getTicket().getFlight().getAirline().getAirlineName());
            }
        });     
        dateT.setCellValueFactory(new Callback<CellDataFeatures<Trip, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(CellDataFeatures<Trip, String> data) {
                return new ReadOnlyStringWrapper(data.getValue().getTicket().getFlight().getDepartureDate().toString());
            }
        });
        placeT.setCellValueFactory(new Callback<CellDataFeatures<Trip, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(CellDataFeatures<Trip, String> data) {
                return new ReadOnlyStringWrapper(data.getValue().getTicket().getFlight().getDestination().name());
            }
        });

        seatT.setCellValueFactory(new Callback<CellDataFeatures<Trip, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(CellDataFeatures<Trip, String> data) {
                return new ReadOnlyStringWrapper(data.getValue().seatToString());
            }
        });
        costT.setCellValueFactory(new PropertyValueFactory<Trip, String>("tripPrice"));

        actionT.setCellValueFactory(new PropertyValueFactory<Trip, String>(""));

        bookingsTable.setItems(userTrips);
    }

    private void renderActions() {
        Callback<TableColumn<Trip, String>, TableCell<Trip, String>> cellFact = (TableColumn<Trip, String> param) -> {
            final TableCell<Trip, String> cell = new TableCell<Trip, String>() {
                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty) {
                        setGraphic(null);
                        setText(null);
                    } else {
                        Button delete = new Button("Borrar");
                        delete.setId("delete");
                        delete.getStylesheets().add(Route.CRUD.getRoute());
                        delete.setOnAction((ActionEvent event) -> {
                            selected = (Trip) getTableRow().getItem();
                            dController.geAirportController().createAlert(airport.getLogged().deleteTrip(selected), Route.SUCCESS);
                            loadData();
                            airport.saveData();
                            initialize();
                        });
                        HBox managebtn = new HBox(delete);
                        managebtn.setStyle("-fx-alignment:center");
                        HBox.setMargin(delete, new Insets(2, 2, 0, 3));
                        setGraphic(managebtn);
                        setText(null);
                    }
                }                
            };
            return cell;
        };
        actionT.setCellFactory(cellFact);
    }

}
