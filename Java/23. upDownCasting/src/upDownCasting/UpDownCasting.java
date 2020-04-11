package upDownCasting;

public class UpDownCasting {

	public static void main(String[] args) {
		Osoba osoba = new Osoba();
		OsobaNasl osobaNasl = new OsobaNasl();
		
		osoba.show();
		osoba.info();
		osobaNasl.show();
		osobaNasl.osobina();
		
		//Upcasting
		//objekat odredjuje koju implementaciiju metoda koristimo
		//radimo sa objektom OsobaNAsl
		Osoba osoba2 = osobaNasl;
		osoba2.show();
		
		//Tip promenljive odredjuje koji metod mozes pozvati
		//osoba2.osobina();
		
		//Downcasting
		//Downcasting je nesiguran
		//Mora da se radi cast , jer provera da li smo sigurni da znamo sta radimo
		//Radimo sa objektom OsobaNAsl
		Osoba osoba3 = new OsobaNasl();
		OsobaNasl osobaNasl2 = (OsobaNasl)osoba3;
		osobaNasl2.osobina();
		osobaNasl2.show();
		
		//Objekat je tipa Osoba , i ne moze se promeniti u objekat OsobaNasl
		//Osoba osoba4 = new Osoba();
		//OsobaNasl osobaNasl3 = (OsobaNasl)osoba4;
		//osobaNasl3.show();
	}

}
