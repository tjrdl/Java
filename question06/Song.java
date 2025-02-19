package Java.question06;

public class Song {
	String title;
	String artist;
	int year;
	String country;
	
	public Song() {
		title ="";
		artist ="";
		year = 0;
		country = "";
	}
	
	public Song(String title, String artist, int year, String country) {
		this.title =title;
		this.artist =artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song = new Song("Dancing Queen","ABBA",1978,"스웨덴");
		song.show();
	}

}
