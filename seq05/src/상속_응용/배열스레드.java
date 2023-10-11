package 상속_응용;

public class 배열스레드 extends Thread{
	// run(), start() ...
	
	@Override
	public void run() {
		// 동시에 처리하고 싶은 내용 작성
		String [] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};
		for (int i = 0; i < list.length; i++) {
			if(i ==4) {
				i =-1;
			}
			System.out.println("이미지 " + list[i]);
			try {
				Thread.sleep(5000);
				// 5000ms = 5초
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}
}
