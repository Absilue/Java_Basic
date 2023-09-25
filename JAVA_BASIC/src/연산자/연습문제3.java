package 연산자;

import javax.swing.JOptionPane;

public class 연습문제3 {
	public static void main(String[] args) {
		
		String tel = JOptionPane.showInputDialog("통신사를 입력하세요");
		String phone = JOptionPane.showInputDialog("전화번호를 입력하세요");
		String name = JOptionPane.showInputDialog("이름을 입력하세요");
		// 한줄 복사 - 컨트롤 + 알트 + 화살표 아래
		// 한줄 삭제 - 컨트롤 + d
		
		String result = name + "님은 " + tel + "에 " + phone;
 		JOptionPane.showMessageDialog(null, "다이얼로그로 " + result + "로 가입되셨습니다");
		
	}
}
