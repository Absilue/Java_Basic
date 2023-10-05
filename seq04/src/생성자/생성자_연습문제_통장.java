package 생성자;

public class 생성자_연습문제_통장 {

	public static void main(String[] args) {
		통장 account = new 통장("최영태", "970719", 10000);
		System.out.println(account.name + "님의 통장 잔고 금액은 " + account.money + "원 입니다");
	}

}
