package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식주문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.setSize(300, 300);
		f.getContentPane().setBackground(Color.red);
		// Frame의 배경색을 지정
		
		JButton a = new JButton();
		a.setText("짬뽕");
		
		JButton b = new JButton();
		b.setText("우동");
		
		JButton c = new JButton();
		c.setText("짜장");
		
		JLabel count = new JLabel();
		// 글자 넣는 부품은 JLabel
		count.setText("개수 : 0개");
		
		JLabel total = new JLabel();
		// 글자 넣는 부품은 JLabel
		total.setText("결제 금액");
		
		JLabel img = new JLabel();
		ImageIcon icon = new ImageIcon("js.jpg");
		img.setIcon(icon);
		
		Font font = new Font("긱블말랑이체", 1, 30);
		//font - 글자 스타일 담당("글자체", 진하게 여부, 글자크기)
		a.setFont(font);
		a.setBackground(Color.pink);
		b.setFont(font);
		b.setBackground(Color.orange);
		c.setFont(font);
		c.setBackground(Color.cyan);
		count.setFont(font);
		total.setFont(font);
		
		f.add(a);
		f.add(b);
		f.add(c);
		f.add(count);
		f.add(img);
		f.add(total);
		
		f.setVisible(true);
	}

}
