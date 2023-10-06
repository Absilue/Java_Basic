package 상속;

public class man extends human {
	// 사람 클래스를 확장해서 man 클래스를 만듬
	
	// man 클래스는 human에서 2개의 매개 변수와 3개의 매개 메서드를 상속받음
	
	int speed;
	
	public void run() {
		System.out.println("뛰다");
	}
}
