package 배열스윕;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 영화좌석예매 {

	static int count = 0; // 전역변수로 선언
	static String num = "";

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setTitle("영화 좌석 예매");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JLabel l1 = new JLabel();
		l1.setText("스크린");
		l1.setPreferredSize(new Dimension(500, 100));
		f.add(l1);

		JButton[] buttons = new JButton[201];
		Random r = new Random();
		// {null, null, null, null ...}
		// 모든 기본형 제외한 참조형 배열의 초기값은 null
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setText("좌석" + i);
			buttons[i].setOpaque(true);
			// buttons 버튼의 배경을 불투명하게 해서 배경색이 표시하는 명령어
			// window 환경에서는 크게 상관없는 명령어
			buttons[i].setBorderPainted(false);
			// buttons의 외각선을 없애는 명령어

			buttons[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// 버튼을 클릭했을때 실행되었으면 하는 내용 작성

					count++;
					int pay = count * 11000;

					String s = e.getActionCommand();
					// 버튼 위에 올라가는 글자를 가지고 옴

					JButton b = (JButton) e.getSource();
					b.setBackground(Color.black);
					b.setEnabled(false);
					// 예매된 좌석을 클릭 못하게 변경

					num = num + s + " ";
					JOptionPane.showMessageDialog(f,
							s + "을 클릭하셨습니다 " + "\n" + "전체 결제 금액은 " + pay + "원 입니다" + "\n" + "선택한 좌석 번호는 " + num + " ");
				}
			});

			f.add(buttons[i]);
		}
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// JFrame의 X를 눌렀을때 자바 프로그램이 종료되는 명령어
		f.setVisible(true);
	}
}
