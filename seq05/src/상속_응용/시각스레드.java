package 상속_응용;

import java.util.Date;

public class 시각스레드 extends Thread{
	
	@Override
	public void run() {
		// 동시에 처리하고 싶은 내용 작성
		for (int i = 500; i >= 0; i--) {
			java.util.Date date = new java.util.Date();
			System.out.println("시각 " + date);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
