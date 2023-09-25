package 연산자;

import javax.swing.JOptionPane;

public class 논리_비교연산_확인문제 {

	public static void main(String[] args) {
		String tem = JOptionPane.showInputDialog("온도를 입력하세요");
		String wind = JOptionPane.showInputDialog("바람세기를 입력하세요");
		
		int tem2 = Integer.parseInt(tem);
		int wind2 = Integer.parseInt(wind);
		
		if( tem2 >= 30 || wind2 < 88) {
			System.out.println("양산을 들고감");
		}else {
			System.out.println("양산을 두고감");
		}
	}
}
