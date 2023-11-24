package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 할머니편지 {

	public static void main(String[] args) {
		Solution8 s = new Solution8();
		String n = "happy birthday!";
		int result = s.solution(n);
		System.out.println(result);
	}
}

class Solution8 {
    public int solution(String message) {
        int length = message.length(); // 문자열의 길이를 먼저 구합니다.
        
        // 전체 길이에 2를 곱하여 최소 가로길이를 구합니다.
        int result = length * 2;
        
        // 결과값 반환
        return result;
    }
}