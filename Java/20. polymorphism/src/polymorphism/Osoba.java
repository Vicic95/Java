package polymorphism;

public class Osoba {
	String ime;
    String prezime;
    int godine;
	public Osoba() {
		
	}
    
    public void show() {
    	System.out.println("Osoba-Ime: "+ime+"Prezime: "+prezime+" Godine: "+godine);
    }
    public void info() {
    	System.out.println("Info - Klasa Osoba");
    }
}
