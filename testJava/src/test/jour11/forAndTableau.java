package test.jour11;

public class forAndTableau {
    public static void main(String[] args) {

        // Méthode avec une constante [for]
        final int TAILLE = 10;
        int[] tab = new int[TAILLE];
        for (int i = 0; i < TAILLE; i++) {
            tab[i] = i + 1;
        }

        // Méthode avec une tableau.length [for]
        int[] tableau = new int[10];
        for (int i = 0; i < tableau.length; i++) {
            tab[i] = i + 1;
        }

        // Méthode foreach : for(type_d_une_case nom_variable) : tableau
        for (int val : tab) {
            System.out.println(val);
        }

    }
}
