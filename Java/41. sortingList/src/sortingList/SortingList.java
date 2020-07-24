package sortingList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorLength implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1>len2)
			return 1;
		else if(len1<len2)
			return -1;
		
 		return 0;
	}
	
}
class ComparatorLetter implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
	
}
class ReverseComparatorLetter implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}
	
}
class Osoba {
	private String ime;
	private String prezime;
	public Osoba(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	@Override
	public String toString() {
		return "Osoba [ime=" + ime + ", prezime=" + prezime + "]";
	}
}
public class SortingList {

	public static void main(String[] args) {
		
		List<String> voce = new ArrayList<String>();
		
		voce.add("jabuka");
		voce.add("banana");
		voce.add("kruska");
		voce.add("limun");
		
		Collections.sort(voce, new ReverseComparatorLetter());
		
		for(String vocka: voce) {
			System.out.println(vocka);
		}
		
		List<Integer> brojevi = new ArrayList<Integer>();
		
		brojevi.add(1);
		brojevi.add(6);
		brojevi.add(8);
		brojevi.add(222);
		brojevi.add(12);
		brojevi.add(654);
		
		Collections.sort(brojevi);
		
		for(Integer broj: brojevi) {
			System.out.println(broj);
		}
	
		List<Osoba> ljudi = new ArrayList<Osoba>();
		
		ljudi.add(new Osoba("Pera","Peric"));
		ljudi.add(new Osoba("Mika","Mikic"));
		ljudi.add(new Osoba("Zika","Zikic"));
		
		for(Osoba osoba: ljudi) {
			System.out.println(osoba);
		}
	
		Collections.sort(ljudi, new Comparator<Osoba>() {

			@Override
			public int compare(Osoba o1, Osoba o2) {	
				return o1.getIme().compareTo(o2.getIme());
			}
			
		});
		for(Osoba osoba: ljudi) {
			System.out.println(osoba);
		}
	}
}
