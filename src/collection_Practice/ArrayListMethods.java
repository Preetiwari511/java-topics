package collection_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<>();
		ArrayList<Character> list1 = new ArrayList<>();
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('A');
		list.add(3,'C');
		list1.add('C');
		list1.add('B');
		
		System.out.println(list); 
		list.remove(4); //
		System.out.println(list);
		System.out.println(list.indexOf('C')); //
		System.out.println(list.lastIndexOf('C')); //
		
		System.out.println(list.get(1));
		
		list.set(0,'X');
		System.out.println(list);
		// listIterator is a method to retrive objects one by one in the list
		
		int index = list.indexOf('C');
		System.out.println(index);
		System.out.println(list.lastIndexOf('C'));
		list.remove(1);
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.isEmpty());
		System.out.println(list.contains('X'));
		System.out.println(list.containsAll(list1));
		
		System.out.println("**************************************************************");
		
	     // Using for-each loop for iteration
		for(char ch : list) {
			System.out.println(ch);
		}
		
		System.out.println("**************************************************************");
		// using iterator method
		
		Iterator<Character> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("**************************************************************");
		
		// using while loop
		int i =0;
		while(i<list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		
		System.out.println("**************************************************************");
		System.out.println("Backward Direction Iteration:");
		// I don't find any function like hasPrevious()
		
		System.out.println("**************************************************************");
		//using lambda expression
		list.forEach((chr)-> System.out.println(chr));
		
		System.out.println("**************************************************************");
	     // using java stream
		list.stream().forEach((chr)->System.out.println(chr)); // why have we used stream???
		
		System.out.println("**************************************************************");
		//sorting the array
		Collections.sort(list);
		System.out.println(list);
        
		System.out.println("**************************************************************");
		// sorting the array in reverse order
	
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		

		
		
			
	}

}
