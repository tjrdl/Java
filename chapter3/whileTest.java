package chapter3;

public class whileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int sum = 0;
		while (i<100) {
			if(i%2==0) {
				sum+=i;
				i++;
			}
			else {
				i++;
			}
		}
		System.out.println(sum);
	}

}
