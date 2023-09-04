package test.LesElementsAbstraits.coursv2;

import java.util.Scanner;

import test.LesElementsAbstraits.coursv2.AutreJeux.Monopoly;

public class Jeux {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choix;
        Jouable[] jeuxDisponibles = { new BatailleNavale(), (Jouable) new Monopoly() };
        do {
            System.out.println("==== Menu principale ====");
            for (int i = 0; i < jeuxDisponibles.length; i++) {
                System.out.printf("%d - %s%n,", i + 1, jeuxDisponibles[i].getNomDuJeu());
            }
            System.out.printf("%d - Quitter%n,", jeuxDisponibles.length + 1);
            choix = s.nextInt() - 1;
            s.nextLine();
            if (choix >= 0 && choix < jeuxDisponibles.length) {
                jeuxDisponibles[choix].jouer();

            }

        } while (choix != jeuxDisponibles.length);

        s.close();
    }
}
