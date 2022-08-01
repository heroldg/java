package test.jour11;

import java.util.Scanner;

public class ListeDeCourses {
    public static void main(String[] args) {
        final String QUITTER = "q";
        final int MAX = 100;
        Scanner console = new Scanner(System.in);
        String[] aAcheter = new String[MAX];
        int nbArticles = 0;
        String saisie;
        do {
            System.out.println(
                    "indiquez l'article à mettre sur votre liste de courses[ saissisez " + QUITTER + " pour terminer]");
            saisie = console.nextLine();
            if (!saisie.equals(QUITTER)) {
                aAcheter[nbArticles] = saisie;
                nbArticles++;
            }

        } while (!saisie.equals(QUITTER) && nbArticles < MAX);
        if (nbArticles == MAX) {
            System.out.println("La liste déborde... Allez déja acheter:");
        } else {
            System.out.println("Liste de courses :");
        }
        for (int i = 0; i < nbArticles; i++)
            System.out.println("-" + aAcheter[i]);

        console.close();
    }
}
