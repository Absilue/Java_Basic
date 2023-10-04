package 부품사용하기;

import 부품만들기.핸드폰;

public class 핸드폰만들기 {
	public static void main(String[] args) {
		핸드폰 phone1 = new 핸드폰();
		phone1.size = 11;
		phone1.speaker = "바나나사";
		
		핸드폰 phone2 = new 핸드폰();
		phone2.size = 9;
		phone2.speaker = "메론사";
		
		System.out.println("사이즈는 " + phone1.size + ", 회사는 " +phone1.speaker);
		System.out.println("사이즈는 " + phone2.size + ", 회사는 " +phone2.speaker);
		System.out.println("phone1의 주소는 " + phone1);
		System.out.println("phone2의 주소는 " + phone2);
		
		phone2.사이즈();
		phone2.스피커();
		
		// 상속받은 8개의 메서드가 존재
		// 상속받은 메서드는 사용자가 임의로 재정의해서 사용 가능
	}
}
