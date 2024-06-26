package route;

public enum Route {

    SPLASH("/ui/screens/splash.fxml"), LOGIN("/ui/screens/login.fxml"), DASHBOARD("/ui/screens/dash.fxml"),
    MAINPANE("screens/mainPane.fxml"), ICON("src/ui/assets/img/ico.jpeg"), AIRCRAFT("src/ui/assets/img/aircraft.png"),
    ALERT("/ui/assets/styles/vendor.css"), CRUD("/ui/assets/styles/table.css"), SPINNER("/ui/screens/spinner.fxml"),
    SUCCESS("/ui/assets/img/success.gif"), ERROR("/ui/assets/img/error.gif"), WARNING("/ui/assets/img/warning.gif"),
    USER_ICON("/ui/assets/img/icons/user.png"), AEROLINEA(Root.BAR.getRoot() + "bar-airline.admin.fxml"),
    ADMINISTRADOR(Root.BAR.getRoot() + "bar-airport-admin.fxml"), HOME(Root.BAR.getRoot() + "home.fxml"),
    CT_SUPERVISOR(Root.BAR.getRoot() + "bar-ct-supervisor.fxml"),
    MIGRACION(Root.BAR.getRoot() + "bar-migration-agent.fxml"),
    COSTUMER(Root.BAR.getRoot() + "bar-costumer.fxml"), ACTIVE_FLIGHTS(Root.TOWER.getRoot() + "active-flights.fxml"),
    UPCOMING_FLIGHTS(Root.TOWER.getRoot() + "upcoming-flights.fxml"),
    NODE_FLIGHT(Root.TOWER.getRoot() + "flight-node.fxml"),
    NODE_UPCOMING_FLIGHT(Root.TOWER.getRoot() + "upcoming-node.fxml"),
    AIRLINE_EMPLOYEES(Root.CRUD.getRoot() + "employees.fxml"), FLIGHTS(Root.CRUD.getRoot() + "flights.fxml"),
    MY_TRIPS(Root.CLIENT.getRoot() + "my-flights.fxml"), NEW_TRIP(Root.CLIENT.getRoot() + "new-flight.fxml"),
    PLAN_FLIGHT(Root.CLIENT.getRoot() + "plan-flight.fxml"), INDICATORS(Root.MIGRATION.getRoot() + "indicators.fxml"),
    INDICATORS_MODAL(Root.MIGRATION.getRoot() + "modalIndicators.fxml"), PROFILE(Root.USER.getRoot() + "profile.fxml"),
    USER_MODAL(Root.CRUD.getRoot() + "usersModal.fxml"), USER_TABLE(Root.CRUD.getRoot() + "users.fxml"),
    AIRLINE_MODAL(Root.CRUD.getRoot() + "airlinesModal.fxml"), AIRLINE_TABLE(Root.CRUD.getRoot() + "airlines.fxml"),
    TRACK_MODAL(Root.CRUD.getRoot() + "tracksModal.fxml"), TRACK_TABLE(Root.CRUD.getRoot() + "tracks.fxml"),
    LUGAGGE_MODAL(Root.CRUD.getRoot() + "lugaggesModal.fxml"),
    AIRCRAFT_MODAL(Root.CRUD.getRoot() + "aircraftsModal.fxml"), AIRCRAFT_TABLE(Root.CRUD.getRoot() + "aircrafts.fxml"),
    TRIP_MODAL(Root.CRUD.getRoot() + "tripsModal.fxml"),
    AL_EMPLOYEES_MODAL(Root.CRUD.getRoot() + "employeesModal.fxml"),
    FLIGHTS_MODAL(Root.CRUD.getRoot() + "flightsModal.fxml");

    private String route;

    private Route(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }
}
