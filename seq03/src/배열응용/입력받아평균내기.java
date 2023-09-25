package 배열응용;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class 입력받아평균내기 {

	public static void main(String[] args) {
		// 숫자 5개를 입력받아서 각각의 데이터로 저장
		// 그 후 데이터를 꺼내서 누적 연산

		// 반복해서 저장하는 공간은 배열을 사용
		// 데이터를 누적시켜야 하므로 for문 밖에 작성

		int[] a = new int[3];
		// a = { 0, 0, 0}

		for (int i = 0; i < 3; i++) {
			String n = JOptionPane.showInputDialog("숫자를 입력하세요");
			// 입력한 값을 String으로 프로그램 안으로 가져옴

			a[i] = Integer.parseInt(n);
			// String 데이터를 int 데이터로 바꿔줌
			// System.out.println(a + 100);
		}
		// 출력 ==> 읽기 전용으로 내용확인만 가능
		// String list = Arrays.toString(a);
		// System.out.println(list);
		System.out.println(Arrays.toString(a));

		int sum = 0;
		for (int x : a) {
			sum = sum + x;
		}
		//		for (int i = 0; i < a.lenth; i++) {
		//			sum = sum +n3[1];
		//		}
		System.out.println((double) sum / a.length);
		// sum은 정수이므로 double을 이용해 실수 값으로 바꿔준 후 평균을 계산
	}
}
