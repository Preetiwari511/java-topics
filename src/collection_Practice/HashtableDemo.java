package collection_Practice;

import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(new Temp4(5),"A");
		ht.put(new Temp4(2),"B");
		ht.put(new Temp4(6),"C");
		ht.put(new Temp4(15),"D");
		ht.put(new Temp4(23),"E");
		ht.put(new Temp4(16),"F");
		//ht.put(new Temp(5),null); // Null point exception will occur 
		
		System.out.println(ht);		
	}
	
}

class Temp4{
	int i;
	
	Temp4(int i){
		this.i = i;
	}
	public int hashCode() {
		return i;	
	}
	public String toString() {
		return i + " ";
	}
	
	
}

