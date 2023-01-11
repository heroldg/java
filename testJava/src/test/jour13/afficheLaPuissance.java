package test.jour13;

import java.util.Scanner;

public class afficheLaPuissance {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Entrez la valeur");
        double val = console.nextDouble();
        console.nextLine();
        System.out.println("Entrez l'exposant");
        int exp = console.nextInt();
        console.nextLine();
        double p = puissance(val, exp);
        System.out.printf("%f puisssance %d = %f%n", val, exp, p);
        console.close();

    }

    public static double puissance(double a, int n) {
        double p = 1;
        for (int i = 0; i < n; i++)
            p *= a;
        return p;
    }
}
