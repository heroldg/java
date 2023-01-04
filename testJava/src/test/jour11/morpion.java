package test.jour11;

import java.util.Scanner;

public class morpion {
    public static void main(String[] args) {

        final int COLONNES = 3;
        final int LIGNES = 3;
        char options = '?';
        int nbCoupDeJeu = 0;

        Scanner console = new Scanner(System.in);

        char[][] morpion = new char[COLONNES][LIGNES];

        for (int i = 0; i < LIGNES; i++) {
            System.out.print("|");
            for (int j = 0; j < COLONNES; j++) {
                System.out.print(morpion[i][j] = options);
                System.out.print("|");

            }

            System.out.println();

        }

        System.out.println();
        System.out.println();

        char playerO = 'O';
        char playerX = 'X';

        System.out.println("PLAYER O: Quelles colonnes ?");
        int morpionColonnes = console.nextInt();
        morpionColonnes = morpionColonnes - 1;

        System.out.println();

        System.out.println("PLAYER O: Quelles lignes ?");
        int morpionlignes = console.nextInt();
        morpionlignes = morpionlignes - 1;

        morpion[morpionColonnes][morpionlignes] = playerO;

        for (int i = 0; i < LIGNES; i++) {

            System.out.print("|");
            for (int j = 0; j < COLONNES; j++) {
                // System.out.print(i);
                // System.out.print(j);

                System.out.print(morpion[j][i]);
                System.out.print("|");

            }
            System.out.println(

            );
        }

        System.out.println("PLAYER O: Quelles colonnes ?");
        morpionColonnes = console.nextInt();
        morpionColonnes = morpionColonnes - 1;

        System.out.println();

        System.out.println("PLAYER O: Quelles lignes ?");
        morpionlignes = console.nextInt();
        morpionlignes = morpionlignes - 1;

        morpion[morpionColonnes][morpionlignes] = playerO;

        for (int i = 0; i < LIGNES; i++) {

            System.out.print("|");
            for (int j = 0; j < COLONNES; j++) {
                // System.out.print(i);
                // System.out.print(j);

                System.out.print(morpion[j][i]);
                System.out.print("|");

            }
            System.out.println(

            );
        }
        System.out.println("PLAYER X: Quelles colonnes ?");
        morpionColonnes = console.nextInt();
        morpionColonnes = morpionColonnes - 1;

        System.out.println();

        System.out.println("PLAYER X: Quelles lignes ?");
        morpionlignes = console.nextInt();
        morpionlignes = morpionlignes - 1;

        morpion[morpionColonnes][morpionlignes] = playerX;

        for (int i = 0; i < LIGNES; i++) {

            System.out.print("|");
            for (int j = 0; j < COLONNES; j++) {
                // System.out.print(i);
                // System.out.print(j);

                System.out.print(morpion[j][i]);
                System.out.print("|");

            }
            System.out.println(

            );
        }

    }
}
