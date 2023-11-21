package 프로그래머스입문;

import java.util.Scanner;

public class 두수비교 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		Solution2 s = new Solution2();
		int result = s.solution(num1, num2);
		System.out.println(result);
		sc.close();
	}
}

class Solution2 {
	public int solution(int num1, int num2) {
		if(num1 > num2) {
			System.out.println(num1 + "이(가) "+ num2 + "보다 큽니다");
			int answer = -1;
			return answer;
		}else if(num1 == num2) {
			System.out.println(num1 + "이(가) "+ num2 + "와 같습니다");
			int answer = 1;
			return answer;
		}else {
			System.out.println(num2 + "이(가) "+ num1 + "보다 큽니다");
			int answer = -1;
			return answer;
		}
	}
}
