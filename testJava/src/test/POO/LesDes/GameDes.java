package test.POO.LesDes;

import java.util.Random;

public class GameDes {
    // LEs attributs d'instance
    private int nbFaces;
    private int faceTiree;

    // Déclaration constructeur
    GameDes(int nbFaces) {
        this.nbFaces = nbFaces;
        this.faceTiree = lancer();
    }

    GameDes() {
        setNbfaces(6);
    };

    // Getters
    public int getNbFaces() {
        return this.nbFaces;

    }

    public int getFaceTiree() {
        return faceTiree;
    }

    // Setters
    public void setNbfaces(int nbFaces) {
        this.nbFaces = nbFaces;
    }

    // Function lancer
    public int lancer() {
        Random r = new Random();
        this.faceTiree = (int) (1 + r.nextInt(this.nbFaces));
        return this.faceTiree;
    }
}
