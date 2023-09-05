package test.LesElementsAbstraits.correction.VitesseMoyenneVersionMultilingue;

public class Anglaise implements Traduction {

    public String saisieDistance() {
        return "Enter the travel time (km) :";
    }

    public String saisieTemps() {
        return "Enter the travel time (min)";
    }

    public String debutReponse() {
        return "you moved at ";
    }

    public String finReponse() {
        return " km/h";
    }
}
