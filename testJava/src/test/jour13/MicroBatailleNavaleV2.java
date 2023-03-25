package test.jour13;

import java.util.Random;
import java.util.Scanner;

public class MicroBatailleNavaleV2 {
    // Il est important de rajouter public static pour avoir accès au constante
    // depuis diffèrentes procèdures et fonctions
    public static final int COLONNES = 4;
    public static final int LIGNES = 4;

    public static char[][] matrix = new char[COLONNES][LIGNES];

    public static char car = '?';

    public static int aleatoireLignes;
    public static int aleatoireColonnes;

    public static int matrixColonnes = 0;
    public static int matrixLignes = 0;

    public static void main(String[] args) {
        initialiserPlateaux();
        afficherPlateau();

        System.out.println("Quelle colonnes ?");
        matrixColonnes = saisirEntierEntresBornes(matrixColonnes) - 1;

        System.out.println("Quelle lignes ?");
        matrixLignes = saisirEntierEntresBornes(matrixLignes) - 1;

        tirer(matrixColonnes, matrixLignes);
        System.out.println("Bravo ! tu as touché le bateau !");

        // tirer();
    }

    public static void initialiserPlateaux() {
        // permet de mettre en place l'élément aleatoire que l'ont cherche
        Random r = new Random();
        Random r2 = new Random();
        aleatoireLignes = (int) (r.nextInt(4));
        aleatoireColonnes = (int) (r2.nextInt(4));
        matrix[aleatoireColonnes][aleatoireLignes] = car;

    }

    public static void afficherPlateau() {
        // Comme le nom de la fonction l'indique, nous permet d'afficher le plateau
        for (int i = 0; i < COLONNES; i++) {
            for (int j = 0; j < LIGNES; j++) {
                if (matrix[i][j] == car) {
                    System.out.print(matrix[i][j] = car);
                    System.out.print(" ");
                } else {
                    char options = '?';
                    System.out.print(matrix[i][j] = options);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static int saisirEntierEntresBornes(int val) {
        Scanner console = new Scanner(System.in);
        val = console.nextInt();
        while (val < 0 || val > 4) {
            System.out.println("La valeur saisie n'est pas conforme au tableau -- Saisissez à nouveau:");
            val = console.nextInt();
            console.close();
        }

        // console.close();
        return val;

    }

    public static int tirer(int coordonneesY, int coordonneesX) {

        char toucher = 'X';
        matrix[coordonneesX][coordonneesY] = toucher;

        for (int a = 0; a < LIGNES; a++) {
            for (int b = 0; b < COLONNES; b++) {
                if (matrix[a][b] == toucher) {
                    System.out.print(matrix[a][b]);
                    System.out.print(" ");
                } else if (matrix[a][b] == car) {
                    System.out.print(matrix[a][b] = car);
                    System.out.print(" ");
                } else {
                    // char options = '?';
                    System.out.print(matrix[a][b]/* = options */);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        if (matrix[aleatoireColonnes][aleatoireLignes] != toucher) {
            System.out.println("Essayez encore !");
            System.out.println();
            System.out.println("Quelle colonnes ?");
            matrixColonnes = saisirEntierEntresBornes(matrixColonnes) - 1;
            System.out.println("Quelle lignes ?");
            matrixLignes = saisirEntierEntresBornes(matrixLignes) - 1;

            tirer(matrixColonnes, matrixLignes);

        }

        return toucher;

    }

}
