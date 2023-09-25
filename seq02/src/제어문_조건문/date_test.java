package 제어문_조건문;

import java.util.Date;

public class date_test {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
			
		System.out.println(hour + "시 " + min + "분 " + sec + "초");
		
		int year = date.getYear() + 1900;
		int month = date.getMonth() +1;
		// 월은 0부터 시작하므로 1을 더해줘야 함
		int today = date.getDate();
		
		System.out.println(year + "년 " + month + "월 " + today + "일");
		
		int day = date.getDay(); // 요일
		System.out.println(date);
	}

}
