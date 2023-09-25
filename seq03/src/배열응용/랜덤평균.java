package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 랜덤평균 {

	public static void main(String[] args) {
		// 랜덤하게 아무 데이터를 받아 자동으로 배열에 삽입
		Random r = new Random();
		int [] a = new int [1000];
		
		for (int i = 0; i < 1000; i++) {
			a[i] = r.nextInt(100);
			// 0~99까지 랜덤한 숫자를 생성
		}
		
		int sum = 0;
		for (int x : a) {
			sum = sum + x;
		}
		System.out.println(sum);
		System.out.println((double) sum / a.length);
		// sum은 정수이므로 double을 이용해 실수 값으로 바꿔준 후 평균을 계산
		System.out.println(Arrays.toString(a));

	}
}
