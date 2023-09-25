package 배열응용;

import java.util.Scanner;

public class 배열_정리문제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] a = new int [5];
		String [] b = new String [3];
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자을 입력하세요 ");
			int plus = sc.nextInt();
			a[i] = plus;
			sum = a[0] + a[2];
		}
		System.out.println("첫번째와 세번째 값을 더한 결과는 " + sum + "입니다");
		
		System.out.println();
		
		for (int k = 0; k < 3; k++) {
			System.out.print("사용하는 코딩 프로그램을 입력하세요 ");
			String program = sc.next();
			b[k] = program;
		}
		System.out.println(b[0] + "보다는 " + b[1]);
	}

}
