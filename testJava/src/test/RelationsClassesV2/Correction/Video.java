package test.RelationsClassesV2.Correction;

public class Video extends Oeuvre {

    private int dureeMinutes;

    public Video(String titre, String auteur, int dureeMinutes) {
        super(titre, auteur);
        this.dureeMinutes = dureeMinutes;

    }

    public int getDureeMinutes() {
        return this.dureeMinutes;
    }

    @Override

    public String getInfo() {
        return "Video " + super.getInfo() + " (" + this.getDureeMinutes() / 60 + " h " + this.getDureeMinutes() % 60
                + ")";
    }

}
