package test.POONEWONE.MBNV3;

import java.util.Scanner;
import java.util.Random;

public class TestGrille {

    public static void main(String[] args) {
        Grille plateauDeJeu = new Grille();
        Scanner console = new Scanner(System.in);

        int lat;
        int longi;

        plateauDeJeu.afficher();
        System.out.println();

        System.out.println("Bateau de l'adversaire");
        Random rlat = new Random();
        Random rlongi = new Random();
        lat = (int) (0 + rlat.nextInt(9));
        longi = (int) (0 + rlongi.nextInt(9));

        plateauDeJeu.deposerBateau(lat, longi);
        plateauDeJeu.afficher();

        do {
            System.out.println();
            System.out.println("Tir du joueur");
            System.out.println("Sélectionne la LATITUDE:");
            lat = console.nextInt() - 1;
            System.out.println("Sélectionne la LONGITUDE:");
            longi = console.nextInt() - 1;

            boolean bateauCoule = plateauDeJeu.tirer(lat, longi);
            if (bateauCoule) {
                break; // C'est ce break qui permet sortir de la boucle si le bateau est coulé
            }
        } while (true);

        console.close();

    }
}
