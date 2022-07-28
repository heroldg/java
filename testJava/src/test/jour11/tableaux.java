package test.jour11;

public class tableaux {
    public static void main(String[] args) {

        // Quelque exemple de déclaration de tableaux

        // Déclaration d'un tableau de 10 entiers :
        // int[] te = new int[10];

        // Déclaration d'un tableau de 3 nombres réels :
        // double[] tr = new double[3];

        // Déclaraion d'un tableau de 30 caractères :
        // char[] tc = new char[30];

        // Déclaration d'un tableau de 6 chaînes de caractères :
        // String[] tt = new String[6];

        // Déclaration d'un tableau d'entiers directement initialisé
        // int[] tab = { 17, 51, 43, 22, 7, 91, 17, 34, 4, 12 };

        double[] tabExemple = new double[3];
        tabExemple[0] = 1.61803398875;
        tabExemple[1] = 2.71828182846;
        tabExemple[2] = 3.14159265359;

        System.out.println("nombre d'or = " + tabExemple[0]);
        System.out.println("e = " + tabExemple[1]);
        System.out.println("pi = " + tabExemple[2]);
    }
}
