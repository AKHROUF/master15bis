package dz.etm.m15.formation.model;

public class Point {

	private int x;
	private int y;
	
	public Point() {
	}	

	public Point(int x, int y) {
		deplacer(x,y);
	}

	public int getX() {
		return x;
	}

	/**
	 * 
	 * @param x
	 * @throws Exception si x < 0
	 */
	public void setX(int x) {
		if (x >= 0)
			this.x = x;
		//else throw new Exception("X doit être positif");
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y >= 0)
			this.y = y;
	}
	
	public void deplacer(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public void deplacer(Point other) {
//		setX(other.x);
//		setY(other.y);
		deplacer(other.x, other.y);
	}
	
	public void afficher() {
		System.out.println("[" + x + ";" + y + "]");
	}
	
	public boolean equals(Point other) {
		return (this.x == other.x && this.y == other.y);
	}
}
