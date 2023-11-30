package 정렬;

import java.util.Arrays;

public class SwapTest_자리바꾸기2 {

	public static void main(String[] args) {
		int[] num = { 6, 1, 2, 3, 5, 9};
		swap(num, 0, 1);
	}
	
	public static void swap(int[] num, int idx1, int idx2) {
		int temp = num[idx2]; //temp <--  1
		num[idx2] = num[idx1]; //{6, 6, ...}
		num[idx1] = temp; 
		print(num);
	}
	
	public static void print(int[] num) {
		System.out.println(Arrays.toString(num));
	}

}
