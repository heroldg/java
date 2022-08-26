package test.jour11;

import java.util.Scanner;

public class machineAVoter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        final int nbCandidat = 2; // Ce chiffre doit correspondre au nombre de colonnes que l'ont souhaite avoir
        int vote = 4; // Ce chiffre correspond au nombre de colonnes que l'ont souhaite avoir
        int candidat = 0;
        int nbvotes = 0;

        double[][] ChoixDuVote = new double[nbCandidat][vote];

        ChoixDuVote[0][0] = 1;
        ChoixDuVote[0][1] = 2;
        ChoixDuVote[0][2] = 3;
        ChoixDuVote[0][3] = 4;

        ChoixDuVote[1][0] = 0;
        ChoixDuVote[1][1] = 0;
        ChoixDuVote[1][2] = 0;
        ChoixDuVote[1][3] = 0;

        while (candidat != -1) {

            System.out.println("1 - Émilie FRELAND");
            System.out.println("2 - Gérard BOUCHARD");
            System.out.println("3 - Marie JUSTEAU");
            System.out.println("4 - Nadia LETORD");
            System.out.println();
            System.out.println("Choisissez parmi :");

            candidat = console.nextInt();

            switch (candidat) {
                case 1:
                    ChoixDuVote[1][0] += 1;
                    nbvotes++;
                    break;
                case 2:
                    ChoixDuVote[1][1] += 1;
                    nbvotes++;
                    break;
                case 3:
                    ChoixDuVote[1][2] += 1;
                    nbvotes++;

                    break;
                case 4:
                    ChoixDuVote[1][3] += 1;
                    nbvotes++;

                    break;

                case -1:
                    System.out.print("Voici les résultats:");

                default:
                    break;
            }
        }

        System.out.println();
        System.out.printf("1 - Émilie FRELAND: %.0f ", ChoixDuVote[1][0]);
        System.out.printf(" | 2 - Gérard BOUCHARD: %.0f", ChoixDuVote[1][1]);
        System.out.printf(" | 3 - Marie JUSTEAU: %.0f", ChoixDuVote[1][2]);
        System.out.printf(" | 4 - Nadia LETORD: %.0f", ChoixDuVote[1][3]);
        System.out.println();
        System.out.println();
        System.out.println("Nombre de votes: " + nbvotes);
        System.out.println();
        System.out.printf("1 - Émilie FRELAND: %.2f%% %n", (ChoixDuVote[1][0] / nbvotes) * 100);
        System.out.printf("2 - Gérard BOUCHARD: %.2f%% %n", (ChoixDuVote[1][1] / nbvotes) * 100);
        System.out.printf("3 - Marie JUSTEAU: %.2f%% %n", (ChoixDuVote[1][2] / nbvotes) * 100);
        System.out.printf("4 - Nadia LETORD: %.2f%% %n", (ChoixDuVote[1][3] / nbvotes) * 100);

        console.close();
    }
}
