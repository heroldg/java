package test.jour11;

import java.util.Scanner;

public class TableauxNombreDOccurences {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        final int ZERO_TO_NINE = 2;
        final int OCCURENCE = 10;

        int[][] Tableau2D = new int[ZERO_TO_NINE][OCCURENCE];
        Tableau2D[0][0] = 0;
        Tableau2D[0][1] = 1;
        Tableau2D[0][2] = 2;
        Tableau2D[0][3] = 3;
        Tableau2D[0][4] = 4;
        Tableau2D[0][5] = 5;
        Tableau2D[0][6] = 6;
        Tableau2D[0][7] = 7;
        Tableau2D[0][8] = 8;
        Tableau2D[0][9] = 9;
        Tableau2D[1][0] = 0;
        Tableau2D[1][1] = 0;
        Tableau2D[1][2] = 0;
        Tableau2D[1][3] = 0;
        Tableau2D[1][4] = 0;
        Tableau2D[1][5] = 0;
        Tableau2D[1][6] = 0;
        Tableau2D[1][7] = 0;
        Tableau2D[1][8] = 0;
        Tableau2D[1][9] = 0;

        System.out.println("Saissisez une valeur 0 et 9 :[pour mettre fin '-1']");

        int chiffre = console.nextInt();
        if (chiffre > 9) {
            System.out.println("Erreur ! Saissisez une valeur 0 et 9[entrer '-1' pour QUITTER]: ");
            chiffre = console.nextInt();
        }
        for (int val : Tableau2D[0]) {
            if (chiffre == val) {
                Tableau2D[1][val] += 1;
            }
        }

        for (int j = 0; j < 1; j++) {

            for (int i = 0; i < OCCURENCE; i++) {
                while (chiffre != -1) {
                    System.out.println("Une valeur entre 0 et 9:[pour mettre fin '-1']");
                    chiffre = console.nextInt();
                    switch (chiffre) {
                        case 0:
                            Tableau2D[1][0] += 1;
                            break;
                        case 1:
                            Tableau2D[1][1] += 1;
                            break;
                        case 2:
                            Tableau2D[1][2] += 1;
                            break;
                        case 3:
                            Tableau2D[1][3] += 1;
                            break;
                        case 4:
                            Tableau2D[1][4] += 1;
                            break;
                        case 5:
                            Tableau2D[1][5] += 1;
                            break;
                        case 6:
                            Tableau2D[1][6] += 1;
                            break;
                        case 7:
                            Tableau2D[1][7] += 1;
                            break;
                        case 8:
                            Tableau2D[1][8] += 1;
                            break;
                        case 9:
                            Tableau2D[1][9] += 1;
                            break;
                        case -1:
                            System.out.print("Voici les résultats:");
                            System.out.println();
                            break;

                        default:
                            System.out.println("Erreur ! Veuillez entrer ");
                            break;
                    }
                }

                System.out.println("Nombre de " + Tableau2D[j][i] + " : " + Tableau2D[1][i]);
            }
        }
        console.close();
    }
}
