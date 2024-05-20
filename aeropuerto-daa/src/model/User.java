package model;

public class User extends Person implements Comparable<User> {

    private String email;
    private String password;
    private UserRole role;

    /**
     * El método constructor de un objeto de Usuario
     */
    public User(String name, String lastName, long id, String email, String password, UserRole role) {
        super(name, lastName, id);
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return this.role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    /**
     * Método necesario para implementar correctamente la orden basada en los ID enteros.
     * 
     * @param other != null
     * @return y la clave int para los métodos de clasificación.
     */
    @Override
    public int compareTo(User other) {
        return (int) (this.getId() - other.getId());
    }

    /**
     * Método necesario para implementar correctamente la orden basada en el Rol de Usuario.
     *
     * @param other != null
     * @return y la clave int para los métodos de clasificación.
     */
    public int compareByRole(User other) {
        return role.name().compareTo(other.getRole().name());
    }

}
