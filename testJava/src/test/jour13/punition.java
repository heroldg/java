package test.jour13;

import java.util.Scanner;

public class punition {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Quelle phrase avez vous comme punition ?");
        String phrase = console.nextLine();
        System.out.println("Combiend e fois souhaiter vous la recopier?");
        int nbFois = console.nextInt();
        console.nextLine();
        afficheNfois(phrase, nbFois);
        console.close();

    }

    // Ce bloc de code est la procédure qui regroupe une suite d'instruction
    // générique qui pourra être réutilisé lorsque que l'ont l'appel comme dans la
    // ligne 11 de cette page
    private static void afficheNfois(String t, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(t);
        }
    }
}
