package test.MEMOIRE;

import java.util.Scanner;

public class RetourTypeReference {
    public static final int H = 0;
    public static final int M = 1;
    public static final int S = 2;

    public static void main(String[] args) {
        int[] temps;
        Scanner console = new Scanner(System.in);
        System.out.println(("Entrez une durée en secondes"));
        int nbSecondes = console.nextInt();
        console.nextLine();
        temps = nbSecToHMS(nbSecondes);

        System.out.printf("%02d:%02d:%02d%n", temps[H], temps[M], temps[S]);
        System.out.println(temps.equals(temps[1]));

        console.close();
    }

    public static int[] nbSecToHMS(int nbS) {
        // 2
        int[] hms = new int[4];
        hms[H] = nbS / 3600;
        nbS %= 3600;
        hms[M] = nbS / 60;
        hms[S] = nbS % 60;
        // 3
        return hms;

    }

}
