package 확인문제;

public class ErrorMain2 {
	public static void main(String[] s) {
		Error2 error = new Error2();
		try {
			error.arr2();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("main()에서 배열 인덱스 에러를 예외 처리함");
		}
		System.out.println("이 부분은 실행되어야 함");	}
}