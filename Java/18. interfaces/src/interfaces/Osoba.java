package interfaces;

public class Osoba implements InfoInt {
	//Interfejs se implementira pomocu implements
	//Moze biti pozvan veci broj interfejsa
	//Svaka metoda deklarisana u interfejsu , mora biti definisana u klasi, koja je implementira
	String ime;
    String prezime;
    int godine;
	
    public Osoba(String ime, String prezime, int godine) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
	}
    @Override
    public void show() {
    	System.out.println("Ime: "+ime+"Prezime: "+prezime+" Godine: "+godine);
    }
    public void info() {
    	System.out.println("Klasa Osoba");
    }
}
