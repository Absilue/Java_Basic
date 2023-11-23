package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열을컬렉션으로2 {

	public static void main(String[] args) {
		String[] s2 = { "감자", "고구마", "우유", "감자", "양파" };
		List<String> list = Arrays.asList(s2);
		System.out.println(list.lastIndexOf("감자"));
		System.out.println(list);
		if(list.contains("양파")) {
			System.out.println("양파는 안사도 된다. ");
		}else {
			System.out.println("양파를 사서 냉장고에 넣어야한다. ");
		}
		list.set(2, "춘식이 우유");
		int index = list.indexOf("양파");
		list.set(index, "양파즙");
		System.out.println(list);
		
		String[] s3 = (String[])list.toArray(); //Object[]
		System.out.println(Arrays.toString(s3));
	}
}
