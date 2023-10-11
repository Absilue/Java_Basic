package 컬렉션;

import java.util.ArrayList;

public class 컬렉션_확인문제3 {

	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		list.add("샤워하기"); // 0
		list.add("아침먹기"); // 1
		list.add("출근하기"); // 2
		list.add("점심먹기"); // 3
		list.add("퇴근하기"); // 4
		System.out.println(list);
		System.out.println("첫번째 할일은 " + list.get(0));
		System.out.println("마지막 할일은 " + list.get(list.size()-1));
		list.set(1, "청소하기");
		System.out.println(list);
	}

}
