package collection_Practice;

import java.util.LinkedList;
import java.util.List;

public class CollectionInterfaceMethodsForList {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(1); // add(object) method 
		list.add(1);
		list.add(3);
		List<Integer> list1 = new LinkedList<>();
		list1.add(2);
		list1.add(3);
		list1.add(4);
		List<Integer> list2 = new LinkedList<>();
		list2.add(2);
		list2.add(3);
		list2.add(4);
		
		list.addAll(list1); // addAll(collection)
		
		System.out.println(list);
		
		list.remove(4); // remove(index) (overridden method of collection remove(object))
		System.out.println(list);
		
		boolean result = list.removeAll(list1); // removeAll(collection)
		System.out.println(result);
		System.out.println(list);
		
		list2.addAll(list1);
		list2.addAll(list);
		System.out.println(list2);
		list2.retainAll(list); // remove all the elements except the one present in collection mentioned in the bracket eg: (list)
		System.out.println(list2);
		
		list2.clear(); // empty the whole collection
		System.out.println(list2);
		
		boolean resultIs = list.contains(list2); // check if the collection in the bracket present in the given collection
		System.out.println(resultIs); 
		
		boolean result2 = list.contains(1); // check if the object present in the given collection
		System.out.println(result2);
		
		System.out.println(list2.isEmpty());
		
		System.out.println(list.size());
		
		Object[] newArray = list.toArray(); // convert the collection into an defined size array, here we can't add any new element/ object to an array. 
		for(Object arr : newArray) {
			System.out.print(arr + " ");
		};
		
		// iterator is method to iterate the objects from the collection one by one
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
