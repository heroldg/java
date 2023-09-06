package test.LesErreursEtExceptions.cours;

public class JeuException extends RuntimeException {
    private static final long serialVesionUID = 1L;

    public JeuException(String message) {
        super(message);
    }
}
