package test.LesElementsAbstraits.exos;

import java.time.LocalDate;

public abstract class CylcleElectrique extends LaLocationDeCycles {
    private int nbKilometreAutonomie;

    public CylcleElectrique(String marque, String modele, LocalDate dateAchat, int nbKilometreAutonomie) {
        super(marque, modele, dateAchat);
        this.nbKilometreAutonomie = nbKilometreAutonomie;
    }

    public int getNbKilometreAutonomie() {
        return this.nbKilometreAutonomie;
    }

    public String getInfo() {
        return super.getInfo() + this.getNbKilometreAutonomie() + " km d'autonomie";
    }

}
