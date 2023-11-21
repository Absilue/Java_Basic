package 프로그래머스입문;

import java.util.Scanner;

public class 양꼬치 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		Solution7 s = new Solution7();
		int result = s.solution(num1, num2);
		System.out.println(result);
		sc.close();
	}

}

class Solution7 {
	public int solution(int num1, int num2) {
		int answer = 0;
		int total = num1 / 10 ;
		
		int sum = (num1 * 12000) + (num2 * 2000);
		return answer = sum - (total * 2000);
	}
}
