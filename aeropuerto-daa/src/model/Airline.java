package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Airline implements Serializable, Comparable<Airline> {

    private static final long serialVersionUID = 1L;
    private String airlineName;
    private String logo;
    private List<Aircraft> aircraft;
    private Advisor assistantRoot; // Árbol binario
    private List<Pilot> pilots;
    private List<User> users;
    private List<Flight> flights;

    private final int LEFT_ADVISOR = 1;
    private final int RIGHT_ADVISOR = 2;
    private final int TWO_ADVISORS = 3;

    /**
     * El método constructor de un objeto de aerolínea
     */
    public Airline(String airlineName, String logo) {
        pilots = new ArrayList<>();
        flights = new ArrayList<>();
        aircraft = new ArrayList<>();
        this.airlineName = airlineName;
        this.logo = logo;
    }

    public Advisor getAssistantRoot() {
        return this.assistantRoot;
    }

    public void setAssistantRoot(Advisor assistantRoot) {
        this.assistantRoot = assistantRoot;
    }

    public String getAirlineName() {
        return this.airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public ImageView getLogo() {
        File file = new File(logo);
        ImageView icon = new ImageView(new Image(("file:///" + file.getAbsolutePath())));
        icon.setFitHeight(50);
        icon.setFitWidth(200);
        return icon;
    }

    public String getIcon() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public List<Aircraft> getAircraft() {
        return this.aircraft;
    }

    public void setAircraft(List<Aircraft> aircraft) {
        this.aircraft = aircraft;
    }

    public List<Pilot> getPilots() {
        return this.pilots;
    }

    public void setPilots(List<Pilot> pilots) {
        this.pilots = pilots;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Flight> getFlights() {
        return this.flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    /**
     * Devuelve una representación de String del objeto.
     * 
     * @return Devuelve una representación de String del objeto.
     */
    @Override
    public String toString() {
        return airlineName;
    }

    /**
     * Busca un avión por su código.
     * 
     * @param code String que representa el código de la aeronave.
     * @return Devuelve la aeronave si se encuentra. Si no, devuelve null.
     */
    public Aircraft searchAircraft(String code) {
        Aircraft a = null;
        for (Aircraft ac : aircraft) {
            if (ac.getPlaneCode().equalsIgnoreCase(code)) {
                a = ac;
            }
        }
        return a;
    }

    /**
     * Verifica si un asesor es la raíz del árbol.
     * 
     * @param advisor Asesor que debe ser revisado.
     * @return Devuelve true si el asesor es la raíz del árbol. Si no, devuelve
     *         falso.
     */
    public boolean isRoot(Advisor advisor) {
        return assistantRoot == advisor;
    }

    /**
     * Verifica si un asesor es una hoja del árbol.
     * 
     * @param advisor Asesor que debe ser revisado.
     * @return Devuelve true si el asesor es una hoja del árbol. Si no, devuelve
     *         falso.
     */
    public boolean isLeaf(Advisor advisor) {
        return advisor.getLeft() == null && advisor.getRight() == null;
    }

    /**
     * Verifica si un asesor es un interno del árbol.
     * 
     * @param advisor Asesor que debe ser revisado.
     * @return Devuelve true si el asesor es un interno del árbol. Si no, devuelve
     *         falso.
     */
    public boolean isInternal(Advisor advisor) {
        return !isLeaf(advisor);
    }

    /**
     * Añade un asesor al árbol binario.
     * 
     * @param advisor Asesor a añadir.
     */
    public void addAdvisor(Advisor advisor) {
        addAdvisor(assistantRoot, advisor);
    }

    /**
     * Método auxiliar para añadir un asesor al árbol binario.
     * 
     * @param origin  Referencia al consejero de origen. Comienza con la raíz.
     * @param current Referencia al asesor actual.
     */
    private void addAdvisor(Advisor origin, Advisor current) {
        if (assistantRoot == null) {
            assistantRoot = current;
        } else {
            if (origin.compareTo(current) > 0) {
                if (origin.getLeft() != null) {
                    addAdvisor(origin.getLeft(), current);
                } else {
                    current.setParent(origin);
                    origin.setLeft(current);
                }
            } else {
                if (origin.getRight() != null) {
                    addAdvisor(origin.getRight(), current);
                } else {
                    current.setParent(origin);
                    origin.setRight(current);
                }
            }
        }
    }

    /**
     * Elimina el asesor del árbol binario.
     * 
     * @param advisor El asesor debe ser eliminado.
     */
    public void removeAdvisor(Advisor advisor) {
        if (assistantRoot == null) {
            System.out.println("No hay asesores para eliminar.");
        } else if (isLeaf(advisor)) {
            removeLeaf(advisor);
        } else if (advisor.getRight() != null && advisor.getLeft() == null) {
            removeWithChild(advisor, RIGHT_ADVISOR);
        } else if (advisor.getRight() == null && advisor.getLeft() != null) {
            removeWithChild(advisor, LEFT_ADVISOR);
        } else {
            removeWithChild(advisor, TWO_ADVISORS);
        }
    }

    /**
     * Elimina la hoja del árbol binario.
     * 
     * @param advisor El asesor debe ser eliminado.
     */
    private void removeLeaf(Advisor advisor) {
        if (isRoot(advisor)) {
            assistantRoot = null;
        } else {
            Advisor parent = advisor.getParent();

            if (parent.getLeft() == advisor) {
                parent.setLeft(null);
            }

            if (parent.getRight() == advisor) {
                parent.setRight(null);
            }

            advisor = null;
        }
    }

    /**
     * Elimina al asesor cuando tiene hijo.
     * 
     * @param advisor     El asesor debe ser eliminado.
     * @param advisorType Número entero que representa si tiene un hijo a la izquierda, a la derecha
     *                    o a ambos. Vinculado con constantes.
     */
    private void removeWithChild(Advisor advisor, int advisorType) {
        Advisor nextAdvisor = null;

        switch (advisorType) {
            case LEFT_ADVISOR:
                nextAdvisor = advisor.getLeft();
                break;
            case RIGHT_ADVISOR:
                nextAdvisor = minSubTree(advisor.getRight());
                break;
            case TWO_ADVISORS:
                nextAdvisor = minSubTree(advisor.getRight());
                if (!isRoot(nextAdvisor.getParent())) {
                    advisor.getLeft().setParent(nextAdvisor);
                    advisor.getRight().setParent(nextAdvisor);
                    if (nextAdvisor.getParent().getLeft() == nextAdvisor) {
                        nextAdvisor.getParent().setLeft(null);
                    } else if (nextAdvisor.getParent().getRight() == nextAdvisor) {
                        nextAdvisor.getParent().setRight(null);
                    }
                }
                break;
        }

        nextAdvisor.setParent(advisor.getParent());

        if (!isRoot(advisor)) {
            if (advisor.getParent().getLeft() == advisor) {
                advisor.getParent().setLeft(nextAdvisor);
            } else if (advisor.getParent().getRight() == advisor) {
                advisor.getParent().setRight(nextAdvisor);
            }
        } else {
            assistantRoot = nextAdvisor;
        }

        if (advisor.getRight() != null && advisor.getRight() != nextAdvisor) {
            nextAdvisor.setRight(advisor.getRight());
        }

        if (advisor.getLeft() != null && advisor.getLeft() != nextAdvisor) {
            nextAdvisor.setLeft(advisor.getRight());
        }

        advisor = null;
    }

    /**
     * Obtiene el valor mínimo de un subárbol binario.
     * 
     * @param advisor Asesor de la cabeza del sub-árbol.
     * @return Devuelve el asesor mínimo del subárbol.
     */
    private Advisor minSubTree(Advisor advisor) {
        if (advisor != null && advisor.getLeft() != null) {
            while (!isLeaf(advisor)) {
                advisor = minSubTree(advisor.getLeft());
            }
        }
        return advisor;
    }

    /**
     * Hace una lista a partir del árbol binario de los asesores.
     * 
     * @return Devuelve una lista con todos los asesores de las aerolíneas.
     */
    public ArrayList<Advisor> advisorsToArray() {
        ArrayList<Advisor> advisors = new ArrayList<>();
        advisorsToArray(assistantRoot, advisors);
        return advisors;
    }

    /**
     * Método auxiliar para crear una lista a partir de un árbol binario.
     * 
     * @param current Referencia al asesor actual.
     * @param result  Arraylist con asesores.
     */
    private void advisorsToArray(Advisor current, ArrayList<Advisor> result) {
        if (current == null) {
            return;
        }
        advisorsToArray(current.getLeft(), result);
        result.add(current);
        advisorsToArray(current.getRight(), result);
    }

    /**
     * Fusiona todos los pilotos y asesores en una sola lista.
     * 
     * @return Devuelve una lista con todos los empleados de la aerolínea.
     */
    public List<Collaborator> getEmployees() {
        ArrayList<Collaborator> employees = new ArrayList<>(pilots);
        employees.addAll(advisorsToArray());
        return new ArrayList<>(employees);
    }

    /**
     * Compara dos nombres de aerolíneas.
     * 
     * @param a Airline to be compared with.
     * @return Devuelve -1 si el nombre es menor que el otro. Devuelve 1 si este
     *         nombre es mayor. Devuelve 0 si ambos nombres son iguales.
     */
    @Override
    public int compareTo(Airline a) {
        if (a.getAirlineName().equalsIgnoreCase(airlineName)) {
            return 0;
        } else {
            return airlineName.compareTo(a.getAirlineName());
        }
    }

    /**
     * Crea una lista a partir de los asesores de la lista enlazada.
     * 
     * @return Devuelve la lista con todos los asesores.
     */
    public List<Advisor> getAdvisor() {
        List<Advisor> list = new ArrayList<>();
        rangeAdvisorsAdd(assistantRoot, list);
        return list;
    }

    /**
     * Método auxiliar para crear listas a partir de asesores de listas enlazadas.
     * 
     * @param advisor Asesor actual.
     * @param list    Lista que contiene asesores.
     */
    private void rangeAdvisorsAdd(Advisor advisor, List<Advisor> list) {
        if (advisor == null) {
            return;
        }
        rangeAdvisorsAdd(advisor.getLeft(), list);
        list.add(advisor);
        rangeAdvisorsAdd(advisor.getRight(), list);
    }

    /**
     * Añade un piloto a la aerolínea.
     * 
     * @param name     String con el nombre del piloto.
     * @param lastName String que contiene el apellido del piloto.
     * @param id       Integer que contiene el número de identificación del piloto.
     * @param airline  Aerolínea vinculada con el piloto.
     */
    public void addPilot(String name, String lastName, int id, Airline airline) {
        Pilot temp = new Pilot(name, lastName, id, airline);
        pilots.add(temp);
    }

    /**
     * Añade un vuelo a la aerolínea.
     * 
     * @param id            Número de identificación del vuelo.
     * @param departureDate Fecha de salida del vuelo.
     * @param departureHour Hora de salida del vuelo.
     * @param arrivalDate   Fecha de llegada del vuelo.
     * @param arrivalHour   Hora de llegada del vuelo.
     * @param origin        Lugar de origen del vuelo.
     * @param destination   Destino del vuelo.
     * @param track         Pista que utilizará el vuelo.
     * @param airline       Compañía aérea vinculada al vuelo.
     * @param aircraft      Aviones relacionados con el vuelo.
     */
    public void addFlight(String id, String departureDate, String departureHour, String arrivalDate, String arrivalHour,
            Places origin, Places destination, Track track, Airline airline, Aircraft aircraft) {
        Flight temp = new Flight(id, departureDate, departureHour, arrivalDate, arrivalHour, origin, destination, track,
                airline, aircraft);
        flights.add(temp);
    }

    /**
     * Añade un nuevo avión a la aerolínea.
     * 
     * @param plane Aviones a añadir.
     */
    public void addAircraft(Aircraft plane) {
        aircraft.add(plane);
    }

    /**
     * Retira al piloto de la aerolínea.
     * 
     * @param pilot El piloto debe ser retirado.
     */
    public void removePilot(Pilot pilot) {
        pilots.remove(pilot);
    }

    /**
     * Elimina el vuelo de la aerolínea.
     * 
     * @param flight Vuelo para ser eliminado.
     */
    public void removeFlight(Flight flight) {
        flights.remove(flight);
    }

    /**
     * Retira la aeronave de la línea aérea.
     * 
     * @param plane Aviones que deben ser retirados.
     */
    public void removeAircraft(Aircraft plane) {
        aircraft.remove(plane);
    }

    /**
     * Importa los datos de los empleados desde un archivo.
     * 
     * @param fileName Nombre del archivo que contiene todos los datos.
     * @throws IOException
     */
    public void importDataEmployees(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        while (line != null) {
            String[] parts = line.split(";");
            String name = parts[1];
            String lastName = parts[2];
            int id = Integer.parseInt(parts[3]);
            String type = parts[4];
            line = br.readLine();
            if (type.equalsIgnoreCase("pilot")) {
                pilots.add(new Pilot(name, lastName, id, this));
            } else {
                addAdvisor(new Advisor(name, lastName, id, this));
            }
            ;
        }
        br.close();
    }

    /**
     * Exporta los datos de los empleados a un archivo.
     * 
     * @param fileName Nombre del archivo que se exportará con los datos.
     * @throws FileNotFoundException
     */
    public void exportDataEmployees(String fileName) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(fileName);
        pw.println("INFORME DE LOS EMPLEADOS DEL SISTEMA AEROPORTUARIO");
        pw.println("Nombre;Apellido;Id;Tipo;Aerolinea");
        for (int i = 0; i < getEmployees().size(); i++) {
            Collaborator e = getEmployees().get(i);
            pw.println(
                    e.getName() + ";" + e.getLastName() + ";" + e.getId() + ";" + e.getType() + ";" + e.getAirline());
        }
        pw.close();
    }

    /**
     * Importar datos de la aeronave desde un archivo.
     * 
     * @param fileName Nombre del archivo que contiene todos los datos.
     * @throws IOException
     */
    public void importDataAircraft(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        while (line != null) {
            String[] parts = line.split(";");
            String planeCode = parts[1];
            int planeWeight = Integer.parseInt(parts[2]);
            int capacity = Integer.parseInt(parts[3]);
            line = br.readLine();
            if (searchAircraft(planeCode) == null) {
                aircraft.add(new Aircraft(planeCode, planeWeight, capacity, this));
            }
        }
        br.close();
    }

    /**
     * Exporta los datos de la aeronave a un archivo.
     * 
     * @param fileName Nombre del archivo que se exportará con los datos.
     * @throws FileNotFoundException
     */
    public void exportDataAircraft(String fileName) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(fileName);
        pw.println("INFORME SOBRE LAS AERONAVES DEL SISTEMA AEROPORTUARIO");
        pw.println("Código;Peso;Capacidad;Aerolinea");
        for (int i = 0; i < getAircraft().size(); i++) {
            Aircraft a = getAircraft().get(i);
            pw.println(a.getPlaneCode() + ";" + a.getPlaneWeight() + ";" + a.getCapacity() + ";" + a.getAirline());
        }
        pw.close();
    }

}
