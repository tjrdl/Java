package Java.chapter4_real;

import java.util.Scanner;

public class Book3 {
	String title;
	String author;
	
	
	public Book3(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book3 [] book = new Book3[2];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i<book.length; i++) {
			System.out.print("제목>>");
			String title = scanner.nextLine();
			System.out.print("저자>>");
			String author = scanner.nextLine();
			book[i] = new Book3(title, author);
		}
		for (int i = 0; i<book.length; i++) {
			System.out.println("제목 "+book[i].title+" 저자 "+book[i].author);
			
		}
	}

}
