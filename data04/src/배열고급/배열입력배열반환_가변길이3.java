package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class 배열입력배열반환_가변길이3 {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88 };
		int find = 3;
		Solution6 s = new Solution6();
		int[] result = s.solution(n, find);
		System.out.println(Arrays.toString(result));
	}
}

class Solution6 {
	public int[] solution(int[] n, int find) {
		//find로 나누어서 20보다 큰 수의 리스트를 구해보세요.
		//가변 리스트에 조건에 맞는 데이터들을 모으고
		//배열에 옮기자. 
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n.length; i++) {
			if ((n[i] / find) > 20) {
				list.add(n[i]);
			}
		}
		System.out.println(list);
		System.out.println(list.size());
		//먼저 풀어보고, 리스트에 아무것도 없을 때 [-1]을
		//리턴하는 것을 추가해보자.!
		int[] answer = null;//기본형이 아니면 null로 초기화
		//null ==> 주소가 안들어있다.!
		if (list.size() == 0) { //조건에 만족하는 것이 없다.
			answer = new int[1]; //[-1]
			answer[0] = -1;
		} else { // 조건에 만족하는 것이 있다.
			answer = new int[list.size()];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i);
			}
		}
		return answer;
	}
}