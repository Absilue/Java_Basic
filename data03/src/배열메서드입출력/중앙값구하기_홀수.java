package 배열메서드입출력;

import java.util.ArrayList;
import java.util.Arrays;

import 배열기본.Print;

public class 중앙값구하기_홀수 {

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		//0, 31, 24, 10, 1, 9
		int[] numbers = {0, 31, 24, 10, 1, 9, 11};
		int result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution5 {
	public int solution(int[] numbers) {
		Arrays.sort(numbers); //파괴형
		//중앙값을 구할 때 위치는 -> 개수/2
		Print.arr(numbers);
		int median = numbers.length / 2;
		int answer = numbers[median];
		return answer;
	}
}