package encapsulation;

public class Osoba {
	
	private String ime;
    
	private String prezime;
    private int godine;
	public Osoba() {
		this.ime = "Pera";
		this.prezime = "Peric";
		this.godine = 21;
	}
	//Zelimo da sakrijemo nacin na koji smo implementirali metode , i podatke
	//Podatke deklarisati private ili bar protected
	//A javnim ucinimo samo upotrebu metoda
    
	
    public void show() {
    	System.out.println("Osoba-Ime: "+ime+"Prezime: "+prezime+" Godine: "+godine);
    }
    public void info() {
    	System.out.println("Info - Klasa Osoba");
    }
    //Metod kojie se koristi samo unutar klase , treba biti private ili bar protected.
    private int privatniMetod() {
    	return 1;
    }
    
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public int getGodine() {
		return godine;
	}
}	
