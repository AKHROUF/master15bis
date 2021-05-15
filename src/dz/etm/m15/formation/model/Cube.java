package dz.etm.m15.formation.model;

public class Cube extends Carre {

	@Override
	public double superficie() {
		//return longueur * longueur * 6;
		return super.superficie() * 6;
	}
	
	public double volume() {
		return Math.pow(longueur, 3);
	}
}
