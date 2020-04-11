package polymorphism;

public class Polymorphism {

	public static void main(String[] args) {
		
		OsobaNasl osobaNasl = new OsobaNasl();
		//Referencira objekat tipa OsobaNasl i koristice metodu iz OsobaNasl
		Osoba osoba2 = osobaNasl;
		osoba2.show();
		
		osobaNasl.info();
		
		//Nece raditi jer je ovde bitan tip promenljive, tacnije Osoba nema metodu osobina
		//Tip promenljive odredjuje koju metodu mozemo da pozovemo
		//osoba2.osobina();
		
		
		//Polimorfizam garantuje da gde se ocekuje nadklasa(parent) , mogu da se koriste njene potklase(child)
		nesto(osobaNasl);
	}
	
	public static void nesto(Osoba osoba) {
		osoba.show();
	}
}
