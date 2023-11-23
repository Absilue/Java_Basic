package 배열고급;

import java.util.Arrays;

public class 배열입력배열반환_고정길이 {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88 };
		Solution1 s = new Solution1();
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution1 {
	public int[] solution(int[] n) {
		//배열에서 최소값과 최대값을 각각 구해서 리턴해주세요.!
		//답안 배열의 첫번째 인덱스에는 최소값
		//답안 배열의 두번째 인덱스에는 최대값 
		//배열에 최소값/최대값/중앙값 문제는 먼저! 정렬을 한다.
		Arrays.sort(n); //오름차순으로 정렬
		System.out.println(Arrays.toString(n));//[3, 22, 44, 66, 88]
		//int[] answer = new int[2];
		int[] answer = {0, 0};//2,3
		answer[0] = n[0];
		answer[1] = n[n.length - 1];
		return answer;
	}
}