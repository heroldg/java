package test.LesElementsAbstraits.exos;

import java.time.LocalDate;

public class Velos extends LaLocationDeCycles {
    private int nombreDeVitesse;
    private double prixHeureVelo = 4.90;

    public Velos(String marque, String modele, LocalDate dateAchat, int nombreDeVitesse) {
        super(marque, modele, dateAchat);

        this.nombreDeVitesse = nombreDeVitesse;
    }

    public int getNombreDeVitesse() {
        return this.nombreDeVitesse;
    }

    @Override
    public double getTarif() {
        return prixHeureVelo;
    }

    @Override

    public String getInfo() {
        return "Vélo " + super.getInfo() + this.getNombreDeVitesse() + " vitesse |" + this.getTarif() + "/heure";
    }
}
