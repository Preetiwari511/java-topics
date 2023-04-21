package collection_Practice;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Employee implements Comparable<Employee>{
	Integer id;	
	String name;
	public Employee(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
 
	@Override
	public int hashCode() {
		return this.id+this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		return this.id == ((Employee)obj).id && this.name.equals(((Employee)obj).name);
	}

	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id == o.id && this.name.equals(o.name) ? 0 : this.id > o.id ? 1 : -1;
	}

	public static void main(String[] args) {
		Set<Employee> empSet = new LinkedHashSet<>();
		empSet.add(new Employee(2, "b"));
		empSet.add(new Employee(1, "a"));
		empSet.add(new Employee(3, "b"));
		empSet.forEach((emp) -> {
			System.out.println(emp + "  " + emp.hashCode());
		});
		
		System.out.println("-----------");
		Set<Employee> treeSet =  new TreeSet<>(empSet);
		for(Employee emp: treeSet) {
			System.out.println(emp);
		}
		
	}
	
	
	
	

}
