package test.LesElementsAbstraits.cours;

public interface Jouable {

    void jouer();

    default String getNomDuJoueur() {
        return this.getClass().getSimpleName();
    }
}