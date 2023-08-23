package test.jour13;

import java.util.Scanner;

public class peint {
    public static int l = 6;
    public static int h = 7;
    public static final int image[][] = new int[l][h];
    /*
     * Saisit les coordonnées d'un point et une nouvelle couleur
     * puis remplace l'ancienne couleur par la nouvelle pour le point ainsi que pour
     * les cases adjacentes
     */

    int x, y, nouvelleCouleur, ancienneCouleur;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Coordonnée x");
        int x = console.nextInt();

        System.out.println("Coordonnée y");
        int y = console.nextInt();

        System.out.println("Nouvelle couleur");

        if (x >= 0 && x < l && y >= 0 && y < h) {
            // ancienneCouleur != nouvellecouleur;
            // ancienneCouleur = image[y][x];
        } else {
            System.out.println("Les coordonnées du point sont hors de l'image");
        }

        peintRec(x, y, image, y, y, x, y);
        console.close();
    }

    public static void peintRec(int x, int y, int image[][], int h, int l, int ancienneCouleur, int nouvelleCouleur) {
        // Remplace l'ancienne couleur par la nouvelle pour le point de coordonnées
        // (x;y) ainsi que pour les cases adjacentes

        if (x > 0 && x < l && y >= 0 && y < h) {
            if (image[y][x] == ancienneCouleur) {

                image[y][x] = nouvelleCouleur;

                peintRec(x - 1, y, image, h, l, ancienneCouleur, nouvelleCouleur);
                peintRec(x + 1, y, image, h, l, ancienneCouleur, nouvelleCouleur);
                peintRec(y - 1, y, image, h, l, ancienneCouleur, nouvelleCouleur);
                peintRec(y + 1, y, image, h, l, ancienneCouleur, nouvelleCouleur);
            }
        }
    }

}
