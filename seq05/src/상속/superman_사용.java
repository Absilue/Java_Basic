package 상속;

public class superman_사용 {

	public static void main(String[] args) {
		superman s = new superman();
		// super는 문법으로 사용하려고 이미 예약되어 있는 단어 - 예약어
		s.age = 50; // human
		s.speed = 100; // man
		s.power = 5000; // superman
		
		s.walk(); // human
		s.run(); // man
		s.fly(); // superman
	}

}
