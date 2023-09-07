package test.LesErreursEtExceptions.Correction.CreationCalculatrice;

import java.util.Scanner;

import javax.crypto.BadPaddingException;

public class Lacalculatrice {

    private static final Scanner s = new Scanner(System.in);
    private static final String OPERATEURS = "+-*/%q";

    public static void main(String[] args) {
        int valeur = saisirEntier();
        char operateur;
        do {
            operateur = saisirOperateur();
            try {
                if (operateur != 'q') {
                    int res = 0;
                    int valeur2 = saisirEntier();
                    switch (operateur) {
                        case '+':

                            res = Operation.ajouter(valeur, valeur2);

                            break;

                        case '-':

                            res = Operation.soustraire(valeur, valeur2);

                            break;

                        case '*':

                            res = Operation.multiplication(valeur, valeur2);

                            break;

                        case '/':

                            res = valeur / valeur2;

                            break;

                        case '%':

                            res = valeur % valeur2;

                            break;

                        default:
                            break;
                    }
                    System.out.printf("%d %s %d = %d%n", valeur, operateur, valeur, valeur2);
                    valeur = res;
                }
            } catch (DepassementCapaciteException e) {
                // TODO: handle exception
                System.err.println(e.getMessage());
            } catch (ArithmeticException e) {
                System.err.println("La division par zéro n'est pas définie pour des entiers");
            }
        } while (operateur != 'q');
    }

    private static char saisirOperateur() {
        String saisie;
        boolean saisieOk;
        do {
            System.out.println("Opérateur ? (+ - * / % ou q pour quitter)");
            saisie = s.nextLine();
            saisieOk = saisie.length() == 1 && Lacalculatrice.OPERATEURS.indexOf(saisie.charAt(0)) != 1;
            if (!saisieOk) {
                System.out.println("Opératation non valide");

            }
        } while (!saisieOk);
        return saisie.charAt(0);
    }

    private static int saisirEntier() {
        System.out.println("Saisir un nombre entier");
        int valeur = 0;
        String vals = s.nextLine();
        boolean saisieOk = false;

        do {
            try {
                valeur = Integer.parseInt(vals);
                saisieOk = true;
            } catch (NumberFormatException e) {
                // TODO: handle exception
                try {
                    new BadPaddingException(vals);
                    System.err.println("La valeur saisie dépassé les capacités de cette calculatrice. Réessayez...");
                } catch (NumberFormatException f) {
                    System.err.println("Saisie incorrecte. Réessayez...");
                }
                vals = s.nextLine();
            }
        } while (!saisieOk);
        return valeur;
    }
}
