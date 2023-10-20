package 확인문제;

public class ErrorMain {
	public static void main(String[] s) {
		Error error = new Error();
			error.arr();
			System.out.println("이 부분은 실행되어야 함");
		}
	}