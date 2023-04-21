package collection_Practice;

import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapTopic {

	public static void main(String[] args) {
		LinkedHashMap  map = new LinkedHashMap();
		map.put(1,"Alexa");
		map.put(2,"Alex");
		map.put(3,"Alexaa");
		map.put(4,"Alexe");
		map.put(5,"Alexo");
		map.put(1,"Alexu");
		
		System.out.println(map); // insertion order is preserved.
		
		LinkedHashMap  map1 = new LinkedHashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		map1.put(i1,"Rohan");
		map1.put(i2,"Mohan");
		System.out.println(map1); // output is {10,Mohan} as HashMap/ LinkedHashMap use .equals method to compare the keys 
		
		IdentityHashMap map2 = new IdentityHashMap<>();
		Integer i3 = new Integer(10);
		Integer i4 = new Integer(10);
		map2.put(i3,"Rohan");
		map2.put(i4,"Mohan");
		System.out.println(map2); // IdentityHasMap uses == method to compare keys hence output is {10=Rohan, 10=Mohan}
 
		
		
			
	}

}
