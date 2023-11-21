package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 정리문제3 {

	public static void main(String[] args) {
		int [] jumsu = new int [10];
		Random r = new Random();
		int max = jumsu[0];
		int min = Integer.MAX_VALUE;
		// min값은 배열에 포함될 수 있는 가장 큰 값을 초기값으로 지정해주어야 정상작동
		int max_index = 0;
		int min_index = 0;
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(100)+1; // 1~100
			
			if(max < jumsu[i]) {
				max = jumsu[i];
				max_index = i;
			}
			
			if(min > jumsu[i]) {
				min = jumsu[i];
				min_index = i;
			}
		}
		System.out.println(Arrays.toString(jumsu));
		
		System.out.println("최대값 : " + max);
		System.out.println("최대값의 위치 : " + (max_index+1));
		
		System.out.println("최소값 : " + min);
		System.out.println("최소값의 위치 : " + (min_index+1));
		
	}

}
