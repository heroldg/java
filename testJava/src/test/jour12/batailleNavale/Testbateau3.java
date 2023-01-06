package test.jour12.batailleNavale;

public class Testbateau3 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Voici les régles de positionnement des bateaux à la bataille navale :");
        System.out.println();
        Bateau.afficherReglesPositionnement();
        System.out.println();
        Bateau.setSymboleTouche('#');
        System.out.println("Lorsqu'un bateau est touché cela est indiqué par un " + Bateau.getSymboleTouche()
                + " à l'emplacement du tir.");

    }
}
