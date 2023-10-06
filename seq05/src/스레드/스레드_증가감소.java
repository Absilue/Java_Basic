package 스레드;

public class 스레드_증가감소 {

	public static void main(String[] args) {
		증가스레드 n1 = new 증가스레드();
		감소스레드 n2 = new 감소스레드();
		이름스레드 n3 = new 이름스레드();
		n1.start();
		n2.start();
		n3.start();
	}

}
