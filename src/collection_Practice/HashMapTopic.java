package collection_Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTopic {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1,"Alexa");
		map.put(2,"Alex");
		map.put(3,"Alexaa");
		map.put(4,"Alexe");
		map.put(5,"Alexo");
		map.put(1,"Alexu");
		
		System.out.println(map);
		
		HashMap map2 = new HashMap();
		map2.put(33,"Newton");
		map2.putAll(map);
		map2.putIfAbsent(60,"Sera");
		map2.putIfAbsent(1,"Alexa");
		System.out.println(map2);
		
		map2.remove(33);
		System.out.println(map2);
		
		System.out.println(map2.remove(1,"Alexa"));
		System.out.println(map.keySet()); // returns set of keys 
		System.out.println(map.entrySet()); // return set with key value and value
		
		map2.clear();
		System.out.println(map2);
		
		System.out.println(map2.size());
		System.out.println(map.size());
		
		System.out.println(map.get(2));
		System.out.println(map.hashCode());
		
		System.out.println(map.replace(5,"Preeti"));
		System.out.println(map);
		System.out.println(map.equals(map2));
		
		Set s1 = map.entrySet();
		
		Iterator itr = s1.iterator();
		
		while(itr.hasNext()) {
			Map.Entry e = (Map.Entry) itr.next();
			System.out.println(e.getKey() + " " + e.getValue());
			if(e.getKey().equals(4)) {
				e.setValue("Sanjay");
			}
		}
		
		System.out.println(map);
		
		
		
		
		
		
		
		
	}

}
