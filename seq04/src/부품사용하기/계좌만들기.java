package 부품사용하기;

import 부품만들기.계좌;

public class 계좌만들기 {
	public static void main(String[] args) {
		계좌 아버지 = new 계좌();
		아버지.이름 = "홍길동";
		아버지.은행이름 = "기업은행";
		아버지.금액 = 20000;
		
		계좌 어머니 = new 계좌();
		어머니.이름 = "맘맘맘";
		어머니.은행이름 = "우리은행";
		어머니.금액 = 15000;
		
		계좌 나 = new 계좌();
		나.이름 = "미미미";
		나.은행이름 = "신한은행";
		나.금액 = 35000;
		
		System.out.println(아버지);
		System.out.println(어머니);
		System.out.println(나);
		// tostring은 언제 사용(호출)되는가?
		// ==> 참조형 변수를 프린트할때 자동으로 호출됨
	}
}
