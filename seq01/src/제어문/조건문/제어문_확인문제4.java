package 제어문.조건문;

public class 제어문_확인문제4 {

	public static void main(String[] args) {
		int water = 1000;
		int water_count = 2;
		
		int mask = 2000;
		int mask_count = 3;
		
		int result1 = water * water_count;
		int result2 = mask * mask_count;
		int result3 = result1 + result2;
		
		System.out.println("지불해야 할 생수값은 " + result1 + "원 입니다.");
		System.out.println("지불해야 할 마스크값은 " + result2 + "원 입니다.");
		System.out.println("총 지불해야 할 값은 " + result3 + "원 입니다.");
		
		
		double korea = 75.0;
		double math = 50.0;
		
		double result = (korea + math) /2.0 ;
		
		System.out.println("평균점수는 " + result + "점 입니다.");
	}

}
