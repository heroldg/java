package test.jour11;

import java.util.Scanner;

public class morpion {
    public static void main(String[] args) {

        // Variables constantes pour les colonnes et lignes d jeu morpion
        final int COLONNES = 3;
        final int LIGNES = 3;

        // Caractères de base quand le tableau ne sera pas encore remplis
        char options = '?';

        // Le nombre de coup joué lors de la partie
        int nbCoupDeJeu = 0;

        // Les symboles des 2 joueur: X et O
        char playerO = 'O';
        char playerX = 'X';

        // Préparation de la console pour que les joueur puissent rentrer des valeurs
        Scanner console = new Scanner(System.in);

        // Création du tableau qui répresente l'espace de jeu du morpion
        char[][] morpion = new char[COLONNES][LIGNES];

        // Prèsentation du tableau
        for (int i = 0; i < LIGNES; i++) {
            System.out.print("|");
            for (int j = 0; j < COLONNES; j++) {
                System.out.print(morpion[i][j] = options);
                System.out.print("|");

            }

            System.out.println();

        }

        // Début de la boucle while permettent de jouer plusieurs coups d'affilié, 9
        // coups pour 9 cases.
        while (nbCoupDeJeu < 9) {

            if (morpion[0][0] == playerO && morpion[0][1] == playerO && morpion[0][2] == playerO
                    || morpion[1][0] == playerO && morpion[1][1] == playerO && morpion[1][2] == playerO
                    || morpion[2][0] == playerO && morpion[2][1] == playerO && morpion[2][2] == playerO
                    || morpion[0][0] == playerO && morpion[1][0] == playerO && morpion[2][0] == playerO
                    || morpion[0][1] == playerO && morpion[1][1] == playerO && morpion[2][1] == playerO
                    || morpion[0][2] == playerO && morpion[1][2] == playerO && morpion[2][2] == playerO
                    || morpion[0][0] == playerO && morpion[1][1] == playerO && morpion[2][2] == playerO
                    || morpion[2][0] == playerO && morpion[1][1] == playerO && morpion[0][2] == playerO) {
                System.out.println("Le Joueur O à gagné la partie");
                nbCoupDeJeu = 9;
            } else if (morpion[0][0] == playerX && morpion[0][1] == playerX && morpion[0][2] == playerX
                    || morpion[1][0] == playerX && morpion[1][1] == playerX && morpion[1][2] == playerX
                    || morpion[2][0] == playerX && morpion[2][1] == playerX && morpion[2][2] == playerX
                    || morpion[0][0] == playerX && morpion[1][0] == playerX && morpion[2][0] == playerX
                    || morpion[0][1] == playerX && morpion[1][1] == playerX && morpion[2][1] == playerX
                    || morpion[0][2] == playerX && morpion[1][2] == playerX && morpion[2][2] == playerX
                    || morpion[0][0] == playerX && morpion[1][1] == playerX && morpion[2][2] == playerX
                    || morpion[2][0] == playerX && morpion[1][1] == playerX && morpion[0][2] == playerX) {
                System.out.println("Le Joueur O à gagné la partie");
                nbCoupDeJeu = 9;

            } else {

                // Choix colonnes pour les deux joueurs
                if (nbCoupDeJeu % 2 == 0) {
                    System.out.println("PLAYER O: Quelles colonnes ?");
                } else {

                    System.out.println("PLAYER X: Quelles colonnes ?");

                }
                int morpionColonnes = console.nextInt();
                morpionColonnes = morpionColonnes - 1;

                // Choix lignes pour les deux joueurs
                if (nbCoupDeJeu % 2 == 0) {

                    System.out.println("PLAYER O: Quelles lignes ?");
                } else {

                    System.out.println("PLAYER X: Quelles lignes ?");
                }
                int morpionlignes = console.nextInt();
                morpionlignes = morpionlignes - 1;

                // changement de tours pour les 2 participant crée en finction de valeurs pair
                // et impair
                if (nbCoupDeJeu % 2 == 0) {

                    if (morpion[morpionColonnes][morpionlignes] == playerX) {
                        System.out.println("Cette case des déjà prise, passez votre tour");
                    } else {
                        morpion[morpionColonnes][morpionlignes] = playerO;
                        nbCoupDeJeu++;
                    }

                } else if (nbCoupDeJeu % 2 == 1) {
                    if (morpion[morpionColonnes][morpionlignes] == playerO) {
                        System.out.println("Cette case des déjà prise, passez votre tour");
                    } else {

                        morpion[morpionColonnes][morpionlignes] = playerX;
                        nbCoupDeJeu++;
                    }

                }

                for (int i = 0; i < LIGNES; i++) {

                    System.out.print("|");
                    for (int j = 0; j < COLONNES; j++) {
                        System.out.print(morpion[j][i]);
                        System.out.print("|");

                    }
                    System.out.println();
                }
                // System.out.println(nbCoupDeJeu);
            }
        }
        System.out.print("Fin du jeu");

        console.close();
    }

}
