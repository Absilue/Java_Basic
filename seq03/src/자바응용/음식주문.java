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

public class 음식주문 {
	
	static int food_count = 0;
	static int total_pay = 0;
	static int a_count=0;
	static int b_count=0;
	static int c_count=0;
	// main 외부에서 변수를 만들면 전체 { }안에서 해당 변수를 사용이 가능

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.setSize(500, 600);
		f.getContentPane().setBackground(Color.red);
		// Frame의 배경색을 지정
		
		JButton a = new JButton();
		a.setText("짬뽕");
		// 짬뽕은 9000원
		
		JButton b = new JButton();
		b.setText("우동");
		// 우동은 7000원
		
		JButton c = new JButton();
		c.setText("짜장");
		// 짜장은 8000원
		
		JLabel count = new JLabel();
		// 글자 넣는 부품은 JLabel
		count.setText("개수 : 0개");
		
		JLabel total = new JLabel();
		// 글자 넣는 부품은 JLabel
		total.setText("결제 금액");
		
		JLabel food_c = new JLabel();
		food_c.setText("주문 내역");
		
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
		count.setForeground(Color.black);
		// 글자색을 바꾸는 명령어
		food_c.setFont(font);
		food_c.setForeground(Color.black);
		total.setFont(font);
		total.setForeground(Color.black);
		
		f.add(a);
		f.add(b);
		f.add(c);
		f.add(count);
		f.add(img);
		f.add(food_c);
		f.add(total);
		

		
		// 짬뽕 버튼을 눌렀을 때
		a.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("짬뽕을 선택하셨습니다");
				food_count++;
				total_pay++;
				a_count++;
				int total_food = (a_count * 9000) + (b_count * 7000) +(c_count *8000);
				food_c.setText("짬뽕 : " + a_count + " 우동 : " + b_count + " 짜장 : " +c_count);
				count.setText("개수 : " + food_count + "개");
				total.setText("결제금액은 " + total_food + "원 입니다");
			}
		});
		
		// 우동 버튼을 눌렀을 때
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("우동을 선택하셨습니다");
				food_count++;
				total_pay++;
				b_count++;
				
				int total_food = (a_count * 9000) + (b_count * 7000) +(c_count *8000);
				food_c.setText("짬뽕 : " + a_count + " 우동 : " + b_count + " 짜장 : " +c_count);
				count.setText("개수 : " + food_count + "개");
				total.setText("결제금액은 " + total_food + "원 입니다");
			}
		});
		
		
		// 짬뽕 버튼을 눌렀을 때
		c.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("짜장을 선택하셨습니다");
				food_count++;
				total_pay++;
				c_count++;
				
				int total_food = (a_count * 9000) + (b_count * 7000) +(c_count *8000);
				food_c.setText("짬뽕 : " + a_count + " 우동 : " + b_count + " 짜장 : " +c_count);
				count.setText("개수 : " + food_count + "개");
				total.setText("결제금액은 " + total_food + "원 입니다");
			}
		});
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// X버튼을 눌렀을때 자바 프로그램을 끄는 명령어
		// 이 명령어가 없으면 X를 눌러도 백그라운드에서 계속 자바 프로그램이 실행되고 있음
		
		f.setVisible(true);
	}

}
