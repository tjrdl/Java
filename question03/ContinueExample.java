package question03;

import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		System.out.println("정수를 5개 입력하세요: ");
		for (int i = 0; i < 5; i++) {
			num = sc.nextInt();
			if(num>0) {
				
				sum+=num;
			}
		}
		System.out.print("양수의 합은 "+sum);
		sc.close();
	}

}
