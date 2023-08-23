package test.jour11;

public class forAndTableau {
    public static void main(String[] args) {

        // Méthode avec une constante [for]
        System.out.println("1.");
        System.out.println();
        final int TAILLE = 10;
        int[] tab = new int[TAILLE];
        for (int i = 0; i < TAILLE; i++) {
            tab[i] = i + 1;
            System.out.println(tab[i]);
        }

        // Méthode avec une tableau.length [for]
        System.out.println("2.");
        System.out.println();
        int[] tableau = new int[10];
        for (int i = 0; i < tableau.length; i++) {
            tab[i] = i + 1;
            System.out.println(tab[i] = i + 1);
        }

        // Méthode foreach : for(type_d_une_case nom_variable) : tableau
        System.out.println("3.");
        System.out.println();
        for (int val : tab) {
            System.out.println(val);
        }

    }
}
