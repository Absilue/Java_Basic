package 메서드_확인문제;

public class 메서드_확인문제1 {

	public static void main(String[] args) {
		메서드_확인문제1_연결 cal = new 메서드_확인문제1_연결();
		int coffee_count = 5;
		int coffee_price = 2000;
		int milk_count = 2;
		int milk_price = 3000;
		
		
		int total_c = cal.mul(coffee_count, coffee_price);
		int total_m = cal.mul(milk_count, milk_price);
		int total = cal.sum(total_c, total_m);
		int total2 = cal.div(total, (coffee_count+milk_count));
		
		System.out.println("커피 결제 금액은 " + total_c + "원입니다");
		System.out.println("밀크티 결제 금액은 " + total_m + "원입니다");
		System.out.println("총 결제 금액은 " + total + "원입니다");
		System.out.println("1인당 결제 금액은 " + total2 + "원입니다");
	}

}
