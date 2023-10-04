package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기쓰기화면 {
	// 멤버변수
	// 멤버메서드(*)
	public void open() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.green);
		f.setTitle("일기장쓰기 화면");
		f.setSize(600, 750);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("맑은 고딕", 1, 40);
		Font font2 = new Font("맑은 고딕", 1, 60);

		// 라벨 3개, 텍스트필드 2개, 텍스트에어리어 1개, 버튼 1개
		JLabel l1 = new JLabel();
		l1.setText("오늘의 날짜");

		JLabel l2 = new JLabel();
		l2.setText("오늘의 제목");

		JLabel l3 = new JLabel();
		l3.setText("오늘의 내용");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextArea t3 = new JTextArea(5, 10); // 5줄, 10글자
		t1.setBackground(Color.pink);
		t1.setForeground(Color.blue);
		t2.setBackground(Color.pink); // 배경색
		t2.setForeground(Color.blue);
		t3.setBackground(Color.pink); // 배경색
		t3.setForeground(Color.blue);

		JButton save = new JButton();
		save.setText("파일에 일기 저장");

		save.setBackground(Color.yellow);
		save.setForeground(Color.red);
		save.setOpaque(true); // 불투명 true
		save.setBorderPainted(false);

		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		save.setFont(font2);

		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(save);

		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e2) {
				String day = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				try {
					FileWriter file = new FileWriter(day + ".txt");
					file.write(day + "\n");
					file.write(title + "\n");
					file.write(content + "\n");
					file.close(); // stream을 닫는다.
					JOptionPane.showMessageDialog(f, "일기저장완료");
				} catch (IOException e) {
					// 대처할 내용 쓰면 됨.!
					System.out.println("에러발생함.");
					e.printStackTrace(); // 자세하게 에러정보도볼 수 있음.
				}

			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}