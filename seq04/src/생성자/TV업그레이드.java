package 생성자;

public class TV업그레이드 {

	// 멤버 변수와 멤버 메서드는 동일
	public int ch;
	public int vol;
	public boolean onoff;
	
	public TV업그레이드(int c, int v, boolean o) {
		// 생성자는 무조건 void라 사용하지 X
		// 클래스 이름과 동일해야 객체 생성시 자동호출됨
		ch = c;
		vol = v;
		onoff = o;
		this.ch = ch;
		// this.ch ==> 현재 클래스 밑에 있는 ch변수라는 의미
		// this ==> 현재 클래스 지정
	}
	
	public void change() {
		System.out.println("채널 변경");
	}
	// 클래스를 만들면 기본 8개 정도의 메서드를 가지고 시작
	// toString ( )은 참조형변수 tv2를 프린트할때 자동으로 프린트할 스트링을 만들어 리턴해주는 메서드
	
	@Override
	public String toString() {
		return "TV업그레이드 [채널 = " + ch + ", 볼륨 = " + vol + ", 전원여부 = " + onoff + "]";
	}
}
