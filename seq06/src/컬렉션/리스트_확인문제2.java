package 컬렉션;

import java.util.LinkedList;

public class 리스트_확인문제2 {

	public static void main(String[] args) {
		LinkedList milk = new LinkedList();
		milk.add("어제 만든 우유");
		milk.add("오늘 만든 우유");
		milk.add("내일 만들 우유");
		System.out.println(milk);
		milk.remove();
		// 가장 첫번째(0번째)가 삭제됨
		System.out.println(milk);
	}

}
