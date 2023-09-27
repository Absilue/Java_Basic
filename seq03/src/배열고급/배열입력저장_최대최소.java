package 배열고급;

import java.util.Arrays;
import java.util.Scanner;

public class 배열입력저장_최대최소 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int [10];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자를 입력하세요 ");
			arr[i] = sc.nextInt();
			// 입력한 데이터 타입을 int 타입으로 바꿔서 배열에 넣음
		}
		Arrays.sort(arr);
		// 배열을 오름차순으로 정렬
		
		int max = arr[arr.length-1];
		int min = arr[0];

		System.out.println("입력한 배열은 " + Arrays.toString(arr));
		System.out.println("--------------------------");
		System.out.println("입력한 숫자 중 최댓값은 " + max + "입니다");
		System.out.println("입력한 숫자 중 최소값은 " + min + "입니다");
	}

}
