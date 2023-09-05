package test.LesElementsAbstraits.exos.VMoyenneVMultilingue;

import java.util.Scanner;

import test.RelationsClassesV2.Cours.Outils;

public class VitesseMoyenne {
    // Calcul la vitesse moyenne d'un temps de trajet
    // private static final int UNE_HEURE = 60;
    // private static double vitesse, min, km;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Francais french = new Francais();
        English english = new English();
        Spanish spanish = new Spanish();
        String[] whichLanguage = { "Français", "English", "Spanish", "QUITTER" };
        int choix;

        do {
            choix = Outils.choix("Menu", whichLanguage);

            switch (choix) {
                case 0:

                    // System.out.println("LANGUE: française");
                    // km = french.saisieDistance();
                    // min = french.saisieTemps();
                    System.out.println(french.debutReponse() + french.finReponse());

                    break;

                case 1:
                    System.out.println("LANGUAGE: english");
                    System.out.println(english.debutReponse() + english.finReponse());

                    break;

                case 2:
                    System.out.println("IDIOMA: spanish");
                    System.out.println(spanish.debutReponse() + spanish.finReponse());

                    break;

                default:
                    break;
            }
        } while (choix == 4);

        System.out.println("Fin .");
        // Adjust the condition to match your exit condition

        // System.out.println("Saississez la distance parcourue (km) : ");
        // km = console.nextDouble();
        // System.out.println("Saississez la temps de parcours (min) : ");
        // min = console.nextDouble();
        // vitesse = km * UNE_HEURE / min;
        // System.out.println("SVous vous êtes déplacé à " + vitesse + " km:/h");

        console.close();

    }

}
