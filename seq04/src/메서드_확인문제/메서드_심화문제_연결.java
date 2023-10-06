package 메서드_확인문제;

import java.util.ArrayList;

public class 메서드_심화문제_연결 {

	public ArrayList<Integer> geteven(int[] num) {
		// 고정된 크기(5개) --> 배열 사용
		// 가변적 크기 --> 배열 사용 불가 --> 컬랙션 사용
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer x : num) {
			if (x % 2 == 0) {
				// 짝수만
				list.add(x);
			}
		}
		return list;
		// 리스트를 반환
	}

	public ArrayList<Integer> getodd(int[] num) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer x : num) {
			if (x % 2 == 0) {
			} else {
				// 홀수만
				list.add(x);
			}
		}
		return list;
		// 리스트를 반환
	}

	public ArrayList<Integer> getunique(int[] num) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// num에서 중복된 값을 제거하고, 중복되지 않은 값을 포함하는 ArrayList 생성
		for (Integer x : num) {
			if (!list.contains(x)) {
				// contains 메서드는 list에 지정된 요소가 있는지 여부를 확인
				// ! 연산자를 사용하여  x가 list에 포함되지 않는 경우를 확인
				list.add(x);
				// x가 list에 포함되지 않을 경우, list에 추가
			}
		}
		return list;
		// 리스트를 반환
	}
}
