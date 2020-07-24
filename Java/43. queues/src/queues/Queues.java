package queues;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queues {

	public static void main(String[] args) {
		//FIFO - first in, first out
		Queue<Integer> queue1 = new ArrayBlockingQueue<Integer>(5);
		queue1.add(5);
		queue1.add(3);
		queue1.add(7);
		queue1.add(1);
		queue1.add(9);
		try {
			queue1.add(15);
		} catch (IllegalStateException e) {
			System.out.println(e.toString());
		}
		
		for(Integer value: queue1) {
			System.out.println(value);
		}
		System.out.println();
		Integer value = queue1.remove();
		System.out.println(value);
		queue1.remove();
		queue1.remove();
		queue1.remove();
		queue1.remove();
		try {
			queue1.remove();
		}catch (NoSuchElementException e) {
			System.out.println(e.toString());
		}
		
		Queue<Integer> queue2 = new ArrayBlockingQueue<Integer>(5);
		queue2.offer(4);
		queue2.offer(1);
		queue2.offer(5);
		queue2.offer(3);
		queue2.offer(9);
		queue2.offer(2);
		System.out.println(queue2.peek());
		System.out.println();
		for(Integer value2: queue2) {
			System.out.println(value2);
		}
		System.out.println();
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		
	}

}
