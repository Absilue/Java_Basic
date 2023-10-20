package 정리문제;

import 정리문제.tour;

public class tourmain {
	public static void main(String[] s) {
		tour tour2 = new tour();
		
		String []  s1 = tour2.가고싶은여행지목록();
		System.out.println("내가 가고 싶은 여행지는 " + s1[0] +"와 " +s1[1] + ", " + s1[2] + "이다");
		
		String s2  = tour2.제일가고싶은여행지();
		System.out.println("제일 가고 싶은 여행지는" + s2 + "인데, 가기 쉽지 않다");
		
		int s3 = tour2.여행지경비(2, 500000);
		if (s3 >= 2000000) {
			System.out.println("여행경비가 부족합니다");
		}else {
			System.out.println("여행경비가 충분히 모였습니다");
		}
	}
}
