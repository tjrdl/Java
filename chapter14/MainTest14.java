package Java.chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainTest14 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		// mapToInt : 기본형 int 타입으로 변경
		int sum = list.stream().mapToInt(n->n).sum();
		
		int sum2 = IntStream.of(20,10,30).sum();
		
		System.out.println(sum);
		System.out.println(sum2);
	}

}
