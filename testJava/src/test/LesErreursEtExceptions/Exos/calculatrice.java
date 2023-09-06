package test.LesErreursEtExceptions.Exos;

import java.util.Scanner;

public class calculatrice {
    private static int val1;
    private static int val2;
    private static int resultat;

    public static void main(String[] args) {
        System.out.println("Faire votre calcule:");
        System.out.println("1 - MULTIPLICATION");
        System.out.println("2 - SOUSTRACTION");
        System.out.println("3 - ADDITION");
        System.out.println("4 - LE RESTE");

        try {
            calculatrice(val1, val2);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Le resulat depasse les limites de la mémoire" + e.getMessage());
        }

    }

    public static int calculatrice(int val1, int val2) throws Exception {
        Scanner console = new Scanner(System.in);
        int choix = console.nextInt();

        switch (choix) {
            case 1:

                System.out.println("Valeur 1:");
                val1 = console.nextInt();
                System.out.println("Valeur 2:");
                val2 = console.nextInt();
                resultat = val1 * val2;
                System.out.printf("La multiplication %d x %d = %d", val1, val2, val1 * val2);
                break;
            case 2:

                System.out.println("Valeur 1:");
                val1 = console.nextInt();
                System.out.println("Valeur 2:");
                val2 = console.nextInt();
                resultat = val1 - val2;
                System.out.printf("La soustraction %d - %d = %d", val1, val2, val1 - val2);
                break;
            case 3:

                System.out.println("Valeur 1:");
                val1 = console.nextInt();
                System.out.println("Valeur 2:");
                val2 = console.nextInt();
                System.out.printf("L'addition %d + %d = %d", val1, val2, val1 + val2);
                resultat = val1 + val2;
                break;
            case 4:

                System.out.println("Valeur 1:");
                val1 = console.nextInt();
                System.out.println("Valeur 2:");
                val2 = console.nextInt();
                resultat = val1 % val2;
                System.out.printf("Le reste %d % %d = %d", val1, val2, val1 % val2);
                break;

            default:
                break;
        }
        ResultatException(resultat);

        return resultat;
    }

    public static int ResultatException(int resulat) throws Exception {
        if (resultat <= 2147483647 || resultat >= -294967296) {
            System.out.println(" est le resultat.");

        } else {
            throw new Exception(" d'une variable int, est oblige de mettre le resultat " + resultat);
        }

        return resultat;

    }

}
