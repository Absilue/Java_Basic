package 선형구조_스택;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class 제일작은수제거하기_stack2 {

	public static void main(String[] args) {
		int[] n = {500, 400, 200, 300, 900};
		//Stack을 이용하여 
		//최대값을 제외한 값을 목록을
		//1. 오름차순으로 배열로 모아 프린트해보세요.
		//2. 내림차순으로 배열로 모아 프린트해보세요.
		Arrays.sort(n);
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < n.length; i++) {
			stack.push(n[i]);
		}
		System.out.println(stack);
		int[] answer = new int[stack.size() - 1];
		stack.pop(); //900
//		for (int i = 0; i < answer.length; i++) {
//			answer[i] = stack.pop();
//		}
		for (int i = answer.length - 1; i >= 0; i--) {
			answer[i] = stack.pop();
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
