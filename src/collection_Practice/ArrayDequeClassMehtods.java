package collection_Practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeClassMehtods {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Anu");    
		deque.add("Minu");     
		deque.add("Shinu");  
		deque.add("Piku");
		 for (String str : deque) {  
			   System.out.println(str);  
			   }  
		 System.out.println("***************************************************************");
		 deque.offer("Jai");
		 deque.offer("Vijay");
		 deque.offerFirst("Sanjay");
		 
		 for (String str : deque) {  
			   System.out.println(str);  
			   }  
		 
		 System.out.println("************************************************************");
		 
		 deque.poll();
		 for (String str : deque) {  
			   System.out.println(str);  
			   }
		 
		 System.out.println("************************************************************");
		 
		 deque.pollFirst();
		 for (String str : deque) {  
			   System.out.println(str);  
			   }  
		 
		 System.out.println("************************************************************");
		 
		 deque.pollLast();
		 for (String str : deque) {  
			   System.out.println(str);  
			   }  
		 
		 System.out.println("************************************************************");
		 
	}

}
