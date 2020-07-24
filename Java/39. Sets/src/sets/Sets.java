package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		//Nema redosled sortiranja
		//Izvrsavanje metoda add(),contains(),remove(),size(),ostaje isto bez obzira na velicinu skupa
		//Interfejsi - Collection,Iterable,Set
		Set<String> set1 = new HashSet<String>();
		
		//LInkedHashSet- povezana lista cuva redosled elemenata kako su uneti
		//Interfejsi - Collection,Iterable,Set
		Set<String> set2 = new LinkedHashSet<String>();
		
		//TreeSort sortira elemente . Ima strukturu hijerarhijskog stabla
		//Objekti se smestaju u rastucem redosledu
		//Uvek kad se doda element, on se smesta na odgovarajucu poziciju u skladu sa sortiranjem
		//Interfejsi - Collection,Iterable,Set
		//Dodavanje elementa je sporije od HashSet-a , ali je brze od LinkedHashSet-a
		//Ako hocemo da poredimo na drugi nacin onda se u objektu implementira interejs Comparator
		Set<String> set3 = new TreeSet<String>();
		
		if(set1.isEmpty())
			System.out.println("Prazan");
		set1.add("prvi");
		set1.add("drugi");
		set1.add("treci");
		set1.add("cetvrti");
		set1.add("peti");
		
		//Ne dodaje duplikate
		set1.add("prvi");
		System.out.println(set1);

		set2.add("prvi");
		set2.add("drugi");
		set2.add("treci");
		set2.add("cetvrti");
		set2.add("peti");
		set2.add("Sesti");
		System.out.println(set2);
	
		set3.add("prvi");
		set3.add("drugi");
		set3.add("treci");
		set3.add("cetvrti");
		set3.add("peti");
		System.out.println(set3);
	
		
		for(String element: set1) {
			System.out.println(element);
		}
		System.out.println();
		for(String element: set2) {
			System.out.println(element);
		}
		System.out.println();
		for(String element: set3) {
			System.out.println(element);
		}
		System.out.println();
		
		if(set1.contains("deseti")) {
			System.out.println("Sadrzi");
		}
		else if(set1.contains("drugi")) {
			System.out.println("Sadrzi drugi");
		}
		else
			System.out.println("ne sadrzi");
		
		Set<String> presek = new HashSet<String>(set1);
		
		System.out.println(presek);
		
		presek.retainAll(set2);
		System.out.println(presek);
		
		Set<String> razlika = new HashSet<String>(set1);
		razlika.removeAll(set2);
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(razlika);
	}

}
