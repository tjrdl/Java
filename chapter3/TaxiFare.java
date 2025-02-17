package chapter3;

import java.util.Scanner;

public class TaxiFare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fare = 0;
		int income = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i<10; i++) {
			System.out.println("요금을 입력하세요: ");
			fare = sc.nextInt();
			income += fare;
		}
		System.out.println("총수입: "+income);
	}

}
