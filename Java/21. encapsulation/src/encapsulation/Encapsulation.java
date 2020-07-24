package encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		//Enkapsulacija je skrivanje podataka od spoljnih pristupa
		//Skrivanej podataka se postize uz pomoco private
		//Pristupa im se samo uz pomoc javnih metoda- getera i setera
		//Get sluzi za dohvatanje podataka - vraca vrednost podataka
		//Set sluzi za postavljanje nove vrednosti promenljive
		Osoba osoba = new Osoba();
		OsobaNasl osobaNasl = new OsobaNasl();
		
		System.out.println(osoba.getIme());
		osobaNasl.show();
		

	}

}
