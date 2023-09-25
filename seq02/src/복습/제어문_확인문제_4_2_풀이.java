package 복습;

public class 제어문_확인문제_4_2_풀이 {

	public static void main(String[] args) {
		int korea = 75;
		int math = 50;
		
		int sum = korea + math;
		double avg = (double)sum / 2;
		// 125 / 2 ==> 62
		// avg = 62.0
		//  double <== int <== short <== byte
		// 계산결과가 실수여야 하는 경우 계산할부터 실수를 사용해야 함
		// (double)sum으로 정수인 sum을 실수로 변환시킴
		
		System.out.println("평균점수는 " + avg + "점 입니다.");
	}

}
