package Vaule;

public class Friends {
	public static void main(String[] args) {
		int age = 200;
		String name = "홍길동";
		double weight = 88.8;
		String color = "y";
		String home = "홍천";
		// 문자 변수입력은 String 사용
		// 반드시 첫글자는 대문자여야함
		boolean pro = true;
		// 적당히 코드 작성하다가 컨트롤 + 쉬프트 + f
		// =>> 코드정리

		System.out.println("친구의 이름은 " + name + "이고 나이는 " + age + "세이다.");
		System.out.println(home + "에 살고 있고 몸무게는 " + weight + "kg이다");
		System.out.println("좋아하는 색은 " + color + "가 들어가는 색이고, 프로그래머 여부는 " + pro + "이다");
	}
}
