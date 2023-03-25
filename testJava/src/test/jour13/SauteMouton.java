package test.jour13;

import java.util.Scanner;

public class SauteMouton {
    public static final int TERRAINDEJEU = 7;
    public static char terrain[] = new char[TERRAINDEJEU];
    public static char montonLeft = '>';
    public static char montonRight = '<';

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        initialiserTerrain();

        System.out.println();

        while (terrain[4] != montonLeft || terrain[5] != montonLeft || terrain[6] != montonLeft
                || terrain[0] != montonRight || terrain[1] != montonRight || terrain[2] != montonRight) {
            System.out.println();
            System.out.println("Quel pion voulez-vous déplacer ?");
            int montonMove = console.nextInt();
            if (montonMove == 111) {
                montonMove = 3;
                initialiserTerrain();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("Recommencez depuis le début");

            }

            gameRules(montonMove);

            System.out.print("             |____ Répondez '111' si vous souhaitez recommencer____|   ");

        }

        System.out.println();
        System.out.println("         BRAVO ! ");
        System.out.println("        Let's Go !");

        console.close();
    }

    public static void initialiserTerrain() {
        terrain[0] = montonLeft;
        terrain[1] = montonLeft;
        terrain[2] = montonLeft;
        terrain[3] = ' ';
        terrain[4] = montonRight;
        terrain[5] = montonRight;
        terrain[6] = montonRight;

        System.out.println("          GAME SPACE          ");
        System.out.println("| 0 | 1 | 2 | 3 | 4 | 5 | 6 | ");
        System.out.print("| ");
        for (int i = 0; i < terrain.length; i++) {
            System.out.print(terrain[i]);
            System.out.print(" | ");
        }
    }

    public static void gameRules(int i) {

        // Les régles pour les moutons de gauches
        if (terrain[i] == montonLeft && terrain[i + 1] == ' ') {
            terrain[i + 1] = montonLeft;
            terrain[i] = ' ';
        }
        if (terrain[i] == montonLeft && terrain[i + 1] == montonRight && terrain[i + 2] == ' ') {
            terrain[i + 2] = montonLeft;
            terrain[i] = ' ';
        }

        // Les régles pour les moutons de droites
        if (terrain[i] == montonRight && terrain[i - 1] == ' ') {
            terrain[i - 1] = montonRight;
            terrain[i] = ' ';
        }
        if (terrain[i] == montonRight && terrain[i - 1] == montonLeft && terrain[i - 2] == ' ') {
            terrain[i - 2] = montonRight;
            terrain[i] = ' ';
        }

        System.out.println("          GAME SPACE          ");
        System.out.println(
                "| 0 | 1 | 2 | 3 | 4 | 5 | 6 |              ------------------------------------------------------");
        System.out.print("| ");
        for (int a = 0; a < terrain.length; a++) {
            System.out.print(terrain[a]);
            System.out.print(" | ");
        }

    }
}
