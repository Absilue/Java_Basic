package 스레드;

public class 골뱅이스레드 extends Thread{
	// 동시에 돌아가는 부품
	// run( ) -> 동시에 실행하고 프로세스를 넣어주면 됨
	// start( ) -> 동시에 시작
	
	@Override
	// ==> @Annotation(표시)
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("@");
		}
	}

}
