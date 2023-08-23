package test.RelationsClassesV2.exos.LesClientsV2;

public class Livre extends Oeuvre {
    static Oeuvre[] livres = new Oeuvre[100];
    private int nbPages;

    public Livre(int choix) {
        choix = 2;
        toutLesLivres();

    }

    public int getNbPages() {
        return nbPages;
    }

    public String toutLesLivres() {
        int nb = getNbLivre();
        String ret = "";
        for (int i = 0; i < nb; i++) {
            ret = "- " + livres[i].getLivre() + "\r\n";
        }
        return ret;
    }

}
