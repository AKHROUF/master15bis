package dz.etm.m15.formation.model;

public class Carre extends FormeGeometrique {

	protected int longueur;
	
	public Carre() {
	}
	
	public Carre(Point origine, String nom, int longueur) {
		setOrigine(origine);
		setNom(nom);
		setLongueur(longueur);
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = Math.abs(longueur);
	}
	
	@Override
	public double superficie() {
		return longueur * longueur;
	}
	
	@Override
	public String toString() {
		return getNom() + "(" + longueur + ")";
	}
}
