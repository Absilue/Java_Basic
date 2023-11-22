package 배열컬렉션변환;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열입력처리후배열만들기 {

	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		// 결과를 배열에 모아서 출력!!!
		// ==> 몇 개인지 모를 때(가변) --> collection(ArrayList)
		ArrayList<Integer> list = new ArrayList<>();
		// 위 목록 중 3의 배수인 숫자들만 모아보자.!
		// 1. for문(배열 순회) + if문(3의 배수 조건)
		// ==> list에 모으자!
		for (int x : arr) {
			if (x % 3 == 0) {
				list.add(x); // [33,66,99]
			}
		}
		// 2. 몇 개인지 세어보고, list 목록도 프린트!
		int size = list.size(); // 3
		System.out.println(size);
		System.out.println(list);

		// 3. answer배열에 옮겨보자.!
		int[] answer = new int[list.size()]; // {0,0,0}

		// 4. list에 있는 것을 꺼내서 배열에 옮기자.!
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		System.out.println(Arrays.toString(answer));
	}
}