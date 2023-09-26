package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 토익문제 {

	public static void main(String[] args) {
		int[] answer = new int[990];
		int[] my_answer = new int[990];

		Random r = new Random(18);
		for (int i = 0; i < my_answer.length; i++) {
			answer[i] = r.nextInt(4);
			my_answer[i] = r.nextInt(4);
		}
		System.out.println(Arrays.toString(answer));
		System.out.println(Arrays.toString(my_answer));

		// 답과 일치할때 점수 1점일때 점수 계산

		int score = 0;
		for (int i = 0; i < my_answer.length; i++) {
			if (answer[i] == my_answer[i]) {
				score++;
			} 
		} System.out.println("내 토익점수는 " + score + "점입니다");
	}

}
