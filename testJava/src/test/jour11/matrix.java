package test.jour11;

import java.util.Random;

public class matrix {
    public static void main(String[] args) {
        final int COLONNES = 20;
        final int LIGNES = 30;

        char[][] matrix = new char[LIGNES][COLONNES];

        for (int i = 0; i < LIGNES; i++) {
            for (int j = 0; j < COLONNES; j++) {
                Random r = new Random();
                char car = (char) ('a' + r.nextInt('z' - 'a' + 1));
                System.out.print(matrix[i][j] = car);

                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
