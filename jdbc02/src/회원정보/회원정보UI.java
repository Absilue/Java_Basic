package 회원정보;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import db연결.MemberDAO;

public class 회원정보UI {
	public static void main(String[] args) {
		// 필요한 부품들을 RAM에 가져와야함
		
		// JFrame
		JFrame f = new JFrame();
		f.setSize(400, 900);
		f.setTitle("네이버 회원가입");
		f.getContentPane().setBackground(Color.green);
		
		// FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// Font
		Font font = new Font("긱블말랑이체", Font.BOLD, 40);
		
		// JLabel 5개
		JLabel l1 = new JLabel("이미지 들어갈 곳");
		JLabel l2 = new JLabel("ID : ");
		JLabel l3 = new JLabel("PW : ");
		JLabel l4 = new JLabel("회원 이름 : ");
		JLabel l5 = new JLabel("회원 TEL : ");
		
		// JTextfield 4개
		JTextField t1 = new JTextField(10); // 10은 글자수
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4= new JTextField(10);
		
		// JButton 2개
		JButton b1 = new JButton("회원가입 요청");
		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
		JButton b2 = new JButton("회원탈퇴 요청");
		b2.setBackground(Color.cyan);
		b2.setForeground(Color.white);
		JButton b3 = new JButton("회원수정 요청");
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		JButton b4 = new JButton("회원검색 요청");
		b4.setBackground(Color.pink);
		b4.setForeground(Color.white);
		
		// 적용
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		f.add(l1); //이미지
		f.add(l2); // ID
		f.add(t1); 
		f.add(l3); // PW
		f.add(t2);
		f.add(l4); // 회원 이름
		f.add(t3);
		f.add(l5); // 회원 TEL
		f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b1을 클릭했을 때 처리내용을 넣어줌
				
				// 1. 입력한 값을 가지고 온다
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				
				// 2. db 처리하는 부품 사용
				MemberDAO dao = new MemberDAO();
				
				// 3. db 처리하는 부품에 입력한 값을 주면서 db해달라고 요청
				dao.insert(id, pw, name, tel);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b2를 클릭했을 때 처리내용을 넣어줌 - 회원 탈퇴
				
				// 1. 탈퇴할 id를 입력받음
				String id = JOptionPane.showInputDialog("탈퇴할 id를 입력하세요");
				
				// 2. dao에 연결
				MemberDAO dao = new MemberDAO();
				
				// 3. id를 연결하여 delete
				dao.delete(id);
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b3을 클릭했을 때 처리내용을 넣어줌 - 회원 정보 수정
				
				// 1. 입력한 값 2개를 가져와서 저장
				String id = JOptionPane.showInputDialog("수정할 ID를 입력하세요");
				String tel = JOptionPane.showInputDialog("수정할 TEL을 입력하세요");
				// 2.  dao를 이용해서 db 처리
				MemberDAO dao = new MemberDAO();
				// 3. sql문 전송
				dao.update(tel, id);
			}
		});
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b4을 클릭했을 때 처리내용을 넣어줌 - 회원 검색 요청
				
				// 1. 검색하고 싶은 id를 입력받아 저장
				String id = JOptionPane.showInputDialog("id를 입력하세요");
				
				// 2. MemberDAO를 사용
				MemberDAO dao = new MemberDAO();
				
				// 3. one(id) 호출, id를 주면서 row 하나 검색 요청
				MemberVO bag = dao.one(id);
				//JOptionPane.showConfirmDialog(f, bag);
				
				int result = dao.insert(bag); //1
				if (result == 1) {
					JOptionPane.showConfirmDialog(f, "회원가입 성공");
				}
			}
		});
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
