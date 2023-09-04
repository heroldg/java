package test.LesElementsAbstraits.exos.VMoyenneVMultilingue;

import java.util.Scanner;

public class VitesseMoyenne {
    // Calcul la vitesse moyenne d'un temps de trajet
    private static final int UNE_HEURE = 60;
    private static double vitesse, min, km;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Saississez la distance parcourue (km) : ");
        km = console.nextDouble();
        System.out.println("Saississez la temps de parcours (min) : ");
        min = console.nextDouble();
        vitesse = km * UNE_HEURE / min;
        System.out.println("SVous vous êtes déplacé à " + vitesse + " km:/h");

        console.close();

    }
}
