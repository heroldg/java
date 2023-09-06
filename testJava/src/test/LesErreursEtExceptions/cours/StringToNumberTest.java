package test.LesErreursEtExceptions.cours;

import java.util.Scanner;

public class StringToNumberTest {

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Entrez un nombre entier");
        int val;
        try {
            val = str2Int(s.nextLine());
            System.out.println("C'est bien un nombre entier : " + val);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("La conversion n'est pas possible car " + e.getMessage());

        }

    }

    public static int str2Int(String chaine) throws Exception {
        int retour = 0;
        for (int i = 0; i < chaine.length(); i++) {
            char c = chaine.charAt(i);
            retour *= 10;
            if (!Character.isDigit(c)) {
                throw new Exception("un caractère n'est pas un chiffre");
            }
            retour += c - '0';
        }
        return retour;

    }
}
