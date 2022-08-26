package test.jour11;

public class queFaitildonc {
    public static void main(String[] args) {
        final int TAILLE = 4;
        int i, j, val;
        int[][] tab2d = new int[TAILLE][TAILLE];
        val = 0;

        for (j = 0; j < tab2d.length; j++) {
            val = j;
            for (i = 0; i < tab2d.length; i++) {
                System.out.print(tab2d[j][i] = val);
                val++;
            }
            System.out.println(/* tab2d[j][i] = val */);
        }
    }
}
