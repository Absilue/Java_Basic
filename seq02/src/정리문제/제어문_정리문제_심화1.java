package 정리문제;

import java.util.Scanner;

public class 제어문_정리문제_심화1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int result = 0;
		// 초기값 지정
		// 반복문의 값을 누적시킬 변수는 반복문 밖에 만들어줘야 함

		System.out.println("시작값을 입력하세요");
		int start = sc.nextInt();
		System.out.println("종료값을 입력하세요");
		int finish = sc.nextInt();

		for (int i = start; i <= finish; i = i + 1) {
			result = result + i;
		}
		System.out.println(result);
	}

}
