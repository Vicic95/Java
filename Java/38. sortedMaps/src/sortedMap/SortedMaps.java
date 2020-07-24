package sortedMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMaps {

	public static void main(String[] args) {
		//ne garantuje redosle elemenata
		//Interfejs Map
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		
		//Prosiruje HashMap , povezana lista stavki mape, gde se garantuje redosled kako su uneseni
		//Interfejs Map
		LinkedHashMap<Integer, String> linkedHash = new LinkedHashMap<Integer, String>();
		
		//Koristi hijerahijski stablo  i razvrstava elemene u rastucem redosledu
		//Interfejs Map,Sorted Map
		TreeMap<Integer, String> tree = new TreeMap<Integer, String>();
		
		test(hash);
		System.out.println();
		test(linkedHash);
		System.out.println();
		test(tree);
	}
	
	public static void test(Map<Integer, String> map) {
		map.put(6, "Sest");
		map.put(4, "Cetiri");
		map.put(13, "Trinaest");
		map.put(5, "Pet");
		map.put(2, "Dva");
		map.put(1, "Jedan");
		
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			
			System.out.println(key + ": " + value);
		}
	}

}
