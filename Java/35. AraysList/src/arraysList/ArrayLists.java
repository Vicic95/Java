package arraysList;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		//ArrayList podrzava dinamicke nizove
		//Kada se koriste primitivni tipovi, pridruzuje im se odgovarajuci objekat- omotac
		//ArrayList sadrzi reference objekata
		//Kada se popuni , automatski se povecava , kada se ukloni objekat sa list,velicina se smanji
		//Povecavanje kapaciteta je vrlo zahtevno i sporo
		//Kreira se nova kolekcija koja sadrzi sve elemente vec postojece liste
		//Ostavlja se prostor za nove elemente , a stara lista se brise
		
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		
		//Klasa ArrayList je genericka klasa i implementira interfejse Collection,List,Iterabe
		//Mogu da skladiste i objkete klase koju sami kreiramo
		
		//Dodavanje brojeva
		//Add ne kopira instancu , vec samo skladisti memorijske adrese objekata
		brojevi.add(10);
		brojevi.add(20);
		brojevi.add(30);
		
		
		System.out.println(brojevi.get(0));
		System.out.println();
		//size() racuna velicinu liste
		for(int i=0;i<brojevi.size();i++) {
			System.out.println(brojevi.get(i));
		}
		//Moze zbog interfejsa Iterable
		System.out.println();
		for(Integer value: brojevi) {
			System.out.println(value);
		}
		
		//Veoma sporo
		brojevi.remove(brojevi.size()-1);
		
		System.out.println();
		for(Integer value: brojevi) {
			System.out.println(value);
		}
		System.out.println();
		
		System.out.println(brojevi);
		
		//Podlista
		System.out.println(brojevi.subList(0, 1));
		
	}

}
