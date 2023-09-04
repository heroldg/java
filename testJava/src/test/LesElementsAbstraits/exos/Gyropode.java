package test.LesElementsAbstraits.exos;

import java.time.LocalDate;

public class Gyropode extends CylcleElectrique {
    private double prixHeureGyropode = 9.90;
    private int tailleMinimale;

    public Gyropode(String marque, String modele, LocalDate dateAchat, int nbKilometreAutonomie, int tailleMinimale) {
        super(marque, modele, dateAchat, nbKilometreAutonomie);
        this.tailleMinimale = tailleMinimale;

    }

    public int getTailleMinimale() {
        return this.tailleMinimale;
    }

    @Override
    public double getTarif() {
        return prixHeureGyropode;
    }

    @Override
    public String getInfo() {
        return "Gyropode " + super.getInfo() + "("
                + getTailleMinimale() + " cm minimum) | " + this.getTarif() + "/heure";

    }

}
