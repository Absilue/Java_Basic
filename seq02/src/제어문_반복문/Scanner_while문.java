package 제어문_반복문;

import java.util.Scanner;

public class Scanner_while문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("test");
			System.out.println("종료? 0, // 계속 1");
			int choice = sc.nextInt();
			if (choice == 0) {
				System.out.println("종료합니다");
				// break
				System.exit(0);
				// System.exit의 경우 while문이 종료되는게 아니라 시스템이 종료됨
			}
		}
		
		// System.out.println("나는 실행이 될까요?");
		// System.exit때문에 System.exit 밑의 코드들은 실행되지 X
	}

}
