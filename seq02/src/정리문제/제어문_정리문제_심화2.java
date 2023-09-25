package 정리문제;

import java.util.Scanner;

public class 제어문_정리문제_심화2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int result = 0;

		System.out.println("시작값을 입력하세요");
		int start = sc.nextInt();
		System.out.println("종료값을 입력하세요");
		int finish = sc.nextInt();
		System.out.println("점프값을 입력하세요");
		int jump = sc.nextInt();

		for (int i = start; i <= finish; i = i + jump) {
			result = result + i;
			if (result > 100) {
				System.out.println(result);
				break;
			}
		}
	}
}
