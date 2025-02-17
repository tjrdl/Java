package chapter3;

public class DoWhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'a';
		
		do {
			System.out.print(c);
			c+=1;
//			c=(char)(c+1);
//			c++;
		} while( c <= 'z');
		}

}
