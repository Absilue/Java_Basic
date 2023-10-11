package 컬렉션;

import java.util.ArrayList;

public class 리스트_확인문제1 {

	public static void main(String[] args) {
		// 순서 --> list 유형 --> ArrayList
		ArrayList list= new ArrayList();
		list.add("박소정");
		list.add("김정민");
		list.add("소지현");
		list.add("김개념");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1 + "등 " + list.get(i));
		}
		list.remove("김정민");
		System.out.println("반칙으로 인한 2등 실격");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1 + "등 " + list.get(i));
		}
		
		// 김정민이 포함되어 있는가?
		System.out.println(list.contains("김정민"));
		
		// 박소정은 몇등인가?
		System.out.println("박소정은 " + (list.indexOf("박소정") + 1 ) + "등 입니다");
		
		// 소지현이 소혜련으로 개명함
		list.set(1,"소혜련");
		System.out.println(list);
	}

}
