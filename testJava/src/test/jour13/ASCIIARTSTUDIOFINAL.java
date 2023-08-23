package test.jour13;

import java.util.Scanner;

public class ASCIIARTSTUDIOFINAL {
    // tableau pour stocker le dessin en ASCII art
    private static char[][] dessin = new char[10][40];

    // Méthode pour afficher le dessin en ASCII art
    public static void affichageDessin() {
        for (int i = 0; i < dessin.length; i++) {
            System.out.print(i + ".|");
            for (int j = 0; j < dessin[i].length; j++) {
                System.out.print(dessin[i][j]);
                System.out.print("|");

            }
            System.out.println();
        }
    }

    // Méthode pour dessiner un caractère à une position donnée
    public static void dessinerUnCaractere(int ligne, int colonnes, char c) {
        if (ligne >= 0 && ligne < dessin.length && colonnes >= 0 && colonnes < dessin[0][colonnes]) {
            dessin[ligne][colonnes] = c;
        } else {
            System.out.println("Position invalide !");
        }
    }

    public static void dessinerRectangle(int startLigne, int startColonne, int endLigne, int endColonne, char c) {
        if (startLigne >= 0 && startLigne < dessin.length && startColonne >= 0 && startColonne < dessin[0].length &&
                endLigne >= 0 && endLigne < dessin.length && endColonne >= 0 && endColonne < dessin[0].length &&
                startLigne <= endLigne && startColonne <= endColonne) {
            for (int i = startLigne; i <= endLigne; i++) {
                for (int j = startColonne; j <= endColonne; j++) {
                    dessin[i][j] = c;
                }
            }
        } else {
            System.out.println("Positions invalides !");
        }
    }

    // Méthode pour changer "la couleur" (c'est-à-dire le caractère) en utilisant un
    // pot de peinture
    public static void changerDeColor(int ligne, int colonne, char newChar) {
        if (ligne >= 0 && ligne < dessin.length && colonne >= 0 && colonne < dessin[0].length) {
            char oldChar = dessin[ligne][colonne];
            remplissage(ligne, colonne, oldChar, newChar);

        } else {
            System.out.println("Position invalide !");
        }
    }

    // Méthode de remplissage par dissusion (flood fill)
    private static void remplissage(int ligne, int colonne, char oldChar, char newChar) {
        if (ligne >= 0 && ligne < dessin.length && colonne >= 0 && colonne < dessin[0].length
                && dessin[ligne][colonne] == oldChar && dessin[ligne][colonne] != newChar) {
            dessin[ligne][colonne] = newChar;
            remplissage(ligne - 1, colonne, oldChar, newChar); // haut
            remplissage(ligne + 1, colonne, oldChar, newChar); // bas
            remplissage(ligne, colonne - 1, oldChar, newChar); // gauche
            remplissage(ligne, colonne + 1, oldChar, newChar); // droite
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char choice;
        char c;
        int startLigne, startColonne, endLigne, endColonne;
        char newChar;

        // initialisation du tableau de dessin avec des caractères espace
        for (int i = 0; i < dessin.length; i++) {
            for (int j = 0; j < dessin[i].length; j++) {
                dessin[i][j] = ' ';
            }
        }

        // Affichage du dessin initial
        System.out.println("dessin en ASCII art :");
        affichageDessin();

        // Menu pour les fonctionnalités
        do {
            System.out.println("\nMenu");
            System.out.println("1. Dessiner un caractère");
            System.out.println("2. Dessiner un rectangle");
            System.out.println("3. Changer la couleur");
            System.out.println("4. Quitter");
            System.out.print("Choix : ");
            choice = console.next().charAt(0);

            switch (choice) {
                case '1':
                    System.out.print("Entrez la ligne : ");
                    int ligne = console.nextInt();
                    System.out.print("Entre la colonne : ");
                    int colonne = console.nextInt();
                    System.out.print("Entrez le caractère : ");
                    c = console.next().charAt(0);
                    dessinerUnCaractere(ligne, colonne, c);
                    affichageDessin();

                    break;

                case '2':
                    System.out.print("Entrez la ligne de départ : ");
                    startLigne = console.nextInt();
                    System.out.print("ENtrez la colonne de départ : ");
                    startColonne = console.nextInt();
                    System.out.print("Entrez la ligne de fin : ");
                    endLigne = console.nextInt();
                    System.out.println("Entre la colonne de fin : ");
                    endColonne = console.nextInt();
                    System.out.print("Entrez le caracère : ");
                    c = console.next().charAt(0);
                    dessinerRectangle(startLigne, startColonne, endLigne, endColonne, c);
                    affichageDessin();

                default:
                    break;

                case '3':
                    System.out.print("Entrez la ligne : ");
                    ligne = console.nextInt();
                    System.out.print("Entrez la colonne : ");
                    colonne = console.nextInt();
                    System.out.print("Entrez le nouveau caractère : ");
                    newChar = console.next().charAt(0);
                    changerDeColor(ligne, colonne, newChar);
                    affichageDessin();
            }

        } while (choice != '4');

        console.close();
    }

}
