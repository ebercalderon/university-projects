package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Airport implements Serializable {

    private static final long serialVersionUID = 1L;
    public final String FILE_SEPARATOR = ";";
    public final String SUCCESS = " se han añadido a nuestro Aeropuerto con éxito";
    public final String DELETE_SUCCESS = " se han eliminado con éxito";
    public final String EDIT_SUCCESS = " han sido editados con éxito";
    public final String REPEATED = " Ups, el registro ya está en la aplicación";
    public final String USER_ERROR = " no se ha podido añadir a nuestro Aeropuerto (ya existe)";
    public final String DELETE_ERROR = " Hey! es tu cuenta (No se puede borrar)";
    public final String OAUTH_MESSAGE = " su cuenta se ha procesado con éxito";
    private final String SAVE_PATH_FILE = "data/Airport.data";
    private List<User> users;
    private List<Airline> airlines;
    private List<Flight> flights;
    private Track firstTrack; // Linked List
    private AirlineUser airlineLogged;
    private Costumer logged;
    private User adminLogged;
    private List<Migration> migration;

    /**
     * El método constructor de un Objeto Aeropuerto(clase principal del modelo) <br>
     */
    public Airport() {
        users = new ArrayList<>();
        airlines = new ArrayList<>();
        flights = new ArrayList<>();
        users.add(new User("Admin", "Admin", 1, "admin@gmail.com", "1", UserRole.ADMINISTRADOR));
        migration = new ArrayList<>();
        dateRender();
    }

    /**
     * Verifica que efectivamente hay un archivo binario para deserializar y comenzar con la
     * persistencia de la aplicación.
     */
    public void dateRender() {
        File file = new File(SAVE_PATH_FILE);
        if (file.length() > 0) {
            loadData();
        }
    }

    /**
     * Carga todos los datos del programa deserializando los datos primitivos y los objetos del archivo.
     */
    @SuppressWarnings("unchecked")
    public void loadData() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(SAVE_PATH_FILE)));
            users = (List<User>) ois.readObject();
            airlines = (List<Airline>) ois.readObject();
            flights = (List<Flight>) ois.readObject();
            firstTrack = (Track) ois.readObject();
            migration = (List<Migration>) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Guarda todos los datos del programa escribiendo tipos de datos primitivos y gráficos de objeto
     * Java a un OutputStream.
     */
    public void saveData() {
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(SAVE_PATH_FILE));
            oos.writeObject(users);
            oos.writeObject(airlines);
            oos.writeObject(flights);
            oos.writeObject(firstTrack);
            oos.writeObject(migration);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Flight> getFlights() {
        flights.clear();
        for (Airline airline : airlines) {
            for (Flight flight : airline.getFlights()) {
                flights.add(flight);
            }
        }
        return flights;
    }

    public Track getFirstTrack() {
        return this.firstTrack;
    }

    public void setFirstTrack(Track firstTrack) {
        this.firstTrack = firstTrack;
    }

    /**
     * Obtiene el número de pistas en la App.
     */
    public int getTrackAmount() {
        int trackAmount = 0;
        Track render = firstTrack;
        while (render != null) {
            trackAmount++;
            render = render.getNext();
        }
        return trackAmount;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Migration> getMigration() {
        return migration;
    }

    public Costumer getLogged() {
        return logged;
    }

    public void setLogged(Costumer logged) {
        this.logged = logged;
    }

    public User getAdminLogged() {
        return adminLogged;
    }

    public void setAdminLogged(User adminLogged) {
        this.adminLogged = adminLogged;
    }

    public AirlineUser getAirlineLogged() {
        return this.airlineLogged;
    }

    public void setAirlineLogged(AirlineUser airlineLogged) {
        this.airlineLogged = airlineLogged;
    }

    public List<Airline> getAirlines() {
        return this.airlines;
    }

    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
    }

    /**
     * Importar los datos de las aerolíneas desde un archivo.
     * 
     * @param fileName Nombre del archivo que contiene todos los datos.
     * @throws IOException
     */
    public void importDataAirlines(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        while (line != null) {
            String[] parts = line.split(FILE_SEPARATOR);
            String airlineName = parts[1];
            String logo = parts[2];
            line = br.readLine();
            createAirline(airlineName, logo);
        }
        br.close();
    }

    /**
     * Exportar los datos de las aerolíneas a un archivo.
     * 
     * @param fileName Nombre del archivo que se exportará con los datos.
     * @throws FileNotFoundException
     */
    public void exportDataAirlines(String fileName) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(fileName);
        pw.println("INFORME DE LAS COMPANIAS AÉREAS DEL SISTEMA AEROPORTUARIO");
        pw.println("Aerolínea;Ruta de los iconos");
        for (int i = 0; i < airlines.size(); i++) {
            Airline a = airlines.get(i);
            pw.println(a.getAirlineName() + FILE_SEPARATOR + a.getIcon());
        }
        pw.close();
    }

    /**
     * Importar los datos de las pistas a un archivo.
     * 
     * @param fileName Nombre del archivo que contiene todos los datos.
     * @throws IOException
     */
    public void importDataTracks(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        while (line != null) {
            String[] parts = line.split(FILE_SEPARATOR);
            int id = Integer.parseInt(parts[1]);
            String gate = parts[2];
            line = br.readLine();
            addTrack(new Track(id, gate));
        }
        br.close();
    }

    /**
     * Exportar todos los datos de las pistas a un archivo.
     * 
     * @param fileName Nombre del archivo que se exportará con los datos.
     * @throws FileNotFoundException
     */
    public void exportDataTracks(String fileName) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(fileName);
        pw.println("INFORME SOBRE LAS PISTAS DEL SISTEMA AEROPORTUARIO");
        pw.println("Código;Puerta;Estado");
        for (int i = 0; i < getTrackAmount(); i++) {
            Track t = tracksToList().get(i);
            pw.println(t.getId() + FILE_SEPARATOR + t.getGate() + FILE_SEPARATOR + t.getState());
        }
        pw.close();
    }

    /**
     * Importar los datos de la migración a un archivo.
     * 
     * @param fileName Nombre del archivo que contiene todos los datos.
     * @throws IOException
     */
    public void importDataMigration(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        while (line != null) {
            String[] parts = line.split(FILE_SEPARATOR);
            Flight flight = new Flight(parts[1]);
            int approved = Integer.parseInt(parts[2]);
            int covid = Integer.parseInt(parts[3]);
            int wanted = Integer.parseInt(parts[4]);
            int minor = Integer.parseInt(parts[5]);
            line = br.readLine();
            Migration m = createMigrationZone(flight);
            m.setapp(approved);
            m.setcov(covid);
            m.setwant(wanted);
            m.setmin(minor);
            m.airportCharges();
        }
        br.close();
    }

    /**
     * Exportar todos los datos de la migración a un archivo.
     * 
     * @param fileName Nombre del archivo que se exportará con los datos.
     * @throws FileNotFoundException
     */
    public void exportDataMigration(String fileName) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(fileName);
        pw.println("INFORME DE MIGRACIÓN DEL SISTEMA AEROPORTUARIO");
        pw.println("Código de vuelo;Aprobado;Covid;Se busca;Menor;Capital");
        for (int i = 0; i < migration.size(); i++) {
            Migration m = migration.get(i);
            pw.println(m.getId() + FILE_SEPARATOR + m.getApproved() + FILE_SEPARATOR + m.getCovid() + FILE_SEPARATOR
                    + m.getWanted() + FILE_SEPARATOR + m.getMinor() + FILE_SEPARATOR + m.getCapital());
        }
        pw.close();
    }

    /**
     * Importar los datos de los usuarios a un archivo.
     * 
     * @param fileName Nombre del archivo que contiene todos los datos.
     * @throws IOException
     */
    public void importDataUsers(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        while (line != null) {
            String[] parts = line.split(FILE_SEPARATOR);
            String name = parts[1];
            String lastName = parts[2];
            long id = Long.parseLong(parts[3]);
            String email = parts[4];
            String password = parts[3];
            UserRole role = UserRole.valueOf(parts[5]);
            Airline airline = searchBynaryAirline(parts[6]);
            line = br.readLine();
            switch (role) {
                case CLIENTE:
                    createUser(name, lastName, id, email, password);
                    break;
                case AEROLINEA:
                    createUser(name, lastName, id, email, password, airline);
                    break;
                default:
                    createUser(name, lastName, id, email, password, role);
                    break;
            }
        }
        br.close();
    }

    /**
     * Exportar todos los datos de los usuarios a un archivo.
     * 
     * @param fileName Nombre del archivo que se exportará con los datos.
     * @throws FileNotFoundException
     */
    public void exportDataUsers(String fileName) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(fileName);
        pw.println("INFORME DE LOS USUARIOS DEL SISTEMA AEROPORTUARIO");
        pw.println("Nombre;Apellido;Identificación;Correo electrónico;Función;Aerolínea");
        for (int i = 0; i < users.size(); i++) {
            User u = users.get(i);
            String msg = (u.getName() + FILE_SEPARATOR + u.getLastName() + FILE_SEPARATOR + u.getId() + FILE_SEPARATOR
                    + u.getEmail() + FILE_SEPARATOR + u.getRole().name());
            if (u instanceof AirlineUser) {
                AirlineUser a = (AirlineUser) u;
                msg += FILE_SEPARATOR + a.getAirline();
            }
            pw.println(msg);
        }
        pw.close();
    }

    /**
     * Crea una instancia de migración asignada y un binario buscando un vuelo dentro del
     * aeropuerto para asignarlo con sus respectivos clientes. <br>
     * Post: agrega una zona de migración en el aeropuerto.
     * 
     * @param flight != null
     * @return Un objeto de migración que se representará más adelante en laApp.
     */
    public Migration createMigrationZone(Flight flight) {
        Migration render = null;
        if (!searchMigrationFlight(flight.getId())) {
            render = new Migration(flight);
            migration.add(render);
        }
        return render;
    }

    /**
     * Obtiene los gastos del aeropuerto que deben entregar en el
     * área de migración dependiendo de los clientes que hayan retenido en cada vuelo.
     * 
     * @return Los proveedores tienen que pagar.
     */
    public int getExpenses() {
        int i = 0;
        int amount = 0;
        while (i < migration.size()) {
            amount += migration.get(i).getCapital();
            i++;
        }
        return amount;
    }

    /**
     * Busca un vuelo dentro de todas las zonas de inmigración para verificar que no ha sido
     * revisado antes.
     * 
     * @param id != String o incluso null.
     * @return una condición booleana que se utilizará más adelante en Thread.
     */
    public boolean searchMigrationFlight(String id) {
        boolean render = false;
        for (Migration m : getMigration()) {
            if (m.getFlight().getId() == id) {
                render = true;
            }
        }
        return render;
    }

    /**
     * Elimina una Instancia de Migración en la lista de destinos del Aeropuerto.
     * @param m != null
     * @param flight != null
     * @param a != String o null
     * @param c != String o null
     * @param w != String o null
     * @param mn != String o null
     * @return Un mensaje de String con fines de notificación.
     */
    public String editMigration(Migration m, Flight flight, int a, int c, int w, int mn) {
        m.setFlight(flight);
        m.setapp(a);
        m.setcov(c);
        m.setwant(w);
        m.setmin(mn);
        return "MIGRATION" + EDIT_SUCCESS;
    }

    /**
     * Elimina una Instancia de Migración en la lista de destinos del Aeropuerto.
     * 
     * @param m != null
     * @return Un mensaje de String con fines de notificación.
     */
    public String deleteMigration(Migration m) {
        migration.remove(m);
        return "MIGRATION" + DELETE_SUCCESS;
    }

    /**
     * Crea una compañía aérea con un nombre y un logotipo.
     * 
     * @param airlineName String que representa el nombre de la aerolínea.
     * @param logo        String que contiene la ruta de la imagen del logotipo.
     * @return Devuelve un String con el resultado de la operación.
     */
    public String createAirline(String airlineName, String logo) {
        String msg = "";
        if (airlines.size() == 0) {
            Airline newAirline = new Airline(airlineName, logo);
            airlines.add(newAirline);
            msg = airlineName + SUCCESS;
        } else {
            int i = 0;
            Airline newAirline = new Airline(airlineName, logo);
            while (i < airlines.size() && newAirline.compareTo(airlines.get(i)) > 0) {
                i++;
            }
            if (searchBynaryAirline(airlineName) == null) {
                airlines.add(i, newAirline);
                msg = airlineName + SUCCESS;
            } else {
                msg = REPEATED;
            }
        }
        return msg;
    }

    /**
     * Búsqueda binaria de una compañía aérea a partir de su nombre.
     * @param airlineName String que contiene el nombre de la compañía aérea que se va a buscar.
     * @return Devuelve la línea aérea si se encuentra. Devuelve null si no se encuentra.
     */
    public Airline searchBynaryAirline(String airlineName) {
        Airline render = null;
        int i = 0;
        int j = airlines.size() - 1;
        while (i <= j && render == null) {
            int m = (i + j) / 2;
            if (airlines.get(m).getAirlineName().equalsIgnoreCase(airlineName)) {
                render = airlines.get(m);
            } else if (airlines.get(m).getAirlineName().compareTo(airlineName) > 0) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return render;
    }

    /**
     * Búsqueda binaria de un vuelo a partir de su código.
     * @param code String que contiene el código del vuelo a buscar.
     * @return Devuelve el vuelo si se encuentra. Devuelve null si no se encuentra.
     */
    public Flight searchBynaryFlight(String code) {
        Flight render = null;
        int i = 0;
        int j = getFlights().size() - 1;
        while (i <= j && render != null) {
            int m = (i + j) / 2;
            if (getFlights().get(m).getId().equals(code)) {
                render = getFlights().get(m);
            } else if (getFlights().get(m).getId().compareTo(code) > 0) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return render;
    }

    /**
     * Crea un nuevo usuario y lo añade a la lista de usuarios del aeropuerto.
     * @param name String que contiene el nombre del usuario.
     * @param lastName String que contiene el apellido del usuario.
     * @param id Variable de tipo Long que contiene el número de identificación del usuario.
     * @param email String que contiene la dirección de correo electrónico del usuario.
     * @param password String que contiene la contraseña del usuario.
     * @param role Rol de usuario de la enumeración.
     * @return Devuelve un String con el resultado de la operación.
     */
    public String createUser(String name, String lastName, long id, String email, String password, UserRole role) {
        String msg = "";
        if (!searchUserId(id)) {
            User newUser = new User(name, lastName, id, email, password, role);
            users.add(newUser);
            msg = name + SUCCESS;
        } else {
            msg = name + USER_ERROR;
        }
        return msg;
    }

    /**
     * Edita los datos de un usuario existente.
     * @param user Usuario a editar.
     * @param name String que contiene el nombre del usuario.
     * @param lastName String que contiene el apellido del usuario.
     * @param id Variable de tipo Long que contiene el número de identificación del usuario.
     * @param email String que contiene la dirección de correo electrónico del usuario.
     * @param password String que contiene la contraseña del usuario.
     * @param role Rol de usuario de la enumeración.
     * @return Devuelve un String con el resultado de la operación.
     */
    public String editUser(User user, String name, String lastName, long id, String email, String password,
            UserRole role) {
        user.setName(name);
        user.setLastName(lastName);
        user.setId(id);
        user.setEmail(email);
        user.setPassword(password);
        user.setRole(role);
        return name + EDIT_SUCCESS;
    }

    /**
     * Crea un nuevo usuario y lo añade a la lista de usuarios del aeropuerto.
     * @param name String que contiene el nombre del usuario.
     * @param lastName String que contiene el apellido del usuario.
     * @param id Variable de tipo Long que contiene el número de identificación del usuario.
     * @param email String que contiene la dirección de correo electrónico del usuario.
     * @param password String que contiene la contraseña del usuario.
     * @return Devuelve un String con el resultado de la operación.
     */
    public String createUser(String name, String lastName, long id, String email, String password, Airline airline) {
        String msg = "";
        if (!searchUserId(id)) {
            AirlineUser newAirlineUser = new AirlineUser(name, lastName, id, email, password, airline);
            users.add(newAirlineUser);
            msg = name + SUCCESS;
        } else {
            msg = name + USER_ERROR;
        }
        return msg;
    }

    /**
     * Edita los datos de un usuario existente.
     * @param user Usuario a editar.
     * @param name String que contiene el nombre del usuario.
     * @param lastName String que contiene el apellido del usuario.
     * @param id Variable de tipo Long que contiene el número de identificación del usuario.
     * @param email String que contiene la dirección de correo electrónico del usuario.
     * @param password String que contiene la contraseña del usuario.
     * @return Devuelve una String con el resultado de la operación.
     */
    public String editUser(AirlineUser user, String name, String lastName, long id, String email, String password,
            Airline airline) {
        user.setName(name);
        user.setLastName(lastName);
        user.setId(id);
        user.setEmail(email);
        user.setPassword(password);
        user.setAirline(airline);
        return name + EDIT_SUCCESS;
    }

    /**
     * Crea un nuevo usuario normal (Sin tipo de usuario definido) y lo añade a la lista de usuarios del aeropuerto.
     * @param name String que contiene el nombre del usuario.
     * @param lastName String que contiene el apellido del usuario.
     * @param id Variable de tipo Long que contiene el número de identificación del usuario.
     * @param email String que contiene la dirección de correo electrónico del usuario.
     * @param password String que contiene la contraseña del usuario.
     * @return Devuelve un String con el resultado de la operación.
     */
    public String createUser(String name, String lastName, long id, String email, String password) {
        String msg = "";
        if (!searchUserId(id)) {
            Costumer newCostumer = new Costumer(name, lastName, id, email, password);
            users.add(newCostumer);
            msg = name + SUCCESS;
        } else {
            msg = name + USER_ERROR;
        }
        return msg;
    }

    /**
     * Crea un nuevo usuario normal (Sin tipo de usuario definido) y lo añade a la lista de usuarios del aeropuerto.
     * @param name String que contiene el nombre del usuario.
     * @param lastName String que contiene el apellido del usuario.
     * @param id Variable de tipo Long que contiene el número de identificación del usuario.
     * @return Devuelve un String con el resultado de la operación.
     */
    public String createUser(String name, String lastName, long id, String iconPath) {
        String msg = "";
        if (!searchUserId(id)) {
            Costumer newCostumer = new Costumer(name, lastName, id, iconPath);
            users.add(newCostumer);
            setLogged(newCostumer);
            msg = name + SUCCESS;
        } else {
            setLogged((Costumer) searchUser(id));
            msg = OAUTH_MESSAGE;
        }
        return msg;
    }

    /**
     * Elimina un usuario de la lista de usuarios.
     * 
     * @param user Usuario a eliminar.
     * @return Devuelve un String con el resultado de la operación.
     */
    public String deleteUser(User user) {
        String msg = "";
        if (getAdminLogged().getId() != user.getId()) {
            users.remove(user);
            msg = user.getName() + DELETE_SUCCESS;
        } else {
            msg = DELETE_ERROR;
        }
        return msg;
    }

    /**
     * Busca si ya existe un nuevo número de identificación.
     * 
     * @param newId Número de identificación introducido por el usuario.
     * @return Devuelve true si el id ya existe. Si no, devuelve false.
     */
    public boolean searchUserId(long newId) {
        boolean render = false;
        for (int i = 0; i < users.size() && !render; i++) {
            if (newId == users.get(i).getId()) {
                render = true;
            }
        }
        return render;
    }

    /**
     * Busca un usuario a partir de un número de identificación.
     * 
     * @param id Número de identificación a buscar.
     * @return Devuelve el usuario si está fundado. Si no, devuelve null.
     */
    public User searchUser(long id) {
        User user = null;
        for (User u : users) {
            if (u.getId() == id) {
                user = u;
            }
        }
        return user;
    }

    /**
     * Verífica el ID y la contraseña ingresada por el usuario y establece el
     * activo utilizado según el tipo de usuario.
     * 
     * @param id       Número de identificación introducido por el usuario.
     * @param password Contraseña introducida por el usuario.
     * @return Devuelve true si las credenciales son correctas. Si no, devuelve false.
     */
    public boolean userVerification(long id, String password) {
        boolean found = false;
        for (int i = 0; i < users.size() && !found; i++) {
            if (users.get(i).getId() == (id) && users.get(i).getPassword().equals(password)) {
                if (users.get(i) instanceof Costumer) {
                    setLogged((Costumer) users.get(i));
                } else if (users.get(i) instanceof AirlineUser) {
                    setAirlineLogged((AirlineUser) users.get(i));
                } else {
                    setAdminLogged(users.get(i));
                }
                found = true;
            }
        }
        return found;
    }

    /**
     * Añade una pista de la lista vinculada de pistas.
     * 
     * @param newTrack Pista a añadir.
     */
    public void addTrack(Track newTrack) {
        if (firstTrack == null) {
            firstTrack = newTrack;
        } else {
            addTrack(firstTrack, newTrack);
        }
    }

    /**
     * Añade la pista a la última posición de la lista enlazada de pistas.
     * 
     * @param track Pista para añadir.
     */
    public void addTrack(Track current, Track track) {
        if (current.getNext() == null) {
            current.setNext(track);
            track.setPrev(current);
        } else {
            addTrack(current.getNext(), track);
        }
    }

    /**
     *
     * @return
     */
    public List<Track> getActiveTracks() {
        List<Track> actives = new ArrayList<>();
        for (Track t : tracksToList()) {
            if (t.getState().equalsIgnoreCase("ACTIVE")) {
                actives.add(t);
            }
        }
        return actives;
    }

    /**
     * Elimina una pista de la lista vinculada de pistas.
     * 
     * @param toDelete Pista a eliminar de la lista enlazada.
     */
    public String removeTrack(Track toDelete) {
        removeTrack(firstTrack, toDelete);
        return "Track " + toDelete.getId() + DELETE_SUCCESS;
    }

    /**
     * Busca de forma recursiva la pista a borrar.
     * 
     * @param current  La pista que se va a comparar con la pista que se va a borrar.
     * @param toDelete La pista que se va a borrar.
     */
    private void removeTrack(Track current, Track toDelete) {
        if (current != null) {
            if (current == toDelete) {
                if (current == firstTrack) {
                    firstTrack = (current.getNext() != null) ? current.getNext() : null;
                } else {
                    current.getPrev().setNext(current.getNext());
                    current.getNext().setPrev(current.getPrev());
                    setTracksId();
                }
            } else {
                removeTrack(current.getNext(), toDelete);
            }
        }
    }

    /**
     * Establece el identificador de cada pista.
     */
    private void setTracksId() {
        for (int i = 0; i < tracksToList().size(); i++) {
            tracksToList().get(i).setId(i + 1);
        }
    }

    /**
     * Creates a list from existing tracks.
     * 
     * @return Devuelve una lista con todas las pistas existentes.
     */
    public List<Track> tracksToList() {
        return tracksToList(firstTrack);
    }

    /**
     * Método auxiliar que crea una lista a partir de las pistas existentes.
     * 
     * @param current Pista actual. Recibe la primera pista al principio.
     * @return Devuelve una lista con todas las pistas existentes.
     */
    public List<Track> tracksToList(Track current) {
        List<Track> tracks = new ArrayList<>();
        while (current != null) {
            tracks.add(current);
            current = current.getNext();
        }
        return tracks;
    }

    /**
     * Edita la información de una pista.
     * 
     * @param track Pista a editar.
     * @param gate  Información actualizada de la puerta.
     * @param state Información estatal actualizada.
     * @return Devuelve un String con el resultado de la edición.
     */
    public String editTrack(Track track, String gate, boolean state) {
        track.setGate(gate);
        if (state) {
            track.inMaintenance();
        } else {
            track.setInMaintenance(state);
        }
        return "Track " + track.getId() + EDIT_SUCCESS;
    }

    /**
     * Lista de usuarios de pedidos.
     * @return Devuelve una lista de usuarios ordenados.
     */
    public List<User> orderUseList() {

        List<User> list = users;

        for (int i = 0; i < list.size(); i++) {
            User minor = list.get(i);
            int pos = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (minor.compareTo(list.get(j)) > 0) {
                    minor = list.get(j);
                    pos = j;
                } else if (minor.compareTo(list.get(j)) == 0) {
                    if (minor.compareByRole(list.get(j)) > 0) {
                        minor = list.get(j);
                        pos = j;
                    }
                }
            }
            User temp = list.get(i);
            list.set(i, minor);
            list.set(pos, temp);
        }

        return list;
    }

    /**
     * Lista de vuelos de pedidos.
     * @return Devuelve una lista ordenada de vuelos.
     */
    public List<Flight> flightList() {
        boolean inserted = false;

        for (int i = 1; i < flights.size(); i++) {
            for (int j = i; j > 0 && !inserted; j--) {
                if (flights.get(j - 1).compareTo(flights.get(j)) == 0) {
                    if (flights.get(j - 1).compareById(flights.get(j)) < 0) {
                        Flight temp = flights.get(j);
                        flights.set(j, flights.get(j - 1));
                        flights.set(j - 1, temp);
                        inserted = true;
                    }
                }
            }
            if (inserted == false) {
                for (int j = i; j > 0 && flights.get(j - 1).compareTo(flights.get(j)) < 0; j--) {
                    Flight temp = flights.get(j);
                    flights.set(j, flights.get(j - 1));
                    flights.set(j - 1, temp);
                    inserted = true;
                }
            }
        }

        return flights;
    }

}
