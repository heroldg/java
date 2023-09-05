package test.LesElementsAbstraits.correction.VitesseMoyenneVersionMultilingue;

import java.util.Scanner;

public class vitesseMoyenne {
    // Calcule la vitesse moyenne sur un trajet
    private static double vitesse, min, km;
    private static int langue;
    static Traduction traductionLangue;
    private static final int UNE_HEURE = 60;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Language ?");
        System.out.println("1 - English");
        System.out.println("2 - Français");
        System.out.println("3 - Español");
        System.out.println("4 - Deutsch");

        langue = console.nextInt();
        switch (langue) {
            case 2:
                traductionLangue = new Francaise();
                break;

            case 3:
                traductionLangue = new Espagnole();
                break;

            case 4:
                traductionLangue = new Allemande();
                break;

            default:
                traductionLangue = new Anglaise();
                break;
        }

        System.out.println(traductionLangue.saisieDistance());
        km = console.nextDouble();

        System.out.println(traductionLangue.saisieTemps());
        min = console.nextDouble();

        vitesse = km * UNE_HEURE / min;

        System.out.println(traductionLangue.debutReponse() + vitesse + traductionLangue.finReponse());
        console.close();
    }
}
