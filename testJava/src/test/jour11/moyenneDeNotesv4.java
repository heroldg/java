package test.jour11;

import java.util.Scanner;

public class moyenneDeNotesv4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        final int MAX = 10;
        int[] TableauNotes = new int[MAX];
        int nbNotes = 0;
        int note;
        int somme = 0;

        do {
            System.out.println("Notes ? [-1 pour mettre fin]");
            note = console.nextInt();
            if (note != -1) {
                TableauNotes[nbNotes] = note;
                nbNotes++;

            }
        } while (note != -1);
        if (nbNotes == MAX) {
            System.out.println("Une moyen de plus de 10 000 notes... maximum atteint");
        } else {
            System.out.print("La moyen des notes:");
            for (int i = 0; i < nbNotes; i++) {
                System.out.print(TableauNotes[i] + "; ");
                somme += TableauNotes[i];
            }

            System.out.println();
            System.out.println("Total(" + somme + ") divisé par le Nombres de notes (" + nbNotes + ")");
            System.out.println("Moyenne :" + somme / nbNotes);

        }
        console.close();
    }
}
