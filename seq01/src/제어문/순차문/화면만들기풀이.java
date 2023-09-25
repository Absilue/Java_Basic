package 제어문.순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 화면만들기풀이 {

	public static void main(String[] args) {
		
		// 1. 필요한 부품을 ram에 준비하기
		JFrame f = new JFrame();
		f.setSize(300, 300);
		
		JButton b = new JButton();
		b.setText("============클릭하시오============");
		JTextField t1 = new JTextField(20);
		JTextField t2 = new JTextField(20);
		JTextField t3 = new JTextField(20);
		// 입력하고 싶은 글자수를 JTextField( )안에 입력
		JLabel l1 = new JLabel();
		// 글자를 앞에 넣어주는 명령어
		l1.setText("이름");
		
		JLabel l2 = new JLabel();
		l2.setText("나이");
		
		JLabel l3 = new JLabel();
		l3.setText("취미");
		
		FlowLayout flow = new FlowLayout();
		
		f.setLayout(flow);
		f.add(b);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		
		// 한번에 import 해줌 - 컨트롤 + 쉬프트 + o
		
		// 2. 
		
		
		f.setVisible(true);
		// setVisible은 위에서 작업한 모든 결과물이 더해진 후 제일 마지막에 실행
	}

}
