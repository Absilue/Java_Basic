package 컬렉션;

import java.util.LinkedList;

public class 리스트_확인문제3 {

	public static void main(String[] args) {
		LinkedList sub = new LinkedList();
		sub.add("국어"); // 0
		sub.add("수학"); // 1
		sub.add("영어"); // 2 
		sub.add("컴퓨터"); // 3 
		
		System.out.println("전체 시험 과목 " + sub);
		
		for (int i = 0; i < sub.size()+1; i++) {
			// sub.remove( )로 sub가 하나씩 줄어드므로, sub.size에 1을 더해줌
			sub.remove();
			System.out.println((i+1) + "일차 시험본 후 남은 과목 : " + sub);
		}
	}

}
