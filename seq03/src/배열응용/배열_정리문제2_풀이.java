package 배열응용;

import java.util.Arrays;

public class 배열_정리문제2_풀이 {

	public static void main(String[] args) {
		String [] tour = {"부산", "홍천", "대전", "천안", "광주"};
		char [] color = {'b', 'r', 'g', 'p', 'w'};
		double [] height = {155.5, 166.6, 177.7, 188.8, 199.9};
		
		System.out.println(Arrays.toString(tour));
		System.out.println();
		
		System.out.println(Arrays.toString(color));
		System.out.println();
		
		System.out.println(Arrays.toString(height));
		System.out.println();
		
		for (int i = 0; i < height.length; i++) {
			System.out.println(height[i]);
		}
		
		double sum = 0.0;
		for (double d : height) {
			// foreach문 - 알아서 배열에 있는거 하나씩 꺼내줌
			// 하나씩 꺼낸 데이터는 d라는 변수에 저장됨
			sum = sum + d;
		} System.out.println("평균은 " + (sum / height.length));
		 	//	평균은 실수의 값을 가져야하는데, double을 사용했으므로 신경쓸 필요 X
	}
}
