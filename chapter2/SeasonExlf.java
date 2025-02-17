package chapter2;

import java.util.Scanner;

public class SeasonExlf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("점(x,y)의 좌표를 입력하시오>> ");

		int x = sc.nextInt();
		
		if (3<=x && x<=5)
		{
			System.out.println("봄");
		}
		else if (6<=x && x<=8)
		{
			System.out.println("여름");
		}
		else if (9<=x && x<=11)
		{
			System.out.println("가을");
		}
		else if ( (x== 12) || (1<=x && x<=2)) {
			System.out.println("겨울");

		}
		else {
			System.out.println("잘못입력");

		}
}}
