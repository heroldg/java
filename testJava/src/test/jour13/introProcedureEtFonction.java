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

    // Déclaration d'une procédure: qui une procedure permet de synthèsiter une
    // suite d'instruction
    public static void afficherNfois(String t, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(t);
        }
    }

    // Déclaration d'une fonction: à la différence d'une procédure il est préciser
    // ce que l'ont souhaite retourner comme valeur ici "double"
    public static double puissance(double a, int n) {
        double p = 1;
        for (int i = 0; i < n; i++) {
            p *= a;
        }
        return p;
    }

}
