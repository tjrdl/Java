package Java.chapter4;

import java.util.Scanner;

public class ArrayMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[7];
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 7개를 입력하세요");
		int min = 0;
		int min_Max_value = Integer.MAX_VALUE;
		for (int i = 0; i<7; i++) {
			int num1 = sc.nextInt();
			num[i] = num1;
//			if(i==0) { 
//				min = num[i];
//			}
			if(num[i] < min_Max_value) {
				min_Max_value = num[i];
			}
			
		}
		System.out.println("가장 작은 수는 "+min_Max_value+"입니다.");
		sc.close();
	}

}
