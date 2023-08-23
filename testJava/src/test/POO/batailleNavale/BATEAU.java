package test.POO.batailleNavale;

public class BATEAU {

    // Les attributs d'instance
    private String type;
    private int longueur;
    private int latitude;
    private int longitude;
    private boolean horizontal;
    private int partiesTouchees = 0;

    // Un attribut de CLass
    private static char symboleTouche = 'x';

    // Les constantes
    public static final int TOUCHE = 1;
    public static final int COULE = 2;

    // Déclaration de constructeur
    public BATEAU(String type, int longueur) {
        this.type = type;
        this.longueur = longueur;
    }

    public BATEAU(String type, int longueur, int latitude, int longitude, boolean horizontal) {
        this(type, longueur);
        this.positionner(latitude, longitude, horizontal);
    }

    // Déclaration Getters pour longueur
    public int getLongueur() {
        return this.longueur;
    }

    // Méthodes Getters et Setters pour l'attribut type
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        if (type.equals(""))
            System.out.println("Le type du bateau ne peut être vide");
        else

            this.type = type;
    }

    // Les méthodes d'instance
    // Déclaration de la méthode positionner
    public void positionner(int latitude, int longitude, boolean horizontal) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.horizontal = horizontal;
    }

    // Déclaration d'une 2ème méthode positionner, celle-ci ne crée pas d'ambiguîté
    // car elle à 4 paramètres et celle définies précedement en avant 3. Donc elle
    // peuvent cohabituer dans la même Class.
    public void positionner(int latDeb, int longDeb, int latFin, int longFin) {
        if (latDeb == latFin) {
            if (longFin - longDeb + 1 == this.longueur) {
                this.horizontal = true;
                this.latitude = latDeb;
                this.longitude = longDeb;
            } else {
                System.out.println(
                        "les coordonnées de début et de fin du tableau ne sont pas cohérentes avec la tailles du bateau.");
            }
        } else {
            if (longDeb == longFin) {
                if (latFin - latDeb + 1 == this.longueur) {
                    this.horizontal = false;
                    this.latitude = latDeb;
                    this.longitude = longDeb;
                } else {

                    System.out.println("les coordonnées de "
                            + "début et de fon du tableau ne sont pas cohérentes avec la tailles du bateau.");
                }
            } else {
                System.out.println("Le bateau doit être positionné soit verticalement soit horizontalement.");
            }
        }

    }

    // Déclaration de la methode utilise : teste si une case dont les coordonnées
    // sont passées en paramètres est utilisée par ce bateau.
    public boolean utilise(int latitude, int longitude) {
        return this.horizontal && this.latitude == latitude && this.longitude <= longitude
                && longitude < this.longitude + this.longueur
                || !this.horizontal && this.longitude == longitude && this.latitude <= latitude
                        && latitude < this.latitude + this.longueur;
    }

    // Déclaration de la methode testerTir : cette méthode est une fonction
    // retournant un entier indiquant si le bateau a été touché par le tir. la
    // valeur 0 indique que le tir n'a effectué aucun dommage sur le bateau. La
    // valeur de la constante TOUCHE indique que le bateau a été touché, mais n'est
    // pas encore coulé. LA valeur de la constante COULE indique que le bateau a
    // sombré. Cette méthode fait appel à la méthode utilise() précedement définie.
    public int testerTir(int latitude, int longitude) {
        int ret = 0;
        boolean touche = utilise(latitude, longitude);
        if (touche) {
            this.partiesTouchees++;
            if (this.partiesTouchees == this.longueur) {
                ret = BATEAU.COULE;
            } else {
                ret = BATEAU.TOUCHE;
            }

        }

        return ret;
    }

    public static void afficherLesReglesPositionnement() {
        System.out.println(
                "Les bateaux doivent être positionnés soit horizontalement , soit verticalement mais jamais en biais.");
        System.out.println(
                "Les bateaux doivent être positionnés intégralement dans la grille de jeu de la bataille navale");
        System.out.println("Une fois positionnés, les bateaux ne peuvent plus petre déplacés");
    }

    public static char getSymboleTouche() {
        return BATEAU.symboleTouche;
    }

    public static void setSymboleTouche(char symboleTouche) {
        BATEAU.symboleTouche = symboleTouche;
    }

    // Cela fait fonctionner le tableau de bateau (TestTableauBateau.java) qui
    // instancie les trois bateaux
    // car methodes d'instance initialiiser() avait était supprimer
    public void initialiser(String string, int i) {
    }

}
