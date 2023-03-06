public class Obligations extends Produit {

    private double tauxInteret;
    private int duree;

    public Obligations(String nom, double tauxInteret, int duree) {
        super(nom);
        this.tauxInteret = tauxInteret;
        this.duree = duree;
    }

    // recuperer le taux d'interet et la duree de l'obligation
    public double getTauxInteret() {
        return tauxInteret;
    }
    public int getDuree() {
        return duree;
    }

    // Les obligations n'ont pas de valeur fixe
    @Override
    public double getValeur() {
        return 0;
    }

    //renvoyer l'obligation avec son nom, son taux d'intérêt et sa durée
    @Override
    public String toString() {
        return String.format("%s - Obligation - Taux d'intérêt: %.2f - Durée: %d ans",
                getNom(), getTauxInteret(), getDuree());
    }

}
