package dz.etm.m15.formation.model;

public class Rectangle extends Carre {

	private int largeur;
	
	public Rectangle() {
	}
	
	public Rectangle(Point origine, String nom, int longueur, int largeur) {
		setOrigine(origine);
		setNom(nom);
		setLongueur(longueur);
		setLargeur(largeur);
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = Math.abs(largeur);
	}
	
	@Override
	public double superficie() {
		return longueur * largeur;
	}
}
