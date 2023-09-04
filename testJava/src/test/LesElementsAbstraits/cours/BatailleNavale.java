package test.LesElementsAbstraits.cours;

import test.POONEWONE.batailleNavale.Bateau;
import test.RelationsClassesV2.Cours.Outils;

public class BatailleNavale implements Jouable {

    private Joueur[] joueurs = new Joueur[2];

    public static void main(String[] args) {

        System.out.println("*** BATAILLE NAVALE ***");
        BatailleNavale bn = new BatailleNavale();
        String[] menu = { "Afficher les régles de positonnement des bateaux", "Joueur", "Quitter" };

        int choix;

        do {
            choix = Outils.choix("Menu", menu);
            switch (choix) {
                case 0:
                    Bateau.afficherReglesPositionnement();
                    break;

                case 1:
                    bn.joueur();

                    break;

            }

        } while (choix != 2);

    }

    private void joueur() {
        // créaton des joueurs
        String[] possibilites = { "Humain", "Ordinateur" };
        for (int i = 0; i < joueurs.length; i++) {
            int choix = Outils.choix("Quel type de joueur le joueur n°" + (i + 1), possibilites);
            if (choix == 0) {
                this.joueurs[i] = new JoueurHumain();
            } else {
                this.joueurs[i] = new JoueurOrdinateur();

            }
            joueurs[0].setAdversaire(this.joueurs[1]);
            joueurs[1].setAdversaire(this.joueurs[0]);
            joueurs[0].setAdversaire(joueurs[1]);
            joueurs[1].setAdversaire(joueurs[0]);

            // positionnement des bateaux
            for (Joueur j : joueurs) {
                System.out.println("C'est à " + j.getNom());
                j.positionnerBateau(Bateau.creerBateau("portes-avions", 5));
                j.positionnerBateau(Bateau.creerBateau("croiseur", 4));
                j.positionnerBateau(Bateau.creerBateau("contre-torpilleur", 3));
                j.positionnerBateau(Bateau.creerBateau("sous-marin", 3));
                j.positionnerBateau(Bateau.creerBateau("torpilleur", 2));
            }

            // début de la partie
            Joueur courant = joueurs[0];
            boolean gagne;

            do {
                System.out.println("C'est au tour de " + courant.getNom() + " de joueur");
                gagne = courant.tirer();
                if (gagne) {
                    System.out.println("C'est " + courant.getNom() + " qui gagne");
                    courant = courant.getAdversaire();
                }

            } while (!gagne);
        }
    }

    @Override
    public void jouer() {

    }

    @Override
    public String getNomDuJoueur() {
        return "Bataille Navale";
    }
}
