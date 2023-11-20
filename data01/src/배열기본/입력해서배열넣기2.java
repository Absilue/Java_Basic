package 배열기본;

import java.util.Arrays;
import java.util.Random;

public class 입력해서배열넣기2 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] numbers = new int[3];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(100); // 0~99중 랜덤값
		}
		System.out.println(Arrays.toString(numbers));
	}
}
