package Java.chapter12;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int [] array = {9,4,5,6,2,1};
		printArray(array);
		System.out.println();
		Arrays.sort(array);
		printArray(array);
		System.out.println();
		System.out.println(Arrays.binarySearch(array, 9));
		System.out.println(Arrays.binarySearch(array, -1));
	}
	// 배열을 받아 출력하는 메소드
	private static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
			
		}
		System.out.print("]");
	}
}
