package collection_Practice;

import java.util.TreeSet;

public class TestComperableforEmp1 {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1(102,"Aman");
		Employee1 e2 = new Employee1(101,"Anil");
		Employee1 e3 = new Employee1(103,"Apurva");
		Employee1 e4 = new Employee1(105,"Amit");;
		Employee1 e5 = new Employee1(104,"Aayush");
		Employee1 e6 = new Employee1(106,"Aayushi");
		
		// when all objects are inserted in a treeSet with default cons
		
		TreeSet<Employee1> treeSet = new TreeSet<>();
		treeSet.add(e1);
		treeSet.add(e2);
		treeSet.add(e3);
		treeSet.add(e4);
		treeSet.add(e5);
		treeSet.add(e6);
		
		System.out.println(treeSet);
		
		
	}

}
