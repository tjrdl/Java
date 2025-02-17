package Java.chapter4;

public class NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringNumber = {"23","12","aaa","9.98"};
		int i;
		for (i = 0; i<stringNumber.length; i++) {
			try {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("숫자로 변형된 값:"+j);
				
			}
			catch (Exception e) {
				System.out.println(stringNumber[i]+"는 정수로 변환할 수 없습니다.");
			}
		}
	}

}
