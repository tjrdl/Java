package chapter3;

import java.util.Scanner;

public class ExGlobalStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sell = 0;
		int buy = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("매수 금액을 입력하세요:");
		buy= sc.nextInt();
		System.out.println("매도 금액을 입력하세요:");
		sell = sc.nextInt();
		
		if(sell>buy) {
			System.out.println("양도세= "+((sell-buy)*0.22));
			
		}
		else {
			System.out.println("양도세= "+0);
		}
	}

}
