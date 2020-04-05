package klasaObjekat;

class Osoba {
    
    // Instancne promenljive
    String ime;
    String prezime;
    int godine;
    
    //Funkcije/metode
}

public class KlasaObjekat {

	public static void main(String[] args) {
		// Kreiranje objekta osoba pomocu klase Osoba
        Osoba osoba1 = new Osoba();    
        osoba1.ime = "Pera";
        osoba1.prezime = "Peric";
        osoba1.godine = 37;
        
        // Kreiranje drugog objekta osoba
        Osoba osoba2 = new Osoba();
        osoba2.ime = "Zika";
        osoba2.prezime = "Zikic";
        osoba2.godine = 20;
        
        System.out.println(osoba2.ime);

	}

}
