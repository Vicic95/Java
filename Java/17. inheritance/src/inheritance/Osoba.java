package inheritance;

public class Osoba {
	String ime;
    String prezime;
    int godine;
	public Osoba(String ime, String prezime, int godine) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
	}
    
    public void show() {
    	System.out.println("Ime: "+ime+"Prezime: "+prezime+" Godine: "+godine);
    }
    public void info() {
    	System.out.println("Info - Klasa Osoba");
    }
}
