package 연습;

public class 테스트 {

	public static void main(String[] args) {

		String s = "a100";
		// a==>0    1==>1
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		
		char c1 = s.charAt(0);
		// charAt 함수는 String 타입의 데이터에서 특정 문자를 char 타입으로 변환시켜줌
		// 'a'
		char c2 = s.charAt(1);
		// '1'
		
		if (c1 == 'a') {
			System.out.println("기획O");
		}else {
			System.out.println("기획X");
		}
	}

}
