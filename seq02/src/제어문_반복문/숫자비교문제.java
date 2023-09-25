package 제어문_반복문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 숫자비교문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int front = 0;
		// 앞의 숫자가 큰 경우

		int back = 0;
		// 뒤의 숫자가 큰 경우

		while (true) {
			System.out.println("첫번째 숫자를 입력하세요");
			int num1 = sc.nextInt();
			System.out.println("두번째 숫자를 입력하세요");
			int num2 = sc.nextInt();

			if (num1 > num2) {
				System.out.println("첫번째 숫자가 더 큽니다");
				front++;
			} else if (num1 == num2) {
				System.out.println("두 숫자가 동일합니다");
			} else {
				System.out.println("두번째 숫자가 더 큽니다");
				back++;
			}
			System.out.println("더 진행하시겠습니까? NO(n), YES(y)");
			String exit = sc.next();
			// if (exit.equals("x") || exit.equals("X")) {
			// System.out.println("게임을 종료합니다")
			// System.exit(0);
			// } 로 대체 가능
			
			char exit2 = exit.charAt(0);
			// 첫번째 NO의 값을 가져옴

			if (exit2 == 'n') {
				System.out.println("게임을 종료합니다");
				System.out.println("첫번째 숫자가 큰 경우는 " + front + "회 입니다");
				System.out.println("두번째 숫자가 큰 경우는 " + back + "회 입니다");
				System.exit(0);
			}
		}

	}

}
