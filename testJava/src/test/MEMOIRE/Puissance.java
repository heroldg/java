package test.MEMOIRE;

import java.util.Scanner;

public class Puissance {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Entrez une valeur");
        double val = console.nextDouble();
        console.nextLine();
        System.out.println("Entrez l'exposant");
        int exp = console.nextInt();
        // 1

        double p = puissance(val, exp);
        System.out.printf("%f puissance %d = %f%n", val, exp, p);
        console.close();
    }

    public static double puissance(double a, int n) {
        double p = 1;
        // 2
        for (int i = 0; i < n; i++) {
            p *= a;
            // 3
        }

        return p;
    }
}
