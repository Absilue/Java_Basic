package 연습;

import javax.swing.JOptionPane;

public class 문제풀이1_순차문 {

	public static void main(String[] args) {
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String doing = JOptionPane.showInputDialog("수업 후 무엇을 하실 예정이신가요?");
		
		String result = today + "에 나는 " + doing + "할 예정입니다";
		
		System.out.println(result);
	}

}
