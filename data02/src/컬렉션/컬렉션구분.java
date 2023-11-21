package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import 배열기본.Print;

public class 컬렉션구분 {

	public static void main(String[] args) {
		// 중복 제거된 컬렉션 ==> set
		HashSet bag = new HashSet();
		bag.add("휴지");
		bag.add(1000);
		System.out.println(bag);
		// bag ==> 주소가 들어가 있음
		// HashSet에 toString()가 들어있어서 주소말고 HashSet에 들어가있는 값들을
		// String으로
		System.out.println(bag.size());
		
		ArrayList list = new ArrayList();
		list.add("코딩수업"); // String --> Object
		list.add(2);
		System.out.println(list);
		String s = (String)list.get(0);  // Object --> String
		int time = (int)list.get(1);
		System.out.println(time + 1);
		
		// <타입 클래스명>은 객체생성할 때 결정가능
		ArrayList<String> name = new ArrayList<String>();
		name.add("장태훈");
		name.add("양민주");
		String s2 = name.get(0);
		
		ArrayList<Integer> food = new ArrayList<Integer>();
		food.add(18000);
		food.add(12000);
		int in = food.get(0);
		food.add(0, 19000); // 오버로딩(다형성)
		// 자바에서는 입력형태가 다르면, 동일한 메서드 이름 사용 가능
		
		boolean result = food.contains(12000); // 데이터를 포함하고 있는지 True / False로 표현
		System.out.println(result);
		
		int result2 = food.indexOf(12000); // 데이터의 포함되어 있는 위치를 알려줌
		System.out.println(result2);
		
		boolean result3 = food.isEmpty();
		System.out.println(result3);
		
		int result4 = food.lastIndexOf(12000);
		System.out.println(result4);
		
		Object[] arr = food.toArray();
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
		food.clear();
		System.out.println(food);
		
		HashMap<Integer, String> tel = new HashMap<>(); // 뒤에 <>는 굳이 적을 필요 X
		tel.put(1, "엄마");
		tel.put(2, "아빠");
		System.out.println(tel);
	}
}
