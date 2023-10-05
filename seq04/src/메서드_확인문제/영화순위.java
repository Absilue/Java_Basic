package 메서드_확인문제;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 영화순위 {

	public static int start = 2;
	
	public static void main(String[] args) {
		
		String [] title = { "화란", "마녀", "헌트", "화사한 그녀", "쿵푸허슬2"};
		String [] image = { "1위.jpg", "2위.jpg", "3위.jpg", "4위.jpg", "5위.jpg"};
		double [] point = {95.4, 90.1, 89.8, 86.2, 81.8};
		// System.out.println(title[0] + " " + image[0] + " " + point[0]);
		
		
		JFrame f = new JFrame("영화 순위");
		f.setSize(420, 500);
		
		// 라벨 3개, 버튼 2개
		// 폰트
		
		Font font = new Font("긱블말랑이체", 1, 40);
		
		JLabel top = new JLabel("제목 : " + title[2] );
		ImageIcon icon = new ImageIcon(image[2]);
		JLabel center = new JLabel("이미지 :" + image[2]);
		JLabel under = new JLabel("평점 : " + point[2]  + "점");
		
		JButton left = new JButton("<<");
		JButton right = new JButton(">>");
		
		top.setFont(font);
		center.setIcon(icon);
		under.setFont(font);
		left.setFont(font);
		right.setFont(font);
		
		// 가운데 정렬 설정
        top.setHorizontalAlignment(JLabel.CENTER);
        under.setHorizontalAlignment(JLabel.CENTER);
		
		f.getContentPane().setBackground(Color.ORANGE);
		// Jlabel은 setBackground 명령어가 적용되지 않으므로 getContentPane으로 통째로 염색
		top.setForeground(Color.DARK_GRAY);
		under.setForeground(Color.DARK_GRAY);
		left.setBackground(Color.CYAN);
		right.setBackground(Color.CYAN);
		
		f.add(top, BorderLayout.NORTH);
		f.add(center, BorderLayout.CENTER);
		f.add(under, BorderLayout.SOUTH);
		f.add(left, BorderLayout.WEST);
		f.add(right, BorderLayout.EAST);
		
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (start>0) {
					start--; //1
					top.setText("제목 : " + title[start]);
					under.setText("평점 : " + point[start]  + "점");
					ImageIcon icon = new ImageIcon(image[start]);
					center.setIcon(icon);
				}else {
					top.setText("마지막 페이지");
					center.setIcon(new ImageIcon("왼쪽.jpg"));
					under.setText(">>버튼 누르세요");
				}

				
				
			}
		});
		
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (start < title.length-1) {
					start++; //3
					top.setText("제목 : " + title[start]);
					under.setText("평점 : " + point[start] + "점");
					ImageIcon icon = new ImageIcon(image[start]);
					center.setIcon(icon);
				}else {
					top.setText("마지막 페이지");
					center.setIcon(new ImageIcon("오른쪽.jpg"));
					under.setText("<<버튼 누르세요");
				}
				
				
			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
}
}