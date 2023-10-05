package 메서드_확인문제;

import java.util.ArrayList;

public class 메서드_심화문제 {

	public static void main(String[] args) {
		int [] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		메서드_심화문제_연결 cal = new 메서드_심화문제_연결();
		ArrayList<Integer> list = cal.geteven(num);
		System.out.println(list);
	}

}
