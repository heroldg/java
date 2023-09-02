package test.LesElementsAbstraits.cours;

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
        boolean orientHoriz;

        do {
            orientHoriz = Outils.choix("Quel orientation souhaitez-vous pour le " + b.getType() + "?",
                    orientations) == 1;
            if (orientHoriz) {
                ligne = Outils.saisirEntreBornes("Ligne", 1, GrilleDeJeu.HAUTEUR) - 1;
                colonne = Outils.saisirEntreBornes("Colonne", 1, GrilleDeJeu.LARGEUR) - 1;

            } else {

                ligne = Outils.saisirEntreBornes("Ligne du hait du bateau ?", 1,
                        GrilleDeJeu.HAUTEUR - b.getLongueur() + 1)
                        - 1;
                colonne = Outils.saisirEntreBornes("Colonne", 1, GrilleDeJeu.LARGEUR) - 1;
            }

        } while (!ajouterBateau(ligne, colonne, orientHoriz, b));
    }

    @Override
    public boolean tirer() {

        this.champsDeTir.afficher();
        int lat = Outils.saisirEntreBornes("Ligne", 1, GrilleDeJeu.HAUTEUR) - 1;
        int lon = Outils.saisirEntreBornes("Colonne", 1, GrilleDeJeu.LARGEUR) - 1;

        return this.testerTir(lat, lon);
    }

}
