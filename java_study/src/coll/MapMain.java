package coll; //컬렉션 프레임워크

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Key, Value
		//Map<String, 객체>
		//Map<String, String>
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "김하나");
		map1.put(2, "김둘");
		map1.put(3, "김셋");
		
		System.out.println(map1.containsKey(2));
		System.out.println(map1.containsKey(4));
		
		System.out.println(map1.containsValue("박사"));
		System.out.println(map1.containsValue("김하나"));
		
		System.out.println(map1.get(3));
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("당번", "지각생");
		System.out.println(map2.get("당번"));
		
		//
		
		Set<Integer> map1key = map1.keySet();
		for(Integer key : map1.keySet()) {
			System.out.println(key);
			System.out.println(map1.get(key));
		}
		for(String value : map1.values()) {
			System.out.println(value);
		}
		
		Set<Entry <Integer, String>> entrySet = map1.entrySet();
		//System.out.println(map1.entrySet());
		for(Entry<Integer,String> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			System.out.println(entry);
			System.out.println(entrySet);
		}
		
//		map1.put(1, "김하나");
//		map1.put(2, "김둘");
//		map1.put(3, "김셋");
		for(Integer key : map1.keySet()) {
			System.out.println(key + " : " + map1.get(key));
		}
		

	}

}
