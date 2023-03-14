package type_produit;

public class ProduitSurgelé extends Produit {
	private int temperature;
    public ProduitSurgelé(String nom, double prix, int quantite, String description, int températureConservation) {
		super(nom, prix, quantite, description);
		this.temperature = températureConservation;
		
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
    

}
