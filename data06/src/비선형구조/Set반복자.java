package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set반복자 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("휴지");
		set.add("휴대폰");
		set.add("휴지");
		System.out.println(set);
		Iterator<String> it = set.iterator();
		//반복자를 만들어줌
		//set은 반복자(이터레이터)를 통해 데이터에 접근할 수 있음
		
//		while (it.hasNext()) {
//			String s = it.next();
//			System.out.println(s);
//		}
		
		for (int i = 0; i < set.size(); i++) {
			String s = it.next();
			System.out.println(s);
		}
	}

}