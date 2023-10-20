package 예외처리;

public class 문제발생클래스2 {

	public static void main(String[] args) {
		System.out.println("1. 정상 실행");
		
			try {
				// 수학 연산 에러
				System.out.println("2. 나누기 실행 :" + 10/0);
				
				// 배열 인덱스 에러
				int [] arr = {1, 2, 3};
				System.out.println(arr[3]); // 0~2까지만 존재 
			} catch (ArithmeticException e1) {
				//ArithmeticException - 수학 연산 에러를 처리
				e1.printStackTrace();
				System.out.println("수학 연산 에러 발생");
			} catch (ArrayIndexOutOfBoundsException e2) {
				// ArrayIndexOutOfBoundsException - 배열 인덱스 에러를 처리
				e2.printStackTrace();
				System.out.println("배열 인덱스 에러 발생");
			} catch (Exception e) {
				// 수학 연산 에러, 배열 인덱스 에러가 아닌 모든 경우
			} System.out.println("기타 에러 발생");
			
 	
		
		System.out.println("3. 여기까지 실행이 될까?");
	}

}
