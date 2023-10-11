package 상속_응용;

public class 카운터스레드 extends Thread{
	// run(), start() ...
	
	@Override
	public void run() {
		// 동시에 처리하고 싶은 내용 작성
		for (int i = 500; i >= 0; i--) {
			System.out.println("카운터 " + i);
			// count.setText("카운터 " + i); --> 실행 X
			// count란 변수는 스레드_프로그래밍1에만 정의되어 있으므로 다른 class에서 사용 X
			try {
				Thread.sleep(1000);
				// 단위가 ms이므로 1000 = 1초
				// 외부의 자원(cpu)을 연결할때는 어떻게 처리할지 명시해줘야 함
			} catch (InterruptedException e) {
				e.printStackTrace();
				// catch할 여러 상황들 작성
				// 에러 출력
			}
		}
	}
}
