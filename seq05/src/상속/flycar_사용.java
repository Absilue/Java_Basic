package 상속;

public class flycar_사용{
	public static void main(String[] args) {
		flycar fly = new flycar();
		fly.color = "red";
		fly.fly = true;
		
		fly.fly();
		fly.run();
	}
}
