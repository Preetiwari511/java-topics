package collection_Practice;

import java.util.ArrayList;

public class ArrayListTopic {
	
	public static void main(String[] args) {
		// creating obj using different type of constructors of ArrayList
		
		ArrayList<String> arrayList = new ArrayList<>(); // default cons with default size of ArrayList
		ArrayList<String> arrayList1 = new ArrayList<>(30); // cons with initial capacity provided
		ArrayList<String> arrayList2 = new ArrayList<>(arrayList1); // providing another collection to create equivalent obj of ArrayList (Any collection can be provided here as parameter)
		
		arrayList.toArray(new String[3]);
		
		
	}

}
