package Java.chapter4;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하시오");
		int num = sc.nextInt();
		int a = 0;
		if(num>50000) {
			int b = num / 50000;
			a = num - (50000 * b);
			System.out.print("오마원권 "+b+"매");

		}
		if(num>10000) {
			int b = a / 10000;
			a = a - (10000 * b);
			System.out.print("만원권 "+b+"매");
		}
		if(num>1000) {
			int b = a / 1000;
			a = a - (1000 * b);
			System.out.print("천원권 "+b+"매");
		}
		if(num>100) {
			int b = a / 100;
			a = a - (100 * b);
			int five = num / 100;
			System.out.print("백원 "+b+"매");
		}
		if(num>50) {
			int b = a / 50;
			a = a - (50 * b);
			int five = num / 10;
			System.out.print("오십원 "+b+"매");
		}
		if(num>10) {
			int b = a / 10;
			a = a - (10 * b);
			int five = num / 10;
			System.out.print("십원 "+b+"매");
		}
		if(num>1) {
			int b = a / 1;
			a = a - (1 * b);
			int five = num / 1;
			System.out.print("일원 "+b+"매");
		}
	}

}
