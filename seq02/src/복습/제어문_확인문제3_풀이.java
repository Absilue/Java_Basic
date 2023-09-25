package 복습;

public class 제어문_확인문제3_풀이 {

	public static void main(String[] args) {
		// 입력 --> 처리 --> 출력
		int count = 5;
		int price = 5000;
		
		int sum = count * price;
		
		String result = "";
		
		if (sum > 20000) {
			result = "할인 적용";
		}else {
			result = "할인 적용 불가";
		}
		
		System.out.println(result);
	}

}
