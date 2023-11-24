package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 문자열다루기기본 {

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		String s2 = "1234";
		boolean result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution5 {
	public boolean solution(String x) {
		//String의 문자를 하나하나 분리해야한다면 
		//list, array을 사용하세요.!
		boolean answer = true;
		char[] c = x.toCharArray();//{'a','2','3','4'}
		if(x.length() == 4 || x.length() == 6) {
			for (int i = 0; i < c.length; i++) {
				if(c[i] < '0' || c[i] > '9') {
					answer = false;
				}
			}
		}else {
			answer = false;
		}
		//숫자 아닌 것을 포함하고 있으면 false
		//if(c1 < '0' || c1 > '9')
		//숫자로만 이루어져 있으면 true
		return answer;
	}
}