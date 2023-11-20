package 배열기본;

import java.util.Arrays;

public class 배열확인 {

	public static void main(String[] args) {
		// 배열은 많은 양의 데이터를 다루기 위한 자료구조
		
		// 배열을 만드는 2가지 방법
		// 1) 배열을 만들때, 이미 값들을 알고 있는 경우
		// --> 선형으로 값들을 넣음
		int [] ages = {10, 20, 30, 40, 50, 60};	

		System.out.println(ages);
		System.out.println(ages.length);
		System.out.println(ages[0]);
		ages[1] = 23;
		System.out.println(ages[1]);
		
		// for
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		
		// for-each
		for (int x : ages) {
			System.out.println(x);
		}
		
		System.out.println(Arrays.toString(ages));
		
		// 2) 배열을 만들때, 값들을 모르는 경우
		// --> 저장공간을 미리 만들고 나중에 값들을 넣음
		double[] weight = new double[5];
		weight[0] = 65.3;
		weight[1] = 75.4;
		weight[2] = 85.5;
		weight[3] = 95.6;
		weight[4] = 105.7;
		
		for (double d : weight) {
			System.out.println(d);
		}
		
		System.out.println(Arrays.toString(weight));
	}

}
