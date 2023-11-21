package 프로그래머스입문;

import java.util.Scanner;

public class 각도기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();

		Solution5 s = new Solution5();
		int result = s.solution(num1);
		System.out.println(result);
		sc.close();
	}

}

class Solution5 {
	public int solution(int angle) {
		int answer = 0;
		if (angle > 0 && angle < 90) {
			answer = 1; // 예각
		} else if (angle == 90) {
			answer = 2;
		} else if (angle > 90 && angle < 180) {
			answer = 3; // 둔각
		} else if (angle == 180) {
			answer = 4;
		}
		return answer;
	}
}
