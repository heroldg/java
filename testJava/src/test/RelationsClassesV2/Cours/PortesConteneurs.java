package test.RelationsClassesV2.Cours;

import test.POONEWONE.batailleNavale.Bateau;

public class PortesConteneurs extends Bateau {
    private int largeur;

    public PortesConteneurs(int largeur, int longueur) {
        initialiser("porte-conteneurs", longueur);
        this.largeur = largeur;

    }

    public int getLargeur() {
        return this.largeur;
    }

    @Override
    // J'ai changer la visibilité en public pour pouvoir faire fonctionne
    // transtypage2, protected to public
    public int getNbcasesUtilisees() {
        return super.getNbcasesUtilisees() * this.largeur;
    }

    @Override

    public boolean utilise(int latitude, int longitude) {
        return this.horizontale && this.latitude <= latitude && latitude < this.latitude + this.largeur
                && this.longitude <= longitude && longitude < this.longitude + this.longueur
                || !this.horizontale && this.longitude <= longitude && longitude < this.longitude + this.largeur
                        && this.latitude <= latitude && latitude < this.latitude + this.latitude + this.longueur;
    }

}
