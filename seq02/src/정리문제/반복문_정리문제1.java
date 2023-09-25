package 정리문제;

public class 반복문_정리문제1 {

	public static void main(String[] args) {
		int result = 0;
		for (int i = 33; i < 222; i++) {
			result = result + i;
		}
		System.out.println(result);

		System.out.println("------------------");

		int result2 = 0;
		for (int j = 0; j < 4500; j = j + 2) {
			result2 = result2 + j;
		}
		System.out.println(result2);

		System.out.println("------------------");

		int result3 = 0;
		for (int k = 0; k < 6000; k = k + 5) {
			result3 = result3 + k;
		}
		System.out.println(result3);

	}
}
