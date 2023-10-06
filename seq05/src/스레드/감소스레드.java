package 스레드;

public class 감소스레드 extends Thread{
	public void run() {
		for (int i = 1000; i > 0; i--) {
			System.out.println("감소 " + i);
		}
	}
}
