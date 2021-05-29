package dz.etm.m15.formation;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import dz.etm.m15.formation.model.Carre;
import dz.etm.m15.formation.model.FormeGeometrique;
import dz.etm.m15.formation.model.Rectangle;

public class Programme {

	
	public static void main(String[] args) {
		// 1. créer un carré
		Carre c = new Carre();		
		
		// 2. nommer le carré "c1"
		c.setNom("c1");
		
		// 3. fixer la longueur à 10
		c.setLongueur(10);
		
		// 4. afficher (dans la console) la superficie du carré
		System.out.println("Superficie = " + c.superficie());
		
		// 5. déplacer l'origine du carré à (50,50)
		// c.setOrigine(new Point(50,50)); NON UN DEPLACEMENT
		c.getOrigine().deplacer(50,50);
		
		System.out.println(c);
		System.out.println(c.toString());
		
		Rectangle r = new Rectangle(null, null, 20, 10);

		Carre c1 = r;
		if (c1 instanceof Rectangle) {
			Rectangle r0 = (Rectangle) c1;
			//r0.getL
		}
		int i = c1.getLongueur(); //20
		//int j = c1.getLargeur(); //ERREUR

		double k = c1.superficie(); // 200
		System.out.println(k);

		FormeGeometrique[] tab = new FormeGeometrique[5];
		tab[0] = r;
		tab[1] = c;
		
		//tab[0].getLongueur(); //ERREUR
		
		//tab[0].getLargeur(); //ERREUR

		tab[0].superficie();

		Rectangle s = (Rectangle)tab[0];
		if (tab[1] instanceof Rectangle) {
			Rectangle t = (Rectangle)tab[1];
		}
		
		Object[] t = {3.14,"Java",r,c};
		
		List<Object> liste = new ArrayList<>();
		liste.add(3.14);
		liste.add("Java");
		liste.add(new Carre(null,null, 8));
		liste.add(c);
		
		((Carre)liste.get(2)).superficie();
		
		List<FormeGeometrique> l = new ArrayList<>();
		//l.add(3.14);
		l.add(new Rectangle(null,null, 20,16));
		l.get(0).superficie();
		
		new FileReader("....");

	}
}
