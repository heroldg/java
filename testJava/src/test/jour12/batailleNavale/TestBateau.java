package test.jour12.batailleNavale;

public class TestBateau {
    public static void main(String[] args) {
        Bateau croiseur = new Bateau("Croiseur", 4);
        int resultatTir;

        // Positionnement dans le sens vertical avec les premièrres case (3,7)
        croiseur.positionner(3, 7, false);

        // Tir en (2;4) : normalement , le bateau n'est pas touché
        resultatTir = croiseur.testerTir(2, 4);
        if (resultatTir == 0) {
            System.out.println("Un tir du bateau ne lui a pas cause de dégâts ! Tout va bien !");
        } else {
            System.out.print("Il ya un problème ! Un tir hors du bateau lui à causé des dégâts");
        }

        // Tir en (6;7) : normalement ce tir touche le bateau
        resultatTir = croiseur.testerTir(6, 7);
        if (resultatTir == Bateau.TOUCHE) {
            System.out.println("Le bateau à bien été touché ! Tout va bien !");
        } else {
            System.out.println("Il y a un problème ! Le bateau n'a pas été touché !");
        }

        // Tir en (3;7) : normalement ce tir coule le bateau
        resultatTir = croiseur.testerTir(3, 7);
        if (resultatTir == Bateau.COULE) {
            System.out.println("LE " + croiseur.getType() + " à bien été coulé ! Tout va bien !");
            croiseur.setType("épave de croisseur");
            System.out.println("C'est maintenant une " + croiseur.getType());
        } else {
            System.out.println("Il y a un problèùe ! Le bateau n'a pas été coulé ");
        }
    }
}
