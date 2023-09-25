package 정리문제;

import java.util.Scanner;

public class 제어문_정리문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id = "root";
		String pw = "1234";
		while (true) {
			System.out.println("아이디를 입력하세요");
			String id2 = sc.next();
			System.out.println("비밀번호를 입력하세요");
			String pw2= sc.next();
			if (id2.equals(id) && pw2.equals(pw) ) {
				System.out.println("로그인 성공");
				break;
			}else {
				System.out.println("로그인 실패");
			}
		}
	}
}