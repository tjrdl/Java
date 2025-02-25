package Java.chapter10;

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx1 t1 = new ThreadEx1();
		
		// 1번 방식
//		Thread t2 = new Thread(new ThreadEx2());
		// 2번 방식 인터페이스로 받음
		Runnable r = new ThreadEx2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
	}

}

class ThreadEx1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("i: " + i);
		}
	}
}

class ThreadEx2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int j = 0; j < 15; j++) {
			System.out.println("j: " + j);
		}
	}

}
