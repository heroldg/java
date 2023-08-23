package test.POO.LesJeuxDeDes;

import java.util.Random;

public class JeuxDes {

    // Les attributs d'instance
    private int nbFaces;
    private int lastFacePlay;

    // Déclarations de 2 constructeurs
    public JeuxDes(int nbFaces) {
        this.nbFaces = nbFaces;
    }

    // Créé un des a 6 faces
    public JeuxDes() {

    }

    // GETTERS DES 2 ATTRIBUTS D'INSTANCE
    public int getNbFaces() {
        return this.nbFaces;
    }

    public int getLastFacePlay() {
        return this.lastFacePlay;
    }

    public void setNfFaces(int nbFaces) {
        // il faut mettre en parametre int nbFaces
        this.nbFaces = nbFaces;
    }

    // Simuler le lancer de dé
    public int launchOfDes(int nbFaces, int lastFacePlay) {
        Random r = new Random();
        int play = (int) (1 + r.nextInt(nbFaces));
        lastFacePlay = play;

        return play;
    }

}
