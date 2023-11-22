package 배열메서드입출력;

import java.util.ArrayList;
import java.util.Arrays;

import 배열기본.Print;

public class 짝수홀수문제 {

	public static void main(String[] args) {
		Solution8 s = new Solution8();
		int[] n = { 1, 2, 3, 4, 5 };
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution8 {
	public int[] solution(int[] n) {
		int[] answer = new int[2]; // {0,0};
		// answer[0] => 짝수개
		// answer[1] => 홀수개
		for (int x : n) {
			if (x % 2 == 0) {
				answer[0]++; // 짝수 개수
			} else {
				answer[1]++; // 홀수 개수
			}
		}
		return answer;
	}
}