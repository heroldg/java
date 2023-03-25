package test.jour13;

import java.util.Scanner;

public class PunitionRecursive {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Quelle punition avez vous à copier ?");
        String phrase = console.nextLine();
        System.out.println("Combien de fois avez-vous à la copier ?");
        int nbFois = console.nextInt();
        console.nextLine();
        afficherNFoisRec(phrase, nbFois);
        console.close();
    }

    public static void afficherNFoisRec(String t, int n) {
        System.out.println(t);
        if (n - 1 > 0)
            afficherNFoisRec(t, n - 1);
    }
}
