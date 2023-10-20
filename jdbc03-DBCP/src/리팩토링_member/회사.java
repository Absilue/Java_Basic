package 리팩토링_member;

public class 회사 {
	public static void main(String[] args) {
		직원 e1 = new 직원();
		e1.name = "강수진";
		e1.salary = 1000;
		e1.address = "삼성역";

		// public >>> protected >>> default >>> private
		// 단, protected는 상속 받은 경우에만 사용 가능 
	}
}