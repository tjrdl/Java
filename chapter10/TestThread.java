package Java.chapter10;

public class TestThread {

	public static void main(String[] args) {
		// 스레드 객체 생성
		TimerThread th = new TimerThread();
		// 스레드가 실행되면서 JVM 스케쥴링
		th.start();
	}

}
