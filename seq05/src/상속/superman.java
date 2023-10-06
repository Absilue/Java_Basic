package 상속;

public class superman extends man {
	// superman은 man < human에서 상속받은
	// 3개의 멤버 변수, 4개의 멤버 메서드를 가지고 있음
	
	int power;
	
	public void fly() {
		System.out.println("하늘을 날다");
	}
}
