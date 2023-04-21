package collection_Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		HashMap  m = new HashMap();
		Temp t = new Temp();
		m.put(t,"Rohan");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
		
		WeakHashMap  map = new WeakHashMap();
		Temp t2 = new Temp();
		map.put(t2,"Rohan");
		System.out.println(map);
		t2 = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(map);
	}
	
	
	

}

class Temp
{
	public String toString() {
		return "Temp";	
	}
	
	public void finalize() {
		System.out.println("Finalize method called");
	}
}