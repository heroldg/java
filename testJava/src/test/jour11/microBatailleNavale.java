package test.jour11;

// import java.io.Console;
import java.util.Random;
import java.util.Scanner;

public class microBatailleNavale {
    public static void main(String[] args) {
        final int COLONNES = 4;
        final int LIGNES = 4;

        Scanner console = new Scanner(System.in);

        // création des paramétres aléatoires: choix alléatoire de la case du bateau

        Random r = new Random();
        Random r2 = new Random();
        char car = '?'; /* car est la variable qui correspond au bateau que l'ont devra chercher */
        int aleatoireLignes = (int) (r2.nextInt(4));
        int aleatoireColonnes = (int) (r.nextInt(4));

        // Création d'un tableau qui regroupe l'ensemble des cases où peut être le
        // bateau que l'ont cherche

        char[][] matrix = new char[COLONNES][LIGNES];
        matrix[aleatoireLignes][aleatoireColonnes] = car;
        // La variable car est définie comme celle que l'ont doit trouver dans le
        // tableau grâce de manière aléatoire

        for (int i = 0; i < COLONNES; i++) {

            for (int j = 0; j < LIGNES; j++) {
                if (matrix[i][j] == car) {
                    // Si dans le tableau une valeur egale à variable car, celle-ci sera print
                    System.out.print(matrix[i][j] = car);

                    System.out.print(" ");
                } else {
                    // Pour toutes les autres variables qui n'ont pas car en valeur elle seront
                    // remplis avec la valeur de la variables options.
                    char options = '?';
                    System.out.print(matrix[i][j] = options);

                    System.out.print(" ");
                }

                /*
                 * char car ="?" et char options = "?" ont les mêmes valeurs pour que le joueur
                 * ne fasse pas la différence. Si vous changer une des deux variables alors la
                 * réponse sera l'unique valeur qui n'est pas la même que les autres.
                 */
            }
            System.out.println();
        }

        /*
         * Si vous décommenté les deux print ci-dessous vous allez avoir les réponses au
         * deux questions "Quelle colonne ?" et "Quelle ligne ?". Le premier chiffre + 1
         * et le second + 1 correspondent à la localisation du bâteau.
         */
        // System.out.print(aleatoireColonnes);
        // System.out.print(aleatoireLignes);

        int matrixColonnes = 0;
        int matrixLignes = 0;

        // System.out.println(matrix[matrixLignes][matrixColonnes]);
        // System.out.println(car);

        while (matrix[aleatoireColonnes][aleatoireLignes] != 'X') {

            System.out.println("Quelle colonnes ? (verticale)");
            matrixColonnes = console.nextInt();
            matrixColonnes = matrixColonnes - 1;
            // Pourquoi faire -1 ? Sachant qu'un tableau commence par 0, il y a un ecart de
            // 1 entre la début d'un tableau et le début d'une énumération faite par un être
            // humain. C'est avec ce - 1 que l'écart est corrigé pour que nous ayant les
            // mêmes valeurs.

            System.out.println("Quelle ligne ?(horizontale)");
            matrixLignes = console.nextInt();

            matrixLignes = matrixLignes - 1;
            // Pourquoi faire -1 ? Sachant qu'un tableau commence par 0, il y a un ecart de
            // 1 entre la début d'un tableau et le début d'une énumération faite par un être
            // humain. C'est avec ce - 1 que l'écart est corrigé pour que nous ayant les
            // mêmes valeurs.
            matrix[matrixColonnes][matrixLignes] = 'X';

            for (int a = 0; a < LIGNES; a++) {

                for (int b = 0; b < COLONNES; b++) {

                    if (matrix[a][b] == 'X') {

                        System.out.print(matrix[a][b]);
                        System.out.print(' ');
                    }

                    else if (matrix[a][b] == car) {

                        System.out.print(matrix[a][b] = car);

                        System.out.print(" ");
                    } else {

                    }
                }
                System.out.println();

            }
            if (matrix[aleatoireColonnes][aleatoireLignes] != 'X') {
                System.out.println("Essayez encore !");
                System.out.println();
            }

        }

        System.out.println("Bravo ! tu as touché le bateau !");
        console.close();
    }

}
