package interfaces;

public class Interfaces {

	public static void main(String[] args) {
		//Interfejsi se koriste za postizanje potpune apstrakcije
		//Koriste se za specificiranje zajednickih svojstava povezanih, ali i nepovezanih klasa
		//Metode u interfejsu ne mogu biti staticcke
		//Ona je kolekcija apstartnih metoda i konstanti
		Osoba osoba1 = new Osoba("Zika","Ziks",46);
        Osoba osoba2 = new Osoba("Mika","Miks",21);
        OsobaNasl nasl = new OsobaNasl("Jova","Jovin",67);
        osoba1.show();
        osoba1.info();
        osoba2.show();
        osoba2.info();
        
        //Interfejs ne moze da ima svoj objekat
        //InfoInt infoint1 = new InfoInt();
        nasl.show();
        nasl.info();

	}

}
