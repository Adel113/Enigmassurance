abstract class Produit {
    private String nom;

    public Produit(String nom) {
        this.nom = nom;
    }

    // recuperer le nom du produit
    public String getNom() {
        return nom;
    }

    public abstract double getValeur();

}
