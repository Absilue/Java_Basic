package 부품만들기;

public class 핸드폰 {
	public int size;
	// 기본형 변수, 전역 변수
	// 전역 변수는 자동초기화 0으로 초기화
	public String speaker;
	// 참조형 변수, 전역 변수
	// 전역 변수는 자동초기화 null로 초기화
	
	public void 사이즈() {
		System.out.println("핸드폰 사이즈");
	}
	
	public void 스피커() {
		System.out.println("스피커 재생");
	}
}
