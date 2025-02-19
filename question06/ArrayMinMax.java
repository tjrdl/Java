package Java.question06;

import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 10개 입력");
		int arr [] = new int[10];
		int min = 0, max = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(i==0) {
				min = arr[i];
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
			
			if(arr[i] > max) {
				max = arr[i];
			}
			
		}
		System.out.println("min = "+min);
		System.out.println("max = "+max);
		System.out.println("sum = "+(max+min));
	}

}
