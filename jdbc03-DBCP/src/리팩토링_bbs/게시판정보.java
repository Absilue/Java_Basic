package 리팩토링_bbs;

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

import 리팩토링_bbs.BbsDAO;
import 리팩토링_member.MemberDAO;

public class 게시판정보 {
	public static void main(String[] args) {
		// 필요한 부품들을 RAM에 가져와야함
		
		// JFrame
		JFrame f = new JFrame();
		f.setSize(400, 800);
		f.setTitle("게시판");
		f.getContentPane().setBackground(Color.lightGray);
		
		// FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// Font
		Font font = new Font("긱블말랑이체", Font.BOLD, 40);
		
		// JLabel 5개
		JLabel l1 = new JLabel("<<<게시판>>>");
		JLabel l2 = new JLabel("게시판 제목 : ");
		JLabel l3 = new JLabel("게시판 내용 : ");
		JLabel l4 = new JLabel("게시판 작성자 : ");
		
		// JTextfield 4개
		JTextField t1 = new JTextField(10); // 10은 글자수
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		
		// JButton 2개
		JButton b1 = new JButton("게시물 작성 완료");
		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
		JButton b2 = new JButton("게시물 삭제 완료");
		b2.setBackground(Color.cyan);
		b2.setForeground(Color.white);
		JButton b3 = new JButton("게시물 수정 완료");
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		JButton b4 = new JButton("게시물 정보 검색");
		b4.setBackground(Color.pink);
		b4.setForeground(Color.white);
		
		// 적용
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		f.add(l1); // 게시판
		f.add(l2); // 게시판 제목
		f.add(t1); 
		f.add(l3); // 게시판 내용
		f.add(t2);
		f.add(l4); // 게시판 작성자
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b1을 클릭했을 때 처리내용을 넣어줌
				
				// 1. 입력한 값을 가지고 온다
				String title = t1.getText();
				String content = t2.getText();
				String writer = t3.getText();
				
				// 2. db 처리하는 부품 사용
				BbsDAO dao = new BbsDAO();
				
				// 3. db 처리하는 부품에 입력한 값을 주면서 db해달라고 요청
				dao.insert(title, content, writer);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b2를 클릭했을 때 처리내용을 넣어줌 - 게시물 삭제
				
				// 1. 삭제할 게시물의 no를 가져온다
				String no = JOptionPane.showInputDialog("삭제할 게시물의 no를 입력하세요");
				
				// 2. dao에 연결
				BbsDAO dao = new BbsDAO();
				int no1 = Integer.parseInt(no);
				
				// 3. id를 연결하여 delete
				dao.delete(no1);
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b3을 클릭했을 때 처리내용을 넣어줌 - 게시물 수정 완료
				
				// 1. 입력한 값 2개를 가져와서 저장
				String no = JOptionPane.showInputDialog("수정할 게시물의 no를 입력하세요");
				String title = JOptionPane.showInputDialog("수정할 Title을 입력하세요");
				String content = JOptionPane.showInputDialog("수정할 Content를 입력하세요");
				// 2.  dao를 이용해서 db 처리
				BbsDAO dao = new BbsDAO();
				int no1 = Integer.parseInt(no);
				// 3. sql문 전송
				dao.update(title, content, no1);
			}				
		});
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b4을 클릭했을 때 처리내용을 넣어줌 - 게시판 검색 요청
				
				// 1. 검색하고 싶은 id를 입력받아 저장
				String no = JOptionPane.showInputDialog("검색할 게시판 no를 입력하세요");
				
				// 2. MemberDAO를 사용
				BbsDAO dao = new BbsDAO();
				
				// 3. one(id) 호출, id를 주면서 row 하나 검색 요청
				dao.one(Integer.parseInt(no));
				
			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
