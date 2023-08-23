package test.RelationsClassesV2.exos.LesDes2Correc;

import java.util.Scanner;

import test.POONEWONE.JeuDeDes.LesDes;

public class JoueurBataille {

    Scanner console = new Scanner(System.in);
    private int nbJetons;
    private LesDes de;
    protected String nom;

    JoueurBataille() {

        System.out.println("Nom du joueur ?");
        this.nom = console.nextLine();

        this.nbJetons = 10;
        this.de = new LesDes();

    }

    public int tourDeJeu() {
        System.out.println(this.nom + " a fait un " + this.de.lancer());

        return this.de.getLastFace();
    }

    public boolean perdUnJeton() {
        this.nbJetons = this.nbJetons - 1;
        return this.nbJetons == 0;
    }

    public void gagneUnJeton() {
        this.nbJetons = this.nbJetons + 1;
    }

    public String getNom() {
        return this.nom;
    }

    public int getNbJetons() {
        return this.nbJetons;
    }

}
