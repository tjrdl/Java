package Java.question09;

import java.util.Scanner;

interface Calc {

	public void setValue(int a, int b);

	public int calculate();

}

class Add implements Calc {
	private int a, b;

	@Override
	public void setValue(int a, int b) {
		// TODO Auto-generated method stub
		this.a = a;
		this.b = b;
	}

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return a + b;
	}

}

class Sub implements Calc {
	private int a;
	private int b;
	
	@Override
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int calculate() {
		return a - b;
	}

}

class Mul implements Calc {
	private int a;
	private int b;
	
	@Override
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int calculate() {
		return a * b;
	}

}

class Div implements Calc {
	private int a;
	private int b;
	
	@Override
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public int calculate() {
		return a / b;
	}

}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하시오>> ");

		int a = 0, b = 0;
		String s = "";

		a = sc.nextInt();
		b = sc.nextInt();
		s = sc.next();

		switch (s) {
		case "+":
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		case "/":
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
		}
	}

	

}
