package test.RelationsClassesV2.exos.LesClientsV22;

public class Commande {
    private String nom;
    private int numCli;

    private String titre;
    private String auteur;
    private int particularite;

    private int numClient;
    private int numOeuvre;

    public Commande(String nom, String titre, String auteur, int particularite) {
        this.nom = nom;

        this.titre = titre;
        this.auteur = auteur;
        this.particularite = particularite;
    }

    public String getInfoCommande(int categories) {
        String ret = "Manque d'info";
        if (categories == 1) {
            ret = this.nom + ": \n\r LIVRE | " + this.titre + " de "
                    + this.auteur + " (" + this.particularite + " pages)";
        } else if (categories == 2) {
            ret = this.nom + ": \n\r VIDEO | " + this.titre + " de "
                    + this.auteur + " (" + this.particularite + " minutes)";
        }

        return "-- Commandes -- \n\r * Commande de " + ret;
    }

    public Commande(int numClient, int numOeuvre) {
        this.numClient = numClient;
        this.numOeuvre = numOeuvre;
    }

}
