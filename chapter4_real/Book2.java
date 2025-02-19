package Java.chapter4_real;

public class Book2 {
	String title;
	String author;
	
	public Book2() {
		title =  "title";
		author = "author";
	}
	public Book2(String title, String author) {
		System.out.println("생성자 호출됨");
		this.title = title;
		this.author = author;
	}
	
	public void print_info() {
		System.out.println("제목 "+this.title+" 저자 "+this.author);
	}
	public String get_name() {

		return this.title;
	}
	
	// 상위 생성자 호출
	public Book2(String title) {
		//this.title = title;
		//this.author = "작자미상";
		this(title,"작자미상");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book2 book = new Book2();
		Book2 book2 = new Book2("aa","bb");
		
		Book2 book3 = new Book2("aa");
		book.print_info();
		book2.print_info();
		book3.print_info();
		
	}

}