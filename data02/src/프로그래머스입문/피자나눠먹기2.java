package 프로그래머스입문;

import java.util.Scanner;

public class 피자나눠먹기2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		Solution9 s = new Solution9();
		int result = s.solution(num1, num2);
		System.out.println(result);
		sc.close();
	}
}

class Solution9 {
	public int solution(int num1, int num2) {
		int answer = 0;
		if(num2 % num1 == 0) {
			answer = num2 / num1;
		}else {
			answer = (num2 / num1) + 1;
		}
		return answer;
	}
}