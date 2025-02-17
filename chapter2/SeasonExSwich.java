package chapter2;

import java.util.Scanner;

public class SeasonExSwich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("달을 입력하세요(1~12)>> ");

		int x = sc.nextInt();
		
		switch (x) {
		case 3,4,5:
			System.out.println("봄");
			break;
		case 6,7,8:
			System.out.println("여름");
			break;
		case 9,10,11:
			System.out.println("가을");
			break;
		case 12,1,2:
			System.out.println("겨울");
			break;	
		default:
			System.out.println("잘못된입력");
		
		}
		
	}

}
