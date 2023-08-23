package test.RelationsEntreClasses.Cours;

import test.POONEWONE.batailleNavale.Bateau;

public class PorteConteneurs extends Bateau {

    private int largeur;

    public PorteConteneurs(int largeur, int longueur) {
        super("porte-conteneurs", longueur);
        this.largeur = largeur;
    }

    private int getLargeur() {
        return this.largeur;
    }

    @Override
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
