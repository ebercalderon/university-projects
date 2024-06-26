package controller.view;

import com.jfoenix.controls.JFXTextField;
import controller.Constant;
import controller.DashboardController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Callback;
import model.Airport;
import model.Flight;
import model.FlightState;
import model.Migration;
import route.Route;
import thread.MigrationThread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class IndicatorsController implements Initializable {

    @FXML
    private BarChart<?, ?> bar;

    @FXML
    private TableView<Migration> migrationTbl;

    @FXML
    private TableColumn<Migration, Integer> idCol;

    @FXML
    private TableColumn<Migration, Integer> aprprovedCol;

    @FXML
    private TableColumn<Migration, Integer> wantedCol;

    @FXML
    private TableColumn<Migration, Integer> minorCol;

    @FXML
    private TableColumn<Migration, Integer> covidCol;

    @FXML
    private TableColumn<Migration, String> actionCol;
    @FXML
    private Button btnEdit;

    @FXML
    private Label modalName;

    @FXML
    private JFXTextField txtCode;

    @FXML
    private JFXTextField txtCovid;

    @FXML
    private JFXTextField txtWanted;

    @FXML
    private JFXTextField txtMinor;

    @FXML
    private JFXTextField txtApproved;
    @FXML
    private HBox chart;

    private Airport airport;
    private DashboardController dController;
    private Migration selected;
    private Stage modal;

    public IndicatorsController(DashboardController dController, Airport airport) {
        this.dController = dController;
        this.airport = airport;
    }

    @FXML
    public void cancelModal(ActionEvent event) {
        modal.close();
    }

    @FXML
    public void editMigration(ActionEvent event) {
        if (validateFields()) {
            dController.geAirportController().createAlert(airport.editMigration(selected, selected.getFlight(),
                    Integer.parseInt(txtApproved.getText()), Integer.parseInt(txtCovid.getText()),
                    Integer.parseInt(txtWanted.getText()), Integer.parseInt(txtMinor.getText())), Route.SUCCESS);
            modal.close();
            airport.saveData();
            getData();
        } else {
            dController.geAirportController().createAlert(Constant.EMPTY_FIELDS, Route.WARNING);
        }
    }

    public boolean validateFields() {
        boolean render = true;
        if (txtCode.getText().isEmpty() || txtCovid.getText().isEmpty() || txtApproved.getText().isEmpty()
                || txtWanted.getText().isEmpty() || txtMinor.getText().isEmpty()) {
            render = false;
        }
        return render;
    }

    public DashboardController getDController() {
        return dController;
    }

    @FXML
    public void exportInfo(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("CSV", "*.csv"),
                new FileChooser.ExtensionFilter("TXT", "*.txt"));
        File selectedFile = fc.showSaveDialog(null);
        if (selectedFile != null) {
            dController.alert(Route.SUCCESS, Constant.EXPORT_SUCCESS);
            try {
                airport.exportDataMigration(selectedFile.getAbsolutePath());
            } catch (FileNotFoundException e) {
                dController.alert(Route.ERROR, Constant.FILE_NOT_FOUND);
            }
        }
    }

    @FXML
    public void importInfo(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.setTitle("Abrir archivo de recursos");
        File selectedFile = fc.showOpenDialog(null);
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("CSV", "*.csv"),
                new FileChooser.ExtensionFilter("TXT", "*.txt"));
        if (selectedFile != null) {
            dController.alert(Route.SUCCESS, Constant.IMPORT_SUCCESS);
            try {
                airport.importDataMigration(selectedFile.getAbsolutePath());
            } catch (IOException e) {
                dController.alert(Route.WARNING, Constant.IOEXCEPTION);
            }
            airport.saveData();
            getData();
        }
    }

    public void setModal(Stage modal) {
        this.modal = modal;
    }

    public void getData() {
        ObservableList<Migration> data = FXCollections.observableArrayList(airport.getMigration());
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        aprprovedCol.setCellValueFactory(new PropertyValueFactory<>("approved"));
        wantedCol.setCellValueFactory(new PropertyValueFactory<>("wanted"));
        minorCol.setCellValueFactory(new PropertyValueFactory<>("minor"));
        covidCol.setCellValueFactory(new PropertyValueFactory<>("covid"));
        renderActions();
        migrationTbl.setItems(data);
        dController.renderToast();
    }

    public void showModal() throws IOException {
        Stage stage = dController.loadModal(Route.INDICATORS_MODAL, this);
        setModal(stage);
        stage.show();
    }

    private void renderActions() {
        Callback<TableColumn<Migration, String>, TableCell<Migration, String>> cellFact = (
                TableColumn<Migration, String> param) -> {
            final TableCell<Migration, String> cell = new TableCell<Migration, String>() {
                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty) {
                        setGraphic(null);
                        setText(null);
                    } else {
                        Button delete = new Button("Borrar");
                        delete.setId("delete");
                        Button edit = new Button("Editar");
                        edit.setId("edit");
                        delete.getStylesheets().add(Route.CRUD.getRoute());
                        edit.getStylesheets().add(Route.CRUD.getRoute());
                        delete.setOnAction((ActionEvent event) -> {
                            selected = (Migration) getTableRow().getItem();
                            dController.geAirportController().createAlert(airport.deleteMigration(selected),
                                    Route.SUCCESS);
                            getData();
                        });
                        edit.setOnAction((ActionEvent event) -> {
                            if (modal == null) {
                                selected = (Migration) getTableRow().getItem();
                                try {
                                    showModal();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                modalName.setText("Editar informe");
                                prepareEdition(selected);
                            }
                        });
                        HBox managebtn = new HBox(edit, delete);
                        managebtn.setStyle("-fx-alignment:center");
                        HBox.setMargin(delete, new Insets(2, 2, 0, 3));
                        HBox.setMargin(edit, new Insets(2, 3, 0, 2));
                        setGraphic(managebtn);
                        setText(null);
                    }
                }
            };
            return cell;
        };
        actionCol.setCellFactory(cellFact);
    }

    public void prepareEdition(Migration selected) {
        txtCode.setText(selected.getId());
        txtApproved.setText(String.valueOf(selected.getApproved()));
        txtCovid.setText(String.valueOf(selected.getCovid()));
        txtWanted.setText(String.valueOf(selected.getWanted()));
        txtMinor.setText(String.valueOf(selected.getMinor()));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        getData();
        for (Flight flight : airport.getFlights()) {
            if (flight.getFlightStatus() == FlightState.HECHO || flight.getFlightStatus() == FlightState.ABORDANDO) {
                Migration m = airport.createMigrationZone(flight);
                if (m != null) {
                    createChart(m);
                }
            }
        }
    }

    private void createChart(Migration m) {
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart<String, Number> bc = new BarChart<String, Number>(xAxis, yAxis);
        bc.setTitle("Vuelo: " + m.getFlight().getId());
        xAxis.setLabel("Tipo");
        yAxis.setLabel("Valor");
        chart.getChildren().add(bc);
        MigrationThread mt = new MigrationThread(this, m, bc);
        mt.start();
    }

    @SuppressWarnings("unchecked")
    public void setChart(Migration migration, BarChart<String, Number> bc) {
        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName("Aprobado");
        series1.getData().add(new XYChart.Data<>("Approved", migration.getApproved()));
        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName("Covid");
        series2.getData().add(new XYChart.Data<>("Covid", migration.getCovid()));
        XYChart.Series<String, Number> series3 = new XYChart.Series<>();
        series3.setName("Menor");
        series3.getData().add(new XYChart.Data<>("Minor", migration.getMinor()));
        XYChart.Series<String, Number> series4 = new XYChart.Series<>();
        series4.setName("Peligroso");
        series4.getData().add(new XYChart.Data<>("Wanted", migration.getWanted()));
        bc.setAnimated(false);
        bc.getData().clear();
        bc.getData().addAll(series1, series2, series3, series4);
        getData();
    }
}
