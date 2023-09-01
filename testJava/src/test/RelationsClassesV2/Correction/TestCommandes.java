package test.RelationsClassesV2.Correction;

import java.util.Scanner;

import test.POO.Clients132.Client;

public class TestCommandes {
    private static final int MAX = 100;
    private static final int QUITTER = 6;
    private static Client[] clients = new Client[MAX];
    private static Oeuvre[] oeuvres = new Oeuvre[MAX];
    private static Commande[] commandes = new Commande[MAX];

    private static int nbOeuvres = 0;
    private static int nbCommandes = 0;
    private static int nb, saisie, nbPages, duree;
    private static String nom, titre, auteur;
    private static Commande com;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while (saisie != QUITTER) {
            System.out.println(Client.getMenu());
            saisie = console.nextInt();
            nb = Client.getNbClients();
            console.nextLine();

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

                    saisie = console.nextInt();
                    console.nextLine();
                    System.out.println("Titre ?");
                    titre = console.nextLine();
                    System.out.println("Auteur ?");
                    auteur = console.nextLine();

                    if (saisie == 1) {
                        System.out.println("Nombre de pages ?");
                        nbPages = console.nextInt();
                        oeuvres[nbOeuvres] = new Livre(titre, auteur, nbPages);

                    } else if (saisie == 2) {
                        System.out.println("Durée (minutes) ?");
                        duree = console.nextInt();
                        oeuvres[nbOeuvres] = new Video(titre, auteur, duree);
                    }

                    System.out.println(oeuvres[nbOeuvres].getInfo() + " ajouté");
                    nbOeuvres++;

                    break;

                case 4:

                    System.out.println("Pour quel client ?");
                    System.out.println();
                    System.out.println("-- Clients --");

                    for (int i = 0; i < nb; i++) {
                        System.out.println(i + 1 + " - " + clients[i].getNom());
                    }
                    saisie = console.nextInt() - 1;
                    com = new Commande(clients[saisie]);

                    while (saisie != nbOeuvres) {

                        System.out.println("Quelle oeuvre à ajouter à la commande ?");
                        for (int i = 0; i < nbOeuvres; i++) {
                            System.out.println(i + 1 + " - " + oeuvres[i].getInfo());
                        }
                        System.out.println((nbOeuvres + 1) + " - Terminer la commande");
                        saisie = console.nextInt() - 1;
                        if (0 <= saisie && saisie < nbOeuvres) {
                            com.ajouter(oeuvres[saisie]);
                        }
                    }
                    commandes[nbCommandes] = com;
                    nbCommandes = nbCommandes + 1;

                    break;

                case 5:
                    System.out.println(" -- COMMANDE --");
                    for (int i = 0; i < nbCommandes; i++) {
                        System.out.println(" * " + commandes[i].GetInfo());

                    }
                    break;

                default:
                    break;
            }
        }
        console.close();
    }

}
