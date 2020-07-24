package naturalOrder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Osoba implements Comparable<Osoba>{
	private String ime;

	public Osoba(String ime) {
		this.ime = ime;
	}

	@Override
	public String toString() {
		return "Osoba [ime=" + ime + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Osoba other = (Osoba) obj;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		return true;
	}

	@Override
	public int compareTo(Osoba o1) {
		int len1 = ime.length();
		int len2 = o1.ime.length();
		
		if(len1>len2){
			return 1;
		}
		else if(len1<len2)
			return -1;
		//Kad bi bilo return 0 , vratio bi samo jedno ime odredjene duzine,ostala imena te duzine bi preskocio
		else
			return ime.compareTo(o1.ime);
	}
}
public class NaturalOrder {

	public static void main(String[] args) {
		List<Osoba> list = new ArrayList<Osoba>();
		SortedSet<Osoba> set = new TreeSet<Osoba>();
	
		addElements(list);
		addElements(set);
		
		Collections.sort(list);
		
		showElements(list);
		System.out.println();
		showElements(set);
	}
	
	private static void addElements(Collection<Osoba> collection) {
		collection.add(new Osoba("Pera"));
		collection.add(new Osoba("Mika"));
		collection.add(new Osoba("Zika"));
		collection.add(new Osoba("Jova"));
		collection.add(new Osoba("Lika"));
		
	}
	private static void showElements(Collection<Osoba> collection) {
		for(Osoba element: collection) {
			System.out.println(element);
		}
	}
}
