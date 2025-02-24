package chapter08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class AA {
}

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set interface collection type, HashSet class 객체 생성
		Set<String> set = new HashSet<>(); // upcasting
//		Set<AA> set = new HashSet<>(); 
//		Set<Object> set = new HashSet<>();
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // set collection 중복 객체 추가 불가
		AA a = new AA();
//		set.add(a); // Set<Object> 타입으로 사용 가능
		set.add("iBatis");

		int size = set.size();
		System.out.println("총 객체수: " + size);

		// set collection은 iterator method 호출해서, Iterator interface type으로 값을 받음
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("JDBC");
		int size_after = set.size();
		System.out.println("총 객체수: " + size_after);
//		
//		Iterator<String> iterator2 = set.iterator();
//		while (iterator2.hasNext()) {
//			String element = (String) iterator2.next();
//			System.out.println("\t" + element);
//		}

		for (String element : set) {
			System.out.println("\t" + element);
		}
		
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
		else {
			System.out.println("객체 있음");
		}
		
		set.clear(); // 객체 클리어
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
		else {
			System.out.println("객체 있음");
		}
	}

}
