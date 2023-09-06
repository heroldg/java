package test.LesErreursEtExceptions.cours;

import java.util.Scanner;

public class CastExceptionBetterVersion {
    public static void main(String[] args) {
        Object[] objets = { "Bonjour !", new Object(), new Scanner(System.in), "Hello !" };

        for (int i = 0; i < objets.length; i++) {
            if (objets[i] instanceof String) {
                String chaine = (String) objets[i];
                System.out.printf("Dans la case d'indice %d, il y a la  chaine de caractère %s%n", i, chaine);
            } else {
                System.out.printf("Dans la case d'indice %d, il y a la  chaine de caractère %n", i);

            }
        }
    }
}
