package collection_Practice;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i<5;i++) {
			q.add(i);
	}
		
		System.out.println("Elements of queue "
				+ q);
		
		q.remove();
		System.out.println(q);
		
		System.out.println(q.peek());
		System.out.println(q.size());
	}

}
