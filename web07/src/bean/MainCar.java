package bean;

public class MainCar {
	public static void main(String[] args) {
		Car car1 = new Car("Red", 200, 2000); // 무더기 (힙영역)
		Car car2 = new Car("Blue", 100, 1000);
		Car car3 = new Car("Green", 300, 3000);
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}
}
