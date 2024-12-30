package coll; //컬렉션 프레임워크

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 숫자들을 set으로 사용하고 싶으면?
		// Wrapper Class
		// int = Integer
		// double = Double
		// String = String
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new HashSet<Integer>();

		System.out.println(set1.size());
		System.out.println(set1.isEmpty());

		set1.add("A");
		set1.add("B");
		set1.add("C");
		System.out.println(set1.size());
		set1.add("C");
		set1.add("C"); // 같은거는 중복X 배열에 추가 안됨.
		set1.add("C");
		set1.add("E");
		set1.add("D");
		set1.add("Z");
		set1.add("F");
		set1.add("S");
		set1.add("H");
		set1.add("K");
		System.out.println(set1.size());
		
		Iterator<String> i1 = set1.iterator();
		
		// i1.hasNext() 다음값이 존재 하는지 확인 용도
		// i1.next() 다음 값 읽어오기
		while(i1.hasNext()) {
			String n = i1.next();
			System.out.println(n);
		}
		

	}

}
