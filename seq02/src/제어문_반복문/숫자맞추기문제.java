package 제어문_반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기문제 {

	public static void main(String[] args) {
		Random r = new Random();
		// int target = r.nextInt();
		// +- 21억중 랜덤한 값이 지정됨
		int target = r.nextInt(99) + 1;
		// 0부터 지정한 값보다 1적은 값중 랜덤으로 한가지 값이 설정
		// 0부터 시작하므로 1을 더해서 1~100까지 값중 한가지가 설정되도록 함
		System.out.println(target);

		int no = 0;
		// 틀린 횟수
		int count = 0;
		// 전체 횟수
		while (true) {
			String data = JOptionPane.showInputDialog("숫자를 입력하세요");
			int data2 = Integer.parseInt(data);
			// 비교 연산자는 기본형 데이터에만 입력가능
			count++;
			if (data2 == target) {
				System.out.println("정답입니다");
				break;
			} else {
				no++;
				System.out.println("정답이 아닙니다");
				// 큰지 작은지 힌트 부여
				if (data2 > target) {
					System.out.println("정답보다 입력한 숫자가 큽니다");
				} else {
					System.out.println("정답보다 입력한 숫자가 작습니다");
				}
			}

			System.out.println("전체 시도 횟수는 " + count + "회 입니다");
			System.out.println("총 틀린 횟수는 " + no + "회 입니다");
		}
	}
}
