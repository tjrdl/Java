package Java.question06;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<>();
		String long_name = "";

		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String str = sc.nextLine();
			array.add(str);
			if (array.get(i).length() > long_name.length()) {
				long_name = array.get(i);
			}
			
		}
		for (int i = 0; i < 4; i++) {
			System.out.print(array.get(i) + " ");
		}
		System.out.println();
		System.out.println("가장 긴 이름: " + long_name);

//		String array[] = new String[4];
//		
//		Scanner sc = new Scanner(System.in);
//		int len = 0;
//		String long_name = "";
//		for (int i = 0; i< array.length; i++) {
//			System.out.print("이름을 입력하세요>>");
//			String str = sc.nextLine();
//			array[i] = str;
//			if(array[i].length() > len) {
//				len = array[i].length();
//				long_name = array[i];
//			}
//		}
//		for (int i = 0; i<array.length; i++) {
//			System.out.print(array[i]+" ");
//		}
//		System.out.println();
//		System.out.println("가장 긴 이름은:"+long_name);

	}

}
