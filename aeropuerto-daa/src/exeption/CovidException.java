package exeption;

public class CovidException extends Exception {
    private String message;

    /**
     * El método constructor de una CovidException
     */
    public CovidException() {
        message = "Tu seguridad es lo más importante, no puedes viajar por no cumplir los requisitos sanitarios";
    }

    /**
     * Recibe el mensaje de excepción pertinente (En este caso, cliente no
     * cumple los requisitos sanitarios)
     * 
     * @return String
     */
    public String getMessage() {
        return message;
    }
}
