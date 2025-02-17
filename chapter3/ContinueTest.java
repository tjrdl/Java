package chapter3;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String s = "no news is good news";
		
		for (int i = 0; i<s.length(); i++) {
//			System.out.print(s.charAt(i));
			if (s.charAt(i) != 'n') {
				continue;
			}
			count++;
		}
		System.out.println("문장에서 발견된 n의 갯수:"+count);
	}

}
