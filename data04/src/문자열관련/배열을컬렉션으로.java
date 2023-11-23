package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열을컬렉션으로 {

	public static void main(String[] args) {
		String[] s2 = { "aaa", "ccc", "bbb", "bbb" };
		// 컬렉션이 함수가 풍부 ==> 검색만 가능 
		
		List<String> list = Arrays.asList(s2);
		
		System.out.println(list);
		// 읽기 전용의 list로 변환이 가능.
		
		int index = list.indexOf("bbb");
		System.out.println(index);
		
		boolean result = list.contains("ccc");
		
		System.out.println(result);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		//list.add("ttt"); ==> 수정불가능!
		//list를 수정을 하고 싶은 경우에는 
		//list를 새로 만들어야 한다.
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(s2));
		list2.add("ttt");
		System.out.println(list2);
	}
}