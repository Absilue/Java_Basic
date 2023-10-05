package 메서드_확인문제;

import java.util.ArrayList;

public class 메서드_심화문제_연결 {

	public ArrayList<Integer> geteven(int[] num) {
		// 고정된 크기(5개) --> 배열 사용
		// 가변적 크기 --> 배열 사용 불가 --> 컬랙션 사용
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer x : num) {
			if (x % 2 == 0) {
				list.add(x);
			}
		}
		return list;
		// 리스트를 반환
	}

}
