package 제어문_반복문;

public class 반복문_확인문제 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			// 초기값 증감값 조건식
			// 0~9
			System.out.print("*");
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < 5; i++) {
			// 초기값 증감값 조건식
			// 0~4
			System.out.print("커피*");
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < 4; i++) {
			// 초기값 증감값 조건식
			// 0~3
			System.out.println("커피*우유");
		}
		
		System.out.println("\n");
		
		int start = 0; // 초기값
		while (start < 3) { // 조건식
			// 0~2
			System.out.println(start+1 +" : 짱!");
			start++; // 증감값
		}
	}
}
