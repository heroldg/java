package test.LesErreursEtExceptions.Exos;

import java.util.Scanner;

public class CalculRacineCaree {
    private static int c;
    private static int r;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Saissisez ce  que vous souhaitez calculer a la racine carrée:");
        c = console.nextInt();
        if (c < 0) {
            System.out.println("La racine carrée n'est pas définie pour unnombre négatif");

        } else {

            r = c * c;
            System.out.printf("La racine carr\u00E9e de %d est : %d", c, r);
        }
        console.close();
    }

}
