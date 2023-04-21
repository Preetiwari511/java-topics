package collection_Practice;

import java.util.*;
import java.util.stream.Collectors;


public class StackMethods {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Deque<Integer> deque = new ArrayDeque<Integer>();
		stack.push(123);
		deque.push(123);
		stack.push(234);
		deque.push(234);
		List<Integer> list1 = stack.stream().collect(Collectors.toList());
		System.out.println("Using Stack -");
		for(int i = 0; i < list1.size(); i++){
			System.out.print(list1.get(i) + " " );
		}
		System.out.println();
		List<Integer> list2 = deque.stream().collect(Collectors.toList());
		System.out.println("Using Deque -");
		for(int i = 0; i < list2.size(); i++){
			System.out.print(list2.get(i) + " " );
		}
		System.out.println();

	}
}
