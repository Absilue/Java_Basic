package 비선형구조;

import java.util.ArrayList;
import java.util.Collections;

public class K번째수연습 {

	public static void main(String[] args) {
		int[] num = { 1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {
				{2, 5, 3},
				{4, 4, 1},
				{1, 7, 3}
		};
		//1. num배열에서 2번째~5번째(인덱스 1~4)까지 추출 
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 4 ; i++) {
			list.add(num[i]);
		}
		
		//2. 정렬
		Collections.sort(list);
		System.out.println(list);
		
		//3. 원하는 위치가 3번째(인덱스 2) 숫자를 추출 
		System.out.println(list.get(2));
	}
}