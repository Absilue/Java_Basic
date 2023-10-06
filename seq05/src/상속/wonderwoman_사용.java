package 상속;

public class wonderwoman_사용 {
	public static void main(String[] args) {
		wonderwoman w = new wonderwoman();
		w.age = 100; // human
		w.hair = 10; // woman
		w.money = 50000; // wonderwoman
		
		w.walk(); // human
		w.talk(); // woman
		w.shopping(); //wonderwoman
	}

}
