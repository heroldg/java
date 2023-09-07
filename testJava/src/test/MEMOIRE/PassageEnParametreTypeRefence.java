package test.MEMOIRE;

import java.util.Scanner;

public class PassageEnParametreTypeRefence {
    public static void main(String[] args) {
        int[] tab = new int[4];
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Entrez la valeur n°" + (i + 1));
            tab[i] = console.nextInt();
            console.nextLine();
        }

        // 1
        multipleRerence(tab, 2);
        //
        for (int i = 0; i < tab.length; i++) {

            System.out.println("Valeur n°" + (i + 1) + " = " + tab[i]);
        }

        console.close();
    }

    public static void multipleRerence(int[] tableau, int coef) {
        // 2
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] *= 2;
        }
        // 3
    }
}
