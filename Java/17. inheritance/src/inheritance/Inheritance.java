package inheritance;

public class Inheritance {

	public static void main(String[] args) {
		Osoba osoba1 = new Osoba("Zika","Ziks",46);
        Osoba osoba2 = new Osoba("Mika","Miks",21);
        OsobaNasl nasl = new OsobaNasl("Jova","Jovin",67);
        osoba1.show();
        osoba1.info();
        osoba2.show();
        osoba2.info();
        
        nasl.show();
        nasl.info();
	}

}
