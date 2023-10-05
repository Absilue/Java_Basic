package 생성자;

import javax.swing.JFrame;

import 부품만들기.TV;

public class 생성자_예제 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("제목1");

		JFrame f2 = new JFrame("제목2");

		TV tv = new TV();
		tv.ch = 5;
		tv.vol = 9;
		tv.onoff = false;
		System.out.println(tv);
		// jar (class를 압축해 놓은 것) == zip
		// java archive (자바 압축)
		
		TV업그레이드 tv2 = new TV업그레이드(6, 9, true);
		System.out.println(tv2);
	}

}
