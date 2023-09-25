package 연산자;

import javax.swing.JOptionPane;

public class 연습문제2 {
	public static void main(String[] args) {

		String high = JOptionPane.showInputDialog("키를 입력하세요");
		// 입력받는 데이터의 타입은 무조건 String 사용
		double high2 = Double.parseDouble(high);
		// 실수 데이터를 넣기 위해 double 명령어 사용
		
		// 기본형 4개 데이터 - 정수 /    실수     / 문자   / 논리
		// 							 int / double / char / boolean
		
		double result = (high2 - 100) * 0.9;
		System.out.println("적정 몸무게는 " + result + "kg 입니다");

	}
}
