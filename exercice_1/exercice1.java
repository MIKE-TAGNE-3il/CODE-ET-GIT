public class FactureManager {

    // Calcul le total d'une facture
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        // reduction selon la catégorie
        if (typeProduit.equals("Alimentaire")) {
            total -= total * 0.05; // Réduction de 5%
        } else if (typeProduit.equals("Electronique")) {
            total -= total * 0.1; // Réduction de 10%
        } else if (typeProduit.equals("Luxe")) {
            total -= total * 0.15; // Réduction de 15%
        }

        // Reduction sur le total
        if (total > 1000) {
            total -= total * 0.05; // Réduction supplémentaire de 5% pour les gros montants
        }

        return total;
    }
}
//Correction:
public class FactureManager {

    /**
     * Calcul le total d'une facture
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        // reduction selon la catégorie
        switch(typeProduit){
            case "Alimentaire":
                prixAlimentaire(typeProduit);
                break;
            case "Electronique":
                prixElectronique(typeProduit);
                break;
            case "Luxe":
                prixLuxe;
                break;
        }
    
        // Reduction sur le total
        if (total > 1000) {
            // Réduction supplémentaire de 5% pour les gros montants
            total -= total * 0.05; 
        }

        return total;
    }

    /**
     * Réduction de 5%
     */
    public static void prixAlimentaire(String typeProduit){
        total -= total * 0.05;
    }

    /**
     * Réduction de 10%
     */
    public static void prixElectronique(String typeProduit){
        total -= total * 0.1; 
    }

    /**
     * Réduction de 15%
     */
    public static void prixLuxe(String typeProduit){
        total -= total * 0.15; 
    }
}