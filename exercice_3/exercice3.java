public class StockManager {

    // gere le stock
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        // Ajout au stock
        if (typeOperation.equals("ajout")) {
            stock += quantite;
            System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
        // Retrait du stock
        } else if (typeOperation.equals("retrait")) {
            if (stock >= quantite) {
                stock -= quantite;
                System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
            } else {
                System.out.println("Stock insuffisant pour le produit : " + produit);
            }
        // Si l'action est inconnu
        } else {
            System.out.println("Opération inconnue.");
        }
    }
}
//Correction
public class StockManager {

    // gere le stock
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        // Ajout au stock
        if (typeOperation.equals("ajout")) {
           ajouterStock();
        // Retrait du stock
        } else if (typeOperation.equals("retrait")) {
            retraitStock();
        // Si l'action est inconnu
        } else {
            System.out.println("Opération inconnue.");
        }
    }
    public static void ajouterStock(){
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    }
    
    public static void retraitStock(){
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
    }
}
