package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열입력배열반환_가변길이 {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88 };
		int find = 40;
		Solution4 s = new Solution4();
		int[] result = s.solution(n, find);
		System.out.println(Arrays.toString(result));
	}
}

class Solution4 {
	public int[] solution(int[] n, int find) {
		//조건에 만족하는 값들의 리스트가 몇 개가 될지 모르겠음.
		//가변길이임. ==> 조건에 맞는 리스트를 일단 모은 후
		//                나중에 모은 데이터를 배열로 옮기면 된다.
		//가변길이 리스트를 모으기 위한 부품이 필요!
		//배열은 X(고정길이), ArrayList O(가변길이)
		//반드시 1개 있음.
		ArrayList<Integer> list = new ArrayList<>();
		//배열에 있는 값들을 반복문(for)을 통해서 하나씩 꺼낸 후
		//find인 40보다 큰 값인지 조건을 검색해서 
		//맞으면 list.add(값);
		for (int i = 0; i < n.length; i++) {
			if(n[i] > find) {
				list.add(n[i]);
			}
		}
		System.out.println(list);
		System.out.println(list.size());
		//배열로 옮기자.!!
		int[] answer = new int[list.size()];
		//list에서 하나씩 꺼내서 배열로 같은 인덱스에 넣어주자.
		//반복문(for) 필요.
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}