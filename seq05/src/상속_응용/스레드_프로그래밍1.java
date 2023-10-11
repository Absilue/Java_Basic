package 상속_응용;

public class 스레드_프로그래밍1 {

	public static void main(String[] args) {
		카운터스레드 counter = new 카운터스레드();
		시각스레드 timer = new 시각스레드();
		배열스레드 array = new 배열스레드();
		
		counter.start();
		timer.start();
		array.start();
		// 스레드 시작
		
		// 에러가 발생해서 프로그램이 멈출 것 같은 순간
		// ==> 해당 상황이 발생했을 때 어떻게 처리할지 코딩(명시) 해줘야 함
		
		// 1) 외부 자원(cpu)을 연결할 때
		// 2) network 연결할 때 - db
		// 3) file 연결할 때
		
		// ==> try{
		//			위험한 상황
		// 		}catch{
		//			위험한 상황이 발생했을 때 처리내용
		//			}
	}

}
