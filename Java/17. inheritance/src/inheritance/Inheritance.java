package inheritance;

public class Inheritance {

	public static void main(String[] args) {
		//Ideja nasledjivanja je da se mogu kreirati nove klase koje u postpunosti preuzimaju
		//funkcionalnosti postoje klase, ali i dodaje svoje atribute i metoda
		//Klasa koja nasledjuje drugu klasu se naziva potklasa
		//Klasa koja se nasledjuje se naziva natklasa
		Osoba osoba1 = new Osoba("Zika","Ziks",46);
        Osoba osoba2 = new Osoba("Mika","Miks",21);
        OsobaNasl nasl = new OsobaNasl("Jova","Jovin",67);
        osoba1.show();
        osoba1.info();
        osoba2.show();
        osoba2.info();
        
        nasl.show();
        nasl.info();
	}

}
