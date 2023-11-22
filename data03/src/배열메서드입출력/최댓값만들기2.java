package 배열메서드입출력;

import java.util.Arrays;

import 배열기본.Print;

public class 최댓값만들기2 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int[] numbers = {0, -31, 24, 10, 1, 9};
		int result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution2 {
	public int solution(int [] numbers) {
		Arrays.sort(numbers); // 파괴형
		Print.arr(numbers);
		int last = numbers[numbers.length-1]; //4
		int last2 = numbers[numbers.length-2]; //3
		int post = last * last2;
		
		int frist = numbers[0];
		int frist2 = numbers[1];
		int pre = frist * frist2;
		
		int answer = 0;
		if(pre>post) {
			answer = pre;
		}else {
			answer = post;
		}
		return answer;
	}
}