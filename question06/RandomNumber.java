package Java.question06;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rNumber;
		Random gernerator = new Random();
//		
//		gernerator.nextInt();
//		gernerator.nextInt(10);
//		int a = gernerator.nextInt(10)+1;
		
		
		while(true) {
			rNumber = gernerator.nextInt(10)+1;
			if (rNumber == 7) {
				System.out.println(rNumber);
				break;
			}
			else {
				System.out.println(rNumber);
			}
		}
	}

}
