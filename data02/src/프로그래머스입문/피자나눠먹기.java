package 프로그래머스입문;

import java.util.Scanner;

public class 피자나눠먹기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		Solution8 s = new Solution8();
		int result = s.solution(num1);
		System.out.println(result);
		sc.close();
	}
}

class Solution8 {
	public int solution(int num1) {
		int answer = 0;
		int slice = 7;
		if(num1 < slice) {
			answer = 1;
		}if(num1 % slice == 0) {
			answer = num1 / slice;
		}else {
			answer = (num1 / slice) + 1;
		}
		return answer;
	}
}