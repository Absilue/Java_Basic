package bean;

public class Car2 {
		// 멤버 변수 + 멤버 메서드
		String color; // 4byte
		int speed;  // 4byte
		int price;  // 4byte
		public static Car2 car2;
		
		// 외부에서는 Car2가 하나 만들어놓은 객체를 달라고 요청
		// Car2.getInstane();
		public static Car2 getinstance() {
			if(car2 == null) {
				car2 = new Car2("Black", 330, 1800);
			}
			return car2;
		}
		
		private Car2(String color, int speed, int price) {
			this.color = color;
			this.speed = speed;
			this.price = price;
		}
}