package encapsulation;

public class OsobaNasl extends Osoba {
	public OsobaNasl() {
		
	}
	public void osobina() {
		System.out.println("Nasledjena");
	}
	@Override
	public void show() {
    	System.out.println("OsobaNasl-Ime: "+getIme()+"Prezime: "+getPrezime()+" Godine: "+getGodine());
    }
}
