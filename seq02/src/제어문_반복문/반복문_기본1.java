package 제어문_반복문;

import java.util.Date;

public class 반복문_기본1 {

	public static void main(String[] args) {
		// 반복문을 작성할때는 cpu가 처음값 변수에 저장해두고
		// n만큼 증가시키면서 조건을 체크해서 반복하는 방식으로 사용
		// 반복문을 작성하기 위해서는 초기값, 증감값, 조건식 3가지가 필요

		for (int i = 0; i < 10; i++) {
			// 초기값 증감값 조건식
			// 0~9까지 1씩 더하면서 총 10번 반복
			System.out.println("@");
			// @가 10번 출력됨
		}
		// 일반적으로 for문은 횟수제한 반복에 사용됨

		int start = 0; // 초기값
		while (start < 10) { // 조건식
			System.out.println("#");
			start++; // 증감값
		}
		// 일반적으로 while문은 무한반복에 사용됨

		while (true) {
			System.out.println("무한 반복~");

			Date date = new Date();
			if (date.getMinutes() == 27) {
				// 27분이 될때까지 while문을 반복함
				// 반복을 할때는 break로 끝나는 시점을 반드시 명시해야함
				System.out.println("EXIT");
				break;
				
			}
		}
	}

}
