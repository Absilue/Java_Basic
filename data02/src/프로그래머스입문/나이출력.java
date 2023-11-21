package 프로그래머스입문;

import java.util.Scanner;

public class 나이출력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();

		Solution3 s = new Solution3();
		int result = s.solution(num1);
		System.out.println("2023년 기준 " + num1 +"살이므로 " + result+"년생입니다");
		sc.close();
	}
}

class Solution3 {
	public int solution(int num1) {
		int answer = 2023 - num1;
		return answer;
	}
}
