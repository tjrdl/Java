package Java.chapter4_real;

public class Book {
	String title;
	String author;
	
	public Book() {
		title =  "title";
		author = "author";
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void print_info() {
		System.out.println("제목 "+this.title+" 저자 "+this.author);
	}
	public String get_name() {

		return this.title;
	}
	
	public Book(String title) {
		this.title = title;
		this.author = "작자미상";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		Book book2 = new Book("aa","bb");
		Book book3 = new Book("aa");
		book.print_info();
		book2.print_info();
		book3.print_info();
		
	}

}
