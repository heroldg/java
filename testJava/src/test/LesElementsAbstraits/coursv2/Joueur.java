package test.LesElementsAbstraits.coursv2;

import test.POONEWONE.batailleNavale.Bateau;
import test.RelationsClassesV2.Cours.GrilleDeJeu;

public abstract class Joueur {
    protected String nom;
    protected GrilleDeJeu champsDeTir = new GrilleDeJeu();
    private Bateau[] bateaux = new Bateau[5];
    private int nbBateaux = 0;
    protected int nbBateauxCoules = 0;
    private Joueur adversaire;

    public String getNom() {
        return this.nom;
    }

    public Joueur getAdversire() {
        return this.adversaire;
    }

    public void setAdversaire(Joueur adversaire) {
        if (adversaire != this) {
            this.adversaire = adversaire;
        }
    }

    public abstract void positionnerBateau(Bateau b);

    public abstract boolean tirer();

    protected boolean ajouterBateau(int ligne, int colonne, boolean orientHoriz, Bateau b) {
        boolean ok = true;
        int c = 0;
        while (ok && c < b.getLongueur()) {
            int n = 0;
            while (ok && n < this.nbBateaux) {
                if (orientHoriz) {
                    ok = !this.bateaux[n].utilise(ligne, colonne + c);
                }

                ok = !this.bateaux[n].utilise(ligne + c, colonne);
                n++;
            }
            c++;
        }
        if (ok) {
            b.positionner(ligne, colonne, orientHoriz);
            this.bateaux[this.nbBateaux] = b;
            this.nbBateaux++;
        } else {
            System.out.println("Le bateau ne peut être positionné à cet emplacement, il se superpose à un autre.");
        }
        return ok;
    }

    protected boolean testerTir(int ligne, int colonne) {
        boolean gagne = false;
        // int resultatTir =
        int resultatTir = this.champsDeTir.get(ligne, colonne);
        if (resultatTir != GrilleDeJeu.INCONNU) {
            System.out.println("Vous avez déja tiré à cette position");

        } else {
            resultatTir = 0;
            int n = 0;
            while (resultatTir == 0 && n < this.adversaire.nbBateaux) {
                resultatTir = this.adversaire.bateaux[n].testerTir(ligne, colonne);
                n++;
            }
            if (resultatTir == 0) {
                System.out.println("Plouf !");
                this.champsDeTir.set(ligne, colonne, GrilleDeJeu.PLOUF);

            } else {
                System.out.println("Coulé ! vous avez coulé son " + this.adversaire.bateaux[n - 1].getType());
                this.adversaire.nbBateauxCoules++;
                gagne = this.adversaire.nbBateaux == this.adversaire.nbBateauxCoules;
            }
        }

        return gagne;
    }

}
