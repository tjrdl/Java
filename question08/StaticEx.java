package Java.question08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
//		int [] array = new int [a.length+b.length];
//		System.arraycopy(a, 0, array, 0, a.length);
//		System.arraycopy(b, 0, array, a.length, b.length);
//		
		int [] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
		return array;
	}

	public static void print(int[] array3) {
		// TODO Auto-generated method stub
//		Arrays.sort(array3);
		System.out.print(Arrays.toString(array3));
	}

}

public class StaticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1,5,7,9};
		int[] array2 = {3,6,-1,100,77};
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}

}
