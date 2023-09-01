package test.LesElementsAbstraits;

import java.util.Random;

import test.POONEWONE.batailleNavale.Bateau;
import test.RelationsClassesV2.Cours.GrilleDeJeu;

public class JoueurOrdinateur extends Joueur {
    private static Random r = new Random();

    public JoueurOrdinateur() {
        this.nom = "Ordinateur";

    }

    @Override
    public void positionnerBateau(Bateau b) {
        int colonne, ligne;
        boolean orientHoriz;

        do {
            orientHoriz = JoueurOrdinateur.r.nextBoolean();
            if (orientHoriz) {
                ligne = JoueurOrdinateur.r.nextInt(GrilleDeJeu.HAUTEUR);
                colonne = JoueurOrdinateur.r.nextInt(GrilleDeJeu.LARGEUR - b.getLongueur() + 1);
            } else {
                ligne = JoueurOrdinateur.r.nextInt(GrilleDeJeu.HAUTEUR - b.getLongueur() + 1);
                colonne = JoueurOrdinateur.r.nextInt(GrilleDeJeu.LARGEUR);

            }
        } while (!this.ajouterBateau(ligne, colonne, orientHoriz, b));

    }

    @Override
    public boolean tirer() {
        int lat, lon;
        do {
            lat = JoueurOrdinateur.r.nextInt(GrilleDeJeu.HAUTEUR);
            lon = JoueurOrdinateur.r.nextInt(GrilleDeJeu.LARGEUR);

        } while (this.champsDeTir.get(lat, lon) != GrilleDeJeu.INCONNU);

        System.out.println(this.nom + " tire en []" + (lat + 1) + ";" + (lon + 1) + "] ");

        return this.testerTir(lat, lon);
    }
}
