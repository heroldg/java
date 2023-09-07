package test.MEMOIRE;

import java.util.Scanner;

public class ZonesDeMemoire {
    private static void testVariablesEtBlocs() {
        // 1
        char car;
        // 2
        int a = 27897;

        // 3
        if (a < Math.sqrt(Integer.MAX_VALUE)) {
            int c = a * a;
            System.out.printf("le carré de %d est %d%n", a, c);
        }

        // 5
        car = 'H';
        final int TABLE = 4;

        // 6
        System.out.printf("table de %d : %n", TABLE);
        for (int i = 0; i < 10; i++) {
            int res = i * TABLE;
            // 7
            System.out.printf("%d x %d = %d%n", i, TABLE, res);

        }

        // 8
        System.out.println("car = " + car);

    }

    private static void testVariablesReference() {
        // Object o = new Object();
    }

    private static void passageEnParametre() {
        Scanner console = new Scanner(System.in);
        System.out.println("Entrez une valeur");
        double val = console.nextDouble();
        console.nextLine();
        System.out.println("Entrez l'exposant");
        int exp = console.nextInt();
        // 1
        afficherPuissance(val, exp);
        // 5
        console.close();
    }

    private static void afficherPuissance(double a, int n) {
        // 2
        double p = 1;
        // 3
        for (int i = 0; i < n; i++) {
            p *= a;
        }

        // 4
        System.out.printf("%f puissance %d = %f%n", a, n, p);
    }

    public static void main(String[] args) {
        testVariablesEtBlocs();
        testVariablesReference();
        passageEnParametre();
    }
}
