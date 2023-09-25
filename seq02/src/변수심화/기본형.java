package 변수심화;

public class 기본형 {

	public static void main(String[] args) {
		// 기본형 데이터 4가지 ==> 값을 변수에 바로 넣음 (원시타입)
		// 정수, 실수, 문자 1, 논리
		
		// 1) 정수  - 4가지 ==> (byte, short, int, long)
		// 	실수 - 2가지 ==> (float, double)
		
		byte age = 127; // +-127(-128~127), 1byte(8비트)
		short wallet = 25000; // +-30000, 2byte
		int money = 20000000; // +-21억, 4byte
		long space = 20000000L; // 21억 이상, 8byte
		
		// 모두 int로 했을때와 메모리 크기 비교
		// 1) 각각 타입을 다르게 해서 메모리를 할당했을 때 ==> 7byte
		// 2) 모두 같은 타입인 int로 메모리를 할당했을때 ==> 12btye
		
		//은행 고객 5명이 로그인했을 경우
		// 1)의 경우 35byte
		// 2)의 경우 60byte
		
		float weight = 88.8f;
		double height = 185.5000;
		
	}

}
