package 확인문제;

public class Error {
	public void arr() {
		try {
			int[] array = { 10, 20, 30 };
			array[3] = 100; // 실행 에러
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("배열 인데스 에러가 발생함");
		}
	}
}
