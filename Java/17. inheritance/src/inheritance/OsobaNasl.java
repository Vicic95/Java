package inheritance;

public class OsobaNasl extends Osoba {
	//Potklasa klase Osoba, nasledjivanje se izvrsa uz pomoc extends
	//Klasa moze iati samo jednu natklasu, ali i neogranicen broj potklasa
	//Potklasa se obraca svojoj natklasi uz pomoc super
	public OsobaNasl(String ime, String prezime, int godine) {
		super(ime, prezime, godine);
	}
	
	@Override
	public void show() {
    	System.out.println("OsobaNasl-Ime: "+ime+"Prezime: "+prezime+" Godine: "+godine);
    }

}
