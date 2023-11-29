package 선형구조_스택;

import java.util.EmptyStackException;
import java.util.Stack;

public class 백준스택문제 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.empty()? 1 : 0);
		
		try {
			System.out.println(stack.pop());//2
			System.out.println(stack.pop());//1
			System.out.println(stack.pop());//error
		} catch (EmptyStackException e) {
			System.out.println("-1");
		}
		System.out.println(stack.size());
		System.out.println(stack.empty()? 1 : 0);
		try {
			System.out.println(stack.pop());//error
		} catch (EmptyStackException e) {
			System.out.println("-1");
		}
		stack.push(3);
		System.out.println(stack.empty()? 1 : 0);
		System.out.println(stack.peek());
	}
}