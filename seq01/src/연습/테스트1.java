package 연습;

import javax.swing.JOptionPane;

public class 테스트1 {

	public static void main(String[] args) {
		String pw = "p";
		String pw2 = "q";
		double w = 2.2;
		
		if (pw.equals("p") && pw2.equals("p")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		if (w > 2) {
			System.out.println("다이어트 성공");
		}else {
			System.out.println("다이어트 실패");
		}
		
		String pw3 = JOptionPane.showInputDialog("비밀번호를 입력하세요");
		String w2 = JOptionPane.showInputDialog("몸무게 변화량을 입력하세요");
		
		double w3 = Double.parseDouble(w2);
		
		if (pw3.equals("p") && w3 >2.0) {
			System.out.println("다이어트 성공");
		}else {
			System.out.println("다이어트 실패");
		}
	}
}
