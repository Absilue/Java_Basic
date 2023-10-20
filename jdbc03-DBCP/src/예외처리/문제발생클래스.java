package 예외처리;

public class 문제발생클래스 {

	public static void main(String[] args) {
		System.out.println("1. 정상 실행");
		
		try {
			// 수학 연산 에러
			System.out.println("2. 나누기 실행 :" + 10/0);
			
			// 배열 인덱스 에러
			int [] arr = {1, 2, 3};
			System.out.println(arr[3]); // 0~2까지만 존재 
			
 		} catch (Exception e) {
			e.printStackTrace();
			// 오류 이유 출력
			
			System.out.println("0으로 나누는것은 불가능");
			// 원래라면 오류가 발생하면 2. 나누기 실행에서 스크립트가 중단되어야 하지만
			// try - catch 구문으로 오류가 발생해도 건너뛰고 3. 여기까지 실행이 될까? 가 정상 실행됨
		}
		
		System.out.println("3. 여기까지 실행이 될까?");
	}

}
