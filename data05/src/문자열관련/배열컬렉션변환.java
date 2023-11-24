package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열컬렉션변환 {
	public static void main(String[] args) {
		String [] s3 = {"박명수", "유재석", "김종국", "송지효", "하하"};
		List<String> list = Arrays.asList(s3);
		// 읽기중심, 값 변경은 가능
		
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(s3));
		
		// 오름차순으로 정렬해서 프린트
		Collections.sort(list);
		System.out.println(list);
		
		// 내림차순으로 정렬해서 프린트
		Collections.reverse(list);
		System.out.println(list);
		
		// 글자수가 3미만인 사람 삭제 후 프린트
		for (int i = 0; i < list.size(); i++) {
			String s2 = list2.get(i);
			if(s2.length() < 3) {
				list2.remove(i);
			}
		}
		System.out.println(list2);
		
		// 유재석을 찾아서 재석유로 변경한 후 프린트
		int index = list2.indexOf("유재석");
		list2.set(index, "재석유");
		System.out.println(list2);
		
		// 전체 목록에서 "김종민"을 3번째로 추가한 후 프린트
		list2.add(3,"김종민");
		System.out.println(list2);
	}
}
