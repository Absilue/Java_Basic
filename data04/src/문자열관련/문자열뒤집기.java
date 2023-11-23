package 문자열관련;

import java.util.Arrays;

public class 문자열뒤집기 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        String[] my_string = { "감자", "고구마", "마", "호박" };
        
        for (String str : my_string) {
            String result = s.solution(str);
            System.out.println(result);
        }
    }
}

class Solution1 {
    public String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer = answer + my_string.charAt(i);
        }
        return answer;
    }
}