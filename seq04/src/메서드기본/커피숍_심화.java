package 메서드기본;

public class 커피숍_심화 {

	public static void main(String[] args) {
		계산기_심화 cal3 = new 계산기_심화();
		int price = 7000; // 커피 한잔 가격
		int count1 = 5; // 오전 방문자 수
		int count2 = 4; // 오후 방문자 수
		
		int total = cal3.add(count1, count2);
		System.out.println("오늘 총 방문자 수는 " + total + "명 입니다");
		
		int total2 = cal3.minus(count1, count2);
		System.out.println("오전과 오후 방문자 수의 차이는 " + total2 + "명 입니다");
		
		int total3 = cal3.total1(price, count1);
		System.out.println("오전에 벌은 총 수익은 " + total3 + "원 입니다");
		
		int total4 = cal3.total1(price, count2);
		System.out.println("오후에 벌은 총 수익은 " + total4 + "원 입니다");
		
		int total5 = cal3.add(total3, total4);
		System.out.println("오늘 벌은 총 수익은 " + total5 + "원 입니다");
		
		int total6 = cal3.div(total5, (count1+count2));
		System.out.println("1인당 결제 금액은 " + total6 + "원 입니다");
	}

}
