package 제어문_조건문;

import java.util.Scanner;

public class switch_case_연습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print ("먹고 싶은 점심 메뉴 입력하세요");
		String menu = sc.next(); 
		
		switch (menu) {
		case "짜장면" :
			System.out.println("중국집으로 가십시오");
			break;
			// break - break를 포함한 { }를 중단시킴
			// switch case는 자체적으로 break 기능이 없으므로 따로 넣어줘야 함
		case "라면" :
			System.out.println("분식집으로 가십시오");
			break;
		case "회" :
			System.out.println("횟집으로 가십시오");
			break;
		default :
			System.out.println("집으로 가십시오");
		}
	}
}
