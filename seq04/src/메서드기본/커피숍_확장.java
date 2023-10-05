package 메서드기본;

import java.util.Random;

public class 커피숍_확장 {

	public static void main(String[] args) {
		계산기_확장 cal2 = new 계산기_확장();
		// 메서드 이름이 한가지로 동일, but 입력형태가 다양
		// 하나의 이름으로 여러형태를 만들 수 있음 ==> 다형성(오버로딩)
		// 입력값의 순서와 타입, 개수를 가지고 구분
		
		
		int total = cal2.add(100, 500);
		System.out.println("계산 결과는 " + total + "입니다");
		
		double total2 = cal2.add(100, 500.5);
		System.out.println("계산 결과는 " + total2 + "입니다");
		
		double total3 = cal2.add(100.4, 500.5);
		System.out.println("계산 결과는 " + total3 + "입니다");
		
		String total4 = cal2.add("a", 500);
		System.out.println("계산 결과는 " + total4 + "입니다");
		
		int [] total5 = cal2.add();
		// 배열 {1, 2, 3}의 주소가 넘어옴
		System.out.println(total5[0] + 100);
		
		Random r = new Random();
		int x = r.nextInt();
		int y = r.nextInt(100);
	}

}
