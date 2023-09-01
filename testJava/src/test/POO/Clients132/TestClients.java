package test.POO.Clients132;

import java.util.Scanner;

import test.RelationsClassesV2.exos.LesClientsV22.Commande;
import test.RelationsClassesV2.exos.LesClientsV22.Oeuvre;

public class TestClients {
    final static int MAX_CLIENTS = 100;
    final static int QUIITER = 6;
    static String nom;
    static Client[] clients = new Client[MAX_CLIENTS];
    static Oeuvre[] oeuvres = new Oeuvre[100];
    static String[][] clientAndOeuvres = new String[100][100];
    static String[][] commandes = new String[100][100];
    static int[] CHOIX = new int[100];
    static int i, nb;
    static int saisie;

    static String titre;
    static String auteur;
    static int particularite;
    static int nbOeuvres;
    static int oeuvreCommande = 0;
    static int clientCommande = 0;

    public static void main(String[] args) {
        int choix = 0;
        Scanner console = new Scanner(System.in);

        while (saisie != QUIITER) {

            System.out.println(Client.getMenu());
            saisie = console.nextInt();
            console.nextLine(); // Cette ligne est présente pour faire en sorte que la ligne 39 -> nom =
                                // console.nextLine() puisse être lu
            nb = Client.getNbClients();
            nbOeuvres = Oeuvre.getnbOeuvres();

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
                    break;

                case 3:

                    System.out.println("Type:");
                    System.out.println("1 - Livre");
                    System.out.println("2 - Video");

                    choix = console.nextInt();

                    if (choix == 1) {
                        // Perhaps made a method instance of this few lines of codes
                        System.out.println("Titre  du livre ?");
                        console.nextLine();
                        titre = console.nextLine();
                        System.out.println("Auteur ?");
                        auteur = console.nextLine();
                        System.out.println("Nombres de pages ?");
                        particularite = console.nextInt();
                        oeuvres[nbOeuvres] = new Oeuvre(titre, auteur, particularite);
                        System.out.println(oeuvres[nbOeuvres].getInfoOeuvre(choix) + " ajouté");
                        CHOIX[nbOeuvres] = choix;
                        break;

                    } else if (choix == 2) {

                        // Perhaps made a method instance of this few lines of codes
                        System.out.println("Titre de la vidéo ?");
                        console.nextLine();
                        titre = console.nextLine();
                        System.out.println("Auteur ?");
                        auteur = console.nextLine();
                        System.out.println("Temps de la vidéo (minutes) ?");
                        particularite = console.nextInt();
                        oeuvres[nbOeuvres] = new Oeuvre(titre, auteur, particularite);
                        System.out.println(oeuvres[nbOeuvres].getInfoOeuvre(choix) + " ajouté");
                        CHOIX[nbOeuvres] = choix;

                        break;

                    }

                case 4:
                    System.out.println("Pour quel client ?");
                    System.out.println();
                    System.out.println("-- Clients --");

                    for (int i = 0; i < nb; i++) {
                        System.out.println(clients[i].getInfo());
                    }
                    clientCommande = console.nextInt();

                    System.out.println("Quelle oeuvre ajouter à la commande ?");
                    for (int i = 0; i < nbOeuvres; i++) {
                        System.out.println(oeuvres[i].getInfoOeuvre(CHOIX[i]));
                        System.out.println(CHOIX[i]);

                    }
                    oeuvreCommande = console.nextInt();

                    for (int i = 0; i < nb; i++) {
                        clientAndOeuvres[i][0] = clients[i].getInfo();
                        for (int j = 0; j < nbOeuvres; j++) {

                            clientAndOeuvres[i][j] = oeuvres[j].getInfoOeuvre(choix);
                        }

                    }

                    // for (int i = 0; i < nb; i++) {
                    // System.out.println(clients[i].getInfo());
                    // for (int j = 0; j < nbOeuvres; j++) {

                    // System.out.println((clientAndOeuvres[i][j]));

                    // }

                    // }

                    // il faut avoir une variable avec le nombre de commande pour un client et une
                    // seconde avec le nombre total de commande.

                    System.out.println((clients[clientCommande - 1].getInfo()));
                    System.out.println((clientAndOeuvres[clientCommande - 1][oeuvreCommande - 1]));

                    break;

                case 5:

                    for (int i = 0; i < nb; i++) {
                        System.out.println(commandes[i][0] = clientAndOeuvres[i][0]);
                        for (int j = 0; j < nbOeuvres; j++) {
                            System.out.println(clientAndOeuvres[clientCommande][oeuvreCommande]);

                        }

                    }

            }

        }

        console.close();
    }
}
