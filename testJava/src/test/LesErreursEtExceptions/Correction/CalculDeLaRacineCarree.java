package test.LesErreursEtExceptions.Correction;

import java.util.Scanner;

public class CalculDeLaRacineCarree {
    // Saisie d'une valeur et calcul
    private static int val;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Entrer une valeur:");

        val = console.nextInt();
        try {
            System.out.printf("Racine carrée de %d = %d", val, val * val);
        } catch (Exception e) {
            // TODO: It's for don't accept negative int
            System.out.println("La racine carrée n'est pas définie pour un nombre négatif");

        }
        console.close();
    }
}
