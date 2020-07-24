package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		//Cuva podatke u hes-tabeli
		//Implementira interfejs Map
		//Vreme izvrsavanja get() i put() je isto bez obzira na velicinu mape
		//Ne garantuje redosled elemenata
		//Na osnovu vrednosti zadatog kljuca racuna jedinstveni hes-kod
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5, "Pet");
		map.put(6, "Sest");
		map.put(4, "Cetiri");
		map.put(3, "Tri");
		map.put(1, "Jedan");
		map.put(2, "Dva");
		
		//Ne moze da se napravi duplikat, vec ce da dobije novu vrednost
		map.put(4, "Four");
		String text = map.get(4);
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
		
		
	}

}
