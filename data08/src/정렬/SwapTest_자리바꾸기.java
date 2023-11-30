package 정렬;

import java.util.Arrays;

public class SwapTest_자리바꾸기 {

	public static void main(String[] args) {
		int[] num = { 6, 1, 2, 3, 5, 9};
		System.out.println(Arrays.toString(num));
		
		//0 --> 1
		//1 --> 0
		//swap전에 백업을 해놓아야한다.!
		int temp = num[1]; //temp <--  1
		num[1] = num[0]; //{6, 6, ...}
		num[0] = temp; //{1, 6, ...}
		System.out.println(Arrays.toString(num));
	}

}
