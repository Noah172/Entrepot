package type_produit;

public class ProduitSurgel� extends Produit {
	private int temperature;
    public ProduitSurgel�(String nom, double prix, int quantite, String description, int temp�ratureConservation) {
		super(nom, prix, quantite, description);
		this.temperature = temp�ratureConservation;
		
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
    

}
