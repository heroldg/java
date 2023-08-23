package test.POONEWONE.batailleNavale;

import test.POO.batailleNavale.BATEAU;

public class TestTableauBateaux {
    public static void main(String[] args) {
        BATEAU[] flotte = new BATEAU[3];
        // for (int i = 0; i < flotte.length; i++) {
        // flotte[i] = new BATEAU("Croiseur", 4);
        // }
        flotte[0] = new BATEAU("Croiseur", 4);
        flotte[1] = new BATEAU("Porte-avions", 5);
        flotte[2] = new BATEAU("Sous-marin", 3);

        System.out.println("Dans le tableau de bateaux, il y a :");
        for (int i = 0; i < flotte.length; i++) {
            System.out.println("-" + flotte[i].getType());
        }
    }
}
