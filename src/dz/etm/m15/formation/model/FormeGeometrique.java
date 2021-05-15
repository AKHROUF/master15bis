package dz.etm.m15.formation.model;

public abstract class FormeGeometrique {

	private Point origine = new Point();
	private String nom;

	public Point getOrigine() {
		return origine;
	}

	public void setOrigine(Point origine) {
		this.origine = origine;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public abstract double superficie();
	
	@Override
	public boolean equals(Object obj) {		
		if (this == obj)
			return true;
		
		if (obj == null || !(obj instanceof FormeGeometrique))
			return false;
		
		FormeGeometrique other = (FormeGeometrique) obj;
		return this.superficie() == other.superficie();
	}
	
}
