package chapter2;

import java.util.Scanner;

public class ExMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 3개 입력>> ");

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int temp = x;
		if(x>y && x>z) {
			temp = x;
		}
		else if(y>x && y>z) {
			temp = y;
		}
		else {
			temp = z;
		}
		System.out.println("최대값은"+temp);
		if(x<y && x<z) {
			temp = x;
		}
		else if(y<x && y<z) {
			temp = y;
		}
		else {
			temp = z;
		}
		System.out.println("최소값은"+temp);

	}

}
