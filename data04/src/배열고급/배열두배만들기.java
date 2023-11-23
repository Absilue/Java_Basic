package 배열고급;

import java.util.Arrays;

public class 배열두배만들기 {

	public static void main(String[] args) {
		int[] n = { 1, 2, 100, -99, 1, 2, 3 };
		Solution7 s = new Solution7();
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution7 {
	public int[] solution(int[] n) {
		int[] answer = new int[n.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = n[i]*2;
		}
		return answer;
	}
}