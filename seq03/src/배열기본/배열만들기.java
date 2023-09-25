package 배열기본;

public class 배열만들기 {

	public static void main(String[] args) {
		// 배열 만들때를 기준으로 함
		// 1) 값을 모르는 경우
		int[] s = new int[5];
		// 자동 초기화 { 0, 0, 0, 0, 0}

		s[0] = 100;
		// s가 가르키고 있는 첫번째 값에 100을 넣음
		s[2] = 200;
		// s가 가르키고 있는 세번째 값에 200을 넣음
		s[s.length - 1] = 300;
		// s가 가르키고 있는 마지막 값에 300을 넣음

		// 2) 값을 알고 있는 경우
		int[] s2 = { 1, 2, 3, 4, 5 };

		// s와 s2의 개수(사이즈 size, 길이 length)를 프린트
		// s가 가르키는 첫번째 값 프린트
		// s가 가르키는 세번째 값 프린트
		// s가 가르키는 마지막 값 프린트

		System.out.println("배열 s가 가지는 사이즈 " + s.length);
		System.out.println("배열 s2가 가지는 사이즈 " + s2.length);

		System.out.println("s의 첫번째 값은 " + s[0]);
		System.out.println("s의 세번째 값은 " + s[2]);
		System.out.println("s의 마지막 값은 " + s[s.length - 1]);

		System.out.println("s의 첫번째 값과 세번째 값의 합은 " + s[0] + s[2]);
		// s가 가르키고 있는 첫번째 값과 세번째 값을 더해서 프린트
		System.out.println("s의 첫번째 값과 세번째 값은 일치합니까? " + (s[0] == s[2]));
		// s가 가르키고 있는 첫번째 값과 세번째 값이 같은지 프린트
		
		for (int i = 0; i < s.length; i++) {
			
		}

	}

}
