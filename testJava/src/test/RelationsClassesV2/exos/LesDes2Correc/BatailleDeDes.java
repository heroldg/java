package test.RelationsClassesV2.exos.LesDes2Correc;

public class BatailleDeDes {

    private static JoueurBataille j1 = new JoueurBataille();
    private static JoueurBataille j2 = new JoueurBataille();
    private static boolean fin;
    private static int score1, score2;

    public static void main(String[] args) {
        do {
            score1 = j1.tourDeJeu();
            score2 = j2.tourDeJeu();

            if (score1 > score2) {
                System.out.println(j1.getNom() + " remporté");
                j1.gagneUnJeton();
                fin = j2.perdUnJeton();
            } else if (score1 < score2) {
                System.out.println(j2.getNom() + " remporté");
                j2.gagneUnJeton();
                fin = j1.perdUnJeton();

            } else {
                System.out.println("Égalité");
                fin = false;
            }

            System.out.println(
                    "Score :" + j1.getNom() + " " + j1.getNbJetons() + " - " + j2.getNom() + " " + j2.getNbJetons());

        } while (!fin);

        if (j1.getNbJetons() == 0) {
            System.out.println(j2.getNom() + " gagne !");
        } else {
            System.out.println(j1.getNom() + " gagne !");

        }
    }

}
