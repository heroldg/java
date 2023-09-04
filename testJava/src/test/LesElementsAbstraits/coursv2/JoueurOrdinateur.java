package test.LesElementsAbstraits.coursv2;

import java.util.Random;

import test.POONEWONE.batailleNavale.Bateau;
import test.RelationsClassesV2.Cours.GrilleDeJeu;

public class JoueurOrdinateur extends Joueur {
    private static Random R = new Random();

    public JoueurOrdinateur() {
        this.nom = "Ordinateur";
    }

    @Override
    public void positionnerBateau(Bateau b) {
        int colonne, ligne;
        boolean orienHoriz;

        do {
            orienHoriz = JoueurOrdinateur.R.nextBoolean();
            if (orienHoriz) {
                ligne = JoueurOrdinateur.R.nextInt(0, GrilleDeJeu.HAUTEUR - 1);
                colonne = JoueurOrdinateur.R.nextInt(0, GrilleDeJeu.LARGEUR - b.getLongueur());
            } else {
                ligne = JoueurOrdinateur.R.nextInt(0, GrilleDeJeu.HAUTEUR - b.getLongueur());
                colonne = JoueurOrdinateur.R.nextInt(0, GrilleDeJeu.LARGEUR - 1);

            }
        } while (!this.ajouterBateau(ligne, colonne, orienHoriz, b));
    }

    @Override
    public boolean tirer() {
        int lat, lon;
        do {
            lat = JoueurOrdinateur.R.nextInt(GrilleDeJeu.HAUTEUR);
            lon = JoueurOrdinateur.R.nextInt(GrilleDeJeu.LARGEUR);

        } while (this.champsDeTir.get(lat, lon) != GrilleDeJeu.INCONNU);

        return this.testerTir(lat, lon);
    }

}
