package Java.chapter08;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array = new ArrayList<>();
		boolean aaa = array.add("oracle");
		System.out.println(aaa);
		boolean bbb = array.add("mysql");
		System.out.println(aaa);
		boolean ccc = array.add("oracle");
		System.out.println(aaa);

		for (int i = 0; i < array.size(); i++) {
			String str = array.get(i);
			System.out.println(i + ": " + str);
		}
	}

}