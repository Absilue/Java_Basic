package 예외처리;

public class 예외처리main {

	public static void main(String[] args) {
		에러발생2 error = new 에러발생2();
			error.call();
			System.out.println("관리자에게 오류 보고");
		}
		// 에러가 발생할 것 같은 코드가 있는 경우
		// call() 메서드를 만든 곳에서 예외처리를 결정할 수도 있음
		
	}

