package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 수능만점자 {

	public static void main(String[] args) {
		Random r = new Random(18);

		int[] arr = new int[10000];
		int sum = 0;
		for (int i = 0; i < 10000; i++) {
			arr[i] = r.nextInt(451);
			// 0~450범위에서 랜덤한 값을 부여
		}

		for (int x : arr) {
			sum = sum + x;
		}
		double avg = sum / arr.length;
		String avg2 = String.format("%.2f", avg);
		// 소수점 둘째자리까지만 표현

		Arrays.sort(arr);
		// 램에 들어있는 arr의 10000개의 데이터의 위치를 옮겨 정렬 (오름차순으로 정렬)
		// cpu가 램에 들어있는 값을 변경해버림 ==> 파괴형 함수

		// String data = "100";
		// cpu가 램의 값을 변경하지 않는다 ==> 비파괴형 함수
		// Arrays.toStirng() ==> 비파괴형 함수
		// Double.parseDouble() ==> 비파괴형 함수

		int max = arr[arr.length - 1];
		// 가장 큰 점수를 찾음
		int count_max = 0;
		// 만점자의 수를 지정할 변수

		for (int score : arr) {
			if (score == max) {
				count_max++;
			}
		}

		int min = arr[arr[0]];
		// 가장 작은 점수를 찾음
		int count_min = 0;

		// 0점자의 수를 지정할 변수
		for (int score : arr) {
			if (score == min) {
				count_min++;
			}
		}
		
		int count_man = 0;
		double range = 50.0;
		// 평균 +-50점
		for (int avg_man : arr) {
			if ( avg_man >= (avg-range) && avg_man <= (avg+range)) {
				count_man++;
			}
		}
		
		int th_man = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 300) {
				th_man++;
			}
		}

		System.out.println("수능 만점자의 수는 " + count_max + "명 입니다");
		System.out.println("수능 0점자의 수는 " + count_min + "명 입니다");
		System.out.println("수능 300점 이상인 학생의 수는 " + th_man + "명 입니다");
		System.out.println("수능 점수의 평균은 " + avg2 + "점 입니다");
		System.out.println("평균 점수에서 +- 50점 범위에 속하는 학생의 수는 " + count_man + "명 입니다");

	}

}
