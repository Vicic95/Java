package arayDeque;

import java.util.ArrayDeque;

public class ArrayDeques {

	public static void main(String[] args) {
		//Dinamicki red - FIFO(first in, first out) ili LIFO(last in, first out)
		//Ne moze se dodati element u sredini
		//Interfejs - Collection,Iterable,Deque
		//Brzi od Steka i LinkedList
		//Primer sa LIFO
		ArrayDeque<String> array = new ArrayDeque<String>();
		array.push("prvi");
		array.push("drugi");
		array.push("treci");
		array.push("cetvrti");
		
		while(array.peek()!=null) {
			System.out.println(array.pop());
		}
	}

}
