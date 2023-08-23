package test.POONEWONE.batailleNavale;

public class TestBateau3 {

    public static void main(String[] args) {
        System.out.println("Voici les régles de positionnement");
        Bateau.afficherReglesPositionnement();

        Bateau.setSymboleTouche('#');
        System.out.println("Lorsqu'un bateau est touché, cela est indiqué par " + Bateau.getSymboleTouche()
                + " à l'emplacement du tir.");
    }
}
