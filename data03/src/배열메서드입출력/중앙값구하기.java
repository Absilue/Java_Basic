package 배열메서드입출력;

import java.util.Arrays;

import 배열기본.Print;

public class 중앙값구하기 {

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		int[] numbers = {1, 2, 3, 4, 5};
		int result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution3 {
	public int solution(int [] numbers) {
		Arrays.sort(numbers); // 파괴형
		
		// 중앙값을 구할때 위치는 (전체 개수 / 2)
		int median  = numbers.length / 2;
		int answer = numbers[median];
		return answer;
	}
}