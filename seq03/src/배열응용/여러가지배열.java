package 배열응용;

import java.util.Arrays;

public class 여러가지배열 {

	public static void main(String[] args) {
		String [] family = {"아빠", "엄마", "형", "나", "동생"};
		int [] age = {54, 50, 30, 27, 24};
		double [] height = {180.3, 170.3, 183.5, 183.3, 169.2};
		
		for (int i = 0; i < height.length; i++) {
			System.out.println(family[i] + "의 나이는 " + age[i] + "살, 키는 " + height[i] + "cm");
			System.out.println("-------------------------");
		}
		// 우리가족 내년 나이 / 동생은 키가 5cm 자랐음
		for (int i = 0; i < height.length; i++) {
			age[i] = age[i] + 1;
			System.out.println(age[i]);
		} height[4] = height[4] + 5;
		 System.out.println(Arrays.toString(height));
	}

}
