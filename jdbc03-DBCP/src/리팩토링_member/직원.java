package 리팩토링_member;

public class 직원 {
	public String name; // public --> 아무곳에서나 접근 가능
	String address;  // default --> 같은 패키지에서 접근 가능
	protected int salary; // protected --> 상속 받은 곳에서 접근 가능(다른 패키지도 가능)
	private int rrn; // private --> 같은 클래스내에서만 접근 가능

	public String toString() {
		return "직원 [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
}
