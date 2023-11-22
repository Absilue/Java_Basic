package 배열컬렉션변환;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int[] n = { 2, 36, 1, 3 };
		int div = 1;
		int[] result = s.solution(n, div);
		System.out.println(Arrays.toString(result));
	}
}

class Solution2 {
	public int[] solution(int[] n, int div) {// 배열, 나누어지는수
		// int[] answer = new int[4];
		// 배열에서 꺼내서 5의 배수만 모아주세요.!
		// ==> 가변, 데이터를 모으고 싶다. --> 컬렉션
		// ==> list
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int x : n) {
			if (x % div == 0) { //div의 배수!
				list.add(x);// [5, 10]
			}
		}
		// 모은 후, 개수를 세어보자.!
		int size = list.size();//2
		
		///////////////기본형 초기화(해당값), 참조형 초기화(null)
		int[] answer = null; //지역변수는 쓰레기값!
		//자바는 "타입명 변수명"라고 쓸 때 
		//ram에 저장공간이 할당 
		if (size == 0) { //결과가 없을 때 
			answer = new int[1];
			answer[0] = -1;
		} else {  //결과가 있을 때 
			answer = new int[size];
			//list에서 꺼내서 배열에 넣어보자.
			for (int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i);
			}//[2, 36, 1, 3]
			Arrays.sort(answer);
		}
		return answer;
	}
}