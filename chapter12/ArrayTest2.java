package Java.chapter12;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = { "a", "b", "c", "d" };
		int[] b = { 1, 5, 5, 7, 3, 3, 42, 6, 8, 45323, 4, 73, 2, 1 };
		System.out.println(a);
		System.out.println(Arrays.asList(a));
		List<String> list = Arrays.asList(a);
		System.out.println(list.get(1));

		Arrays.sort(b, 4, 14); // 4 부터 14 전까지 정렬
		System.out.println(Arrays.toString(b));

		Arrays.sort(b); // 4 부터 14 전까지 정렬
		System.out.println(Arrays.toString(b));

		Arrays.sort(a, Collections.reverseOrder()); // 4 부터 14 전까지 정렬
		System.out.println(Arrays.toString(a));

		Arrays.sort(a);
		Arrays.sort(a, 2, 4, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));

		String[] cc = { "11", "12", "13", "14", "52", "23", "145", "1" };
		Arrays.sort(cc,Collections.reverseOrder());
		System.out.println(Arrays.toString(cc));
		
		int [] c = Arrays.copyOf(b, b.length);
		System.out.println(Arrays.toString(c));
		
		String [] d = Arrays.copyOf(a, 3);
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(a));
		}

}
