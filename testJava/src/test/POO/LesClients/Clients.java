package test.POO.LesClients;

public class Clients {

    // Les attributs d'instance
    private String name;
    private int numClient;

    // Déclaration constructeur
    public Clients(String name) {
        this.name = name;
        this.numClient = giveNumberClient();
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getNumClient() {
        return this.numClient;
    }

    // Setters
    public void setName(String name) {
        if (name.equals("")) {
            System.out.println("Aucun nom n'a été renseigné");
        } else {
            this.name = name;
        }
    }

    public int setNumClient(int numClient) {
        return this.numClient = numClient;
    }

    // Function GiveNumberClient
    public int giveNumberClient() {
        if (this.numClient == 0) {

            this.numClient = this.numClient + 1;

            if (this.numClient > 0) {
                this.numClient++;
            }
        } else {
        }

        return this.numClient;
    }

}
