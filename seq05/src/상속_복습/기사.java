package 상속_복습;

public class 기사 {
	public static void main(String[] args) {
		A b = new B();
		// 형변환
		b.paint();
		b.draw();
	}
}
class A {
	public void paint() {
		System.out.print("A");
		draw();
	}
	public void draw() {
		System.out.print("B");
		draw();
	}
}
class B extends A {
	public void paint() {
		super.draw();
		System.out.print("C");
		this.draw();
	}
	public void draw() {
		System.out.print("D");
	}
}
