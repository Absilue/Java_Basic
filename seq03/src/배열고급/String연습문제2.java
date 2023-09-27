package 배열고급;

import java.util.Arrays;

public class String연습문제2 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		String [] all2 = all.split(",");
		System.out.println(Arrays.toString(all2));
		
		int com = 0;
		int count = 0;
		int all2_count = all2.length;
		
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].contains(" ")) {
				all2[i] = all2[i].trim();
				// all2[i] 앞뒤의 공백을 제거하는 명령어
			}
			
			if (all2[i].equals("컴퓨터")) {
				com = i;
			}
			if (all2[i].length() <3) {
				count++;
			}
		}
		System.out.println("과목수는 " + all2_count + "과목입니다");
		System.out.println("컴퓨터 인덱스의 영역은 " + com);
		System.out.println("과목명이 세글자 미만인 과목수는 " + count + "과목");
		
	}

}
