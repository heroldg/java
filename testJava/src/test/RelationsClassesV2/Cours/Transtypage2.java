package test.RelationsClassesV2.Cours;

import test.POONEWONE.batailleNavale.Bateau;

public class Transtypage2 {

    public static void main(String[] args) {
        Bateau[] lesBateaux = new Bateau[5];

        lesBateaux[0] = new Bateau("porte-avions", 5);
        lesBateaux[1] = new Bateau("croiseur", 4);
        lesBateaux[2] = new PortesConteneurs(2, 5);
        lesBateaux[3] = new Bateau("contre-torpilleur", 3);
        lesBateaux[4] = new Bateau("sous-marin", 3);

        for (int i = 0; i < lesBateaux.length; i++) {
            System.out.println("utilise " + lesBateaux[i].getNbcasesUtilisees() + " cases");
        }
    }
}
