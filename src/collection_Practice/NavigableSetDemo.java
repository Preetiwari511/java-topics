package collection_Practice;

import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ns = new  TreeSet<Integer>();
		ns.add(2000);
		ns.add(1000);
		ns.add(3000);
		ns.add(5000);
		ns.add(4000);
		System.out.println(ns);
		System.out.println(ns.floor(3000));
		System.out.println(ns.ceiling(2000));
		System.out.println(ns.higher(5000));
		System.out.println(ns.lower(4000));
		System.out.println(ns.pollFirst());
		System.out.println(ns.pollLast());
		System.out.println(ns.descendingSet());
		System.out.println(ns);
	}

}
