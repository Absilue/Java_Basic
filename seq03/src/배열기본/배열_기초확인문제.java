package 배열기본;

public class 배열_기초확인문제 {

	public static void main(String[] args) {
		int[] a = new int[5];
		// a, int[5], length =>> 총 7개의 방을 가짐

		System.out.println("배열의 크기는 " + a.length);
		a[0] = 100;
		// 배열의 첫번째 위치에 100 부여
		a[2] = 200;
		// 배열의 세번째 위치에 300 부여
		a[a.length - 1] = 500;
		// 배열의 마지막 위치에 500 부여

		System.out.println("배열의 첫번째 값은 " + a[0]);
		System.out.println("배열의 세번째 값은 " + a[2]);
		System.out.println("배열의 마지막 값은 " + a[a.length - 1]);

		System.out.println();
		
		for (int i : a) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		// 입력용 X, 인덱스 사용 불가
		for (int x = 0; x < a.length; x++) {
			System.out.println(x+ " : " + a[x]);
			// index
		}
	}

}
