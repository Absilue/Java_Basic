package 배열기본;

public class 배열맛보기 {
	public static void main(String[] args) {
		// 배열 : 많은 양의 데이터를 다루기 위해 사용
		
		int age = 100;
		// 기본형 변수(변수에 값이 저장)
		// 하나의 변수에 하나의 데이터만 저장
		// 변수의 타입도 하나씩 선언해줘야 함
		System.out.println(age);
		
		
		// 1) 배열을 만들 때, 이미 값을 알고 있는 경우
		int [ ] addr = {1, 2, 3, 4};
		// 참조형 변수(변수에 주소가 저장)
		// 하나의 이름으로 여러 개의 데이터를 다룰 수 있음 
		System.out.println(addr);
		// [ ]가 들어간 순간 배열로 인식함
		
		
		// 2) 배열을 만들때, 값을 모르고 있는 경우
		int [ ] addr2 = new int [1000];
		// 임의로 1000개의 공간을 가진 배열을 만듬
		System.out.println(addr2);
	}
}
