package test.jour13;

import java.util.Scanner;

public class ASCIIARTSTUDIOTEST {

    // Tableau pour stocker le dessin en ASCII art
    private static char[][] drawing = new char[10][40];

    // Méthode pour afficher le dessin en ASCII art
    public static void displayDrawing() {
        for (int i = 0; i < drawing.length; i++) {
            for (int j = 0; j < drawing[i].length; j++) {
                System.out.print(drawing[i][j]);
            }
            System.out.println();
        }
    }

    // Méthode pour dessiner un caractère à une position donnée
    public static void drawCharacter(int row, int col, char c) {
        if (row >= 0 && row < drawing.length && col >= 0 && col < drawing[0].length) {
            drawing[row][col] = c;
        } else {
            System.out.println("Position invalide !");
        }
    }

    // Méthode pour dessiner un rectangle avec un ensemble de caractères
    public static void drawRectangle(int startRow, int startCol, int endRow, int endCol, char c) {
        if (startRow >= 0 && startRow < drawing.length && startCol >= 0 && startCol < drawing[0].length &&
                endRow >= 0 && endRow < drawing.length && endCol >= 0 && endCol < drawing[0].length &&
                startRow <= endRow && startCol <= endCol) {
            for (int i = startRow; i <= endRow; i++) {
                for (int j = startCol; j <= endCol; j++) {
                    drawing[i][j] = c;
                }
            }
        } else {
            System.out.println("Positions invalides !");
        }
    }

    // Méthode pour changer "la couleur" (c'est-à-dire le caractère) en utilisant un
    // pot de peinture
    public static void changeColor(int row, int col, char newChar) {
        if (row >= 0 && row < drawing.length && col >= 0 && col < drawing[0].length) {
            char oldChar = drawing[row][col];
            floodFill(row, col, oldChar, newChar);
        } else {
            System.out.println("Position invalide !");
        }
    }

    // Méthode de remplissage par diffusion (flood fill)
    private static void floodFill(int row, int col, char oldChar, char newChar) {
        if (row >= 0 && row < drawing.length && col >= 0 && col < drawing[0].length &&
                drawing[row][col] == oldChar && drawing[row][col] != newChar) {
            drawing[row][col] = newChar;
            floodFill(row - 1, col, oldChar, newChar); // haut
            floodFill(row + 1, col, oldChar, newChar); // bas
            floodFill(row, col - 1, oldChar, newChar); // gauche
            floodFill(row, col + 1, oldChar, newChar); // droite
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        char c;
        int startRow, startCol, endRow, endCol;
        char newChar;

        // Initialisation du dessin avec des caractères espace
        for (int i = 0; i < drawing.length; i++) {
            for (int j = 0; j < drawing[i].length; j++) {
                drawing[i][j] = ' ';
            }
        }

        // Affichage du dessin initial
        System.out.println("Dessin en ASCII art :");
        displayDrawing();

        // Menu pour les fonctionnalités
        do {
            System.out.println("\nMenu :");
            System.out.println("1. Dessiner un caractère");
            System.out.println("2. Dessiner un rectangle");
            System.out.println("3. Changer la couleur (pot de peinture)");
            System.out.println("4. Quitter");
            System.out.print("Choix : ");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case '1':
                    System.out.print("Entrez la ligne : ");
                    int row = scanner.nextInt();
                    System.out.print("Entrez la colonne : ");
                    int col = scanner.nextInt();
                    System.out.print("Entrez le caractère : ");
                    c = scanner.next().charAt(0);
                    drawCharacter(row, col, c);
                    displayDrawing();
                    break;
                case '2':
                    System.out.print("Entrez la ligne de départ : ");
                    startRow = scanner.nextInt();
                    System.out.print("Entrez la colonne de départ : ");
                    startCol = scanner.nextInt();
                    System.out.print("Entrez la ligne de fin : ");
                    endRow = scanner.nextInt();
                    System.out.print("Entrez la colonne de fin : ");
                    endCol = scanner.nextInt();
                    System.out.print("Entrez le caractère : ");
                    c = scanner.next().charAt(0);
                    drawRectangle(startRow, startCol, endRow, endCol, c);
                    displayDrawing();
                    break;
                case '3':
                    System.out.print("Entrez la ligne : ");
                    row = scanner.nextInt();
                    System.out.print("Entrez la colonne : ");
                    col = scanner.nextInt();
                    System.out.print("Entrez le nouveau caractère : ");
                    newChar = scanner.next().charAt(0);
                    changeColor(row, col, newChar);
                    displayDrawing();
                    break;
                case '4':
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
                    break;
            }
        } while (choice != '4');

        scanner.close();
    }
}
