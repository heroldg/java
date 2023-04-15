package test.jour13;

import java.util.Scanner;

public class ASCIIArtStudio {
    public static int COLONNES = 4;
    public static int LIGNES = 10;
    public static final char tab[][] = new char[LIGNES][COLONNES];
    public static final char espace = ' ';

    public static void main(String[] args) {
        // initialiserTab();
        int forme = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("1 - Un nouveau caractère");
        System.out.println("2 - Rectangle");
        System.out.println("3 - Quitter");

        forme = console.nextInt();

        while (forme != 3) {
            switch (forme) {
                case 1:
                    newCaractere();

                    System.out.println("1 - Un nouveau caractère");
                    System.out.println("2 - Rectangle");
                    System.out.println("3 - Quitter");
                    forme = console.nextInt();
                    break;
                case 2:
                    rectangle();
                    System.out.println("1 - Un nouveau caractère");
                    System.out.println("2 - Rectangle");
                    System.out.println("3 - Quitter");
                    forme = console.nextInt();

                    break;

                default:
                    break;
            }
        }
        System.out.println("Fin merci");
        console.close();
    }

    // public static void initialiserTab() {

    // System.out.print(" |0|1|2|3|");
    // System.out.println();
    // for (int index = 0; index < LIGNES; index++) {
    // System.out.print((index) + ".|");

    // for (int i = 0; i < COLONNES; i++) {
    // tab[i][i] = espace;
    // System.out.print(tab[i][i]);
    // System.out.print("|");
    // }
    // System.out.println();
    // }
    // }

    public static void newCaractere() {

        System.out.println("Saissisez un caractère à dessiner");
        Scanner console = new Scanner(System.in);
        char newCar = console.next().charAt(0);

        System.out
                .println("Vous souhaitez dessiner le caractère " + newCar + " sur la colonnes[chiffre entre 0 et 3]:");
        int coordonneesX = console.nextInt();

        System.out.println("Et sur la ligne[chiffre entre 0 et 9]:");
        int coordonneesY = console.nextInt();

        tab[coordonneesY][coordonneesX] = newCar;

        System.out.print("  |0|1|2|3|");
        System.out.println();

        for (int a = 0; a < LIGNES; a++) {
            System.out.print(a + ".|");

            for (int b = 0; b < COLONNES; b++) {
                if (tab[a][b] == newCar) {
                    System.out.print(tab[a][b] = newCar);
                    System.out.print("|");
                } else if (tab[a][b] == espace) {
                    System.out.print(tab[a][b]);
                    System.out.print("|");

                } else {
                    // char options = '?';
                    System.out.print(tab[a][b] = espace);
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }

    public static void rectangle() {
        System.out.println("Saissisez un caractère à dessiner pour le rectangle");
        Scanner console = new Scanner(System.in);
        char newCar = console.next().charAt(0);

        System.out.println("Vous souhaitez que le dessin du rectangle " + newCar + " commence sur la ligne:");
        int ligneStart = console.nextInt();

        System.out.println("Et finisse sur la ligne:");
        int ligneEnd = console.nextInt();

        tab[ligneStart][0] = newCar;
        tab[ligneStart][1] = newCar;
        tab[ligneStart][2] = newCar;
        tab[ligneStart][3] = newCar;

        tab[ligneEnd][0] = newCar;
        tab[ligneEnd][1] = newCar;
        tab[ligneEnd][2] = newCar;
        tab[ligneEnd][3] = newCar;

        System.out.print("  |0|1|2|3|");
        System.out.println();

        for (int a = 0; a < LIGNES; a++) {
            if (a > ligneStart && a < ligneEnd) {
                tab[a][0] = newCar;
                tab[a][3] = newCar;
            }
            System.out.print(a + ".|");

            for (int b = 0; b < COLONNES; b++) {
                if (tab[a][b] == newCar) {
                    System.out.print(tab[a][b]);

                } else {

                    System.out.print(tab[a][b] = espace);
                }

                System.out.print("|");

            }
            System.out.println();
        }
    }

    public static void colorChange() {

    }

}
