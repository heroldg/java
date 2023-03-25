package test.jour13;

import java.util.Scanner;

public class LePLusGrand {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Entrer une premiere valeur");
        int val1 = console.nextInt();
        System.out.println("Entrer une seconde valeur");
        int val2 = console.nextInt();
        console.close();
        int p = comparaisonFonction(val1, val2);
        System.out.println(p);
        comparaison(val1, val2);

    }

    // Voici le cheminement pour savoir quel nombre est le plus grand en passant par
    // une procèdure
    public static void comparaison(int chiffre1, int chiffre2) {
        if (chiffre1 > chiffre2) {
            System.out.println("La premiere valeur " + chiffre1 + " est plus grande que " + chiffre2);

        } else if (chiffre1 == chiffre2) {

            System.out.println("La premiere valeur " + chiffre1 + " est plus égale à la seconde valeur " + chiffre2);
        }

        else {

            System.out.println("La seconde valeur " + chiffre2 + " est plus grande que " + chiffre1);
        }
    }

    // Voici le cheminement en passant par une fonction
    public static int comparaisonFonction(int a, int b) {
        int p = 0;
        if (a > b) {
            p = a;
        } else if (b > a) {
            p = b;
        }
        return p;
    }

}
