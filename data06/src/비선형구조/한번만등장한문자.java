package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		String s2 = "abcabcadc";
		String result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution1 {
	public String solution(String s2) {//"abcabcadc"
		//1. String을 하나씩 분리시켜라. 
		//   array, list(**)
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < s2.length(); i++) {
			list.add(s2.charAt(i) + "");
		}
		//System.out.println(list);
		//Collections.sort(list);
		
		//2. 어떤 것들이 들어있는지 목록을 만들어보자.!
		//   list중에서 중복을 제거하고 모으면 된다.!
		//   set이다.!
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}
		//System.out.println(set);//set변수는 주소가 들어있음.
		//주소가 들어있는 참조형 변수를 프린트할 때 
		//그 주소가 가르키는 값들을 프린트하고 싶으면
		//주소를 찍어주는 함수를 바꾸어주면 된다.
		//컬렉션의 toString()이 모두 바뀌어져 있음.(오버라이드)
		//[값,값,값]
		
		//set은 get()함수를 사용 불가.
		//set안에 있는 값(엘리먼트, 요소)을 하나씩 접근할 때 
		//반복자를 사용해야 한다. 
		Iterator<String> it = set.iterator();
		String answer = "";
		
		ArrayList<String> result = new ArrayList<String>();
		
		for (int i = 0; i < set.size(); i++) {
			String s3 = it.next();
			int f = Collections.frequency(list, s3);
			if (f == 1) {
				result.add(s3);
				//answer = answer + s3; //answer += s3;
			}
		}
		Collections.sort(result);
		answer = String.join("",result);
		return answer;
	}
}