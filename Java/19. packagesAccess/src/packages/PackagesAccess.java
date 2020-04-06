package packages;
import access.Osoba;

public class PackagesAccess {

	//private--samo ista klasa
	//protected --  isti paket i klasa koja nasledjuje
	//no modifier- samo isti paket
	//public -- bilo gde
	public static void main(String[] args) {
		Osoba osoba1 = new Osoba();

		//private--samo ista klasa
		//System.out.println(osoba1.ime);
				
		//protected -- nije isti paket , iako je nasledjuje
		//System.out.println(osoba1.prezime);
				
		//no modifier- samo isti paket
		//System.out.println(osoba1.godine);
			
		System.out.println(osoba1.los);
	}

}
