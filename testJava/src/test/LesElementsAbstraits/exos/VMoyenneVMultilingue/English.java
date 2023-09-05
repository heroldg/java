package test.LesElementsAbstraits.exos.VMoyenneVMultilingue;

import java.util.Scanner;

public class English implements Traduction {

    Scanner console = new Scanner(System.in);
    double km, min, vitesse;
    String ret;

    public English() {

    }

    @Override
    public double saisieDistance() {
        System.out.println("Enter the distance traveled (km):");
        km = console.nextDouble();

        return km;

    }

    @Override
    public double saisieTemps() {
        System.out.println("Enter the route time (min) : ");
        this.min = console.nextDouble();

        return min;

    }

    @Override
    public String debutReponse() {
        ret = "The Speed is";

        return ret;
    }

    @Override
    public String finReponse() {
        vitesse = this.saisieDistance() * (60 / this.saisieTemps());
        String formattedVitesse = String.format("%.0f", vitesse);

        return ": " + formattedVitesse + " KM/H";
    }

}
