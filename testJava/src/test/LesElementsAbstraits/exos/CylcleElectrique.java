package test.LesElementsAbstraits.exos;

import java.time.LocalDate;

public class CylcleElectrique extends LaLocationDeCycles {
    private int nbKilometreAutonomie;

    public CylcleElectrique(String marque, String modele, int tarif, LocalDate dateAchat, int nbKilometreAutonomie) {
        super(marque, modele, tarif, dateAchat);
        this.nbKilometreAutonomie = nbKilometreAutonomie;
    }

    public int getNbKilometreAutonomie() {
        return this.nbKilometreAutonomie;
    }

}
