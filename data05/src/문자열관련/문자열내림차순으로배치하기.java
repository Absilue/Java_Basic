package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 문자열내림차순으로배치하기 {

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		String s2 = "Zbcdefg";
		String result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution4 {
	public String solution(String x) {
		
		//String --> char[]
		char[] c = x.toCharArray();
		Arrays.sort(c);//오름차순 
		System.out.println(Arrays.toString(c));
		
		//char[] --> String
		//String s = new String(c)
		String s2 = new String(c);
		
		StringBuilder sb = new StringBuilder(s2);
		sb.reverse();
		System.out.println(sb);
		String answer = sb.toString();
		return answer;
	}
}