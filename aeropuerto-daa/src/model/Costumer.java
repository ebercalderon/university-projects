package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Costumer extends User {

    Random r = new Random();
    private String iconPath;
    private Trip rootTrip; // Binary Tree
    private String state;
    private String notifications;

    public Costumer(int value) { // JUnit Tests
        super("Tester", "User", 8, "testerUser@correo.co", "8", UserRole.CLIENTE);
        state = CostumerState.values()[value].name();
    }

    /**
     * El método constructor de un objeto JWT Costumer
     */
    public Costumer(String name, String lastName, long id, String email, String password) {
        super(name, lastName, id, email, password, UserRole.CLIENTE);
        rootTrip = null;
        int value = (int) ((Math.random() * 4));
        state = CostumerState.values()[value].name();
    }

    /**
     * El método constructor de un objeto personalizado de autenticación de Google
     */
    public Costumer(String name, String lastName, long id, String iconPath) {
        super(name, lastName, id, "", "", UserRole.CLIENTE);
        this.iconPath = iconPath;
        rootTrip = null;
        int value = (int) ((Math.random() * 4));
        state = CostumerState.values()[value].name();
    }

    public String getIconPath() {
        return this.iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    public Random getR() {
        return this.r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    public String getNotifications() {
        return this.notifications;
    }

    public void setNotifications(String notifications) {
        this.notifications = notifications;
    }

    public Trip getRootTrip() {
        return rootTrip;
    }

    public void setRootTrip(Trip rootTrip) {
        this.rootTrip = rootTrip;
    }

    /**
     * Añade un nuevo viaje al cliente.
     * @param newPNode Viaje a añadir.
     */
    public void addTrip(Trip newPNode) {

        if (rootTrip == null) {
            rootTrip = newPNode;
        } else {
            addTrip(rootTrip, newPNode);
        }

    }

    /**
     * Añade un nuevo viaje al cliente.
     * @param parent Viaje padre
     * @param newTrip Viaje a añadir.
     */
    private void addTrip(Trip parent, Trip newTrip) {
        if (newTrip.getTripPrice() <= parent.getTripPrice()) {
            if (parent.getLeft() == null) {
                parent.setLeft(newTrip);
                newTrip.setFather(parent);
            } else {
                addTrip(parent.getLeft(), newTrip);
            }
        } else {
            if (parent.getRight() == null) {
                parent.setRight(newTrip);
                newTrip.setFather(parent);
            } else {
                addTrip(parent.getRight(), newTrip);
            }
        }
    }

    /**
     * Crea una lista a partir de la lista enlazada de viajes.
     * @return Devuelve una lista con todos los viajes del cliente.
     */
    public List<Trip> getTrips() {
        List<Trip> list = new ArrayList<>();
        rangeTripsAdd(rootTrip, list);
        bubbleSorting(list);
        return list;
    }

    /**
     * Algoritmo de ordenamiento de burbuja para viajes.
     * @param list Lista con los viajes del cliente.
     */
    private void bubbleSorting(List<Trip> list) {

        for (int i = list.size() - 1; i > 0; i--) {

            for (int j = 0; j < list.size() - 1; j++) {

                if (list.get(j).compareByDate(list.get(j + 1)) > 0) {

                    Trip temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set((j + 1), temp);

                } else if (list.get(j).compareByDate(list.get(j + 1)) == 0) {
                    if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                        Trip temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set((j + 1), temp);
                    }
                }
            }
        }
    }

    /**
     * Método auxiliar para crear una lista a partir de la lista enlazada de viajes.
     * @param node Referencia al viaje actual.
     * @param list Lista con viajes.
     */
    private void rangeTripsAdd(Trip node, List<Trip> list) {
        if (node == null) {
            return;
        }
        rangeTripsAdd(node.getLeft(), list);
        list.add(node);
        rangeTripsAdd(node.getRight(), list);
    }

    /**
     * Busca un viaje.
     * @param toFind Viaje a buscar.
     * @return Devuelve el viaje buscado. Devuelve null si no se encuentra nada.
     */
    public Trip getTrip(Trip toFind) {
        Trip temp = null;
        rangeTripSearch(rootTrip, toFind, temp);
        return temp;
    }

    /**
     * Busca un rango de viaje.
     * @param node Referencia al viaje actual.
     * @param toFind Viaje a buscar.
     * @param returnV Viaje de vuelta.
     */
    private void rangeTripSearch(Trip node, Trip toFind, Trip returnV) {
        if (node == null) {
            return;
        }
        rangeTripSearch(node.getLeft(), toFind, returnV);
        if (node.equals(toFind)) {
            returnV = node;
        }
        rangeTripSearch(node.getRight(), toFind, returnV);
    }

    /**
     * Elimina un viaje de la lista de viajes del cliente.
     * @param trip Viaje que debe ser eliminado.
     * @return Devuelve un String con el resultado de la operación.
     */
    public String deleteTrip(Trip trip) {
        Trip temp = trip;

        if (temp != null) {

            Trip parent = temp.getFather();
            Trip right = temp.getRight();
            Trip left = temp.getLeft();

            if (right == null && left == null) { // no children case
                if (rootTrip == temp) {
                    rootTrip = null;
                } else {
                    if (parent.getLeft() == (temp)) {
                        parent.setLeft(null);
                    } else {
                        parent.setRight(null);
                    }
                }
            } else if (right == null || left == null) { // One children case

                Trip tempSon = null;

                if (right == null) {
                    tempSon = left;
                } else {
                    tempSon = right;
                }
                tempSon.setFather(parent);

                if (parent == null) {
                    rootTrip = tempSon;
                } else {
                    if (parent.getLeft() == (temp)) {
                        parent.setLeft(tempSon);
                    } else {
                        parent.setRight(tempSon);
                    }
                }
            } else { // Two children case
                Trip minTrip = minTrip(right);

                deleteTrip(minTrip);

                temp.setRootLuggage(minTrip.getRootLuggage());
                temp.setTicket(minTrip.getTicket());
                temp.setTripPrice(minTrip.getTripPrice());
                temp.setId(minTrip.getId());
                temp.setFlightSeat(minTrip.getFlightSeat());
            }

            temp.getFlightSeat().setSeatState(false);
            temp.setFather(null);
            temp.setLeft(null);
            temp.setRight(null);

            return temp.getId();

        } else {
            return "No se pudo eliminar";
        }

    }

    /**
     * Obtiene el valor mínimo de un árbol binario.
     * @param starTrip Viaje raíz desde árbol.
     * @return Devuelve el viaje mínimo desde el árbol.
     */
    private Trip minTrip(Trip starTrip) {
        if (starTrip.getLeft() == null) {
            return starTrip;
        } else {
            return minTrip(starTrip.getLeft());
        }
    }

    /**
     * Elimina un viaje del árbol binario.
     * @param trip Viaje a ser eliminado.
     * @return Devuelve un String con el resultado de la operación.
     */
    public String removeTrip(Trip trip) {
        if (rootTrip == null) {
            System.out.println("No hay viajes que eliminar.");
        } else if (isLeaf(trip)) {
            removeLeaf(trip);
        } else if (trip.getRight() != null && trip.getLeft() == null) {
            removeWithChild(trip, 2);
        } else if (trip.getRight() == null && trip.getLeft() != null) {
            removeWithChild(trip, 1);
        } else {
            removeWithChild(trip, 3);
        }
        return "Viaje eliminado con éxito";
    }

    /**
     * Elimina la hoja del árbol binario.
     * @param trip Viaje a ser eliminado.
     */
    private void removeLeaf(Trip trip) {
        if (trip == rootTrip) {
            rootTrip = null;
        } else {
            Trip parent = trip.getFather();

            if (parent.getLeft() == trip) {
                parent.setLeft(null);
            }

            if (parent.getRight() == trip) {
                parent.setRight(null);
            }

            trip = null;
        }
    }

    /**
     * Elimina el viaje cuando tiene hijo.
     * @param trip Viaje a ser eliminado.
     * @param tripType Entero que representa si tiene un hijo a su izquierda, derecha o ambos.
     *
     */
    private void removeWithChild(Trip trip, int tripType) {
        Trip nextTrip = null;

        switch (tripType) {
            case 1:
                nextTrip = trip.getLeft();
                break;
            case 2:
                nextTrip = minSubTree(trip.getRight());
                break;
            case 3:
                nextTrip = minSubTree(trip.getRight());
                if (!isRoot(nextTrip.getFather())) {
                    trip.getLeft().setFather(nextTrip);
                    trip.getRight().setFather(nextTrip);
                    if (nextTrip.getFather().getLeft() == nextTrip) {
                        nextTrip.getFather().setLeft(null);
                    } else if (nextTrip.getFather().getRight() == nextTrip) {
                        nextTrip.getFather().setRight(null);
                    }
                }
                break;
        }

        nextTrip.setFather(trip.getFather());

        if (!(trip.getFather() == null)) {
            // if(!isRoot(trip)) {
            if (trip.getFather().getLeft() == trip) {
                trip.getFather().setLeft(nextTrip);
            } else if (trip.getFather().getRight() == trip) {
                trip.getFather().setRight(nextTrip);
            }
        } else {
            rootTrip = nextTrip;
        }

        if (trip.getRight() != null && trip.getRight() != nextTrip) {
            nextTrip.setRight(trip.getRight());
        }

        if (trip.getLeft() != null && trip.getLeft() != nextTrip) {
            nextTrip.setLeft(trip.getRight());
        }

        trip = null;
    }

    /**
     * Obtiene el valor mínimo de un subárbol binario.
     *
     * @param trip Viaje raíz desde el subárbol.
     * @return Devuelve el viaje mínimo del subárbol.
     */
    private Trip minSubTree(Trip trip) {
        if (trip != null && trip.getLeft() != null) {
            while (!isLeaf(trip)) {
                trip = minSubTree(trip.getLeft());
            }
        }
        return trip;
    }

    /**
     * Verifica si un viaje es la raíz del árbol.
     * 
     * @param trip viaje a comprobar.
     * @return Devuelve true si el viaje es la raíz del árbol. En caso contrario, devuelve false.
     */
    public boolean isRoot(Trip trip) {
        return rootTrip == trip;
    }

    /**
     * Verifica si un viaje es una hoja del árbol.
     * 
     * @param trip Viaje a comprobar.
     * @return Devuelve true si el asesor es una hoja del árbol. Si no, devuelve
     *         falso.
     */
    public boolean isLeaf(Trip trip) {
        return trip.getLeft() == null && trip.getRight() == null;
    }

    /**
     * Añade equipaje al cliente.
     * @param luggage Equipaje a añadir.
     * @param trip Referencia del viaje para el equipaje que se va a añadir.
     */
    public void addLuggage(Luggage luggage, Trip trip) {
        trip.addLuggage(luggage);
    }

    public String getState() {
        return state;
    }

    public void setState(int state) {
        this.state = CostumerState.values()[state].name();
    }

    /**
     * Cuenta la cantidad de viajes.
     * @param node Referencia al viaje actual.
     * @param count Número entero que contiene el recuento de viajes.
     * @return Devuelve un entero con toda la cantidad de viajes.
     */
    private int countTrips(Trip node, int count) {
        if (node == null) {
            return 0;
        }
        countTrips(node.getLeft(), count);
        count++;
        countTrips(node.getRight(), count);
        return count;
    }

    /**
     * Método auxiliar para contar la cantidad de viajes.
     * @return Devuelve la cantidad de viajes del cliente.
     */
    public int countTrips() {
        return countTrips(rootTrip, 0);
    }

}
