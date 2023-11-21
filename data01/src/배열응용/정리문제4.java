package 배열응용;

import java.util.Arrays;

public class 정리문제4 {

	public static void main(String[] args) {
		
		String s = " '휴지', '블루볼펜', '지우개' +=- ";
		s = s.replace("+=-", "").replace("'","");	
		String [] s2 = s.trim().split(",");
		
		System.out.println(Arrays.toString(s2));
		
		if(s2[1].substring(1,3).equals("블루") ) {
			System.out.println("파란 볼펜");
		}else {
			System.out.println("빨간 볼펜");
		}
		
		for (int i = 0; i < s2.length-1; i++) {
			if(s2[i].length() < s2[i+1].length()) {
				System.out.println("가장 짧은 문자열을 가지는 것은 " + s2[i] +"입니다");
			}else if(s2[i].length() < s2[i+2].length()) {
				System.out.println("가장 짧은 문자열을 가지는 것은 " + s2[i] +"입니다");
			}
		}
		
		int [] s3 = new int [s2.length];
		for (int i = 0; i < s2.length; i++) {
			s3[i] = s2[i].trim().length();
		}
		System.out.println(Arrays.toString(s3));
	}
}
