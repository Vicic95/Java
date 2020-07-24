package setMap;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Osoba {
	private int godine;
	private String ime;
	private String prezime;
	
	public Osoba(int godine, String ime, String prezime) {
		this.godine = godine;
		this.ime = ime;
		this.prezime = prezime;
	}
	@Override
	public String toString() {
		return "Osoba [godine=" + godine + ", ime=" + ime + ", prezime=" + prezime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + godine;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((prezime == null) ? 0 : prezime.hashCode());
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
		if (godine != other.godine)
			return false;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (prezime == null) {
			if (other.prezime != null)
				return false;
		} else if (!prezime.equals(other.prezime))
			return false;
		return true;
	}
}

public class SetMap {

	public static void main(String[] args) {
		Osoba osoba1 = new Osoba(24,"Pera","Peric");
		Osoba osoba2 = new Osoba(34,"Zika","Zikic");
		Osoba osoba3 = new Osoba(44,"Mika","Mikic");
		Osoba osoba4 = new Osoba(44,"Mika","Mikic");
	
		//Da bi razlikovale koja je osoba ista, uvodimo equals i hashCode
		Map<Osoba, Integer> map = new LinkedHashMap<Osoba, Integer>();
		
		map.put(osoba1,1);
		map.put(osoba2,2);
		map.put(osoba3, 3);
		map.put(osoba4, 4);
		for(Osoba key: map.keySet()) {
			System.out.println(key+": "+map.get(key));
		}
		
		Set<Osoba> set = new LinkedHashSet<Osoba>();
		
		set.add(osoba1);
		set.add(osoba2);
		set.add(osoba3);
		set.add(osoba4);
		
		System.out.println(set);
		
	}

}
