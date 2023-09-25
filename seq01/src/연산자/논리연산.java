package 연산자;

public class 논리연산 {

	public static void main(String[] args) {
		String id = "HESS";
		String inputid = "JESS";
		
		String pw = "2222";
		String inputpw = "3333";
		
		if(inputid.equals(id) && inputpw.equals(pw) ){
			// ==은 기본 데이터 값만 비교 가능
			// String으로 만들어진 값은 참조 데이터라
			// equal 명령어를 써야함
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}

}
