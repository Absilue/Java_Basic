package 배열응용;

import java.util.Arrays;
import java.util.Random;

import 배열기본.Print;

public class 정리문제 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] numbers = new int[20];
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(900);
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println(max);
		
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		
		if(s1.equals(s2)) {
			System.out.println("문자열 일치");
		}else{
			System.out.println("문자열 불일치");
		}
		if(s1.length() < s2.length()) {
			System.out.println("s2가 더 긴 String입니다");
		}else {
			System.out.println("s1이 더 긴 String입니다");		
		}
		
		String s3 = "나는 진짜 java programmer가 되었어";
		String s33 = s3.substring(6,21);// 6~20
		System.out.println(s33.toUpperCase());
		
		String s4 = "2056521";
		if(s4.charAt(0) == '2') {
			System.out.println("여자");
		}else {
			System.out.println("남자");
		}
		
		String s5 = "[10, 30, 20, 50, 40]";
		s5 = s5.replace("[","");
		s5 = s5.replace("]","");
		System.out.println(s5);
		
		s5 = s5.trim();
		System.out.println(s5);
		
		String [] s6 = s5.split(", ");
		Print.arr(s6);
		
		int sum = 0;
		for (String s : s6) {
			sum += Integer.parseInt(s);
		}
		System.out.println(sum);
		
		int [] newarr = new int [s6.length];
		for (int j = 0; j < newarr.length; j++) {
			newarr[j] = Integer.parseInt(s6[j]);
		}
		Print.arr(newarr);
		Arrays.sort(newarr); // 오름차순으로 정렬, 파괴형
		Print.arr(newarr);
		
		String s10 = "어흥길";
		String s11 = "흥길어";
		System.out.println(s10 == s11); // 참조형으로 주소 비교
		
		s10 = "허흥길";
		System.out.println(s10 == s11);
		// 참조형에서 주소가 가르키는 값들이 동일한지 비교
		System.out.println(s10.equals(s11));
		
		s10 = "장태훈";
		s10 = "양태훈";
		// String이 변경될때는 새로운 메모리에 변경된 데이터를 넣음(비효율적)
		
		StringBuilder sb = new StringBuilder();
		sb.append("장태훈");
		System.out.println(sb);
		sb.insert(0, "양민주");
		System.out.println(sb);
	}
}
