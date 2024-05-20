package exeption;

public class MinorException extends Exception {
    private String message;

    /**
     * El método constructor de una MinorException
     */
    public MinorException() {
        message = ("Lo siento, eres menor de edad y no tienes el permiso pertinente para viajar");
    }

    /**
     * Recibe el mensaje de excepción pertinente (En este caso, cliente sin
     * aprobación de los padres [Menor])
     * 
     * @return String
     */
    public String getMessage() {
        return message;
    }
}
