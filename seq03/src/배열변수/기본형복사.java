package 배열변수;

public class 기본형복사 {

	public static void main(String[] args) {
		int 수학1 = 100;
		int 수학2 = 수학1;
		System.out.println(수학1 + " " + 수학2);
		
		수학2 =96;
		System.out.println(수학1 + " " + 수학2);
		
		// 변수에 들어가는 데이터의 유형
		
		// 1) 값이 들어가는 경우 - 기본형 데이터
		// 	정수, 실수, 문자1, 논리 - 변수 하나당 값 하나가 들어감
		
		// 2) 주소가 들어가는 경우 (값이 들어가는 경우를 제외한 나머지 전부)
		//		 배열, 클래스, 컬렉션, 참조형 데이터
	}

}
