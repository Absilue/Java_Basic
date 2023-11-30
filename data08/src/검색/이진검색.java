package 검색;

import java.util.Arrays;

public class 이진검색 { // binary search

	public static void main(String[] args) {
		int[] num = { 1, 4, 5, 2, 7, 8, 9, 6 };
		
		//정렬을 먼저 해야함.
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.binarySearch(num, 5)); //3
		System.out.println(Arrays.binarySearch(num, 8)); //6
		System.out.println(Arrays.binarySearch(num, 10)); //-값이 나온다.!
		System.out.println(Arrays.binarySearch(num, 1, 5, 1)); 
	}
}
