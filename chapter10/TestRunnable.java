package Java.chapter10;

public class TestRunnable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Runnable로 만든 스레드는 Thread 객체의 생성자로 호출
		Thread th = new Thread(new TimerRunnable());
		th.start();
	}

}
