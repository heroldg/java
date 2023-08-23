package test.POONEWONE.batailleNavale;

public class TestBateau {
    public static void main(String[] args) {
        Bateau croiseur = new Bateau("Croiseur", 4);
        int resultatTir;

        // positionnement dansle sen vertical avec pour prèemiere case (3;7)
        croiseur.positionner(3, 7, false);

        // tir en (2;4) : normalement, le bateau n'est pas touché
        resultatTir = croiseur.testerTir(2, 4);
        if (resultatTir == 0) {
            System.out.println("Un tir hors du bateau ne lui a pas causé de dégats ! Tout va bien");
        } else {
            System.out.println("Il y a un problème ! Un tir hors du bateau lui à causé des dégats");
        }

        // tir en (6;7) : normalement ce tir touche le bateau
        resultatTir = croiseur.testerTir(6, 7);
        if (resultatTir == Bateau.TOUCHE) {
            System.out.println("Le bateau à été touché ! Tout va bien");
        } else {
            System.out.println("Il y a un problème !Le bateau n'a pas été touché");
        }

        // tir en (5;7) : normalement ce tir touche le bateau
        resultatTir = croiseur.testerTir(5, 7);
        if (resultatTir == Bateau.TOUCHE) {
            System.out.println("Le bateau à été touché ! Tout va bien");
        } else {
            System.out.println("Il y a un problème !Le bateau n'a pas été touché");
        }

        // tir en (4;7) : normalement ce tir touche le bateau
        resultatTir = croiseur.testerTir(4, 7);
        if (resultatTir == Bateau.TOUCHE) {
            System.out.println("Le bateau à été touché ! Tout va bien");
        } else {
            System.out.println("Il y a un problème !Le bateau n'a pas été touché");
        }

        // tir en (3;7) : normalement ce tir coule le bateau
        resultatTir = croiseur.testerTir(3, 7);
        if (resultatTir == Bateau.COULE) {
            System.out.println("Le " + croiseur.getType() + " a été coulé ! Tout va bien !");
            croiseur.setType("épave de croiseur");
            System.out.println("C'est maintenant une  " + croiseur.getType());
        } else {
            System.out.println("Il y a un problème !Le bateau n'a pas été touché");
        }

    }
}
