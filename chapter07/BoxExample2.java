package Java.chapter07;

public class BoxExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제네릭 타입 파라미터: String, T가 String
//		Box2<String> box1 = new Box2<String>();
		// new Box2<>(); 다이아몬드 파라미터 생략 가능
		Box2<String> box1 = new Box2<>();
		box1.setT("hello");
		
		// 컴파일 단계에서 제네릭 타입 감지
//		box1.setT(777);
		
		// 불필요한 타입 변환 없어짐
		String greet = box1.getT();
		
		System.out.println(greet);
		
		// Wrapper 클래스가 와야 함
//		Box2<int> box2 = new Box2<int>();
		
		Box2<Integer> box2 = new Box2<Integer>();
		box2.setT(777);
		
		// auto unboxing
		int number = box2.getT();
		System.out.println(number);
	}

}
