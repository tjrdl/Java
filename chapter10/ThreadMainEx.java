package Java.chapter10;

public class ThreadMainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName(); // 현재 실행중인 스레드 이름
		long id = Thread.currentThread().getId(); // 현재 실행중인 스레드의 고유 번호
		int priority = Thread.currentThread().getPriority(); // 현재 실행중인 스레드 우선순위
		Thread.State s = Thread.currentThread().getState(); 
		
		
		System.out.println("현재 스레드 이름 : "+name);
		System.out.println("현재 스레드 id : "+id);
		System.out.println("현재 스레드 우선순위 값 : "+priority);
		System.out.println("현재 스레드 상태 : "+s);
	}

}
