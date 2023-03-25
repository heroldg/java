package test.jour13;

public class TestConstante {
    public static final int GLOBALE = 42;

    public static void main(String[] args) {
        final int LOCAL = -72;
        System.out.println(
                "il est possible d'acceder à la constante GLOBALE : " + GLOBALE + " et à la constante LOCAL" + LOCAL);
        proc();
    }

    public static void proc() {
        System.out.println(
                "Il est possible d'accéder à la constante GLOBALE " + GLOBALE + " mais pas la constante LOCAL");
    }
}
