package test.MEMOIRE;

import java.util.Random;

public class Memoire {
    public static void main(String[] args) {
        System.out.printf("La plage de valeur d'un int (32 bits) va de %d a %d%n", Integer.MIN_VALUE,
                Integer.MAX_VALUE);

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(" " + i);
        }

        for (char i = 'A'; i <= 'Z'; i++) {
            int ptCode = i;
            System.out.printf("%n %s a pour point de code U+%X%n", i, ptCode);
        }

        System.out.printf("%-20s%-20s%%-20s%n", "point de code", "valeur", "en baqe 10", "caractère");
        for (int i = 32; i < 127; i++) {
            char c = (char) i;
            System.out.printf("U+%-18X%-20d%-20s%n", i, i, c);

        }

        Random r = new Random();
        char c = (char) ('A' + r.nextInt(26));
        System.out.print("Lettre aléatoire: " + c + "   ");

        if (c > 'R') {

            System.out.printf("Le caractère %s est après le caractère R%n", c);
        }

    }
}
