package test.POO.LesJeuxDeDes;

public class TroisDes {
    public static void main(String[] args) {

        int somme = 0;

        do {
            System.out.println("---------------------------------------------");

            JeuxDes Des6faces = new JeuxDes(6);

            int resultat1 = Des6faces.launchOfDes(6, 0);
            System.out.println("Le dé à six faces : " + resultat1);

            JeuxDes Des10faces = new JeuxDes(10);

            int resultat2 = Des10faces.launchOfDes(10, 0);
            System.out.println("Le dé à dix faces : " + resultat2);

            JeuxDes Des12faces = new JeuxDes(12);

            int resultat3 = Des12faces.launchOfDes(12, 0);
            System.out.println("Le dé à douze faces : " + resultat3);

            System.out.println();

            somme = (resultat1 + resultat2 + resultat3);
            System.out.println("somme égale " + somme + " (" + resultat1 + " + " + resultat2 + " + " + resultat3 + ")");
            System.out.println();

        } while (somme <= 20);

        System.out.print(" Fin.");

    }
}
