package chapter3;

import java.util.Scanner;

public class ArithmeticExIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op = "+";
		int num1 = 0, num2 = 0;
		
		System.out.println("연산 >>");
		num1 = sc.nextInt();
		op = sc.next();
		num2 = sc.nextInt();
		
		if(op.equals("+")) {
			System.out.println(num1+op+num2+"의 계산 결과는"+(num1+num2));
		}
		else if (op.equals("-")) {
			System.out.println(num1+op+num2+"의 계산 결과는"+(num1-num2));
		}
		else if (op.equals("*")) {
			System.out.println(num1+op+num2+"의 계산 결과는"+(num1*num2));
		}
		else if (op.equals("/")) {
			System.out.println(num1+op+num2+"의 계산 결과는"+(num1/num2));
		}
	}
}
