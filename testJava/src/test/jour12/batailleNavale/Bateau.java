package test.jour12.batailleNavale;

public class Bateau {
    // Attribut d'instance: Ses attribut son propre à chaque instance
    private String type;
    private int longueur;
    private int latitude;
    private int longitude;
    private boolean horizontal;
    private int partiesTouchees = 0;

    // Attribut de classe: Collectivement utilisées
    public static char SymboleTouche = 'x';

    // Constante
    public static final int TOUCHE = 1;
    public static final int COULE = 2;

    public Bateau(String type, int longueur) {
        this.type = type;
        this.longueur = longueur;
    }

    public Bateau(String type, int longueur, int latitude, int longitude, boolean horizontal) {
        this(type, longueur);
        this.positionner(latitude, longitude, horizontal);
    }

    public String getType() {
        // La méthodes GET: le but étant de récupere la valeur d'un attribut sans pour
        // autant pouvoir changer la valeur
        return this.type;
    }

    public void setType(String type) {
        // La méthodes SET: cette méthode permet de modifié la valeur d'un attribut.
        // Généralement avant d'effectuer la modification une méthode getter vérifie si
        // la noubelle valeur respecte les régles souhaitées.
        if (type.equals(""))
            System.out.println("Le type de bateau ne peut être vide");
        else
            this.type = type;

        // Certain élément tel que {} ne sont pas présent pour faire les ifelse
    }

    public void positionner(int latitude, int longitude, boolean horizontal) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.horizontal = horizontal;
    }

    public void positionner(int latDeb, int longDeb, int latFin, int longFin) {
        if (longDeb == longFin) {
            if (longFin - longDeb + 1 == this.longueur) {
                this.horizontal = true;
                this.latitude = latDeb;
                this.longitude = longDeb;

            } else {
                System.out.println(
                        "Les coordonnées de debut et de fin de tableau ne sont pas cohérents avec la taille du bateau.");
            }
        } else {
            if (longDeb == longFin) {
                if (latFin - latDeb + 1 == this.longueur) {
                    this.horizontal = false;
                    this.latitude = latDeb;
                    this.longitude = longDeb;
                } else {
                    System.out.println(
                            "Les coordonnées de debut et de fin de tableau ne sont pas cohérents avec la taille du bateau.");
                }
            } else {
                System.out.println("Le bateau doit être positionné soit verticale soit horizontalement.");
            }
        }
    }

    public boolean utilise(int latitude, int longitude) {
        return this.horizontal && this.latitude == latitude && this.longitude <= longitude
                && longitude < this.longitude + this.longitude
                || !this.horizontal && this.longitude == longitude && this.latitude <= latitude
                        && latitude < this.latitude + this.longueur;
    }

    public int testerTir(int latitude, int longitude) {
        int ret = 0;
        boolean touche = utilise(latitude, longitude);
        if (touche) {
            this.partiesTouchees++;
            if (this.partiesTouchees == this.longitude) {
                ret = Bateau.COULE;
            } else {
                ret = Bateau.TOUCHE;
            }

        }
        return ret;
    }

    public static void afficherReglesPositionnement() {
        System.out.println(
                "Les bateaux doivent être positionnés soit horizontalement soit verticalement mais jamais en biais.");
        System.out.println("Les bateux ne peuvent pas se superposer. Il est néanmoins possible qu'ils se touchent.");
        System.out.println(
                "Les bateaux doivent être positionnés intégralement dans la grille de jeu de la bataille navale.");
        System.out.println("Une fois positionnés, les bateaux ne peuvent pas être déplacés ");
    }

    public static char getSymboleTouche() {
        return Bateau.SymboleTouche;
    }

    public static void setSymboleTouche(char symboleTouche) {
        Bateau.SymboleTouche = symboleTouche;
    }

    public void initialiser(String string, int i) {
    }
}
