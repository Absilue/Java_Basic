package 제어문.조건문;

import javax.swing.JOptionPane;

public class 제어문_확인문제 {

	public static void main(String[] args) {
		String weight = JOptionPane.showInputDialog("몸무게를 입력하세요");
		String height = JOptionPane.showInputDialog("신장을 입력하세요");
		
		double wei2 = Double.parseDouble(weight);
		double hei2 = Double.parseDouble(height);
		
		double result = wei2 + ((hei2/100.0) * (hei2/100.0));
		System.out.println("bmi 지수는 " + result + "입니다");
		
		String now = JOptionPane.showInputDialog("누적 포인트 입력하세요");
		String fu = JOptionPane.showInputDialog("추가 포인트를 입력하세요");
		
		double now2 = Double.parseDouble(now);
		double fu2 = Double.parseDouble(fu);
		
		double result2 = (now2 + fu2);
		System.out.println("최종 포인트는 " + result2 + "입니다");
	}

}
