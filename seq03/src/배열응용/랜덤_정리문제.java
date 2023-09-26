package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 랜덤_정리문제 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int [] arr = new int [1000];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = r.nextInt(1000);	
			}
		
		Arrays.sort(arr);
		// 오름차순으로 정렬
			
		int count_300 = 0;
		int count_400 = 0;
		int count_500 = 0;
		int count_600 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >=300) {
				count_300++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >=400) {
				count_400++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >=500) {
				count_500++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >=600) {
				count_600++;
			}
		}
		
		int max = arr[arr.length-1];
		int min = arr[arr[0]];
		
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		System.out.println("최댓값은 " + max);
		System.out.println("최소값은 " + min);
		System.out.println();
		System.out.println("300 이상의 수는 " + count_300 + "개이다");
		System.out.println("400 이상의 수는 " + count_400 + "개이다");
		System.out.println("500 이상의 수는 " + count_500 + "개이다");
		System.out.println("600 이상의 수는 " + count_600 + "개이다");
	}

}
