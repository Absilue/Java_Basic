package 제어문.조건문;

public class 문자열비교 {

	public static void main(String[] args) {
		String pass = "password";
		// 기본형만 == 연산자를 통해 값 비교가 가능
		
		if (pass.equals("password")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}

}
