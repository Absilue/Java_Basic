package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 짝수는싫어요 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int n = 15;
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution2 {
    public int[] solution(int n) {
    	int[] answer = new int[(n+1)/2];
    	int x = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer[x] = i;
                x++;
            }
        }
        return answer;
    }
}