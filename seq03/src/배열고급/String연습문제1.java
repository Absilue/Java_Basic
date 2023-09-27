package 배열고급;

import java.util.Arrays;
import java.util.Scanner;

public class String연습문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 입력하세요 ");
		String s = sc.next();
		String [] s2 = s.split(",");
		System.out.println("입력한 전화번호는 " + Arrays.toString(s2) +"입니다");
		
		if (s.substring(1,4) == "011") {
			System.out.println("통신사는 SKT");
		}else if (s.substring(1,4) == "019"){
			System.out.println("통신사는 LG");
		}else {
			System.out.println("통신사는 KT");
		}
		
		if (s.substring(5,9).length() >= 4) {
			System.out.println("최신폰");
		}else {
			System.out.println("올드폰");
		}
		
		if (s.length() >= 10) {
			System.out.println("유효한 전화번호");
		}else {
			System.out.println("유효하지 않은 전화번호");
		}
	}

}
