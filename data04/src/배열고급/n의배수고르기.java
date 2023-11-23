package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;

public class n의배수고르기 {

	public static void main(String[] args) {
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		int n = 3;
		Solution8 s = new Solution8();
		int[] result = s.solution(n, numlist);
		System.out.println(Arrays.toString(result));
	}
}

class Solution8 {
	public int[] solution(int n, int[] numlist) {
		//1. 가변리스트인 ArrayList를 만들어라.
		ArrayList<Integer> list = new ArrayList<Integer>();
		//2. 배열의 조건에 맞는 것을 list에 일단 모아라.
		for (int i = 0; i < numlist.length; i++) {
			if(numlist[i] % n == 0) {
				list.add(numlist[i]);
			}
		}
		System.out.println(list);
		//3. list사이즈 만큼 배열을 만들어라.
		int[] answer = new int[list.size()];
		
		//4. list에서 배열로 옮겨라.
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}







