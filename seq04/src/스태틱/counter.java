package 스태틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class counter {
	public static int count;
	// 전역변수로 0으로 초기화
	
	public static void main(String[] args) {
		JFrame f = new JFrame("카운터 프로그램");
		f.setSize(400, 300);
		 
		// FlowLayout flow = new FlowLayout();
		f.setLayout(new FlowLayout());
		// 한번만 사용할 변수는 new를 사용할 필요 없이 바로 만들어서 사용해도 상관X
		
		Font font = new Font("긱블말랑이체", 1 , 15);
		
		JButton plus = new JButton("1 더하기");
		JButton minus = new JButton("1 빼기");
		JButton reset = new JButton("0으로 초기화");
		JLabel num = new JLabel("0");
		
		plus.setFont(font);
		minus.setFont(font);
		reset.setFont(font);
		num.setFont(new Font("긱블말랑이체", 1, 150));
		// 한번만 사용할 변수는 new를 사용할 필요 없이 바로 만들어서 사용해도 상관X
		num.setForeground(Color.red);
		
		plus.setBackground(Color.cyan);
		minus.setBackground(Color.cyan);
		reset.setBackground(Color.green);
		
		f.add(plus);
		f.add(minus);
		f.add(reset);
		f.add(num);
		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				num.setText(count + " ");
				// or String.valueof();를 이용해 데이터를 String으로 변경
			}
		});
		
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				num.setText(count + " ");
				// or String.valueof();를 이용해 데이터를 String으로 변경
			}
		});
		
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				num.setText(count + " ");
				// or String.valueof();를 이용해 데이터를 String으로 변경
			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		}
	}
