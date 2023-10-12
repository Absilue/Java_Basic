package 형변환개념;

import java.util.ArrayList;

public class 형변환_확인문제1 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add('남');
		
		System.out.println(me);
		
		int a = (Integer)me.get(0);
		System.out.println(a+2000);
		
		double b = (double)me.get(1);
		System.out.println(b+10);
		
		boolean c = (boolean)me.get(2);
		if (c) {
			System.out.println("배고파요");
		}else {
			System.out.println("배불러요");
		}
		
		Character d = (Character)me.get(3);
		if (d == '남') {
			System.out.println("주민번호 뒷자리는 1,3");
		}else {
			System.out.println("주민번호 뒷자리는 2,4");
		}
		
		// 데이터를 넣을때는 업케스팅
		// 데이터를 가져올때는 다운케스팅
		
		// ArrayList에는 다양한 타입을 넣을 수 있지만 실제 코딩할때 다양한 타입을 넣는경우는 많지 X
		// 매번 데이터를 넣을 때마다 형변환을 해야하는가?
		
		ArrayList<String> list = new ArrayList<>();
		// ArrayList에 < >를 사용하면 객체를 생성할때 타입을 결정할 수 있음
		// < >안에는 클래스만 넣을 수 있음 
		// <기본형> 사용 불가
		// 제너릭(제너럴, 일반적인) 프로그래밍
		
		list.add("러시아");
		list.add("영국");
		list.add("미국");
		String s = list.get(0);
		System.out.println(list);
		System.out.println(s);
	}

}
