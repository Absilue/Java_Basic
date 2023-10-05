package 메서드기본;

public class 계산기 {
	
		// public X ==> 같은 패키지 내에서만 사용 가능
		// public O ==> 다른 패키지에서도 사용 가능
		public void add() {
			// add라고 하는 명령어(함수/메서드)에 대한 처리 내용 작성
			System.out.println("계산기 기능 작동");
			System.out.println("");
		}
		
		public int add2() {
			int price = 5000;
			int count = 3;
			int sum = price * count;
			System.out.println("천원 할인 쿠폰 적용");
			return sum;
			// return을 사용하기 위해서는 public 뒤의 void에 변수 sum의 타입인 int를 써야 정상 작동
		}
		
		public int add3(int price, int count) {
			// 커피숍.class에서 add3에 넣은 3000,5 데이터를 가져와(호출)
			// 각각 price count에 저장
			int sum = price * count;
			System.out.println("2천원 할인 쿠폰 적용");
			return sum;
			// 입력값을 받기 위해 만들어진 변수
			// 전달, 받는 중간다리 역활을 수행하는 변수
			// 매개변수(parameter)
		}
		
		public int add4(int price) {
			int sum = price;
			System.out.println("미수금 2천원 적용 및 천원 할인 쿠폰 적용");
			return sum;
		}
	}

