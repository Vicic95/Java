package equals;

public class Equals {

	public static void main(String[] args) {
		
		Osoba osoba1 = new Osoba("Pera","Peric",54);
		Osoba osoba2 = new Osoba("Mika","Mikic",24);
		Osoba osoba3 = new Osoba("Pera","Peric",54);
		
		//iako imaju iste atribute osoba1 i osoba3 su dva razlicita objekta
		System.out.println(osoba1 == osoba3);
		//sa override equals u klasi Osoba , ispunjavaju zahteve da budu jednaki
		System.out.println(osoba1.equals(osoba3));
		
		//Za ne-primitivne tipove ne treba koristiti == za poredjenje ,vec equals
		Double d1 = 7.2;
		Double d2 = 7.2;
		System.out.println(d1 == d2);
		//Ovde za Integer pokazuje na isti objekat, pa moze i ==
		Integer i1 = 2;
		Integer i2 = 2;
		System.out.println(i1==i2);
		
		//U nekom slucaju bi radilo , kada sistem uradi optimizaciju i referencira oba na isti objekat
		//Treba koristiti equals , jer poredi atribute
		String str1 = "Hello";
		String str2 = "Helloblabla".substring(0,5);
		System.out.println(str2);
		System.out.println(str1 == str2);
	}

}
