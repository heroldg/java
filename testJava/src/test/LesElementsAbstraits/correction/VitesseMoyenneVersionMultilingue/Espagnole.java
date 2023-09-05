package test.LesElementsAbstraits.correction.VitesseMoyenneVersionMultilingue;

public class Espagnole implements Traduction {
    public String saisieDistance() {
        return "Introduce la distancia reccorrida (km)";
    }

    public String saisieTemps() {
        return "Introduce el tiempo de viaje (min)";
    }

    public String debutReponse() {
        return "Te moviste a ";
    }

    public String finReponse() {
        return " km/h";
    }
}
