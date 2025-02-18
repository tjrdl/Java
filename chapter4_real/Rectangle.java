package Java.chapter4_real;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	public int getArea() {
		return width * height;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		int result = rect.getArea();
		System.out.println("사각형의 면적은 "+result);
		sc.close();
	}

}
