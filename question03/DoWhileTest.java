package question03;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int sum = 0;
		do {
			if(i%2==0) {
				sum+=i;
				i++;
			}
			else {
				i++;
			}
		}while( i < 100);
		System.out.println(sum);
	}

}
