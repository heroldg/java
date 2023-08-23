package test.POONEWONE.customers;

public class customers {
    private String name;
    private int numCustomer;

    public static void afficherMenu() {
        System.out.println("--MENU--");
        System.out.println("1 - Afficher les clients");
        System.out.println("2 - Créer un client");
        System.out.println("3 - Quitter");

    }

    public customers(String name) {
        this.name = name;
        this.numCustomer = giveNumberCustomer();
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getNumCustomer() {
        return this.numCustomer;
    }

    // Setters
    public void setName(String name) {
        if (name.equals("")) {
            System.out.println("Aucun nom n'a été renseigné");
        } else {
            this.name = name;
        }
    }

    public int setNumCustomer(int numCustomer) {
        return this.numCustomer = numCustomer;
    }

    public int giveNumberCustomer() {
        if (this.numCustomer == 0) {
            this.numCustomer = this.numCustomer + 1;

        }

        if (this.numCustomer >= 1) {
            this.numCustomer++;
        }

        return this.numCustomer;
    }

}
