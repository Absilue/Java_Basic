package 제어문.조건문;

import javax.swing.JOptionPane;

public class 제어문_확인문제3 {

	public static void main(String[] args) {
		int coffee = 5000;
		int count = 5;
		
		int result = coffee * count;
		
		if (result > 20000) {
			JOptionPane.showMessageDialog(null, "할인 받으세요");
		}else {
			JOptionPane.showMessageDialog(null, "정가대로 결제해주세요");
		}
		
		
		int age = 100;
		int age2 = age+1;
		System.out.println(age2);
		
		if (age2 > 100) {
			JOptionPane.showMessageDialog(null, "이제부터 시작");
		}else {
			JOptionPane.showMessageDialog(null, "아직 젊어요");
		}
	}
		

}
