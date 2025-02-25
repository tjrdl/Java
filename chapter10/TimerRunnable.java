package Java.chapter10;
// Runnable 인터페이스 상속받아서 구현
public class TimerRunnable implements Runnable {
	int n = 0;
	@Override
	public void run() {
		while (true) {
			System.out.println(n);
			n++;
			try {
				// Thread를 상속받지 못해 직접 선언
				// extends Thread를 선언한 경우 sleep(1000); 사용 가능
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
