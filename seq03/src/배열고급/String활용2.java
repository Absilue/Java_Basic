package 배열고급;

import java.util.Arrays;
import java.util.Scanner;

public class String활용2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] s2 = s.split(",");
		System.out.println(Arrays.toString(s2));

		int count_c = 0;
		int count_s = 0;

		for (String x : s2) {
			if (x.equals("흐림")) {
				count_c++;
			} else {
				count_s++;
			}
		}
		System.out.println("입력한 날씨중 맑은 날은 " + count_s + "일 입니다.");
		System.out.println("입력한 날씨중 흐린 날은 " + count_c + "일 입니다.");

	}

}
