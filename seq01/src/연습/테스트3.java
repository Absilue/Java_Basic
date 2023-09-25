package 연습;

public class 테스트3 {

	public static void main(String[] args) {
		final double PI = 3.14;
		// final (상수) = 절대로 변경 불가
		// final을 사용한 경우에는 변수명으로 대문자 사용
		double r = 2.2;
		double x = (PI * r * r);
		System.out.println(x + "cm^2");
		System.out.printf("%.2f", x);
		// printf("%. 표현하고 싶은 소수점자릿수f", 값)
	}

}
