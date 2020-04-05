package metod;

class Osoba {
    
    // Instancne promenljive
    String ime;
    String prezime;
    int godine;
    
    //Funkcije/metode
    void info() {
    	System.out.println("Podaci- Ime: "+ime+" ,Prezime: "+prezime+" ,Godine: "+godine);
    }
    void pozdrav() {
    	System.out.println("Zdravo");
    }
}
public class Metod {

	public static void main(String[] args) {
		// Kreiranje objekta osoba pomocu klase Osoba
        Osoba osoba1 = new Osoba();    
        osoba1.ime = "Pera";
        osoba1.prezime = "Peric";
        osoba1.godine = 37;
        
        osoba1.pozdrav();
        osoba1.info();
        
        // Kreiranje drugog objekta osoba
        Osoba osoba2 = new Osoba();
        osoba2.ime = "Zika";
        osoba2.prezime = "Zikic";
        osoba2.godine = 20;
        
        osoba2.pozdrav();
        osoba2.info();
        
        System.out.println(osoba2.ime);

	}

}
