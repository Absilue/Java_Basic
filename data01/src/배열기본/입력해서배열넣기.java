package 배열기본;

import java.util.Arrays;
import java.util.Scanner;

public class 입력해서배열넣기 {

	public static void main(String[] args) {
		// 입력하는 객체 필요 Scanner
		// 많은 양의 데이터를 선형으로 넣을 수 있는 객체
		// 배열을 사용
		
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("숫자 입력 >>>");
			numbers[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(numbers));
	}

}
