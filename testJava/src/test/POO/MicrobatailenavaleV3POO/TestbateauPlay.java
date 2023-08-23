package test.POO.MicrobatailenavaleV3POO;

import java.util.Random;
import java.util.Scanner;

public class TestbateauPlay {

    public static void main(String[] args) {
        Grille grilleDeJeu = new Grille();
        Scanner console = new Scanner(System.in);

        grilleDeJeu.afficher();

        System.out.println();
        System.out.println("BATEAU COMPUTER");
        System.out.println("LATITUDE:");
        int lat = console.nextInt() - 1;
        System.out.println("LONGITUDE:");
        int longi = console.nextInt() - 1;

        grilleDeJeu.computerBateau(lat, longi);
        grilleDeJeu.afficher();

        System.out.println();
        System.out.println("BATEAU PLAYER");
        System.out.println("LATITUDE:");
        lat = console.nextInt() - 1;
        System.out.println("LONGITUDE:");
        longi = console.nextInt() - 1;

        grilleDeJeu.playerBateau(lat, longi);
        grilleDeJeu.afficher();

        System.out.println();
        System.out.println("Tir du player");
        System.out.println("LATITUDE:");
        lat = console.nextInt() - 1;
        System.out.println("LONGITUDE:");
        longi = console.nextInt() - 1;

        grilleDeJeu.tirer(lat, longi);
        grilleDeJeu.afficher();

        System.out.println();
        System.out.println("Tir du Computer");
        Random rLat = new Random();
        Random rLongi = new Random();
        lat = (int) (0 + rLat.nextInt(9));
        longi = (int) (0 + rLongi.nextInt(9));

        grilleDeJeu.tirerComputer(lat, longi);
        grilleDeJeu.afficher();

        console.close();
    }
}
