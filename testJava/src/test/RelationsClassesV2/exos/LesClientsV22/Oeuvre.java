package test.RelationsClassesV2.exos.LesClientsV22;

public class Oeuvre {
    private String titre;
    private String auteur;
    private int particularite;
    private int numOeuvre;

    private static int nbOeuvres = 0;

    public Oeuvre(String titre, String auteur, int particularite) {
        this.titre = titre;
        this.auteur = auteur;
        this.particularite = particularite;
        nbOeuvres = nbOeuvres + 1;
        this.numOeuvre = nbOeuvres;
    }

    public String getInfoOeuvre(int categories) {
        String ret = "Manque d'information";
        if (categories == 1) {
            ret = "LIVRE | " + this.numOeuvre + " - " + this.titre + " de " + this.auteur + " (" + this.particularite
                    + " pages)";
        } else if (categories == 2) {
            ret = "VIDÉO | " + this.numOeuvre + " - " + this.titre + " de " + this.auteur + " (" + this.particularite
                    + " minutes)";
        }

        return ret;
    }

    public static int getnbOeuvres() {
        return nbOeuvres;
    }

}
