package Java.chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainTest12 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 8; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		Stream<Integer> myStream = list.stream();
		myStream.filter(s-> (s>=5)).forEach(n->System.out.println(n));
		
		System.out.println(list);
	}

}
