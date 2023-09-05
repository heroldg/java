package test.LesElementsAbstraits.correction.VitesseMoyenneVersionMultilingue;

public class Allemande implements Traduction {
    public String saisieDistance() {
        return "Geben Sie die zerückgelegte Entfernung ein (km) : ";
    }

    public String saisieTemps() {
        return "Geben Sie die Reisezeit ein (min)";
    }

    public String debutReponse() {
        return "Sie sind mit ";
    }

    public String finReponse() {
        return " km/h umgezogen";
    }
}
