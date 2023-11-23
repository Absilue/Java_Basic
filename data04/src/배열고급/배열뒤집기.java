package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열뒤집기 {

	public static void main(String[] args) {
		Solution9 s = new Solution9();
		int[] num_list = { 1, 2, 3, 4, 5, 33, 22, 55, 11 };
		int[] result = s.solution(num_list);
		System.out.println(Arrays.toString(result));
	}
}

class Solution9 {
	public int[] solution(int[] num_list) {
		//역순으로 정렬해보세요.(내림차순)
		//오름차순으로 정렬 --> 거꾸로 집어 넣으세요.!
		Arrays.sort(num_list);
		System.out.println(Arrays.toString(num_list));
		//거꾸로 집어 넣기 위해서는 
		//끝에서 부터 하나씩 위치값을 감소시키는 별도의 j변수 필요
		int[] answer = new int[num_list.length];
		int j = answer.length - 1;
		for (int i = 0; i < answer.length; i++) {
			answer[j] = num_list[i];
			j--;
		}
		return answer;
	}
}