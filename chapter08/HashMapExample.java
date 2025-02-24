package chapter08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Map collection : key, value
		// Map Interface type 으로 HashMap class 객체 생성(키: 문자열, 값, 정수형 Wrapper class)
		Map<String, Integer> map = new HashMap<>(); // upcasting
		map.put("임영웅", 31);
		map.put("영탁", 38);
		map.put("이진원", 25);
//		map.put("임영웅", 30); // 키 중복 허용 x
		map.put("김호중", 31); // 값 중복 허용 o
		map.put("정동원", 14);

		System.out.println("총 Entry 수: " + map.size());
		System.out.println("임영웅: " + map.get("임영웅"));
		System.out.println();

		Set<String> keySet = map.keySet(); // map collection의 모든 key들을 Set collection으로 받음
		Iterator<String> keyIterator = keySet.iterator();

		// Map collection key,value를 가져오는 첫번째 방식
		while (keyIterator.hasNext()) { // 컬렉션 객체가 있으면 참
			String key = (String) keyIterator.next(); // 컬렉션 객체를 가져옴
			Integer value = map.get(key); // Integer, int 사용 무관

			// index 개념이 없어 출력 순서가 랜덤으로 발생됨
			System.out.println("\t" + key + ": " + value);

		}
		System.out.println();

		map.remove("임영웅");
		System.out.println("총 Entry 수: " + map.size());

		// Map.Entry 구조로 키/값 으로 객체를 받음
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

		// set collection 방식으로 객체 처리(키, 값을 받아옴)
		Iterator<Map.Entry<String, Integer>> entryiterator = entrySet.iterator();

		// Map collection key/value 를 가져오는 두번째 방식
		while (entryiterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryiterator.next(); // collection 객체를 가져옴
			String key = entry.getKey();
			Integer value = entry.getValue();

			System.out.println("\t" + key + ": " + value);

		}
		map.clear();
		System.out.println("총 Entry 수: " + map.size());

	}

}
