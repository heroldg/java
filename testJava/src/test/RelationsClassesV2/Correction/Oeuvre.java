package test.RelationsClassesV2.Correction;

public class Oeuvre {
    private String titre;
    private String auteur;

    public Oeuvre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;

    }

    public String getTitre() {
        return this.titre;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public String getInfo() {
        return this.getTitre() + " de " + this.getAuteur();
    }
}
