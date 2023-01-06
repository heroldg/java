package test.jour12;

public class JeuxdeDes {
    // Attribut instances: Ses attribut son propres à chaque instance
    private int nbFaces;
    private int lastFacePlay;

    public void des(int nbFaces) {
        this.nbFaces = nbFaces;
    }

    public void desSixFaces() {
        this.nbFaces = 6;
    }

    public int getNbFaces() {
        return this.nbFaces;
    }

    public int GetLastFacePlay() {
        return this.lastFacePlay;
    }

    public void setNbfaces(int nbFaces) {
        this.nbFaces = nbFaces;
    }

}
