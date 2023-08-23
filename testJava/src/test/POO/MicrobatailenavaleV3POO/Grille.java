package test.POO.MicrobatailenavaleV3POO;

public class Grille {

    // Attribut d'instance de type tableau 10 x 10
    private static final char[][] Ocean = new char[10][10];

    // Les attributs d'instance
    private int latitude;
    private int longitude;

    // Constante
    private static final char eau = '~';
    private static final char logoBotComputer = 'B';
    private static final char logoBotPlayer = 'O';
    public static final int COULE = 1;
    public static final int longueur = 1;

    // Un attibut de class
    private static char symbolesTouche = 'X';

    // Remplir d'eau toutes les cases accesibles pour les bateaux
    Grille() {
        for (int i = 0; i < Ocean.length; i++) {
            for (int j = 0; j < Ocean.length; j++) {
                Ocean[i][j] = eau;
            }
        }
    }

    // Affiche toutes les cases avec les informations necessaires
    public void afficher() {
        // Prèsentation du tableau
        System.out.println("  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10|");
        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print((i + 1) + " |");
            } else {
                System.out.print((i + 1) + "|");

            }
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + Ocean[i][j]);
                System.out.print(" |");

            }

            System.out.println();

        }
    }

    // Méthode d'instance pour deposer Bateau de l'ordinateur (computeur)
    public void computerBateau(int latitude, int longitude) {

        Ocean[latitude][longitude] = logoBotComputer;

    }

    // Méthode d'instance déposer Bateau du joueur
    public void playerBateau(int latitude, int longitude) {
        Ocean[latitude][longitude] = logoBotPlayer;
    }

    public void tirerComputer(int latitude, int longitude) {

        Ocean[latitude][longitude] = symbolesTouche;

    }

    // Méthode d'instance tirer
    public int tirer(int latitude, int longitude) {

        Ocean[this.latitude][this.longitude] = symbolesTouche;
        int bateauCoule = 0;

        if (Ocean[this.latitude][this.longitude] == logoBotComputer && Ocean[latitude][longitude] == symbolesTouche) {
            bateauCoule = 1;
            System.out.println("Le bateau B est coulé");
        } else {
            bateauCoule = 0;
            System.out.println("Le bateau B n'est pas coulé " + Ocean[this.latitude][this.longitude]);
        }

        return bateauCoule;

    }

}
