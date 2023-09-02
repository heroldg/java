package test.LesElementsAbstraits.cours;

import java.util.Scanner;

public class Jeux {
    // new Reversi(), new Maximot, new Monopoly(), new Demineur() |________tab
    // Jouable[]
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choix;
        Jouable[] jeuxDisponibles = { new BatailleNavale() };
        do {
            System.out.println("==== Menu principale ====");
            for (int i = 0; i < jeuxDisponibles.length; i++) {
                System.out.printf("%d - %s%n,", i + 1, jeuxDisponibles[i].getNomDuJoueur());
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
