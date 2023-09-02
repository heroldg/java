package test.LesElementsAbstraits.exos;

import java.time.LocalDate;

public class Velos extends LaLocationDeCycles {
    private int nombreDeVitesse;

    public Velos(String marque, String modele, int tarif, LocalDate dateAchat, int nombreDeVitesse) {
        super(marque, modele, tarif, dateAchat);

        this.nombreDeVitesse = nombreDeVitesse;
    }

    public int getNombreDeVitesse() {
        return this.nombreDeVitesse;
    }

    @Override

    public String getInfo() {
        return "Vélo " + getNombreDeVitesse() + " vitesse" + super.getInfo();
    }
}
