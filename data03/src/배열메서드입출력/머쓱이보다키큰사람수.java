package 배열메서드입출력;

import java.util.ArrayList;
import java.util.Arrays;

import 배열기본.Print;

public class 머쓱이보다키큰사람수 {

	public static void main(String[] args) {
		Solution6 s = new Solution6();
		int[] numbers = {149, 180, 192, 170};
		int height = 167;
		int result = s.solution(numbers, height);
		System.out.println(result);
	}
}

class Solution6 {
	public int solution(int[] numbers, int height) {
		int answer = 0;//머쓱이보다 키큰 사람수 
		for (int x : numbers) {
			if (x > height) {
				answer++;
			}
		}
		return answer;
	}
}