package Java.chapter07;

// 대문자 알파벳 T를 타입파라미터로 받은 제네릭
public class Box2<T>{
	private T t; // 타입 파라미터를 t의 타입으로 사용
	
	// 타입 파라미터를 메소드의 리턴 타입으로
	public T getT() {
		return t;
	}
	
	// 타입 파라미터를 메소드의 매개변수 타입으로
	public void setT(T t) {
		this.t = t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
