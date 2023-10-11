package 상속_응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.text.StyledEditorKit.BoldAction;

public class 문자판독기 extends JFrame {
	JLabel ch, words, chcount, wordscount;
	// 전역변수 설정 ==> 전역변수는 자동초기화, 참조형변수 ==> null로 초기화
	JTextArea area;
	// 아직 저장해놓은 위치 X ==> null
	JButton b1, b2, b3, b4;

	// ==> null
	public 문자판독기() {
		setTitle("문자 판독기");
		setSize(300, 700);

		ch = new JLabel("     결과 출력");
		words = new JLabel(" ");
		chcount = new JLabel(" ");
		wordscount = new JLabel(" ");

		area = new JTextArea(5, 10);
		// 세로 5줄 가로 10글자 입력 가능한 영역

		b1 = new JButton("글자 수 카운트");
		b2 = new JButton("배경색 변경");
		b3 = new JButton("글자색 변경");
		b4 = new JButton("색 변경 초기화");

		setLayout(new FlowLayout());

		Font font = new Font("긱블말랑이체", Font.BOLD, 30);
		ch.setFont(font);
		chcount.setFont(font);
		words.setFont(font);
		wordscount.setFont(font);
		area.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
        b1.setBorderPainted(false);
        b2.setBorderPainted(false);
        b3.setBorderPainted(false);
        b4.setBorderPainted(false);

		add(ch);
		add(chcount);
		add(words);
		add(wordscount);
		add(area);
		add(b1);
		add(b2);
		add(b3);
		add(b4);

		area.setBackground(Color.cyan);
		area.setForeground(Color.magenta);
		getContentPane().setBackground(Color.pink);

		chcount.setForeground(Color.WHITE);
		wordscount.setForeground(Color.WHITE);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 처리 내용
				// 모의코드(수도코드, pseudo code)
				// 입력한 문자열을 가지고 와서 저장
				String s = area.getText();

				// 글자수를 카운팅(계산)
				int num = s.length();

				// 단어수를 카운팅(계산)
				String[] s2 = s.split(" ");
				// {단어, 단어, 단어}로 끊어서 s2란 배열에 넣어줌
				int num2 = s2.length;

				// 각각의 라벨에 계산결과를 넣기
				ch.setText("입력한 글자수는 ");
				chcount.setText(num + "글자 입니다 ");
				// String.valueof(num)을 사용해도 무관
				words.setText("입력한 단어수는 ");
				wordscount.setText(num2 + "개 입니다 ");
				// String.valueof(num2)를 사용해도 무관

			}
		});
		
		// 배경색 바꾸는 기능 추가
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				Color rcolor = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
				area.setBackground(rcolor);
			}
		});
		
		// 글자색 바꾸는 기능 추가
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				Color rcolor2 = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
				area.setForeground(rcolor2);
			}
		});
		
		// 색 변경 초기화 기능 추가
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setBackground(Color.cyan);
				area.setForeground(Color.magenta);
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		문자판독기 name = new 문자판독기();
	}

}
