class Action extends Produit {
    private double prix;
    private int quantite;

    public Action(String nom, double prix, int quantite) {
        super(nom);
        this.prix = prix;
        this.quantite = quantite;
    }

    //récupérer les valeurs de prix et de quantité d'une action.
    public double getPrix() {
        return prix;
    }
    public int getQuantite() {
        return quantite;
    }

    // calculer la valeur totale d'une action
    @Override
    public double getValeur() {
        return prix * quantite;
    }

    //pour renvoyer une chaîne de caractères qui décrit l'action avec son nom, son prix, sa quantité et sa valeur totale.
    @Override
    public String toString() {
        return String.format("%s - Action - Prix: %.2f - Quantité: %d - Valeur: %.2f", getNom(), getPrix(), getQuantite(), getValeur());
    }
}
