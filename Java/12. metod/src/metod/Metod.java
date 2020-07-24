package metod;

class Osoba {
    
    // Instancne promenljive
    String ime;
    String prezime;
    int godine;
    
    //Metode mogu biti staticke(klasne) i nestaticke(objektne)
    //staticke pripadaju celoj klasi i pozivaju se ImeKlase.Metod(parametri)
    //nestaticke pripadaju pojedinacnim objektima i pozivaju se uz odgovarajuce objekte - ObjekatMetod(parametri)
    void pozdrav() {
    	System.out.println("Zdravo");
    }

    //Preopterecenje metoda - Overloading je situacija kada imamo u klasi dve metoda sa istim imenom
    //ali razlicitim brojem parametara ili razlicitim parametrima
    void info() {
    	System.out.println("Podaci- Ime: "+ime+" ,Prezime: "+prezime+" ,Godine: "+godine);
    }
    void info(String arg) {
    	System.out.println(arg +" Podaci- Ime: "+ime+" ,Prezime: "+prezime+" ,Godine: "+godine);
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
        osoba2.info("Overloading");
        
        System.out.println(osoba2.ime);

	}

}
