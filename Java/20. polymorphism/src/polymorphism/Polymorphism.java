package polymorphism;

public class Polymorphism {

	public static void main(String[] args) {
		//POlimorfizam predstavlaj mogucnost da se metod ponasa razlicito u zavisnosti od objekta
		//nad kojim se primenjuje
		
		
		OsobaNasl osobaNasl = new OsobaNasl();
		//Osim sto promenljiva tipa Osoba moze cuvati reference na objekat te klase
		//Ona moze cuvati i referencu na objekat proizvoljne potklase
		//Metod koji ce se polimorfno pozivati mora biti deklarisan i u baznoj i u izvedenoj/im klasi
		//Referencira objekat tipa OsobaNasl i koristice metodu iz OsobaNasl
		Osoba osoba2 = osobaNasl;
		osoba2.show();
		
		osobaNasl.info();
		
		
		//Nece raditi jer je ovde bitan tip promenljive, tacnije Osoba nema metodu osobina
		//Tip promenljive odredjuje koju metodu mozemo da pozovemo- metoda nije polimorfna
		//osoba2.osobina();
		
		
		//Polimorfizam garantuje da gde se ocekuje nadklasa(parent) , mogu da se koriste njene potklase(child)
		nesto(osobaNasl);
	}
	
	public static void nesto(Osoba osoba) {
		osoba.show();
	}
}
