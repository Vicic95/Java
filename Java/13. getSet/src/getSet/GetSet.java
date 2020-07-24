package getSet;

class Osoba {
    
    // Instancne promenljive
    String ime;
    String prezime;
    int godine;
    
    //Funkcije/metode
    public void info() {
    	System.out.println("Podaci- Ime: "+ime+" ,Prezime: "+prezime+" ,Godine: "+godine);
    }
    public void pozdrav() {
    	System.out.println("Zdravo");
    }
    //Geteri moraju da vracaju podatke istog tipa kao promenljiva
    public String getIme() {
		return ime;
	}
    //Seteri moraju da primaju podatke isto tipa kao promenljiva
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getGodine() {
		return godine;
	}
	public void setGodine(int godine) {
		this.godine = godine;
	}
	public int penzija() {
		int p = 65 - godine;
		return p;
	}
	public int rad(int broj) {
		return godine-broj;
	}
}
public class GetSet {

	public static void main(String[] args) {
		//Uz pomoc getera i setera metoda moze da postane dostupna samo za citanje ili samo za pisanje
		//Korisna je kod skrivanja podataka
        Osoba osoba1 = new Osoba();    
        osoba1.ime = "Pera";
        osoba1.prezime = "Peric";
        osoba1.godine = 37;
        
        
        osoba1.pozdrav();
        osoba1.info();
        System.out.println("Do penzije: "+osoba1.penzija());
        
        System.out.println("Radni staz: "+osoba1.rad(19));
        osoba1.setGodine(41);
        osoba1.setIme("Jova");
        osoba1.setPrezime("Jovic");
        System.out.println("Izmenjeno-Godine: "+osoba1.getGodine()+" Ime: "+osoba1.getIme()+" Prezime: "+osoba1.getPrezime());
        
        Osoba osoba2 = new Osoba();
        osoba2.ime = "Zika";
        osoba2.prezime = "Zikic";
        osoba2.godine = 20;
        
        osoba2.pozdrav();
        osoba2.info();
        System.out.println("Do penzije: "+osoba2.penzija());
        
        System.out.println("Radni staz: "+osoba2.rad(19));
        osoba2.setGodine(26);
        osoba2.setIme("Mika");
        osoba2.setPrezime("Mikic");
        System.out.println("Izmenjeno-Godine: "+osoba2.getGodine()+" Ime: "+osoba2.getIme()+" Prezime: "+osoba2.getPrezime());
        

	}

}
