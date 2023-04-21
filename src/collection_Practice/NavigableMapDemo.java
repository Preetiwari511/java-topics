package collection_Practice;

import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		TreeMap<String,String> nm = new TreeMap<String,String>();
		nm.put("A","Block 1");
		nm.put("B","Block 2");
		nm.put("C","Block 3");
		nm.put("D","Block 4");
		nm.put("E","Block 5");
		nm.put("F","Block 6");
		System.out.println(nm);
		System.out.println(nm.ceilingKey("C"));
		System.out.println(nm.higherKey("E"));
		System.out.println(nm.floorKey("D"));
		System.out.println(nm.lowerKey("E"));
		System.out.println(nm.pollFirstEntry());
		System.out.println(nm.pollLastEntry());
		System.out.println(nm.descendingMap());
		System.out.println(nm);
	}

}
