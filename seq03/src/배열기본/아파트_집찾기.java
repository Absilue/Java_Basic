package 배열기본;

public class 아파트_집찾기 {

	public static void main(String[] args) {
		int[] s = { 10, 15, 20, 10 };
		System.out.println("배열이 들어 있는 주소 " +s);
		
		System.out.println(s[0]);
		// s안의 들어있는 주소가 가르키는 첫번째 값을 프린트
		// [ ]안의 숫자는 0부터 시작
		
		System.out.println(s[1]);
		// s안의 들어있는 주소가 가르키는 두번째 값을 프린트
		
		System.out.println(s[2]);
		// s안의 들어있는 주소가 가르키는 세번째 값을 프린트
		
		System.out.println(s[3]);
		// s안의 들어있는 주소가 가르키는 네번째 값을 프린트
		
		System.out.println("전체 s가 가르키는 방의 수 " + s.length);
		// s.length는 읽기 전용
		// length s 전체가 가지는 집의 개수
		
		int [] s2 = { 1, 4, 7};
		// 전체 변수의 개수, 메모리 크기?
		// 참조형 변수는 4byte 크기
		// s2, 1, 4, 7 , 보이지 않는 length까지 포함해 총 5개의 변수가 만들어짐
		// 5*4byte = 총 20 byte를 사용
		
		System.out.println("배열이 들어 있는 주소 "  + s2);
	}

}
