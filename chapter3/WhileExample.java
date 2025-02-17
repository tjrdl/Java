package chapter3;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int sum = 0;
		
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		while (n!=-1) {
			sum+=n;
			count++;
			n = scanner.nextInt();
		}
		
		if (count == 0) {
			System.out.println("입력된 수가 없습니다.");
			
		}
		else {
			System.out.println("정수의 갯수는 " + count + "개 이며 ");
			System.out.println("평균은" + (double) sum / count + "입니다.");
			
		}
		
	}

}
