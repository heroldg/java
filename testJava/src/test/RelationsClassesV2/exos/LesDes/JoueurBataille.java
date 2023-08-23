package test.RelationsClassesV2.exos.LesDes;

import java.util.Random;

import test.POONEWONE.JeuDeDes.LesDes;

public class JoueurBataille extends LesDes {
    // private int nbJetons = 10;
    private LesDes deSixFaces;
    // private String nomJoueur;
    // private JoueurBataille adversaire;

    public JoueurBataille() {
        this.deSixFaces = new LesDes();
    }

    public int lancer() {
        Random r = new Random();
        lastFace = (int) (1 + r.nextInt(this.nbFacesDes));
        return this.lastFace;
    }

    public int lancerJoueur(String nom) {
        int lastPLay = deSixFaces.lancer();
        System.out.println(nom + " a fait un " + lastPLay);

        return lastPLay;
    }

}
