package 제어문_반복문;

import java.util.Random;

public class 랜덤test {

	public static void main(String[] args) {
		Random r = new Random();
		// int target = r.nextInt();
		// +- 21억중 랜덤한 값이 지정됨
		int target = r.nextInt(3);
		// 0부터 지정한 값보다 1적은 값중 랜덤으로 한가지 값이 설정

		// int target = r.nextInt(99) +1;
		// 0부터 시작하므로 1을 더해서 1~100까지 값중 한가지가 설정되도록 함
		System.out.println(target);
	}

}
