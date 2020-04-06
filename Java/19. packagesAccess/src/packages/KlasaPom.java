package packages;

import access.Osoba;

public class KlasaPom extends Osoba{

	private Osoba osoba1 = new Osoba();
	private KlasaPom klasaPom1 = new KlasaPom();
	public KlasaPom() {
		//private--samo ista klasa
		//System.out.println(osoba1.ime);
		
		//protected -- ovo ne moze jer je this instana , a klasa Osoba nije u ovom paketu
		//System.out.println(osoba1.prezime);
		
		System.out.println(klasaPom1.prezime);
		System.out.println(prezime);
		
		//no modifier- samo isti paket
		//System.out.println(osoba1.godine);
		
		System.out.println(osoba1.los);
	}
}
