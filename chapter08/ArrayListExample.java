package chapter08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List 컬렉션에서 ArrayList 클래스로 객체 생성
		// List에 focus 상태에서 ctrl t
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		// 2번째 인덱스에 데이터 베이스가 추가되고 기존에 있던 값들은 한칸씩 밀림
		list.add(2, "Database");
		list.add("Spring");
		

		int size = list.size();

		String skill = list.get(2);
		System.out.println("2: " + skill);
		
		list.remove(1);

		System.out.println("총 list 갯수:" + size);

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		
		list.remove("Spring");
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
	}

}
