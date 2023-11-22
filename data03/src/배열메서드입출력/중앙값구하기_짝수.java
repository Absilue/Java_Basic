package 배열메서드입출력;

import java.util.Arrays;

import 배열기본.Print;

public class 중앙값구하기_짝수 {

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		int result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution4 {
	public int solution(int [] numbers) {
		// 중앙값을 구할때 위치는 (전체 개수 / 2)
		// 배열에 들어간 개수가 짝수인 경우에는 중앙값 2개를 더해서 리턴
		
		// 1. 정렬 --> 오름차순
		// 2. 중앙위치(2개) --> 홀수처럼 찾으면 중앙위치 중에서 뒤의 것을 찾아줌
		Arrays.sort(numbers); // 파괴형
		int median  = numbers.length / 2;
		int median2  = (numbers.length / 2)-1;
		
		int answer = numbers[median] + numbers[median2];
		return answer;
	}
}