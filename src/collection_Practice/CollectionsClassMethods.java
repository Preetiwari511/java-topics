package collection_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CollectionsClassMethods {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = Arrays.asList(5,4,2,3,1);
		list.add(1);
		list.add(2);
		list.add(3);
		List<Integer>list3 = Arrays.asList(4,5);
		Collections.addAll(list, 3,6,8); //1. adds the objects to the specified collection.
		System.out.println(list);
		System.out.println(list2);
		Collections.copy(list, list2);
		System.out.println(list); // elements of list2 are copied to list at the same index of list2
		boolean hasNoSameElements = Collections.disjoint(list, list2); // if no element is same returns true
		System.out.println(hasNoSameElements);
		boolean isChanged = Collections.replaceAll(list, 8, null);
		System.out.println(isChanged + " "+ list);
		int occ = Collections.indexOfSubList(list, list3);
		System.out.println(occ); // gives the index of the list
		list.add(4);
		list.add(5);
		System.out.println(Collections.lastIndexOfSubList(list, list3));
		try {
			System.out.println("Inside try");
			int maxNum = Collections.max(list);// not getting this one
			System.out.println(maxNum);
		} catch (Exception e) {
			System.out.println("Inside catch");
			System.out.println("error========" + e);
		}finally {
			// close resources
		}
		
		Set set = Collections.singleton("12");
		System.out.println(set);
		System.out.println(Collections.unmodifiableCollection(list)); // why??
		List l = Collections.EMPTY_LIST;
		System.out.println(l);
		CollectionsClassMethods n = new CollectionsClassMethods();
		Collections.sort(list2);
		System.out.println(list2);
		System.out.println(Collections.binarySearch(list2, 3)); // before calling binarySearch method,compulsorily the list should be sorted. 
		System.out.println(Collections.binarySearch(list2, 0)); // the return type is int of this method (returns index if  element is available else returns insertion point. )
		System.out.println(Collections.binarySearch(list2, 6));
		
		

		
		
	}

	

}
