package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;

public class K번째수풀이 {

	public static void main(String[] args) {
		
		Solution2 s = new Solution2();
		int[] num = { 1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {
				{2, 5, 3},
				{4, 4, 1},
				{1, 7, 3}
		};
		int[] result = s.solution(num, commands);
		System.out.println(Arrays.toString(result));
	}
}

class Solution2 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int start = command[0];
            int end = command[1];
            int k = command[2];
            
            // 배열 자르기 & 정렬
            int[] slicedArray = Arrays.copyOfRange(array, start - 1, end);
            Arrays.sort(slicedArray);
            
            // k번째 숫자 찾기
            answer[i] = slicedArray[k - 1];
        }
        return answer;
    }
}