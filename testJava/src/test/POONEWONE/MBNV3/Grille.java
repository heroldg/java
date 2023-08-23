package test.POONEWONE.MBNV3;

public class Grille {
    // attribut d'instance de type tableau
    char Tab[][] = new char[10][10];

    // attribut d'instance de type integer
    // private int latitude;
    // private int longitude;

    // attribut d'instance de type character qui represente le bateau
    private char bateau = 'B';

    // Constante
    private final char EAU = '~';

    // attribut de classe
    private final char symboleTir = 'x';

    // Constructeur permettant d'initialiser la grille avec de l'eau à toute les
    // cases

    Grille() {
        for (int i = 0; i < Tab.length; i++) {
            for (int j = 0; j < Tab.length; j++) {
                Tab[i][j] = EAU;
            }
        }
    }

    public void deposerBateau(int latitude, int longitude) {
        Tab[latitude][longitude] = bateau;
    }

    public boolean tirer(int latitude, int longitude) {
        boolean bateauCoule;

        if (Tab[latitude][longitude] == bateau) {
            bateauCoule = true;
            Tab[latitude][longitude] = symboleTir;
            afficher();
            System.out.println("Le bateau " + bateau + " est coulé");

        } else {

            bateauCoule = false;
            Tab[latitude][longitude] = symboleTir;
            afficher();
            System.out.println("Le bateau " + bateau + " sain et sauf");
        }

        return bateauCoule;
    }

    // affiche le plateau de jeu de la bataille navale
    public void afficher() {
        System.out.println("  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10|");
        for (int i = 0; i < Tab.length; i++) {
            if (i < 9) {
                System.out.print((i + 1) + " |");

            } else {
                System.out.print((i + 1) + "|");
            }

            for (int j = 0; j < Tab.length; j++) {
                System.out.print(" " + Tab[i][j] + " |");

            }

            System.out.println();

        }
    }

}
/*
 * Si vous souhaitez affichez la case que vous assez tirer avec un decalage d'un
 * coup
 * public boolean tirer(int latitude, int longitude) {
 * boolean bateauCoule;
 * 
 * if (Tab[latitude][longitude] == bateau) {
 * bateauCoule = true;
 * afficher();
 * System.out.println("Le bateau " + bateau + " est coulé");
 * 
 * } else {
 * 
 * bateauCoule = false;
 * afficher();
 * System.out.println("Le bateau " + bateau + " sain et sauf");
 * }
 * 
 * Tab[latitude][longitude] = symboleTir;
 * return bateauCoule;
 * }
 */