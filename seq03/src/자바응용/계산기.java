package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {
		// 필요한 부품을 ram에 가져다 놓아야 함

		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		// 버튼들의 배치가 자연스럽게 해주는 명령어

		f.setSize(400, 650);
		f.getContentPane().setBackground(Color.white);
		// Frame의 배경색을 지정

		JButton plus = new JButton();
		plus.setText("더하기");

		JButton minus = new JButton();
		minus.setText("빼  기");
		
		JButton mul = new JButton();
		mul.setText("곱하기");
		
		JButton div = new JButton();
		div.setText("나누기");

		JLabel l1 = new JLabel();
		// 글자 넣는 부품은 JLabel
		l1.setText("첫번째 숫자");
		JTextField t1 = new JTextField(10);
		// html에서 input 역활 = java에서 JTextField

		JLabel l2 = new JLabel();
		// 글자 넣는 부품은 JLabel
		l2.setText("두번째 숫자");
		JTextField t2 = new JTextField(10);

		JLabel img = new JLabel();
		ImageIcon icon = new ImageIcon("cal.png");
		img.setIcon(icon);
		
		JLabel l3 = new JLabel();
		l3.setText("계산 결과");
		

		Font font = new Font("긱블말랑이체", 1, 30);
		// font - 글자 스타일 담당("글자체", 진하게 여부, 글자크기)
		plus.setFont(font);
		plus.setBackground(Color.pink);
		minus.setFont(font);
		minus.setBackground(Color.pink);
		mul.setFont(font);
		mul.setBackground(Color.pink);
		div.setFont(font);
		div.setBackground(Color.pink);
		l1.setFont(font);
		t1.setFont(font);
		t1.setBackground(Color.cyan);
		t2.setForeground(Color.DARK_GRAY);
		l2.setFont(font);
		t2.setFont(font);
		t2.setBackground(Color.cyan);
		// t2 영역의 배경색을 지정
		t2.setForeground(Color.DARK_GRAY);
		// t2 영역의 글자색을 지정
		l3.setFont(font);

		f.add(img);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(plus);
		// plus 버튼을 더하는 명령어
		// add할 위치를 지정해줘야 함
		// 지정하지 않을 경우, 마지막에 입력한 add 값으로 덧씌워짐
		f.add(minus);
		f.add(mul);
		f.add(div);
		f.add(l3);

		// plus 버튼을 클릭했을때, 실행될 액션을 설정
		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을때 처리내용을 작성
				System.out.println("플러스 버튼을 누르셨습니다");
				String s1 = t1.getText();
				String s2 = t2.getText();

				if (s1.equals("") || s2.equals("")) {
					JOptionPane.showMessageDialog(f, "데이터가 입력되지 않았습니다");
				} else {
					int n1 = Integer.parseInt(s1);
					int n2 = Integer.parseInt(s2);
					int sum = n1 + n2;

					System.out.println("계산결과는 " + sum + "입니다");
					JOptionPane.showMessageDialog(f, "계산결과는 " + sum + "입니다");
					// 위치에 null을 입력하면 모니터 정중앙에 출력
					// 위치에 f를 입력해 JFrame 안에 위치하게 함

					// t1, t2 입력한 값 지우기
					t1.setText("");
					t2.setText("");
					l3.setText("계산결과는 " + sum + "입니다");
				}
			}
		});

		// minus 버튼을 클릭했을때, 실행될 액션을 설정
		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을때 처리내용을 작성
				System.out.println("마이너스 버튼을 누르셨습니다");
				String s3 = t1.getText();
				String s4 = t2.getText();

				if (s3.equals("") || s4.equals("")) {
					JOptionPane.showMessageDialog(f, "데이터가 입력되지 않았습니다");
				} else {
					int n3 = Integer.parseInt(s3);
					int n4 = Integer.parseInt(s4);
					int minus = n3 - n4;

					System.out.println("계산결과는 " + minus + "입니다");
					JOptionPane.showMessageDialog(f, "계산결과는 " + minus + "입니다");

					// t1, t2 입력한 값 지우기
					t1.setText("");
					t2.setText("");
					l3.setText("계산결과는 " + minus + "입니다");
					// t1과 t2를 공백으로 texting 함
				}

			}
		});
		
		// mul 버튼을 클릭했을때, 실행될 액션을 설정
				mul.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// 버튼을 클릭했을때 처리내용을 작성
						System.out.println("곱하기 버튼을 누르셨습니다");
						String s5 = t1.getText();
						String s6 = t2.getText();

						if (s5.equals("") || s6.equals("")) {
							JOptionPane.showMessageDialog(f, "데이터가 입력되지 않았습니다");
						} else {
							int n5 = Integer.parseInt(s5);
							int n6 = Integer.parseInt(s6);
							int mul = n5 * n6;

							System.out.println("계산결과는 " + mul + "입니다");
							JOptionPane.showMessageDialog(f, "계산결과는 " + mul + "입니다");
							// 위치에 null을 입력하면 모니터 정중앙에 출력
							// 위치에 f를 입력해 JFrame 안에 위치하게 함

							// t1, t2 입력한 값 지우기
							t1.setText("");
							t2.setText("");
							l3.setText("계산결과는 " + mul + "입니다");
						}
					}
				});

				// div 버튼을 클릭했을때, 실행될 액션을 설정
				div.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// 버튼을 클릭했을때 처리내용을 작성
						System.out.println("나누기 버튼을 누르셨습니다");
						String s7 = t1.getText();
						String s8 = t2.getText();

						if (s7.equals("") || s8.equals("")) {
							JOptionPane.showMessageDialog(f, "데이터가 입력되지 않았습니다");
						} else {
							int n7 = Integer.parseInt(s7);
							int n8 = Integer.parseInt(s8);
							int div = n7 / n8;

							System.out.println("계산결과는 " + div + "입니다");
							JOptionPane.showMessageDialog(f, "계산결과는 " + div + "입니다");
							// 위치에 null을 입력하면 모니터 정중앙에 출력
							// 위치에 f를 입력해 JFrame 안에 위치하게 함

							// t1, t2 입력한 값 지우기
							t1.setText("");
							t2.setText("");
							l3.setText("계산결과는 " + div + "입니다");
						}
					}
				});
				
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// X버튼을 눌렀을때 자바 프로그램을 끄는 명령어
		// 이 명령어가 없으면 X를 눌러도 백그라운드에서 계속 자바 프로그램이 실행되고 있음

		f.setVisible(true);
		// 위에 설정한 옵션들을 보이게 하는 명령어
		// 설정들은 모두 setVisile 위에 위치해야 함
	}

}
