package Java.chapter14;

import java.util.Arrays;

public class MainTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int sumValue = Arrays.stream(arr).sum();
		System.out.println(sumValue);
		long count = Arrays.stream(arr).count();
		System.out.println(count);
	}

}
