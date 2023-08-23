package test.POO.LesClients;

import java.util.Scanner;

public class TestSaisirEtAffichage {
    public static void main(String[] args) {
        int choix = 0;
        final int MAX = 100;
        Scanner console = new Scanner(System.in);
        Clients[] allClients = new Clients[MAX];
        int nbClient = 0;
        String saisie;

        do {
            System.out.println("----MENU----");
            System.out.println("1 - Liste de Client");
            System.out.println("2 - Ajouter un client [prenom] [nom]");
            System.out.println("3 - Quitter");
            choix = console.nextInt();
            console.nextLine(); // Permet de lire la nouvelle ligne restante dans le deuxieme choix du Switch

            switch (choix) {
                case 1:
                    if (nbClient == MAX) {
                        System.out.println("LA liste de client à atteint son maximum:");
                    } else {
                        System.out.println("Liste de cLients :");
                    }

                    for (int i = 0; i < nbClient; i++) {
                        System.out
                                .println("- Client N°" + allClients[i].getNumClient() + " " + allClients[i].getName());
                    }

                    break;

                case 2:

                    System.out.println("Indiquez le prénom et le nom du client à ajouter:");

                    saisie = console.nextLine();

                    allClients[nbClient] = new Clients(saisie);
                    allClients[nbClient].setNumClient(nbClient + 1);
                    nbClient++;

                default:
                    break;
            }
        } while (choix != 3 && nbClient < MAX);

        if (nbClient == MAX) {
            System.out.println("LA liste de client à atteint son maximum:");
        } else {
            System.out.println("Liste de clients :");
        }

        for (int i = 0; i < nbClient; i++) {
            System.out
                    .println("- Client N°" + allClients[i].getNumClient() + " " + allClients[i].getName());
            System.out.println();
        }
        System.out.println("Fin ");

        console.close();
    }

}

// int choix = 0;
// Scanner console = new Scanner(System.in);
