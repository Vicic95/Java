package generics;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		//<Tip elemenata>
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("jabuka");
		list.add("kruska");

		
		String voce = list.get(1);
		System.out.println(voce);
	
		showList(list);
		
		ArrayList<Osoba> lista2 = new ArrayList<Osoba>();
		lista2.add(new Osoba());
		lista2.add(new Osoba());
		lista2.add(new OsobaNasl());
		showList2(lista2);
		
		ArrayList<OsobaNasl> lista3 = new ArrayList<OsobaNasl>();
		lista3.add(new OsobaNasl());
		lista3.add(new OsobaNasl());
		lista3.add(new OsobaNasl());
		showList2(lista3);
		showList3(lista3);
		
	}
	public static void showList(ArrayList<String> list) {
		for(String element: list) {
			System.out.println(element);
		}
	}
	//Ne moze da se koristi za ArrayList<OsobaNasl>, ako je definisana za ArrayLsit<Osoba>,ali moze wildcard-?
	public static void showList2(ArrayList<? extends Osoba> list) {
			for(Osoba element: list) {
				System.out.println(element);
				element.show();
				
			}

	}
	
	public static void showList3(ArrayList<? super OsobaNasl> list) {
		for(Object element: list) {
			System.out.println(element);
			
		}

}

}
