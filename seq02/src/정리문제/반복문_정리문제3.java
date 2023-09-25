package 정리문제;

import javax.swing.JOptionPane;

public class 반복문_정리문제3 {

	public static void main(String[] args) {
		int iu = 0;
		int you = 0;
		int bts = 0;

		while (true) {
			String data = JOptionPane.showInputDialog("입력 1)아이유 2)유재석 3)방탄 4) 종료");
			int data2 = Integer.parseInt(data);
			
			if (data2 == 1) {
				iu++;
			} else if (data2 == 2) {
				you++;
			} else if (data2 == 3) {
				bts++;
			} else if (data2 == 4) {
				break;
			} else {
				System.out.println("투표를 잘못하셨습니다");
			}

		}
		System.out.println("투표를 종료합니다");
		System.out.println("아이유 득표수 >>> " + iu + "표");
		System.out.println("유재석 득표수 >>> " + you + "표");
		System.out.println("방탄 득표수 >>> " + bts + "표");
	}

}
