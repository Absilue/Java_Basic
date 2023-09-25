package 제어문.조건문;

import javax.swing.JOptionPane;

public class 제어문_확인문제2 {

	public static void main(String[] args) {
		String nu1 = JOptionPane.showInputDialog("숫자를 입력하세요");
		String nu2 = JOptionPane.showInputDialog("숫자를 입력하세요");

		int nu11 = Integer.parseInt(nu1);
		int nu22 = Integer.parseInt(nu2);
		
		int result1 = (nu11 + nu22);
		int result2 = (nu11 - nu22);
		int result3 = (nu11 * nu22);
		int result4 = (nu11 / nu22);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		String tem = JOptionPane.showInputDialog("현재 온도를 입력하세요");
		
		double tem2 = Double.parseDouble(tem);
		
		if ( tem2 >= 25 ) {
			JOptionPane.showMessageDialog(null, "너무 더워요");
		}else {
			JOptionPane.showMessageDialog(null, "괜찮아요");
		}
	}

}
