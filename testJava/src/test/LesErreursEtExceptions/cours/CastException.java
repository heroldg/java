package test.LesErreursEtExceptions.cours;

import java.util.Scanner;

public class CastException {
    public static void main(String[] args) {
        Object[] objects = { "Bonjour !", new Object(), new Scanner(System.in), "Hello" };
        for (int i = 0; i < objects.length; i++) {
            try {
                String chaine = (String) objects[i];
                System.out.printf("Dans la case d'indice %d, il y a la chaîne de caractère %s%n", i, chaine);

            } catch (ClassCastException e) {
                // TODO: handle exception
                System.out.printf("Daans la case d'indice %d, il y a auche chose qu'une chaîne de caractère%n", i);
            }
        }
    }
}
