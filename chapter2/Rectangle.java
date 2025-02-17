package chapter2;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점(x,y)의 좌표를 입력하시오>> ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (( 100 <= x && x <= 200 ) || ( 100 <= y && y <= 200 )) {
			System.out.println("("+x+","+y+")는 사각형 안에 있습니다.");
		}
		else {
			System.out.println("사각형안에 없습니다.");
		}
		
	}

}
