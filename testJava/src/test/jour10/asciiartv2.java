package test.jour10;

import java.util.Scanner;

public class asciiartv2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int taille;
        String caractere;
        int forme = 0;
        String espace = "                                                                                                  ";

        System.out.println("Taille ? [entre 3 et 100]");
        taille = console.nextInt();

        System.out.println("Caractère ?");
        caractere = console.next();

        System.out.println("Forme ?");
        System.out.println("1 - rectangle plein");
        System.out.println("2 - rectangle creux");
        System.out.println("3 - croix de Saint-André");
        System.out.println("4 - triangle rectangle");
        System.out.println("5 - losange rectangle");
        System.out.println("6 - damier");
        System.out.println("7 - Quitter cette magnifique application");
        forme = console.nextInt();

        while (forme != 7) {
            switch (forme) {
                case 1:
                    // Rectangle plein
                    for (int i = 0; i < taille; i++) {
                        for (int m = 0; m < taille - 1; m++) {
                            System.out.print(caractere);
                        }
                        System.out.println(caractere);

                    }
                    System.out.println("Forme ?");
                    System.out.println("1 - rectangle plein");
                    System.out.println("2 - rectangle creux");
                    System.out.println("3 - croix de Saint-André");
                    System.out.println("4 - triangle rectangle");
                    System.out.println("5 - losange rectangle");
                    System.out.println("6 - damier");
                    System.out.println("7 - Quitter cette magnifique application");

                    forme = console.nextInt();

                    break;

                case 2:
                    // Rectangle vide

                    for (int m = 0; m < taille; m++) {
                        System.out.print(caractere);
                    }
                    System.out.println();

                    for (int i = 0; i < taille - 2; i++) {
                        System.out.printf("%s%s%s%n", caractere,
                                "                                                                                                  "
                                        .substring(0, taille - 2),
                                caractere);

                    }

                    for (int m = 0; m < taille; m++) {
                        System.out.print(caractere);
                    }

                    System.out.println("");
                    System.out.println("Forme ?");
                    System.out.println("1 - rectangle plein");
                    System.out.println("2 - rectangle creux");
                    System.out.println("3 - croix de Saint-André");
                    System.out.println("4 - triangle rectangle");
                    System.out.println("5 - losange rectangle");
                    System.out.println("6 - damier");
                    System.out.println("7 - Quitter cette magnifique application");

                    forme = console.nextInt();

                    break;
                case 3:
                    // Triangle rectangle
                    System.out.println(caractere);

                    for (int i = 0; i < taille - 2; i++) {
                        System.out.printf("%s%s%s%n", caractere,
                                "                                                                                                  "
                                        .substring(0, i),
                                caractere);

                    }

                    for (int m = 0; m < taille; m++) {
                        System.out.print(caractere);
                    }

                    System.out.println("");
                    System.out.println("Forme ?");
                    System.out.println("1 - rectangle plein");
                    System.out.println("2 - rectangle creux");
                    System.out.println("3 - triangle rectangle");
                    System.out.println("4 - croix de Saint-André");
                    System.out.println("5 - losange rectangle");
                    System.out.println("6 - damier");
                    System.out.println("7 - Quitter cette magnifique application");

                    forme = console.nextInt();

                    break;
                case 4:
                    // Croix de Saint-André
                    for (int i = 0; i < (taille / 2); i++) {
                        System.out.printf("%s%s%s%s%s%n",
                                "                                                                                                  "
                                        .substring(0, i),
                                caractere, espace.substring((taille / 2), (taille - i)),
                                espace.substring((taille / 2), (taille - i)), caractere);

                    }
                    // System.out.println();(espace.substring(0, (taille / 2)) + caractere);

                    for (int i = 0; i < (taille / 2); i++) {
                        System.out.printf("%s%s%s%s%n",
                                "                                                                                                  "
                                        .substring(taille / 2, taille - i),
                                caractere, espace.substring(0, 2 * i)/*
                                                                      * ,
                                                                      * espace.substring((taille / 2),
                                                                      * (taille) + i)
                                                                      */, caractere);

                    }
                    System.out.println("");
                    System.out.println("Forme ?");
                    System.out.println("1 - rectangle plein");
                    System.out.println("2 - rectangle creux");
                    System.out.println("3 - triangle rectangle");
                    System.out.println("4 - croix de Saint-André");
                    System.out.println("5 - losange rectangle");
                    System.out.println("6 - damier");
                    System.out.println("7 - Quitter cette magnifique application");

                    forme = console.nextInt();

                    break;
                case 5:
                    // Losange
                    System.out.println("");
                    System.out.println("Forme ?");
                    System.out.println("1 - rectangle plein");
                    System.out.println("2 - rectangle creux");
                    System.out.println("3 - triangle rectangle");
                    System.out.println("4 - croix de Saint-André");
                    System.out.println("5 - losange rectangle");
                    System.out.println("6 - damier");
                    System.out.println("7 - Quitter cette magnifique application");

                    forme = console.nextInt();

                    break;
                case 6:
                    // Damier
                    System.out.println("");
                    System.out.println("Forme ?");
                    System.out.println("1 - rectangle plein");
                    System.out.println("2 - rectangle creux");
                    System.out.println("3 - triangle rectangle");
                    System.out.println("4 - croix de Saint-André");
                    System.out.println("5 - losange rectangle");
                    System.out.println("6 - damier");
                    System.out.println("7 - Quitter cette magnifique application");

                    forme = console.nextInt();

                    break;

                default:
                    break;
            }
        }
        System.out.println("Au revoir !  ");
        console.close();
    }
}
