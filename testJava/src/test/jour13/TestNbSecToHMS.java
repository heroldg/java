package test.jour13;

import java.util.Scanner;

public class TestNbSecToHMS {
    public static final int H = 0;
    public static final int M = 1;
    public static final int S = 2;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Entrer une durée en secondes");
        int nbSecondes = console.nextInt();
        console.nextLine();
        console.close();
        int[] temps = nbSecToHMS(nbSecondes);
        System.out.printf("durée = %02d:%02d:%02d%n", temps[H], temps[M], temps[S]);
    }

    public static int[] nbSecToHMS(int nbS) {
        int[] hms = new int[3];
        hms[H] = nbS / 3600;
        nbS %= 3600;
        hms[M] = nbS / 60;
        hms[S] = nbS % 60;
        return hms;
    }
}
