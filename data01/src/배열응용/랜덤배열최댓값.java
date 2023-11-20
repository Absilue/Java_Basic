package 배열응용;

import java.util.Random;

import 배열기본.Print;

public class 랜덤배열최댓값 {

	public static void main(String[] args) {
		Random r = new Random(100);
		// 의사(가짜) 랜덤값
		
		int [] numbers = new int [1000];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(1000);
		}
		Print.arr(numbers);
		
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println(max);
	}

}
