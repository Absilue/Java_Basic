package 연산자;

import javax.swing.JOptionPane;

public class 연습문제1 {
	public static void main(String[] args) {
		
		String width = JOptionPane.showInputDialog("가로 길이를 입력하세요");
		String length = JOptionPane.showInputDialog("세로 길이를 입력하세요");
		
		int width2 = Integer.parseInt(width);
		// int는 정수타입의 데이터만 입력가능
		int lengh2 = Integer.parseInt(length);
		
		int result = width2 * lengh2;
		
		JOptionPane.showMessageDialog(null, "사각형의 면적은 " + result + "cm^2 입니다");
		
	}
}
