package 메서드연습;

public class 커피가게 {

	public static void main(String[] args) {
		int coffee_price = 5000;
		int coffee_count = 15;
		
		// 커피가격이 5만원 이상이면 5천원 할인
		계산기 cal = new 계산기();
		int result = cal.mul(coffee_price, coffee_count);
		if (result >= 50000) {
			System.out.println("최종 결제 금액은 " + (result-5000) + "입니다");
		}else {
			System.out.println("최종 결제 금액은 " + result + "입니다");
		}
		
		int [] result2 = cal.array();
		System.out.println(result2[0]+100);
		
		MemberVO result3 =  cal.get2("win2", "2222", "win2", "010");
		result3.setPw("1111");
		System.out.println(result3);
		
		String result4 = cal.get4("홍길동", 100);
		System.out.println(result4 + " 환영해주세요");
	}

}
