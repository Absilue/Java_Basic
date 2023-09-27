package 배열고급;

public class String연습 {

	public static void main(String[] args) {
		String s = "나는 프로그래머야";
		String s2 = " 정말로";
		
		System.out.println(s + s2);
		// 스트링 결합
		
		System.out.println(s.concat(s2));
		// 스트링 결합
		
		System.out.println(s.charAt(0));
		// s의 첫번째 글자 추출
		
		System.out.println(s.endsWith("야"));
		// s가 특정 문자로 끝나는지 확인
		
		System.out.println(s.substring(3));
		// s의 인덱스 중 3번째 이후 글자들을 추출
		
		System.out.println(s.substring(3,8));
		// s의 인덱스 중 3~7번째의 글자들을 추출
		
		System.out.println(s.contains(s2));
		// s에 s2가 포함되어있는지를 확인
		
		System.out.println(s.lastIndexOf("프"));
		// s중 프 글자의 위치 확인
		
		System.out.println(s.toUpperCase());
		// s를 모두 대문자로
		
		System.out.println(s.toLowerCase());
		// s를 모두 소문자로
		
		System.out.println(s.length());
		// s의 글자수
		
		System.out.println(s.replace("나", "너"));
		// s중 나 ==> 너로 바꿈
	}

}
