package collection_Practice;

import java.util.Comparator;
import java.util.TreeSet;

public class Test2ComparatorforEmp1 implements Comparator<Employee1>  {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1(102,"Aman");
		Employee1 e2 = new Employee1(101,"Anil");
		Employee1 e3 = new Employee1(103,"Apurva");
		Employee1 e4 = new Employee1(105,"Amit");;
		Employee1 e5 = new Employee1(104,"Aayush");
		Employee1 e6 = new Employee1(106,"Aayushi");
		
		// when all objects are inserted in a treeSet with default cons
		
		TreeSet<Employee1> treeSet = new TreeSet<>(new Test2ComparatorforEmp1());
		treeSet.add(e1);
		treeSet.add(e2);
		treeSet.add(e3);
		treeSet.add(e4);
		treeSet.add(e5);
		treeSet.add(e6);
		
		System.out.println(treeSet);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//		Doesn't take null value.
//		TreeSet<Employee1> treeSet1 = new TreeSet<>();
//		treeSet1.add(null);
//		System.out.println(treeSet1);
		
		
	}

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		Employee1 e1 = (Employee1) o1;
		Employee1 e2 = (Employee1) o2;
		
	    String s1 = e1.getName();
	    String s2 = e2.getName();
	    
	    int l1 = s1.length();
	    int l2 = s2.length();
	    
	    if(l1<l2) {
	    	return -1;
	    }
	    else if(l1>l2) {
	    	return +1;
	    }
	    else {
		return e1.compareTo(o2) ;
	    }
	}

}
