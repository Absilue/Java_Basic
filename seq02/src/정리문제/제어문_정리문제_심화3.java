package 정리문제;

import java.util.Date;

public class 제어문_정리문제_심화3 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		
		if (hour < 11) {
			System.out.println("굿모닝");
		}else if (hour < 15) {
			System.out.println("굿에프터눈");
		}else if (hour < 19) {
			System.out.println("굿이브닝");
		}else {
			System.out.println("굿나잇");
		}
	}

}
