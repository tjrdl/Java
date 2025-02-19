package Java.question06;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 10개 입력>>");
		int arr[] = new int[10];
		int res[] = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] % 3 == 0) {
				int j = arr[i];
				res[i] = j;
			}
		}
		System.out.print("3의 배수는 ");
		for(int i = 0; i<res.length; i++) {
			if(res[i] != 0)
			System.out.print(res[i]+" ");
		}
	}

}
