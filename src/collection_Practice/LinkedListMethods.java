package collection_Practice;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList list = new LinkedList<>();
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		System.out.println(list);
		
		//methods only in linkedlist class
		
		list.addFirst('X');
		list.addLast('Z');
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		// LinkedList constructors 
		
		LinkedList<Character> l = new LinkedList<>(); // default constructor but here there is no concept of initial capacity like ArrayList
		LinkedList<Character> l2 = new LinkedList<>(list); // an object created with equivalent of collection given as constructor parameter 		
	}

}
