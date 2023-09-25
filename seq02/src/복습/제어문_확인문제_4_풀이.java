package 복습;

public class 제어문_확인문제_4_풀이 {

	public static void main(String[] args) {
		int water_pirce = 1000;
		int water_count = 2;
		
		int mask_price = 2000;
		int mask_count = 3;
		// 변수는 상수가 아니면 소문자를 사용 - 낙타표기법
		
		int water = water_count * water_pirce;
		int mask = mask_count * mask_price;
		int result = water + mask;
		
		System.out.println("지불해야 할 생수값은 " + water + "원 입니다.");
		System.out.println("지불해야 할 마스크값은 " + mask + "원 입니다.");
		System.out.println("총 지불해야 할 값은 " + result + "원 입니다.");
	}

}
