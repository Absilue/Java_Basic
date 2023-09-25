package 제어문_조건문;

import java.util.Date;

public class date_확인문제 {

	public static void main(String[] args) {
		Date date = new Date();
		int year = date.getYear() + 1900;
		
		String result = "밀레니엄 세대가 아니시군요";
				if (year >= 2000) {
					result = "밀레니엄 세대시군요";
				}
		System.out.println(result);
		
		System.out.println("--------------------");
		
		int day =date.getDay();
		switch (day) {
		case 0: // 일요일
		case 6: // 토요일
				System.out.println("주말이니 쉬자");
		default:
			System.out.println("열심히 코딩 공부하자");
			break;
		}
		
		System.out.println("--------------------");
		
		int month = date.getMonth();
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일까지");
			break;
		default:
			System.out.println("31일까지");
		}
		
	}

}
