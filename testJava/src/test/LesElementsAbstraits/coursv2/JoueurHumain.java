package test.LesElementsAbstraits.coursv2;

import java.util.Scanner;

import test.POONEWONE.batailleNavale.Bateau;
import test.RelationsClassesV2.Cours.GrilleDeJeu;
import test.RelationsClassesV2.Cours.Outils;

public class JoueurHumain extends Joueur {

    Scanner console = new Scanner(System.in);

    public JoueurHumain() {
        System.out.println("Nom du joueur ?");
        this.nom = console.nextLine();
    }

    private static final String[] orientations = { "Vertical", "Horizontal" };

    @Override
    public void positionnerBateau(Bateau b) {
        int colonne, ligne;
        boolean orienHoriz;

        do {
            orienHoriz = Outils.choix("Voulez-vouz orientez votre " + b.getType() + " horizontalement ?",
                    orientations) == 1;
            if (orienHoriz) {
                ligne = Outils.saisirEntreBornes("Ligne", 1, GrilleDeJeu.HAUTEUR) - 1;
                colonne = Outils.saisirEntreBornes("colonne", 1, GrilleDeJeu.LARGEUR) - 1;

            } else {
                ligne = Outils.saisirEntreBornes("Ligne du haut du bateau ?", 1,
                        GrilleDeJeu.HAUTEUR - b.getLongueur() + 1);
                colonne = Outils.saisirEntreBornes("Colonne", 1, GrilleDeJeu.LARGEUR - 1);
            }
        } while (!ajouterBateau(ligne, colonne, orienHoriz, b));

    }

    @Override
    public boolean tirer() {
        this.champsDeTir.afficher();
        int lat = Outils.saisirEntreBornes("Ligne", 1, GrilleDeJeu.HAUTEUR) - 1;
        int lon = Outils.saisirEntreBornes("colonne", 1, GrilleDeJeu.LARGEUR) - 1;

        return this.testerTir(lat, lon);

    }
}
