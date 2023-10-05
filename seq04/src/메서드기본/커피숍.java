package 메서드기본;

public class 커피숍 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.add(); // void
		// 계산기.add(); ==> 사용X
		
		// 할인기간이면 계산된 금액에서 1000원 할인 기능 추가
		int total = cal.add2(); // void X
		// int 타입의 데이터를 return(반환)
		System.out.println("결제 금액은 " + (total-1000) + "원 입니다");
		System.out.println("");
		
		int total2 = cal.add3(3000,5);
		System.out.println("결제 금액은 " + (total2-2000) + "원 입니다");
		System.out.println("");
		
		// 계산기의 add() 기능을 사용하고 싶으면 램에 계산기 원본을 이용하여
		// 대상에 가져다 놓고 난 다음 필요한 메서드를 사용
		// ==> 객체 생성을 한 후, 필요한 메서드를 선택해서 사용
		
		// cal 변수안에 계산기 생성된 것의 위치(주소)가 들어있음
		// 생성된 주소가 있어야 메서드 사용이 가능
		
		int total3 = cal.add4(10000);
		// 입력한 값에 미수금 2000원을 더해서 리턴한 후 1000원 할인쿠폰 적용해서 출력
		System.out.println("결제 금액은 " + (total3+2000-1000) + "원 입니다");
	}

}
