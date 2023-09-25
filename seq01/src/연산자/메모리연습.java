package 연산자;

public class 메모리연습 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// 한줄 복사 - 컨트롤  + 알트 + 화살표 아래
		a = b + 10;
		System.out.println("a >>" + a);
		
		int c = b + 10;
		System.out.println("c >>" + c);
	}

}
