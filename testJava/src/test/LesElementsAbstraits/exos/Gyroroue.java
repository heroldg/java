package test.LesElementsAbstraits.exos;

import java.time.LocalDate;

public class Gyroroue extends CylcleElectrique {
    private int tailleMinimale;

    public Gyroroue(String marque, String modele, int tarif, LocalDate dateAchat, int nbKilometreAutonomie,
            int tailleMinimale) {
        super(marque, modele, tarif, dateAchat, nbKilometreAutonomie);
        this.tailleMinimale = tailleMinimale;

    }

    public int getTailleMinimale() {
        return this.tailleMinimale;
    }

    @Override

    public String getInfo() {
        return "Gyroroue avec " + getNbKilometreAutonomie() + "(" + getTailleMinimale() + " cm) " + super.getInfo();
    }
}
