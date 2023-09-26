package 배열응용;

import java.util.Scanner;

public class 배열_정리문제3_풀이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int [5];
		// arr = {0, 0, 0, 0, 0}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("원하는 숫자를 입력하세요");
			arr[i] = sc.nextInt();
		} System.out.println("첫번째와 세번째 값의 합은 " + (arr[0] + arr[2]));
		
		System.out.println();
		
		String [] arr2 = new String [3];
		
		for (int k = 0; k < arr2.length; k++) {
			System.out.println("사용하는 프로그램을 입력하세요");
			arr2[k] = sc.next();
		} System.out.println(arr2[0] + "보다는 " + arr2[1]);
	}
}
