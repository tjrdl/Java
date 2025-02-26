package Java.chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainTest13 {

	public static void main(String[] args) {
	List<String> sList = new ArrayList<String>();
	sList.add("Tomas");
	sList.add("Edward");
	sList.add("Jack");
	
	Stream<String> stream = sList.stream();
	stream.forEach(str -> System.out.print(str+" "));
	System.out.println("\n===========================");
	
	sList.stream().sorted().forEach(str -> System.out.print(str+" "));
	System.out.println("\n===========================");
	
	// 데이터를 변형 할 때 사용하는 map --> 길이로 변경
	sList.stream().map(s->s.length()).forEach(s -> System.out.print(s+" "));
	System.out.println("\n===========================");
	
	// 이름의 길이가 5이상인 경우
	sList.stream().filter(s->s.length() >=5 ).forEach(s -> System.out.print(s+" "));
	}

}
