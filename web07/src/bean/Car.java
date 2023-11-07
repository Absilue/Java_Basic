package bean;

public class Car {
		// 멤버 변수 + 멤버 메서드
		String color; // 4byte
		int speed;  // 4byte
		int price;  // 4byte
		
		public Car(String color, int speed, int price) {
			this.color = color;
			this.speed = speed;
			this.price = price;
		}
}