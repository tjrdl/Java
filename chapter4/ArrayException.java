package chapter4;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[5];
		intArray[0] = 0;
		
		try {
			for(int i = 0; i<intArray.length; i++) {
				intArray[i+1] = intArray[i]+i+1;
				System.out.println(intArray[i]);
			}
		} 
		// 모든 예외 상황에서 캐치
		//catch (Exception e) {
		// 특정상황(배열의 인덱스가 바운드를 넘어설 경우)에서 캐치
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}

}
