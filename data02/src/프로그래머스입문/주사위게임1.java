package 프로그래머스입문;

import java.util.Scanner;

public class 주사위게임1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(); // 주사위 첫번째 나온 숫자
		int num2 = sc.nextInt(); // 주사위 두번째 나온 숫자
		
		Solution15 s = new Solution15();
		int result = s.solution(num1, num2);
		System.out.println(result);
		sc.close();
	}
}

class Solution15 {
	public int solution(int num1, int num2) {
		int answer = 0;
		if((num1 % 2 == 1) && (num2 % 2 == 1)) {
			answer = (num1*num1) + (num2*num2); 
		}else if((num1 % 2 == 1) && (num2 % 2 == 0)) {
			answer = 2*(num1 + num2);
		}else if((num1 % 2 == 0) && (num2 % 2 == 1)) {
			answer = 2*(num1 + num2);
		}else if((num1 % 2 == 0) && (num2 % 2 == 0)) {
			answer = Math.abs(num1 - num2);
		}
		return answer;
	}
}