package test.LesElementsAbstraits;

import test.POONEWONE.batailleNavale.Bateau;
import test.RelationsClassesV2.Cours.GrilleDeJeu;
import test.RelationsClassesV2.Cours.Outils;

public abstract class Joueur {
    protected String nom;
    protected GrilleDeJeu champsDeTir = new GrilleDeJeu();
    private Bateau[] bateaux = new Bateau[5];
    private int nbBateaux = 0;
    protected int nbBateauxCoules = 0;
    private Joueur adversaire;

    private String[] orientations = { "Horizontal", "Vertical" };

    public String getNom() {
        return this.nom;
    }

    public Joueur getAdversaire() {
        return this.adversaire;
    }

    public void setAdversaire(Joueur adversaire) {
        if (adversaire != this) {
            this.adversaire = adversaire;
        }
    }

    public void positionnerBateau(Bateau b) {
        int colonne, ligne;
        boolean orientHoriz;
        do {
            orientHoriz = Outils.choix("Quelle orientation souhaitez-vous pour le " + b.getType() + " ?",
                    orientations) == 1;
            if (orientHoriz) {
                ligne = Outils.saisirEntreBornes("Ligne ?", 1, GrilleDeJeu.HAUTEUR) - 1;
                colonne = Outils.saisirEntreBornes("Colonne de début du bateau ? ", 1, b.getLongueur() + 1) - 1;
            } else {
                ligne = Outils.saisirEntreBornes("Ligne du haut du bateau ?", 1,
                        GrilleDeJeu.HAUTEUR - b.getLongueur() + 1)
                        - 1;
                colonne = Outils.saisirEntreBornes("Colonne ?", 1, GrilleDeJeu.LARGEUR) - 1;

            }

        } while (!ajouterBateau(ligne, colonne, orientHoriz, b));
    }

    private boolean ajouterBateau(int ligne, int colonne, boolean orientHoriz, Bateau b) {
        boolean ok = true;
        int c = 0;
        while (ok && c < b.getLongueur()) {
            int n = 0;
            while (ok && n < this.nbBateaux) {
                if (orientHoriz) {
                    ok = !this.bateaux[n].utilise(ligne, colonne + c);
                } else {
                    ok = !this.bateaux[n].utilise(ligne + c, colonne);
                    n++;
                }
            }
            c++;

            if (ok) {
                b.positionner(ligne, colonne, orientHoriz);
                this.bateaux[this.nbBateaux] = b;
                this.nbBateaux++;
            } else {
                System.out.println(
                        "Le bateau ne peut pas être positionné à cet emplacement, il se superpose à un autre.");
            }

        }

        return ok;
    }

    public boolean tirer() {
        this.champsDeTir.afficher();
        int lat = Outils.saisirEntreBornes("Ligne ?", 1, GrilleDeJeu.HAUTEUR) - 1;
        int lon = Outils.saisirEntreBornes("Colonne ?", 1, GrilleDeJeu.LARGEUR) - 1;
        return this.testerTir(lat, lon);
    }

    private boolean testerTir(int ligne, int colonne) {
        boolean gagne = false;
        int resultatTir = this.champsDeTir.get(ligne, colonne);
        if (resultatTir != GrilleDeJeu.INCONNU) {
            System.out.println("Vous avez déjà tiré à cette position");
        } else {
            resultatTir = 0;
            int n = 0;
            while (resultatTir == 0 && n < this.adversaire.nbBateaux) {
                resultatTir = this.adversaire.bateaux[n].testerTir(ligne, colonne);
                n++;
            }
            if (resultatTir == 0) {
                System.out.println("Plouf !");
                this.champsDeTir.set(ligne, colonne, GrilleDeJeu.BOOM);
            } else {
                System.out.println("Touché !");
                if (resultatTir == Bateau.COULE) {
                    System.out.println("Coulé ! Vous avez coulé son " + this.adversaire.bateaux[n - 1].getType());
                    this.adversaire.nbBateauxCoules++;
                    gagne = this.adversaire.nbBateaux == this.adversaire.nbBateauxCoules;
                }

            }
        }

        return gagne;

    }
}
