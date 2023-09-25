package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// 산술 연산자 ( + - * / %)
		
		int x = 200;
		int y = 100;
		
		System.out.println("두 수의 합은 " +  (x + y));
		System.out.println("두 수의 차는 " +  (x - y));
		System.out.println("두 수의 곱은 " +  (x * y));
		System.out.println("두 수의 나눗셈은 " +  (x / y));
		
		x = x + y;
		System.out.println(x);
		// x란 변수가 x+y란 값으로 변형되었기 때문에 추후에 
		// x란 변수값을 다시 사용하기 불가능하므로 가급적 변수는 재지정하지 않는다
		
		int result = x + y;
		System.out.println(result);
	}

}
