package 연습;

import javax.swing.JOptionPane;
// 패키지 이름은 절대 java, javax로 사용하지 않는다
// 이클립스에는 4500개의 java(핵심부품), javax(추가부품)이 들어있으므로

public class 테스트1풀이 {

	public static void main(String[] args) {
		char pw1 = 'p';
		String s = JOptionPane.showInputDialog("비밀번호 입력"); // "q"
		char pw2 = s.charAt(0); // 'q'
		
		if ( pw1 == pw2) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
		}else {
			JOptionPane.showMessageDialog(null, "로그인 실패");
		}
		
		double w = 2.2;
		if( w > 2 );{
			JOptionPane.showMessageDialog(null, "다이어트 성공");
		}
		
		if ( pw1 == pw2 && w > 2) {
			JOptionPane.showMessageDialog(null, "오늘은 성공");
		}else {
			JOptionPane.showMessageDialog(null, "내일 다시 도전");
		}
	}
}
