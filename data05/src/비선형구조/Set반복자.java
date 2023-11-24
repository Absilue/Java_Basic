package 비선형구조;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자 {
	
	public static void main(String[] args) {
		// set은 꺼내는 기능이 없으며, 순서도 없음
		HashSet<String> set = new HashSet<String>();
		set.add("고구마");
		set.add("감자");
		set.add("호박");
		System.out.println(set);
		
		//반복자(iteratr, 이터레이터)
		// set에 있는 값을 하나씩 꺼내려면 반복자를 달아야함
		Iterator<String> it = set.iterator();
		// System.out.println(it.next()); // 고구마
		// System.out.println(it.next()); // 감자
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// array ==> list : Arrays.asList()
		// list ==> array : list.toArray()
		// set ==> array : set.toArray()
		Object[] arr = set.toArray();
	}
}
