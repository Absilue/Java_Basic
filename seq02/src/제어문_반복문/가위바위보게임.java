package 제어문_반복문;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 가위바위보게임 {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(3);
		
		int count = 0;
		// 전체 시행 횟수
		int win = 0;
		// 내가 이긴 횟수
		int draw = 0;
		// 비긴 횟수
		int lose = 0;
		// 내가 진 횟수

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("안내면 진거 가위! 바위! 보!");
			String data = JOptionPane.showInputDialog("가위 바위 보 (0-가위 / 1- 바위/ 2-보)");
			int data2 = Integer.parseInt(data);
			if (data2 == 0) {
				// 비교연산자를 사용할때는 반드시 == 을 사용
				// 내가 낸게 가위일때
				if (target == 0) {
					// 컴퓨터가 낸게 가위일때
					System.out.println("내가 낸것은 가위");
					System.out.println("컴퓨터가 낸것은 가위");
					System.out.println("비겼습니다");
					draw++;
					count++;
				} else if (target == 1) {
					// 컴퓨터가 낸게 바위일때
					System.out.println("내가 낸것은 가위");
					System.out.println("컴퓨터가 낸것은 바위");
					System.out.println("졌습니다");
					lose++;
					count++;
				} else {
					// 컴퓨터가 낸게 보일때
					System.out.println("내가 낸것은 가위");
					System.out.println("컴퓨터가 낸것은 보");
					System.out.println("이겼습니다");
					win++;
					count++;
				}
			} else if (data2 == 1) {
				if (target == 0) {
					System.out.println("내가 낸것은 바위");
					System.out.println("컴퓨터가 낸것은 가위");
					System.out.println("이겼습니다");
					win++;
					count++;
				} else if (target == 1) {
					System.out.println("내가 낸것은 바위");
					System.out.println("컴퓨터가 낸것은 바위");
					System.out.println("비겼습니다");
					draw++;
					count++;
				} else {
					System.out.println("내가 낸것은 바위");
					System.out.println("컴퓨터가 낸것은 보");
					System.out.println("졌습니다");
					lose++;
					count++;
				}
			}

			else if (data2 == 2) {
				if (target == 0) {
					System.out.println("내가 낸것은 보");
					System.out.println("컴퓨터가 낸것은 가위");
					System.out.println("졌습니다");
					lose++;
					count++;
				} else if (target == 1) {
					System.out.println("내가 낸것은 보");
					System.out.println("컴퓨터가 낸것은 바위");
					System.out.println("이겼습니다");
					win++;
					count++;
				} else {
					System.out.println("내가 낸것은 보");
					System.out.println("컴퓨터가 낸것은 보");
					System.out.println("비겼습니다");
					draw++;
					count++;
				}
			} else {
				System.out.println("잘못된 값을 입력하였습니다");
			} 
			System.out.println("게임을 더 하시겠습니까? (네/아니오)");
			String exit = sc.next();
			if (exit.equals("아니오")) {
				System.out.println("종료합니다");
			}
			System.out.println("전체 시도 횟수는 " + count + "회 입니다");
			System.out.println("이긴 횟수는 " + win + "회 입니다");
			System.out.println("비긴 횟수는 " + draw + "회 입니다");
			System.out.println("진 횟수는 " + lose + "회 입니다");
	}
}
}
