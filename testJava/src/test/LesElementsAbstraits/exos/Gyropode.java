package test.LesElementsAbstraits.exos;

import java.time.LocalDate;

public class Gyropode extends CylcleElectrique {

    public Gyropode(String marque, String modele, int tarif, LocalDate dateAchat, int nbKilometreAutonomie) {
        super(marque, modele, tarif, dateAchat, nbKilometreAutonomie);
    }

    public String getinfo() {
        return "Gyropode " + getNbKilometreAutonomie() + " kilomètres d'autonomie " + super.getInfo();
    }

}
