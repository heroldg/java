package test.POO.Clients132;

public class Client {

    // Les attributs d'instance
    private String nom;
    private int numCli;
    private static int nbClients = 0;

    // Déclaration constructeur
    public Client(String nom) {
        this.nom = nom;
        nbClients = nbClients + 1;
        this.numCli = nbClients;
    }

    // fonction getters
    public String getInfo() {

        return "Client n°" + this.numCli + " [ " + this.nom + " ]";
    }

    // Getters

    public static int getNbClients() {
        return nbClients;
    }

    public static String getMenu() {
        return "   Menu   \n\r 1 - Afficher les clients  \n\r 2 - Cr\u00E9er un client\r\n 3 - Créer une oeuvre\r\n 4 - Créer une commande \r\n Afficher les commandes \r\n Quitter";

    }

}
