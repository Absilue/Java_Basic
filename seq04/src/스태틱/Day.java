package 스태틱;

public class Day {

		public String doing; //null
		public int time; //0
		public String location; //null
		public static  int count; //0
		public static  int sum; //0
		// 전역변수 ==> 자동 초기화
		// 전역변수를 누적시키고 싶으면 Static을 사용
		// 코딩에서 누워있는 글씨는 Static이 사용된 변수
		
		
		
		// 생성자
		public  Day(String doing, int time, String location) {
			this.doing = doing;
			this.time = time;
			this.location = location;
			count++;
			sum = sum + time;
		}

		@Override
		public String toString() {
			return "Day [doing = " + doing + ", time = " + time + "시간, location = " + location + "]";
		}
}
