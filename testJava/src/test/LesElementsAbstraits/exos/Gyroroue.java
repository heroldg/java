package test.LesElementsAbstraits.exos;

import java.time.LocalDate;

public class Gyroroue extends CylcleElectrique {
    private double prixHeureGyroroue = 18.90;

    public Gyroroue(String marque, String modele, LocalDate dateAchat, int nbKilometreAutonomie) {
        super(marque, modele, dateAchat, nbKilometreAutonomie);

    }

    @Override
    public double getTarif() {
        return prixHeureGyroroue;
    }

    @Override

    public String getInfo() {
        return "Gyroroue " + super.getInfo() + " |" + this.getTarif() + "/heure";
    }
}
