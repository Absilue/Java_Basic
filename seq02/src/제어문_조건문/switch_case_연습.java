package 제어문_조건문;

public class switch_case_연습 {

	public static void main(String[] args) {
		String name = "자바";
		
		switch (name) {
		case "자바" :
			System.out.println("1101호로 가십시오");
			break;
			// break - break를 포함한 { }를 중단시킴
			// switch case는 자체적으로 break 기능이 없으므로 따로 넣어줘야 함
		case "파이썬" :
			System.out.println("1102호로 가십시오");
			break;
		case "리눅스" :
			System.out.println("1103호로 가십시오");
			break;
		default :
			// default의 경우 case의 경우가 모든 경우가 해당되므로
			// 따로 break를 걸어줄 필요가 없음
			System.out.println("카운터로 가십시오");
		}
		
		// 데이터 타입 : long X / 정수만 가능 / 실수는 불가능
		// 				  char, String 사용 가능
		
		if ( name.equals("자바")) {
			System.out.println("1101호로 가십시오");
		// if문은 자체적으로 break 기능이 있으므로 따로 break를 넣어주지 않아도 됨
		}else if (name.equals("파이썬")) {
			System.out.println("1102호로 가십시오");
		}else if (name.equals("리눅스")) {
			System.out.println("1103호로 가십시오");
		}else {
			System.out.println("카운터로 가십시오");
		}
	}

}
