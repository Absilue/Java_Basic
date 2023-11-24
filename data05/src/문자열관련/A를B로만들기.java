package 문자열관련;

import java.util.Arrays;

public class A를B로만들기 {
	public static void main(String[] args) {
		String before = "sub";
		String after = "bus";
		
		char[] b = before.toCharArray();
		char[] a = after.toCharArray();
		
		Arrays.sort(b);
		Arrays.sort(a);
		
		System.out.println(Arrays.equals(a, b));
	}
}
