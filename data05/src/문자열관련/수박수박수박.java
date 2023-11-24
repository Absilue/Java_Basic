package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 수박수박수박 {

	public static void main(String[] args) {
		Solution7 s = new Solution7();
		int n = 11;
		String result = s.solution(n);
		System.out.println(result);
	}
}

class Solution7 {
    public String solution(int x) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < x; i++) {
            if (i % 2 == 0) {
                answer.append("수");
                // 짝수일때 수
            } else {
                answer.append("박");
                // 홀수일때 박
            }
        }
        return answer.toString();
    }
}