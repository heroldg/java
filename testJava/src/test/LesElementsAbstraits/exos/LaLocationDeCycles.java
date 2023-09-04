package test.LesElementsAbstraits.exos;

import java.time.LocalDate;

public abstract class LaLocationDeCycles {
    protected String marque;
    protected String modele;
    protected double tarif;
    protected LocalDate dateAchat;

    LaLocationDeCycles(String marque, String modele, LocalDate dateAchat) {
        this.marque = marque;
        this.modele = modele;
        this.dateAchat = dateAchat;
    }

    public int age() {
        return dateAchat.until(LocalDate.now()).getYears();
    }

    public String getMarque() {
        return this.marque;
    }

    public String getModele() {
        return this.modele;
    }

    public abstract double getTarif();

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public String getInfo() {
        return "- Le " + this.getModele() + " de la marque " + this.getMarque() + " | "
                + LocalDate.from(getDateAchat()) + " | ";
    }

}

// import java.time.LocalDate;

// public class MyClass {
// private LocalDate dateOfBirth;

// // Constructor
// public MyClass(LocalDate dateOfBirth) {
// this.dateOfBirth = dateOfBirth;
// }

// // Getter method for dateOfBirth
// public LocalDate getDateOfBirth() {
// return dateOfBirth;
// }

// // Main method for testing
// public static void main(String[] args) {
// LocalDate dob = LocalDate.of(1990, 5, 15);
// MyClass myObject = new MyClass(dob);

// LocalDate retrievedDate = myObject.getDateOfBirth();
// System.out.println("Date of Birth: " + retrievedDate);
// }
// }
