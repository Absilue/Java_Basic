package 정리문제;

import java.util.Scanner;

public class 제어문_정리문제2 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int ap_re = 0;
		int st_re = 0;
		int total = 0;
		
		while(true) {
			System.out.println("사과 구매 갯수를 입력하세요");
			int ap_count = sc.nextInt();
			System.out.println("사과 개당 가격을 입력하세요");
			int ap_pay = sc.nextInt();
			System.out.println("딸기 구매 갯수를 입력하세요");
			int st_count = sc.nextInt();
			System.out.println("딸기 개당 가격을 입력하세요");
			int st_pay = sc.nextInt();
			
			ap_re = ap_count * ap_pay;
			st_re = st_count * st_pay;
			total = ap_re + st_re;
			break;
		}
		System.out.println("사과의 구매 가격은 " + ap_re + "원 입니다");
		System.out.println("딸기의 구매 가격은 " + st_re + "원 입니다");
		System.out.println("총 구매 가격은 " + total + "원 입니다");
	}

}
