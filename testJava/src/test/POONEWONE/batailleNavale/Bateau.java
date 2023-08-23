package test.POONEWONE.batailleNavale;

public class Bateau {
    // Les attributs d'instance sont en visibilité privée dans le but de respecter
    // le pricipe d'encapsulation
    private String type;
    protected int longueur;
    protected int latitude;
    protected int longitude;
    protected boolean horizontale;
    private int partiesTouchees = 0;

    // Attribut de classe
    private static char symboleTouchees = 0;

    // Les constantes n'ont pas l'obligation d'être en visibilité private car elle
    // ne sont pas amené à changer. Pour faire appel à ses constantes il faut la
    // faire préceder du nom de la classe, exemple: Bateau.TOUCHE
    public static final int TOUCHE = 1;
    public static final int COULE = 2;

    protected Bateau() {

    }

    public static Bateau creerBateau(String type, int longueur) {
        Bateau ret = null;
        if (type.equals("")) {
            System.out.println("le type du bateau ne peut être vide");
        } else if (longueur <= 0) {
            System.out.println("La taille du bateau doit être strictement positive");
        } else {
            ret = new Bateau();
            ret.initialiser(type, longueur);
        }
        return ret;
    }

    public static Bateau CreerEtPositionnerBateau(String type, int longueur, int latitude, int longitude,
            boolean horizontale) {
        Bateau ret = creerBateau(type, longueur);
        if (ret != null) {
            ret.positionner(latitude, longitude, horizontale);
        }
        return ret;
    }

    protected void initialiser(String type, int longueur) {
        this.type = type;
        this.longueur = longueur;
    }

    // Initialisation caractere du bateau
    public Bateau(String type, int longueur) {
        this.type = type;
        this.longueur = longueur;
    }

    public Bateau(String type, int longueur, int latitude, int longitude, boolean horizontale) {
        this(type, longueur);
        this.positionner(latitude, longitude, horizontale);
    }

    // Déclaration Getters pour longueur
    public int getLongueur() {
        return this.longueur;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        if (type.equals("")) {
            System.out.println("le type du bateau ne peut être vide");
        } else {
            this.type = type;
        }
    }

    public void positionner(int latitude, int longitude, boolean horizontale) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.horizontale = horizontale;
    }

    public void positionner(int latDeb, int longDeb, int latFin, int longFin) {
        if (latDeb == latFin) {
            if (longFin - longDeb + 1 == this.longueur) {
                this.horizontale = true;
                this.latitude = latDeb;
                this.longitude = longDeb;
            } else {
                System.out.println(
                        "Les coordonnées de début et de fin du tableau ne sont pas cohérentes avec la taille du bateau");
            }
        } else {
            if (longDeb == longFin) {
                if (latFin - latDeb + 1 == this.longueur) {
                    this.horizontale = false;
                    this.latitude = latDeb;
                    this.longitude = longDeb;
                } else {
                    System.out.println(
                            "Les coordonnées de début et de fin du tableau ne sont pas cohérente avec la taille du bateau");
                }
                System.out.println("Le bateau doit être positionnée soir verticatelement soit horizontalement");
            }
        }
    }

    // Teste si une case dont les coordonnées sont passées en paramètres est
    // utilisée par ce bateau
    public boolean utilise(int latitude, int longitude) {
        return this.horizontale && this.latitude == latitude && this.longitude < longitude
                && longitude < this.longitude + this.longueur
                || !this.horizontale && this.longitude == longitude && this.latitude <= latitude
                        && latitude < this.latitude + this.longueur;

    }

    // J'ai changer la visibilité en public pour pouvoir faire fonctionne
    // transtypage2, protected to public
    public int getNbcasesUtilisees() {
        return this.longueur;
    }

    public int testerTir(int latitude, int longitude) {
        boolean touche = true;
        int ret = 0;
        if (touche) {
            this.partiesTouchees++;
            if (this.partiesTouchees == this.getNbcasesUtilisees()) {
                ret = Bateau.COULE;
            } else {
                ret = Bateau.TOUCHE;
            }

        }

        return ret;
    }

    public static void afficherReglesPositionnement() {
        System.out.println(
                "Les bateaux doivent être positionnés soit à la vertical soit à l'horizontale mais jamais en biais");
        System.out.println("Les bateaux ne peuvent pas se supersposer il est néamoins possible qu'ils se touche.");
        System.out.println(
                "Les bateaux doivent être positionnés intégralement dans la grille de jeu de la bataille navale.");
        System.out.println("Une fois positionnés , les bateaux ne peuent plus être déplacés");

    }

    public static char getSymboleTouche() {
        return Bateau.symboleTouchees;
    }

    public static void setSymboleTouche(char symboleTouche) {
        Bateau.symboleTouchees = symboleTouche;
    }

    // @Override
    // public String ToString() {
    // return this.type + " en position " + (this.horizontale ? "horizontale" :
    // "verticale")
    // + " à partir de la case de coordonnées " + this.latitude + "; " +
    // this.longitude;
    // }
}
