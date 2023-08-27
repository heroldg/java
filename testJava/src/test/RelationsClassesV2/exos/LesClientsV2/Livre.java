package test.RelationsClassesV2.exos.LesClientsV2;

public class Livre extends Oeuvre {
    static Oeuvre[] livres = new Oeuvre[100];
    private int nbPages;
    int nb = 0;

    public Livre(int choix) {
        choix = 2;
        toutLesLivres();

    }

    public Livre() {
        initialiser(getTitre(), getAuteur(), nbPages);
        this.getLivre();
        livres[nb].getLivre();
    }

    public int getNbPages() {
        return nbPages;
    }

    public String toutLesLivres() {
        int nb = getNbLivre();
        String ret = "";
        if (nb == 0) {
            ret = "Il n'y a pas de livre à la commande";
        } else {

            System.out.println("Toutes la Catégories livre: ");
            for (int i = 0; i < nb; i++) {
                ret = "- " + livres[i].getLivre() + "\r\n";
            }
        }
        return ret;
    }

}
