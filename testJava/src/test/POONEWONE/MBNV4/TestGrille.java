package test.POONEWONE.MBNV4;

import java.util.Scanner;
import java.util.Random;

public class TestGrille {
    public static void main(String[] args) {
        GrilleComputer plateauComputer = new GrilleComputer();
        GrillePlayer plateauPlayer = new GrillePlayer();
        Scanner console = new Scanner(System.in);

        String namePlayer;

        int lat;
        int longi;

        System.out.println("L'adversaire à placé son Bateau:");
        Random rLat = new Random();
        Random rLongi = new Random();
        lat = (int) (0 + rLat.nextInt(9));
        longi = (int) (0 + rLongi.nextInt(9));

        plateauComputer.deposerBateau(lat, longi);
        plateauComputer.afficher();

        System.out.println("Votre nom:");
        namePlayer = console.nextLine();

        System.out.println(namePlayer + "Sélectionne la LATITUDE de votre bateau:");
        lat = console.nextInt() - 1;
        System.out.println(namePlayer + "Sélectionne la LONGITUDE de votre:");
        longi = console.nextInt() - 1;
        System.out.println(namePlayer + " à  placé son Bateau");
        plateauPlayer.deposerBateau(lat, longi);
        plateauPlayer.afficher();

        do {
            System.out.println();
            System.out.println("Tir de " + namePlayer);
            System.out.println("Sélectionne la LATITUDE:");
            lat = console.nextInt() - 1;
            System.out.println("Sélectionne la LONGITUDE");
            longi = console.nextInt() - 1;

            boolean bateauCoule = plateauComputer.tirer(lat, longi);
            if (bateauCoule) {
                break;
            }

            System.out.println();
            System.out.println("Tir de l'ordinateur");
            System.out.println("Sélectionne la LATITUDE:");
            lat = (int) (0 + rLat.nextInt(9));
            System.out.print(lat);
            System.out.println("Sélectionne la LONGITUDE");
            System.out.print(longi);
            longi = (int) (0 + rLongi.nextInt(9));

            bateauCoule = plateauPlayer.tirer(lat, longi);
            if (bateauCoule) {
                break;
            }

        } while (true);

        console.close();
    }
}
