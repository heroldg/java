package test.MEMOIRE.Correction;

import java.util.Scanner;

public class AlgoDeConversion {
    // Convertit un nombre entier en base 10 en un autre base
    private static int n, base;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("nombre à convertir :");
        n = console.nextInt();
        System.out.println("Base d'arrivée : ");
        base = console.nextInt();
        // System.out.println("\n");
        convertirB10versBxDiv(n, base);
        console.close();
    }

    public static void afficher(int chiffre) {
        // Afficher un chiffre dans une base < 36
        if (chiffre < 10) {
            System.out.print(chiffre);

        } else {
            System.out.print("A" + (chiffre - 10));

        }
    }

    public static void convertirB10versBxDiv(int n, int base) {
        // convertit le nombre n écrit en base 10 en une autre base
        int quotient = n / base;
        if (quotient < base) {
            if (quotient > 0) {
                afficher(quotient);
            }
        } else {
            convertirB10versBxDiv(quotient, base);
        }
        afficher(n % base);
    }
}
