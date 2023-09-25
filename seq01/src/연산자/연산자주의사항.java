package 연산자;

public class 연산자주의사항 {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 4;
		
		int sum = n1 + n2;
		int avg = sum / 2;
		// JAVA의 연산시 정수와 정수의 연산결과는 무조건 정수
		// 실제 --> (5+4)/2=4.5
		// JAVA --> (5+4)/2=4  소숫점을 버림
		
		double avg2 = sum / 2.0;
		// JAVA의 연산시 하나라도 실수면 연산결과는 무조건 실수
		// 피 연산자 2를 2.0으로 실수로 표현했기 때문에
		// double 태그를 사용해야 함
		
		System.out.println(avg);
		System.out.println("----------------------");
		System.out.println(avg2);
	}

}
