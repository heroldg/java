package test.jour13;

public class introProcedureEtFonction {

    public static void main(String[] args) {
        // procédure principale auto suggère
    }

    public static void nom_de_la_procedure() {
        // procedure déclarer sans autosuggestion
    }
    /*
     * public static type_retour
     * nom_de_la_fonction(){
     * //Traitements
     * 
     * return valeur;
     * }
     */

    // exemple de procédure à l'emploi
    public static void afficherNfois(String t, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(t);
        }
    }

    public static double puissance(double a, int n) {
        double p = 1;
        for (int i = 0; i < n; i++) {
            p *= a;
        }
        return p;
    }

}
