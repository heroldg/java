package test.LesErreursEtExceptions.Correction.CreationCalculatrice;

public class DepassementCapaciteException extends Exception {
    private static final long serialVersionUID = 1L;

    public DepassementCapaciteException() {
        super("le résultat dépassé la capacité de la calculatrice");
    }
}
