package test.RelationsClassesV2.exos.LesDes;

import java.util.Scanner;

public class PLayDeuxJoueurDe {
    public static final int Seuil = 20;
    public static int pointJoueur = 10;
    public static int pointadversaire = 10;

    public static void main(String[] args) {

        JoueurBataille De = new JoueurBataille();
        Scanner console = new Scanner(System.in);
        System.out.println("Nom du joueur ?");
        String joueur = console.nextLine();

        System.out.println("Nom du joueur ?");
        String adversaire = console.nextLine();

        do {

            int resultatDeJoueur = De.lancerJoueur(joueur);
            int resultatDeAdversaire = De.lancerJoueur(adversaire);

            if (resultatDeJoueur == resultatDeAdversaire) {
                System.out.println();
                System.out.println(adversaire + " égalité");
                System.out.println();

            } else if (resultatDeJoueur > resultatDeAdversaire) {
                pointJoueur++;
                pointadversaire--;

                System.out.println();
                System.out.println(joueur + " gagne");

            } else if (resultatDeAdversaire > resultatDeJoueur) {
                pointadversaire++;
                pointJoueur--;

                System.out.println();
                System.out.println(adversaire + " gagne");

            }

            System.out.print(joueur + " :" + pointJoueur + "| " + adversaire + " :" + pointadversaire);
            System.out.println();

        } while (pointJoueur != 0 && pointadversaire != 0);

        console.close();
    }
}
