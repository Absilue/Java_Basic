package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 정리문제3 {

	public static void main(String[] args) {
		int [] jumsu = new int [10];
		Random r = new Random();
		int max = jumsu[0];
		int min = jumsu[0];
		int max_index = 0;
		int min_index = 0;
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(100)+1;
			
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
