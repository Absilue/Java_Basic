package 정리문제;

public class 반복문_정리문제2 {

	public static void main(String[] args) {
		int result = 0;
		for (int i = 1; i < 1000; i = i + 3) {
			if (i % 5 == 0) {
				result = result;
			} else {
				result = result + i;
			}
			if (result > 100) {
				break;
			}
		}
		System.out.println(result);
	}
}
