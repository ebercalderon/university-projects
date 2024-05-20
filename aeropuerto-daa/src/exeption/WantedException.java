package exeption;

public class WantedException extends Exception {
    private String message;

    /**
     * El método constructor de WantedException
     */
    public WantedException() {
        message = ("Ha sido detenido y se presentarán cargos en el tribunal");
    }

    /**
     * Obtiene el mensaje de excepción pertinente (En este caso, cliente con antecedentes
     * judiciales)
     * 
     * @return String
     */
    public String getMessage() {
        return message;
    }
}
