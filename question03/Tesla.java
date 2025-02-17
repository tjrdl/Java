package question03;

import java.util.Scanner;

public class Tesla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int price = 520;
		System.out.println("매수 수량을 입력하시오 >> ");
		int num = sc.nextInt();
		int num2 = price * num;
		int result100 = 0, result10 = 0;
		result100 = num2 / 100;
		result10 = (num2 % 100) / 10;
		System.out.println("100달러짜리 " + result100 + "매");
		System.out.println("10달러짜리 " + result10 + "매");
	}

}
