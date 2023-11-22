package 배열컬렉션변환;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열자르기 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int[] n = {1, 2, 3, 4, 5};
		int start = 1;
		int end = 3;
		int[] result = s.solution(n, start, end);
		System.out.println(Arrays.toString(result));
	}
}

class Solution1 { //1~3, 3 - 1 = 2
	public int[] solution(int[] n, int start, int end) {
		//int[] answer = Arrays.copyOfRange(n, start, end + 1);
		//시작, 끝을 지정하는 함수는 끝 + 1주어야 한다.!
		int[] answer = new int[end - start + 1]; //3-1+1
		//자바는 "타입명 변수명"을 썼을 때 메모리에 공간을 할당  
		//answer = null; 자바스크립트에서는 값을 넣을때 
		//변수명 = 값
		int index = 0;
		for (int i = start; i < end + 1; i++) {
			answer[index] = n[i]; //1부터 시작 
			index++;
		}
		return answer;
	}
}