package staticPrim;


class Osoba {
    //Konstanta , Zajednicka za sve objekte klase Osoba
    public final static int LUCKY_NUMBER = 7;
    
    public String ime;
    public static String opis;
    public static int br = 0;
    public int id; 
    
    public Osoba() {
        id = br;    
        br++;
    }
    
    public void show() {
        System.out.println("Id: " + id + " ,opis: " + opis + " ,ime: " + ime);
    }
    //Ne bi radilo za system.out.println(ime);
    //za static metodu , mora static promenljiva
    public static void info() {
        System.out.println(opis);       
    }
}

public class Static {

	public static void main(String[] args) {
		Osoba.opis = "Ja sam osoba";
		Osoba.info();
		
		System.out.println("Pre: "+Osoba.br);
		Osoba osoba1 = new Osoba();
		Osoba osoba2 = new Osoba();
		Osoba osoba3 = new Osoba();
		System.out.println("Posle: "+Osoba.br);
		
		osoba1.ime = "Mika";
		osoba2.ime = "Zika";
		osoba3.ime = "Jova";
		
		osoba1.show();
		osoba2.show();
		osoba3.show();
	
		System.out.println(Math.PI);
		System.out.println(Osoba.LUCKY_NUMBER);
	
	}
	

}
