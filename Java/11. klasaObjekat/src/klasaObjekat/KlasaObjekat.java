package klasaObjekat;

//Ova klasa definise novi tip podatak koji se zove Kutija
class Osoba {
    //Klasa je sablon po kom se kreiraju objekti
	//Objekat je instanca odnosto primerak neke klase
    // Promenljive instance - Svaki objekat sadrzi sopstvenu kopiju tih promenljivih
    String ime;
    String prezime;
    int godine;
    
}

public class KlasaObjekat {

	public static void main(String[] args) {
		
		//Ovo je promenljiva referentnog tipa, ona sadrzi referencu na podatke
		//Promenljiva primitivnog tipa sadrzi binarnu reprezentaciju neke vrednosti
		//A promenljiva referentnog tipa sazdrzi binarnu reprezentaciju adrese nekog objekta
		// Kreiranje objekta osoba pomocu klase Osoba
		//Prvo se deklarise promenljiva tipa Osoba, ta promenljiva pokazuje na objekat
		//Kreira se stvarna fizicka kopija objekta koja se dodeljuje toj promenljivoj, pomocu new
		//New alocira memoriju za objekat i vraca rederencu na taj memorijski blok
		//Ta referenca se smesta u promenljivu
		Osoba osoba1 = new Osoba();
		
		//Svaki objekat ima stanje,ponasanje i identitet
        //Stanja predstavljaju atributi sa svojim vrednostima
        //Ponasanje se predstavlja pomocu metoda
        //Identitet se odnosi na svojstvo koje ga razlikuje od drugih objekata
 
		//Dodela vrednosti atributima
		osoba1.ime = "Pera";
        osoba1.prezime = "Peric";
        osoba1.godine = 37;
        
        //osoba2 sadrzi referencu na objekat tipa Osoba
        //Ta promenljiva ima podrazumevanu vrednost null i ne pokazuje ni na jedan objekat
        Osoba osoba2;
        //Kreira se objekat u memoriji, pa se promenljivoj osoba2 dodeljuje referenca na njega
        osoba2 = new Osoba();
        osoba2.ime = "Zika";
        osoba2.prezime = "Zikic";
        osoba2.godine = 20;
        
        System.out.println(osoba2.ime);

	}

}
