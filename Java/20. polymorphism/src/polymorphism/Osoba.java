package polymorphism;

public class Osoba {
	String ime;
    String prezime;
    int godine;
	public Osoba() {
		
	}
    
	//Metod ne sme biti private , da bi bio polimorfan
	//Polimorfni metod mora imati isti potpis i u baznoj i u izvedenim klasama
    public void show() {
    	System.out.println("Osoba-Ime: "+ime+"Prezime: "+prezime+" Godine: "+godine);
    }
    public void info() {
    	System.out.println("Info - Klasa Osoba");
    }
}
