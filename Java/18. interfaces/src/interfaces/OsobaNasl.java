package interfaces;

public class OsobaNasl extends Osoba {
	public OsobaNasl(String ime, String prezime, int godine) {
		super(ime, prezime, godine);
	}

    public void info() {
    	System.out.println("Klasa OsobaNasl");
    }
}
