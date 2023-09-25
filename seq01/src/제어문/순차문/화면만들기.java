package 제어문.순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class 화면만들기 {

	public static void main(String[] args) {
		// JFrame f
		// JButton b
		// JTextField t1
		// JTextField t2
		// JTextField t3
		
		JFrame f = new JFrame();
		// 램 저장공간 f, 새로운 부품의 틀 이름 JFrame
		f.setSize(500, 500);
		// JFrame의 크기를 조절하는 명령어
		
		JButton b = new JButton();
		
		FlowLayout flow = new FlowLayout();
		//배치해주는 부품을 따로 설정하지 않으면 다 가운데로 들어가버림
		//물흐르듯이 순서대로 배치해주는 부품을 써야함
		f.setLayout(flow);
		
		b.setText("나의 정보 확인");
		
		f.add(b);
		// f에 b를 올리는 명령어
		
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		
		f.setVisible(true);
		// JFrame이 보이도록 하는 명령어
		// 위에서부터 순서대로 실행되므로 f.add 명령어를 표현하기 위해서는
		// f.add가 f.setVisible 보다 위에 있어야 함
	}

}
