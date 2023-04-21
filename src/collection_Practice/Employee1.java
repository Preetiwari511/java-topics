package collection_Practice;

public class Employee1 implements Comparable<Employee1> {
	// the creator of the class will implement Comparable and provide definition to compareTo method, which will be used for default sorting

	private int id;
	private String name;
	
	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.setName(name);
	}
	
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + getName() + "]";
	}



	@Override
	public int compareTo(Employee1 o) {
		return this.id> o.id ?1 : this.id<o.id ? -1 :0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
 
}
