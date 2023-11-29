package 선형구조_스택;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		long s2 = 12345;
		int[] result = s.solution(s2);
		System.out.println(Arrays.toString(result));
	}
}

class Solution1 {
	public int[] solution(long n) {
		String s = n + "";
		String[] s2 = s.split("");
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < s2.length; i++) {
			stack.push(s2[i]);
		}
		System.out.println(stack);
		
		int[] answer = new int[stack.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = Integer.parseInt(stack.pop());
		}
		return answer;
	}
}