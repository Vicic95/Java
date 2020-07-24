package priorityQueues;

import java.util.PriorityQueue;

public class PriorityQueues {

	public static void main(String[] args) {
		//Red cekanja - priorite odredjuje zadati komparator
		//Ako se ne zada, koristi se podrazumevani komparator - rastuce
		//Koristi se za rasporedjivanje poslova
		//Interfejsi - Collection,Iterable,Queue
		PriorityQueue<Integer> red = new PriorityQueue<Integer>();
		
		red.offer(1);
		red.offer(5);
		red.offer(3);
		red.offer(333);
		
		for(Integer element: red) {
			System.out.println(element);
		}
	}

}
