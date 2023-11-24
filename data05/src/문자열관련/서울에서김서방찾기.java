package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 서울에서김서방찾기 {

	public static void main(String[] args) {
		Solution6 s = new Solution6();
		String[] s2 = {"Jane", "Kim"};
		String result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution6 {
	public String solution(String[] s2) {
		//배열의 위치를 찾을 때는 list로 변경해서
		//indexOf()를 이용함.
//		List<String> list = Arrays.asList(s2);
//		int index = list.indexOf("Kim");
		int index = 0;
		for (int i = 0; i < s2.length; i++) {
			if(s2[i].equals("Kim")) {
				index = i;
			}
		}
		String answer = "김서방은 " + index + "에 있다";
		//"김서방은 1에 있다"
		return answer;
	}
}