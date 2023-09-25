package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {
		// 필요한 부품을 ram에 가져다 놓아야 함
		
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		// 버튼들의 배치가 자연스럽게 해주는 명령어
		
		f.setSize(300, 300);
		f.getContentPane().setBackground(Color.orange);
		// Frame의 배경색을 지정
		
		JButton plus = new JButton();
		plus.setText("더하기");
		
		JButton minus = new JButton();
		minus.setText("빼  기");
		
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
		
		Font font = new Font("긱블말랑이체", 1, 30);
		//font - 글자 스타일 담당("글자체", 진하게 여부, 글자크기)
		plus.setFont(font);
		plus.setBackground(Color.pink);
		minus.setFont(font);
		minus.setBackground(Color.pink);
		l1.setFont(font);
		t1.setFont(font);
		t1.setBackground(Color.cyan);
		t2.setForeground(Color.DARK_GRAY);
		l2.setFont(font);
		t2.setFont(font);
		t2.setBackground(Color.cyan);
		//t2 영역의 배경색을 지정
		t2.setForeground(Color.DARK_GRAY);
		// t2 영역의 글자색을 지정
		
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


		
		f.setVisible(true);
		// 위에 설정한 옵션들을 보이게 하는 명령어
		// 설정들은 모두 setVisile 위에 위치해야 함
	}

}
