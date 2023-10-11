package 상속_복습;

public class 기사2 {
	public static void main(String[] args) {
		B2 b = new B2();
		b.paint(); // BCD
		b.draw(); // D
	}
}
class A2 {
	public void paint() {
		System.out.print("A");
		draw();
	}
	public void draw() {
		System.out.print("B");
		draw();
	}
}
class B2 extends A2 {
	public void paint() {
		super.draw();
		// B
		// 자기보다 상위 클래스의 정보를 호출함
		System.out.print("C");
		// C
		this.draw();
		// D
	}
	public void draw() {
		System.out.print("D");
	}
}
