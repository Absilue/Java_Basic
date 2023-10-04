package 부품만들기;

public class 계좌 {
	public String 이름;
	public String 은행이름;
	public int 금액;
	
	public void 입금하다() {
		System.out.println(이름 + "이 " + 금액 + "원을 입금하였습니다");
	}
	public void 출금하다() {
		System.out.println(이름 + "이 " + 금액 + "원을 출금하였습니다");
	}
	
	public String toString() {
		return "계좌 [ 이름 = " + 이름 + ", 은행이름 =  " + 은행이름 + ", 금액 = " + 금액 + "원 ]";
	}
}
