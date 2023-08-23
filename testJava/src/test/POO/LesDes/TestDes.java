package test.POO.LesDes;

public class TestDes {
    public static final int Seuil = 20;
    int de6, de10, de12;

    public static void main(String[] args) {

        GameDes de6 = new GameDes();
        GameDes de10 = new GameDes(10);
        GameDes de12 = new GameDes(12);

        do {
            System.out.println("Tentative d'arriver à " + Seuil);
            System.out.println("Lancement du dé à six faces " + de6.lancer());
            System.out.println("Lancement du dé à dix faces " + de10.lancer());
            System.out.println("Lancement du dé à douze faces " + de12.lancer());

        } while ((de6.getFaceTiree() + de10.getFaceTiree() + de12.getFaceTiree()) < Seuil);

        System.out.println("Victoire");
    }

}
