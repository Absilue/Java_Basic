package 프로그래머스입문;

import java.util.Scanner;

public class 두수나눗셈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		Solution4 s = new Solution4();
		int result = s.solution(num1, num2);
		System.out.println(result);
		sc.close();
	}
}

class Solution4 {
	public int solution(int num1, int num2) {
		int answer = 0;
		// 나누기 연산시 소수점을 살려하기 때문에, 최소한 하난의 값을 double로 지정해야 함
		double result = (double)num1 / num2;
		System.out.println(result);
		result = result * 1000;
		System.out.println((int)result);
		answer = (int)result;
		return answer;
	}
}
