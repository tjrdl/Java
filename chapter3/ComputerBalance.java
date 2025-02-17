package chapter3;

import java.util.Scanner;

public class ComputerBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int purchaseAmount = 0;
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구매 금액을 입력하세요:");
		purchaseAmount = sc.nextInt();
		
		if (purchaseAmount >= 300000) {
			balance = purchaseAmount - 30000;
			System.out.println("청구 금액"+balance);
		}
		else if (purchaseAmount < 300000 && 100000<=purchaseAmount) {
			balance = purchaseAmount - 5000;
			System.out.println("청구 금액"+balance);
		}
		else {
			balance = purchaseAmount;
			System.out.println("청구 금액"+balance);
		}
	}

}
