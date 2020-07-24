package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedLists {

	public static void main(String[] args) {
		//Efikasniije kad treba promeniti ili procitati prozivoljni element		
		//Ako se uklanja iz sredine, svi nakon njega se pomeraju za jedno mesto ka pocetku slicno i za dodavanje
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		//Ako dodajemo i brisemo bilo gde drugo , koristimo LinkedList
		//Svaki element ima referencu na prethodni i sledeci element
		//Kada se dodaje u sredini , samo se doda referenca na prethodni i sledeci
		//A za orethodni i sledeci se azuriraju
		//Interfejsi - Collection,List,Iterable,Queue,Deque
		LinkedList<Integer> linked = new LinkedList<Integer>();
		
		liste("Array",array);
		liste("Linked",linked);
		
		LinkedList<String> linked2 = new LinkedList<String>();
		linked2.add("A");
		linked2.add("B");
		linked2.add("C");
		linked2.add("D");
		System.out.println(linked2);
		linked2.remove(2);
		
		ListIterator<String> itr  = linked2.listIterator();
		itr.next();
		itr.next();
		itr.remove();
		System.out.println(linked2);
		
		linked2.removeFirst();
		System.out.println(linked2);
		
		String vrednost = linked2.get(0);
		linked2.set(0, vrednost + "-dodatak");
		System.out.println(linked2);
	}
	
	public static void liste(String str,List<Integer> lista) {
		for(int i=0;i<1E5;i++) {
			lista.add(i);
		}
		
		
		long start = System.currentTimeMillis();
		/*dodavanj na kraj liste
		for(int i=0;i<1E5;i++) {
			lista.add(i);
		}
		*/
		//Dodavanje bilo gde drugo
		//for(int i=0;i<1E5;i++){
		//	lista.add(0,i);
		//}
		
		
		for(int i=0;i<1E5;i++) {
			lista.add(lista.size()-100,i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Vreme; "+(end-start) +" "+ str);
	}

}
