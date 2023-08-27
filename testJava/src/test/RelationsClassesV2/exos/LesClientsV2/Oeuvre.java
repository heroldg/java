package test.RelationsClassesV2.exos.LesClientsV2;

import java.util.Scanner;

public class Oeuvre {

    Scanner console = new Scanner(System.in);

    private String titre;
    private String auteur;
    private String video = "video";
    private String livre = "livre";
    private int nbVideo = 0;
    private int nbLivre = 0;

    // Le trableau prend on compte les deux categories d'oeuvre (video et livre)
    public String[][] categoriesOeuvres = new String[2][100];
    private int particularite;

    public Oeuvre(int choix) {

        this.categoriesOeuvres[0][0] = video;
        this.categoriesOeuvres[1][0] = livre;
        if (choix == 1) {
            addLivres();
        } else if (choix == 2) {
            addVideo();
        }

    }

    public void addLivres() {
        nbVideo = nbVideo + 1;
        int time;
        System.out.println("titre ?");
        this.titre = console.nextLine();
        System.out.println("auteur ?");
        this.auteur = console.nextLine();
        System.out.println("durée (minutes) ?");
        time = console.nextInt();
        setParticularite(time);
        this.categoriesOeuvres[0][nbVideo] = this.getVideo();
        System.out.println(this.getVideo());
    }

    public void seeMediaAvailible() {
        for (int i = 0; i < this.categoriesOeuvres.length; i++) {
            System.out.println(this.categoriesOeuvres[0][i]);
            System.out.println(this.categoriesOeuvres[1][i]);
        }
    }

    public void addVideo() {
        nbLivre = nbLivre + 1;
        int pages;

        setParticularite(particularite);
        System.out.println("titre ?");
        this.titre = console.nextLine();
        System.out.println("auteur ?");
        this.auteur = console.nextLine();
        System.out.println(" nombres de pages ?");
        pages = console.nextInt();
        setParticularite(pages);
        this.categoriesOeuvres[1][nbLivre] = getLivre();
        System.out.println(this.getLivre());
    }

    public int getNbVideo() {
        return nbVideo;
    }

    public int getNbLivre() {
        return nbLivre;
    }

    public String getVideo() {
        return "Video " + this.getTitre() + " de " + this.getAuteur() + " (" + this.getParticularite()
                + " minutes) ajouté";

    }

    public String getLivre() {
        return "Livre " + this.getTitre() + " de " + this.getAuteur() + " (" + this.getParticularite()
                + " pages) ajouté ";
    }

    public String getTitre() {
        return this.titre;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public int getParticularite() {
        return particularite;
    }

    public void setParticularite(int particularite) {
        this.particularite = particularite;
    }

    protected void initialiser(String titre, String auteur, int particularite) {
        this.titre = titre;
        this.auteur = auteur;
        this.particularite = particularite;

    }

    public Oeuvre() {

    }

}
