package 정리문제;

import java.util.Date;
import java.util.Scanner;

public class 순차문_정리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사원번호를 입력하세요");
		String num = sc.nextLine();
		
		char first = num.charAt(0);
		// num의 첫번째 문자를 추출하는 명령어
		String num2;
		// 이렇게 추출된 문자를 num2로 지정
		
		switch (first) {
		case 'A':
			num2 = "관리직";
			break;
		case 'B':
			num2 = "영업직";
			break;
		case 'C':
			num2 = "기술직";
			break;

		default:
			num2 = "알 수 없음";
		}
		System.out.println("사원 분류코드는 " + num2 + "입니다");
		
	}
	

}
