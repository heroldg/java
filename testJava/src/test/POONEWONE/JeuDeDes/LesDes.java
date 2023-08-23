package test.POONEWONE.JeuDeDes;

import java.util.Random;

public class LesDes {

    protected int nbFacesDes;
    protected int lastFace;

    public LesDes(int nbFacesDes) {
        this.nbFacesDes = nbFacesDes;
    }

    public LesDes() {
        this.nbFacesDes = 6;
    }

    public int getNbFacesDes() {

        return this.nbFacesDes;
    }

    public int getLastFace() {
        return this.lastFace;
    }

    public void setNbFacesDes(int nbFacesDes) {
        if (nbFacesDes == 0) {
            System.out.println("Le nombre de face d'un dès ne peut pas être 0.");
        }
        this.nbFacesDes = nbFacesDes;
    }

    public int lancer() {
        Random r = new Random();
        lastFace = (int) (1 + r.nextInt(this.nbFacesDes));
        return this.lastFace;
    }
}
