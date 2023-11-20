package 배열응용;

import java.util.Arrays;

public class 정리문제2 {

	public static void main(String[] args) {
		String s1 = " 011-245-1234 ";
		
		s1.trim();
		System.out.println(s1);
		
		String [] s2 = s1.trim().split("-");
		System.out.println(Arrays.toString(s2));
		
		if(s2[0].equals("011")) {
			System.out.println("SK");
		}else if (s2[0].equals("019")) {
			System.out.println("LG");
		}else {
			System.out.println("Apple");
		}
		
		if(s2[1].length() >= 4 ) {
			System.out.println("최신폰");
		}else {
			System.out.println("올드폰");
		}
		
		if(s1.trim().length() >= 10) {
			System.out.println("유효한 전화번호");
		}else {
			System.out.println("유효하지 않은 전화번호");
		}
	}

}
