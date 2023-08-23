package test.POO.Clients132;

import java.util.Scanner;

import test.RelationsClassesV2.exos.LesClientsV2.Oeuvre;

public class TestClients {
    final static int MAX_CLIENTS = 100;
    final static int QUIITER = 6;
    static String nom;
    static Client[] clients = new Client[MAX_CLIENTS];
    static int i, nb;
    static int saisie;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while (saisie != QUIITER) {

            System.out.println(Client.getMenu());
            saisie = console.nextInt();
            console.nextLine(); // Cette ligne est présente pour faire en sorte que la ligne 39 -> nom =
                                // console.nextLine() puisse être lu
            nb = Client.getNbClients();

            switch (saisie) {
                case 1:

                    System.out.println("-- Clients --");
                    for (int i = 0; i < nb; i++) {
                        System.out.println(clients[i].getInfo());
                    }

                    break;

                case 2:
                    System.out.println("Nom ?");
                    nom = console.nextLine();
                    clients[nb] = new Client(nom);
                    System.out.println(clients[nb].getInfo() + " ajouté");
                default:
                    break;

                case 3:
                    System.out.println("Type ?");
                    System.out.println("1 - Video");
                    System.out.println("2 - Livre");
                    int choix = console.nextInt();

                    if (choix == 1) {
                        Oeuvre videoOeuvre = new Oeuvre(choix);
                        // Utilisez l'instance videoOeuvre comme nécessaire
                    } else if (choix == 2) {
                        Oeuvre livreOeuvre = new Oeuvre(choix);
                        // Utilisez l'instance livreOeuvre comme nécessaire
                    }
            }
        }

        console.close();
    }
}
