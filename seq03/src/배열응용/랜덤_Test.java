package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 랜덤_Test {

	public static void main(String[] args) {
		Random r = new Random(100);
		// r.setSeed(100);
		
		int [] arr = new int[1000];
		
		for (int i = 0; i < 1000; i++) {
			arr[i] = r.nextInt(100);
			// 0부터 시작해서 지정한 값보다 작은 범위의 값들을 랜덤으로 지정
		}	System.out.println(Arrays.toString(arr));

	}

}
