package test.jour11;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char[][] palindrome = new char[2][100];
        String saisie = "";
        System.out.println("-----EST-CE UN PALINDROME ?--------------------------- \nUn palindrome est un mot dont l'ordre des lettres est\nle même qu'il soit lu de gauche à droite ou de droite \nà gauche. ");

        while (!saisie.equals("-1")) {

            System.out.println();
            System.out.println("Entrez un mot[tout en minuscule ou tout en majuscule][-1 pour mettre fin]:");
            saisie = console.nextLine();
            String choix = "";

            for (int i = 0; i < saisie.length(); i++) {
                // System.out.println(saisie.charAt(i));
                palindrome[0][i] = saisie.charAt(i);
            }
            for (int j = saisie.length(); j > 0; --j) {
                // System.out.println(saisie.charAt(j - 1));
                palindrome[1][j] = saisie.charAt(j - 1);

                if (palindrome[0][saisie.length() - j] == palindrome[0][j - 1]) {
                    choix = "Ceci est un palindrome: ";
                } else {
                    choix = "Ceci n'est pas un palindrome: ";

                }
            }
            if (!saisie.equals("-1")) {

                System.out.println(choix + saisie);
            }
        }

        console.close();
    }
}
