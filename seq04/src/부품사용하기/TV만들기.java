package 부품사용하기;

import 부품만들기.TV;

public class TV만들기 {
	public static void main(String[] args) {
		// 틀 - class ==> 실제 - 객체
		TV mytv = new TV();
		mytv.ch = 7;
		mytv.vol = 8;
		mytv.onoff = true;
		
		TV yourtv = new TV();
		yourtv.ch = 4;
		yourtv.vol = 3;
		yourtv.onoff = false;
		
		// new ==> 객체 만들어주는 키워드 (객체 생성)
		
		System.out.println(mytv.ch);
		System.out.println(mytv.onoff);
	}
}
