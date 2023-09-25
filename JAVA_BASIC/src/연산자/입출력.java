package 연산자;

import javax.swing.JOptionPane;

public class 입출력 {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("이름을 말해보세요");
		JOptionPane.showMessageDialog(null, "당신의 이름은 " + name + "이군요");

		// 당신의 취미는 무엇인가요?
		// 홍길동님의 취미는 테니스입니다

		String hobby = JOptionPane.showInputDialog("당신의 취미는 무엇인가요?");
		JOptionPane.showMessageDialog(null, "당신의 취미는 " + hobby + "이군요");

		// 당신은 몇시에 일어나나요?
		// 테니스는 9시에 시작할 수 있군요

		String time = JOptionPane.showInputDialog("당신은 몇시에 일어나나요?");
		JOptionPane.showMessageDialog(null, hobby + "는 " + time + "시에 시작할 수 있군요");

		
		// time + 1;
		// --> "9"+1="91"
		// 문자열을 숫자로 변경해주는 작업은 매우 자주 사용
		
		// int time2 = Integer.parseInt(time);
		// 정수.분석해서 정수로 바꾸는 명령어
		
		// int result = time2 +1;
		// --> 9+1=10
	}
}
