package polymorphism;

public class OsobaNasl extends Osoba {
	public OsobaNasl() {
		
	}
	public void osobina() {
		System.out.println("Nasledjena");
	}
	//Polimorfni metod
	@Override
	public void show() {
    	System.out.println("OsobaNasl-Ime: "+ime+"Prezime: "+prezime+" Godine: "+godine);
    }
}
