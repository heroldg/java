package test.LesElementsAbstraits.coursv2;

public interface Jouable {
    void jouer();

    default String getNomDuJeu() {
        return this.getClass().getSimpleName();
    };
}
