package 메서드기본;

public class 계산기_확장 {
	
		public int add(int x, int y) {
			return x + y;
			// int와 int의 산술연산의 결과는 int
		}
		
		public double add(int x, double y) {
			return x + y;
			// int와 double의 산술연산의 결과는 double
			// 변수 중 하나라도 실수면 연산 결과는 무조건 실수
		}
		
		public double add(double x, double y) {
			return  x + y;
			// double과 double의 산술연산의 결과는 double
		}
		
		public String add(String x, int y) {
			return x + y;
			// String과 int의 산술연산의 결과는 String
			// 변수 중 하나라도 String이면 연산 결과는 무조건 String
		}
		
		public int [] add() {
			int [] num = {1, 2, 3};
			return num;
			// 배열도 마찬가지로 변수 앞에 사용한 타입을 void 자리에 적어줌
		}
	}
