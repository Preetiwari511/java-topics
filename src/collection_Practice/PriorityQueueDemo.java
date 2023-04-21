package collection_Practice;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue pr = new PriorityQueue();
		System.out.println(pr.peek());
		for(int i =0;i<=10;i++) {
			pr.offer(i);
		}
		System.out.println(pr);
		System.out.println(pr.poll());
		System.out.println(pr);
		System.out.println(pr.remove());
		System.out.println(pr.element());
		System.out.println(pr);
		
	}

}
