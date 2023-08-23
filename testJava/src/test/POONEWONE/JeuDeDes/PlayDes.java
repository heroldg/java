package test.POONEWONE.JeuDeDes;

public class PlayDes {
    public static final int Seuil = 20;
    int des6, des10, des12;

    public static void main(String[] args) {

        /*
         * System.out.println("Vous souhaitez jouer avec un dès à combien de face ?");
         */

        LesDes des6 = new LesDes();
        LesDes des10 = new LesDes(10);
        LesDes des12 = new LesDes(12);

        do {
            System.out.println("Tentative d'arriver à " + Seuil);
            System.out.println("Lancement du dè à six faces " + des6.lancer());
            System.out.println("Lancement du dè à dix faces " + des10.lancer());
            System.out.println("Lancement du dè à douze faces " + des12.lancer());

            System.out.println("");
            System.out.println("Total: " + (des10.getLastFace() + des12.getLastFace() + des12.getLastFace()));
            System.out.println("");

        } while ((des10.getLastFace() + des12.getLastFace() + des12.getLastFace() < Seuil));

        System.out.println("Victoire");

    }
}
