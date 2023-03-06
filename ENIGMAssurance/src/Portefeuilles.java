import java.util.ArrayList;
import java.util.Scanner;

public class Portefeuilles {


    ArrayList<Produit> portefeuille = new ArrayList<Produit>();

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("******* Bienvenus ******");
            System.out.println("-------ENIGMAssurance-----");
            System.out.println("");
            System.out.println("Veuillez choisir une option:");
            System.out.println("Ajouter une action => 1 ");
            System.out.println("Ajouter une obligation d'état => 2");
            System.out.println("Afficher le contenu du portefeuille => 3");
            System.out.println("Quitter => 4");
            int choixOption = scanner.nextInt();
            scanner.nextLine();

            switch (choixOption) {
                case 1:
                    ajouterAction(scanner);
                    break;
                case 2:
                    ajouterObligation(scanner);
                    break;
                case 3:
                    afficherPortefeuille();
                    break;
                case 4:
                    System.out.println("Au revoir!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Option invalide.");
            }
        }
    }


    // methode pour ajouter une action au portefeuille
    private void ajouterAction(Scanner scanner) {
        System.out.println("Veuillez saisir le nom de l'action:");
        String nomAction = scanner.nextLine();
        System.out.println("Veuillez saisir le prix de l'action:");
        double prixAction = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Veuillez saisir la quantité de l'action:");
        int quantiteAction = scanner.nextInt();
        scanner.nextLine();
        portefeuille.add(new Action(nomAction, prixAction, quantiteAction));
        System.out.println("Action ajoutée au portefeuille.");
    }


    // methode pour ajouter une obligation au portefeuille
    private void ajouterObligation(Scanner scanner) {
        System.out.println("Veuillez saisir le nom de l'obligation d'état:");
        String nomObligation = scanner.nextLine();
        System.out.println("Veuillez saisir le taux d'intérêt de l'obligation d'état:");
        double tauxInteret = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Veuillez saisir la durée de l'obligation d'état:");
        int duree = scanner.nextInt();
        scanner.nextLine();
        portefeuille.add(new Obligations(nomObligation, tauxInteret, duree));
        System.out.println("Obligation d'état ajoutée au portefeuille.");
    }

    // methode pour afficher  le contenu du portefeuille
    private void afficherPortefeuille() {
        if (portefeuille.isEmpty()) {
            System.out.println("Le portefeuille est vide.");
        } else {
            System.out.println("Contenu du portefeuille:");
            for (Produit produit : portefeuille) {
                System.out.println(produit);
            }
        }

    }
}


