package test.POO.batailleNavale;

public class TestBateau3 {
    public static void main(String[] args) {
        System.out.println("Voici les règles de positionnement des bateaux à la bataille navale");
        BATEAU.afficherLesReglesPositionnement();

        System.out.println("Lorsqu'un bateau est touché, cela est indiqué par un " + BATEAU.getSymboleTouche()
                + " à l'emplacement du tir.");
    }
}
