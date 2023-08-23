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
    private String[][] categoriesOeuvres = new String[2][100];
    private int particularite;

    Oeuvre(int choix) {

        this.categoriesOeuvres[0][0] = video;
        this.categoriesOeuvres[1][0] = livre;
        if (choix == 1) {
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
        } else if (choix == 2) {
            nbLivre = nbLivre + 1;
            int pages;

            setParticularite(particularite);
            System.out.println("titre ?");
            this.titre = console.nextLine();
            System.out.println("auteur ?");
            System.out.println("durée (minutes) ?");
            pages = console.nextInt();
            setParticularite(pages);
            this.auteur = console.nextLine();
            this.categoriesOeuvres[1][nbLivre] = getLivre();
            System.out.println(this.getLivre());
        }

    }

    public int getNbVideo() {
        return nbVideo;
    }

    public int getNbLivre() {
        return nbLivre;
    }

    public String getVideo() {
        return "Video " + this.getTitre() + " de " + this.getAuteur() + " (" + this.getParticularite() + ")";
    }

    public String getLivre() {
        return "Livre " + this.getTitre() + " de " + this.getAuteur() + " (" + this.getParticularite() + ")";
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

    protected void initialiser(int particularite) {
        this.titre = titre;
        this.auteur = auteur;
        this.particularite = particularite;

    }

    public Oeuvre() {
        this.titre = titre;
        this.auteur = auteur;
        this.particularite = particularite;
    }

}
