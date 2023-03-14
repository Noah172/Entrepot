package type_produit;

import java.time.LocalDate;

public class Produit {
    private String nom;
    private double prix;
    private int quantite;
    private String description;
    private LocalDate datePeremption;

    public Produit(String nom, double prix, int quantite, String description, LocalDate datePeremption) {
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;//quantité en grammes par unité:exemples,500g par sachet de pates
        this.description = description;
        this.datePeremption = datePeremption;
    }

    // Getters and setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getDatePeremption() {
        return datePeremption;
    }
    public void setDatePeremption(LocalDate datePeremption) {
        this.datePeremption = datePeremption;
    }

    // Méthodes
    public boolean estPerime() {
        LocalDate datePeremption = this.getDatePeremption();
        if (datePeremption == null) {
            return false; // Pas de date de péremption spécifiée
        } else {
            return datePeremption.isBefore(LocalDate.now());
        }
    }

    public String afficherInfoProduit() {
        String infoProduit = "Nom : " + this.getNom() + "\n" +
                             "Prix : " + this.getPrix() + "\n" +
                             "Quantité en stock : " + this.getQuantite() + "\n";
        if (this.estPerime()) {
            infoProduit += "Périmé : Oui\n";
        } else {
            infoProduit += "Périmé : Non\n";
        }
        return infoProduit;
    }
    
}
