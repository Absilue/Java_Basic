package 배열메서드입출력;

import java.util.ArrayList;
import java.util.Arrays;

import 배열기본.Print;

public class 점의위치구하기 {

	public static void main(String[] args) {
		Solution7 s = new Solution7();
		int[] numbers = {-7, 9}; //{x, y}
		int result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution7 {
	public int solution(int[] numbers) {
		int answer = 0;
		int x = numbers[0];
		int y = numbers[1];
		if (x > 0 && y > 0) {
			answer = 1;
		}else if (x < 0 && y > 0) {
			answer = 2;
		}else if (x < 0 && y < 0) {
			answer = 3;
		}else {
			answer = 4;
		}
		return answer;
	}
}