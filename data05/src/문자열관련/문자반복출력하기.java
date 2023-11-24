package 문자열관련;

public class 문자반복출력하기 {

    public static void main(String[] args) {
        Solution9 s = new Solution9();
        String inputString = "Hello";
        int repeatCount = 3; // 반복할 횟수를 지정해줍니다.
        String result = s.solution(inputString, repeatCount); // 문자열과 반복 횟수를 모두 전달합니다.
        System.out.println(result);
    }
}

class Solution9 {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        
        // 문자열을 순회하여 각 문자를 주어진 횟수만큼 반복하여 새로운 문자열에 추가합니다.
        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            for (int j = 0; j < n; j++) {
                answer.append(currentChar);
            }
        } 
        return answer.toString();
    }
}