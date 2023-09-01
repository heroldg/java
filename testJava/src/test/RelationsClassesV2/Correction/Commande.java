package test.RelationsClassesV2.Correction;

import test.POO.Clients132.Client;

public class Commande {
    private final int MAX_OEUVRES = 10;
    private Oeuvre[] oeuvreCommandees = new Oeuvre[MAX_OEUVRES];
    private int nbOeuvres = 0;
    private Client cli;

    Commande(Client cli) {
        this.cli = cli;
    }

    public void ajouter(Oeuvre o) {
        this.oeuvreCommandees[this.nbOeuvres] = o;
        this.nbOeuvres = this.nbOeuvres + 1;
    }

    public String GetInfo() {
        String r;
        int j;
        r = "commande de " + this.cli.getNom() + " : \n\r";
        for (j = 0; j < nbOeuvres; j++) {
            r += " - " + this.oeuvreCommandees[j].getInfo() + "\n\r";
        }

        return r;
    }

}
