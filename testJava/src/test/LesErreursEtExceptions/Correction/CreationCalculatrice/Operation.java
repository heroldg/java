package test.LesErreursEtExceptions.Correction.CreationCalculatrice;

public class Operation {

    public static int ajouter(int a, int b) throws DepassementCapaciteException {
        long reslong = (long) a + b;
        int resInt = a + b;
        if (reslong != resInt) {
            throw new DepassementCapaciteException();
        }
        return resInt;
    }

    public static int soustraire(int a, int b) throws DepassementCapaciteException {
        long reslong = (long) a - b;
        int resInt = a - b;
        if (reslong != resInt) {
            throw new DepassementCapaciteException();
        }
        return resInt;
    }

    public static int multiplication(int a, int b) throws DepassementCapaciteException {
        long reslong = (long) a * b;
        int resInt = a * b;
        if (reslong != resInt) {
            throw new DepassementCapaciteException();
        }
        return resInt;
    }

}
