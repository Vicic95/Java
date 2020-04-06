package inheritance;

public class OsobaNasl extends Osoba {

	public OsobaNasl(String ime, String prezime, int godine) {
		super(ime, prezime, godine);
	}
	
	@Override
	public void show() {
    	System.out.println("OsobaNasl-Ime: "+ime+"Prezime: "+prezime+" Godine: "+godine);
    }

}
