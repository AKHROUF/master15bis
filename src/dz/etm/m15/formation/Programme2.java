package dz.etm.m15.formation;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Programme2 {

	public static void main(String[] args) {
		// autoboxing + unboxing
		Double o = 3.14;//autoboxing valeur->objet
		double x = o; //unboxing objet->valeur
		
		// conversion type<--->string
		String s = "641365.56987";
		double y = Double.parseDouble(s);
		String t = String.valueOf(y);
		String t2 = y + "";
		System.out.println(y*2);
		
		// formattage des nombres
		DecimalFormat format = new DecimalFormat("#,##0.00");
		System.out.println(format.format(y));
		String v = "987,551222";
		try {
			double z = format.parse(v).doubleValue();
			System.out.println(z);
		} catch (ParseException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		// Dates
		Date d1 = new Date();
		System.out.println(d1.getDate()+"/"+
				(d1.getMonth()+1)+"/"+
				(d1.getYear()+1900)); 
		
		Date d2 = new Date(54, 10, 1); // 1/11/1954
		System.out.println(d2);
		
		SimpleDateFormat format2= new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format3= new SimpleDateFormat(
				"EEEE dd MMMM yyyy", new Locale("ar"));
		System.out.println(format2.format(d2));
		System.out.println(format3.format(d2));
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		c.set(1962, 6, 5); // 5/7/1962
		System.out.println(format3.format(c.getTime()));
		
		c.set(Calendar.YEAR, 2021);
		System.out.println(format3.format(c.getTime()));
		
		int j = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("jour " + j);// dim=1 ... sam=7
		
		String phrase = "Partout Le Roi Trouve Sa Place Assise";
		String osi = "Physique Liaison Réseau Transport Session Présentation Application";
		StringBuilder tampon = new StringBuilder(phrase);
		
		System.out.println("début de la concaténation");
		for (int i = 0; i < 150000; i++) {
			//phrase += osi;
			tampon.append(osi);
		}
		System.out.println("fin de la concaténation");
	}
}
