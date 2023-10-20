package 리팩토링_member;

public class 매니저 extends 직원{
	// 멤버 변수 4개, 메서드 1개 상속
	private int bonus;
	
	public void test() {
		System.out.println("관리자 이름 : " + name);
		System.out.println("관리자 월급 : " + salary);
		System.out.println("관리자 주소 : " + address);
		// System.out.println("관리자 주민번호 : " + rrn);
		// 직원 class에서 rrn은 private으로 지정했기 때문에 데이터를 가져오지 못함
		System.out.println("관리 감독");
	}
}
