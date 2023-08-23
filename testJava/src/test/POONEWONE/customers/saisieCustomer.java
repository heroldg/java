package test.POONEWONE.customers;

import java.util.Scanner;

public class saisieCustomer {
    public static void main(String[] args) {
        int choix = 0;
        final int MAX = 100;
        Scanner console = new Scanner(System.in);
        customers[] AllCustomers = new customers[MAX];
        int nbCustomers = 0;
        String saisie;

        do {
            customers.afficherMenu();
            choix = console.nextInt();
            console.nextLine(); // Permet de lire la nouvelle ligne restant dans le deuxieme doix du switch

            switch (choix) {
                case 1:
                    if (nbCustomers == MAX) {
                        System.out.println("La liste de client à atteint son maximum.");
                    } else {
                        System.out.println("Liste de client:");

                    }

                    for (int i = 0; i < nbCustomers; i++) {
                        System.out.println(
                                "- Client N°" + AllCustomers[i].getNumCustomer() + " " + AllCustomers[i].getName());
                    }

                    break;

                case 2:

                    System.out.println("Indiquez le prénom et le nom du client à ajouter:");

                    saisie = console.nextLine();

                    AllCustomers[nbCustomers] = new customers(saisie);
                    AllCustomers[nbCustomers].setNumCustomer(nbCustomers + 1);
                    nbCustomers++;

                    break;

                default:
                    break;
            }
        } while (choix != 3 && nbCustomers < MAX);

        if (nbCustomers == MAX) {
            System.out.println("La liste de client à atteint son maximum");
        } else {
            System.out.println("Liste de clients :");
        }

        for (int i = 0; i < nbCustomers; i++) {
            System.out.println("- Clients N°" + AllCustomers[i].getNumCustomer() + " " + AllCustomers[i].getName());
            System.out.println();
        }

        System.out.println("fin");

        console.close();
    }
}
