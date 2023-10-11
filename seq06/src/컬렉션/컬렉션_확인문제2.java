package 컬렉션;

import java.util.HashMap;

public class 컬렉션_확인문제2 {

	public static void main(String[] args) {
		HashMap home = new HashMap();
		home.put("안방","TV");
		home.put("거실","쇼파");
		home.put("부엌","냉장고");
		home.put("현관","신발");
		System.out.println("집안에 물건별 위치 : " + home);
		System.out.println("현관에 있는 물건은 " + home.get("현관") + "입니다");
		home.replace("거실", "책상");
		// 거실 key값의 쇼파를 책상으로 변경
		System.out.println("집안에 물건별 위치 : " + home);
	}

}
