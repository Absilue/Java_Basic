package 배열스윕;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 많은버튼만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setTitle("버튼 모음");
		f.setLayout(null);
		
		JButton b1 = new JButton();
		b1.setText("버튼1");
		b1.setBounds(200, 200, 100, 100);
		// b1버튼의 가로, 세로 위치와 너비, 높이를 결정
		b1.setBackground(Color.orange);
		
		JButton b2 = new JButton();
		b2.setText("버튼2");
		b2.setBounds(300, 200, 100, 100);
		// b1버튼의 가로, 세로 위치와 너비, 높이를 결정
		b2.setBackground(Color.pink);
		
		JButton [] buttons = new JButton[200];
		Random r = new Random();
		// {null, null, null, null ...}
		// 모든 기본형 제외한 참조형 배열의 초기값은 null
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setText("버튼 증식" + i);
			int x = r.nextInt(500);
			int y = r.nextInt(500);
			buttons[i].setBackground(Color.yellow);
			buttons[i].setBounds(x, y, 60, 60);
			buttons[i].setOpaque(true);
			// buttons 버튼의 배경을 불투명하게 해서 배경색이 표시하는 명령어
			// window 환경에서는 크게 상관없는 명령어
			buttons[i].setBorderPainted(false);
			// buttons의 외각선을 없애는 명령어
			f.add(buttons[i]);
		}
		
		f.add(b1);
		f.add(b2);
	
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// JFrame의 X를 눌렀을때 자바 프로그램이 종료되는 명령어
		f.setVisible(true);
	}

}
