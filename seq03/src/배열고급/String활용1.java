package 배열고급;

import java.util.Arrays;

public class String활용1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="감자, 고구마, 양파";
		String [] s2 = s.split(",");
		// 한개의 String이였던 s를 ,기준으로로 나누는 명령어
		
		System.out.println(Arrays.toString(s2));
		System.out.println(s2.length);
		System.out.println(s2[0]);
		// s2에서 첫번째 String 출력
		
		String s3 = "				홍길동";
		System.out.println(s3.trim());
		// s3에서 공백을 없애줌
		s3 = s3.replace("				", "");
		// s3에서 공백을 없애줌
		System.out.println(s3);
		
		String s4 = "최영태";
		char c4 = s4.charAt(0);
		// s4에서 첫번째 글자를 추출함
		if (c4 == '최') {
			System.out.println("최씨 가문이시군요");
		}else {
			System.out.println("최씨 가문이 아니시군요");
		}
	}
}
