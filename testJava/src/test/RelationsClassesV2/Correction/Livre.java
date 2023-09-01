package test.RelationsClassesV2.Correction;

public class Livre extends Oeuvre {

    private int nbPages;

    public Livre(String titre, String auteur, int nbPages) {
        super(titre, auteur);
        // TODO Auto-generated constructor stub
        this.nbPages = nbPages;
    }

    public int getNbPages() {
        return this.nbPages;
    }

    @Override

    public String getInfo() {
        return "Livre " + super.getInfo() + " (" + this.getNbPages() + " pages)";
    }

}
