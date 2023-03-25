package test.jour13;

import java.util.Random;
import java.util.Scanner;

public class UnTabEtDesFonctions {
    public static final int numMaxi = 0;
    public static final int maxi = 1;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Choississez un nombre maximum pour les paramètres aléatoires");
        int max = console.nextInt();

        System.out.println();
        System.out.println("Les nombres aléatoires vont de 0 à " + max);
        System.out.println();

        // La ligne ci-dessous ermet d'instancier une variable et d'appeler une fonction
        int[] maximumNumber = maxArray(TabUneDimension(max));
        // La ligne ci-dessous Permet d'écrire la réponse attendu
        System.out.print(
                "Le nombre maximum est " + maximumNumber[1] + ", celui-ci correspond à la ligne " + maximumNumber[0]);

        console.close();

    }

    // Fonction qui permet de faire un tableau à 10 entrée instancié avec des
    // nombres aléatoires
    public static int[] TabUneDimension(int max) {
        int[] tab = new int[10];
        int numeration = 1;
        for (int i = 0; i < tab.length; i++) {
            Random r = new Random();
            System.out.print(numeration++ + " : ");
            System.out.println(tab[i] = (int) (r.nextInt(max)));
        }

        return tab;
    }

    // Permet de trouver le nombre le plus élevé dans le tableau
    public static int[] maxArray(int[] array) {
        int[] numAndMax = new int[2];
        int maxInt = array[0];
        int num = 0;
        int numeration = 0;
        for (int each : array) {
            numeration++;
            if (maxInt < each) {
                num = numeration;
                maxInt = each;

            }

            numAndMax[numMaxi] = num;
            numAndMax[maxi] = maxInt;
            if (numAndMax[numMaxi] == 0) {
                numAndMax[numMaxi] = 1;
            }

        }

        return numAndMax;

    }

}

// public static void EachValueArray(int[] array) {
// for (int i = 0; i < array.length; i++) {
// System.out.println("valeur " + array[i]);

// }
// }