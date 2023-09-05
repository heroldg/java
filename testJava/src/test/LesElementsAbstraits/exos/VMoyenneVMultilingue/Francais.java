package test.LesElementsAbstraits.exos.VMoyenneVMultilingue;

import java.util.Scanner;

public class Francais extends VitesseMoyenne implements Traduction {
    Scanner console = new Scanner(System.in);
    double km, min, vitesse;
    String ret;

    public Francais() {

    }

    public Francais(double km, double min, double vitesse, String ret) {
        this.km = km;
        this.min = min;
        this.vitesse = vitesse;
        this.ret = ret;

    }

    @Override
    public double saisieDistance() {
        System.out.println("Saississez la distance parcourue (km) : ");
        this.km = console.nextDouble();

        return km;
    }

    @Override
    public double saisieTemps() {
        System.out.println("Saississez le temps du parcours(min) : ");
        this.min = console.nextDouble();

        return min;

    }

    @Override
    public String debutReponse() {
        ret = "La vitesse est";

        return ret;
    }

    @Override
    public String finReponse() {
        vitesse = this.saisieDistance() * (60 / this.saisieTemps());
        String formattedVitesse = String.format("%.0f", vitesse);

        return ": " + formattedVitesse + " KM/H";
    }

}
