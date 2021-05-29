package dz.etm.m15.formation.model;

public class Cube extends Carre implements IForme3D {

	@Override
	public double superficie() {
		//return longueur * longueur * 6;
		return super.superficie() * 6;
	}
	
	@Override
	public double volume() {
		return Math.pow(longueur, 3);
	}
}
