package test.jour11;

public class Tableaux2D {
    public static void main(String[] args) {
        final int NB_LIGNES = 2;
        final int NB_COLONNES = 3;

        char[][] tab2d = new char[NB_LIGNES][NB_COLONNES];
        tab2d[0][0] = 'E';
        tab2d[0][1] = 'N';
        tab2d[0][2] = 'I';
        tab2d[1][0] = 'D';
        tab2d[1][1] = 'E';
        tab2d[1][2] = 'V';

        for (int j = 0; j < NB_LIGNES; j++) {
            for (int i = 0; i < NB_COLONNES; i++) {
                System.out.print(tab2d[j][i]);
            }
            System.out.println();
        }
    }

    // Dans le cas d'un tableau à deux dimensions comme tab2d, lorsqu'est appelé
    // .length, c'est la taille de la premiere dimension qui est récupérée. Pour
    // récupérér la taille de l'autre dimension il faut specialiser le nombre de
    // colonnes de quelle lignes nous souhaitons récupérer (pour le moment toutes
    // les lignes ont le même nombre de colonnes) maos il est possible que ce ne
    // soit pzd le cas. Voici donc comment peut être réécrite la double boucle
    // d'affichage du programme précédent.

    /*
     * For(int j= j ; <tab2d.length ; j++)
     * System.out.print(tab2d[j][i]);
     * System.out.println();
     */
}
