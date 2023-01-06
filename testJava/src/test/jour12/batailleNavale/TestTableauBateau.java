package test.jour12.batailleNavale;

public class TestTableauBateau {
    public static void main(String[] args) {
        Bateau[] flotte = new Bateau[3];
        for (int i = 0; i < flotte.length; i++) {
            flotte[i] = new Bateau("Croiseur", 4);
        }
        flotte[0].initialiser("Porte-avions", 5);
        flotte[1].initialiser("Croiseur", 4);
        flotte[2].initialiser("Sous-marin", 3);

        System.out.println("Dans le tableau de bateaux, il y a :");
        for (int i = 0; i < flotte.length; i++) {
            System.out.println("-" + flotte[i].getType());
        }
    }
}