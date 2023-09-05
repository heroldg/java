package test.LesElementsAbstraits.correction.VitesseMoyenneVersionMultilingue;

public class Francaise implements Traduction {
    public String saisieDistance() {
        return "Saissisez la distance parcurue (km)";
    }

    public String saisieTemps() {
        return "Saissisez le temps de parcours (min)";
    }

    public String debutReponse() {
        return "Vous vous êtes déplacé à ";
    }

    public String finReponse() {
        return " km/h";
    }
}
