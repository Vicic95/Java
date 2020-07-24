package constructors;


class Osoba {
    
    // Instancne promenljive
    String ime;
    String prezime;
    int godine;
    //Konstruktor je specijalni metod, koji se koristi za inicijalizaciju objekta
    //Poziva se u trenutku kreiranja objekta
    //Ako se ne kreira konstruktor, program poziva podrazumevani konstruktor
    //this se koristi kao referenca na objekat klase , u konstruktoru se koristi uz objektne atribute
    //this() se koristi kada klasa ima vise konstruktora, da bi se koristio postojeci konstruktor
    public Osoba() {
		this("Zika","Ziks",45);
		System.out.println("Constructor");
	}
    public Osoba(String ime) {
		this(ime,"Ziks",12);
		System.out.println("2. Constructor");
    }
    public Osoba(String ime, String prezime) {
		this(ime,prezime,78);
		System.out.println("3. Constructor");
	}
	public Osoba(String ime, String prezime, int godine) {
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
		System.out.println("4. Constructor-glavni");
	}
  
    
}
public class Constructors {

	public static void main(String[] args) {
		
		//Kreiranje sa razlicitm konstruktorima iste klase
		Osoba osoba1 = new Osoba();
		System.out.println(osoba1.prezime);
		
		Osoba osoba2 = new Osoba("Mika");
		System.out.println(osoba2.godine);
		
		Osoba osoba3 = new Osoba("Jova","Jovin");
		System.out.println(osoba3.godine);
		
		Osoba osoba4 = new Osoba("Lola","Lolin",45);
		System.out.println(osoba4.godine);
		

	}

}
