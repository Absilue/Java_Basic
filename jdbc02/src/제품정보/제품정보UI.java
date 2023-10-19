package 제품정보;

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
import 게시판정보.BbsDAO;

public class 제품정보UI {
	public static void main(String[] args) {
		// 필요한 부품들을 RAM에 가져와야함

		// JFrame
		JFrame f = new JFrame();
		f.setSize(500, 1100);
		f.setTitle("제품 정보");
		f.getContentPane().setBackground(Color.orange);

		// FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		// Font
		Font font = new Font("긱블말랑이체", Font.BOLD, 40);

		// JLabel 5개
		JLabel l1 = new JLabel("제품 코드 : ");
		JLabel l2 = new JLabel("제품명 : ");
		JLabel l3 = new JLabel("제품 내용 : ");
		JLabel l4 = new JLabel("제품 가격 : ");
		JLabel l5 = new JLabel("제조 회사 : ");
		JLabel l6 = new JLabel("제품 이미지 : ");

		// JTextfield 4개
		JTextField t1 = new JTextField(10); // 10은 글자수
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		JTextField t5 = new JTextField(10);
		JTextField t6 = new JTextField(10);

		// JButton 2개
		JButton b1 = new JButton("제품 추가");
		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
		JButton b2 = new JButton("제품 검색");
		b2.setBackground(Color.cyan);
		b2.setForeground(Color.white);
		JButton b3 = new JButton("제품 내용 변경");
		b3.setBackground(Color.PINK);
		b3.setForeground(Color.white);
		
		// 적용
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		l6.setFont(font);

		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		t5.setFont(font);
		t6.setFont(font);

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		f.add(l1); // ID
		f.add(t1);
		f.add(l2); // 제품 이름
		f.add(t2);
		f.add(l3); // 제품 내용
		f.add(t3);
		f.add(l4); // 가격
		f.add(t4);
		f.add(l5); // 제조 회사
		f.add(t5);
		f.add(l6); // 제품 이미지
		f.add(t6);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// b1을 클릭했을 때 처리내용을 넣어줌 - 제품 추가

				// 1. 입력한 값을 가지고 온다
				String id = t1.getText();
				String name = t2.getText();
				String content = t3.getText();
				String price = t4.getText();
				String company = t5.getText();
				String img = t6.getText();

				// 2. db 처리하는 부품 사용
				ProductDAO dao = new ProductDAO();
				int price1 = Integer.parseInt(price);

				// 3. db 처리하는 부품에 입력한 값을 주면서 db해달라고 요청
				dao.insert(id, name, content, price1, company, img);
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// b2를 클릭했을 때 처리내용을 넣어줌 - 제품 검색 요청

				// 1. 검색하고 싶은 id를 입력받아 저장
				String no = JOptionPane.showInputDialog("검색할 상품 코드를 입력하세요");

				// 2. ProductDAO를 사용
				ProductDAO dao = new ProductDAO();

				// 3. one(id) 호출, id를 주면서 row 하나 검색 요청
				int no2 = Integer.parseInt(no);
				ProductVO bag = dao.one(no2);
				JOptionPane.showConfirmDialog(f, bag);

			}
		});
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// b2를 클릭했을 때 처리내용을 넣어줌 - 제품 내용 변경

				// 1. 검색하고 싶은 id를 입력받아 저장
				String id = JOptionPane.showInputDialog("수정할 제품 코드를 입력하세요");
				String name = JOptionPane.showInputDialog("수정할 제품명을 입력하세요");
				String content = JOptionPane.showInputDialog("수정할 제품 내용을 입력하세요");
				String price = JOptionPane.showInputDialog("수정할 제품 가격을 입력하세요");
				String company = JOptionPane.showInputDialog("수정할 제조 회사를 입력하세요");
				String img = JOptionPane.showInputDialog("수정할 제품 이미지를 입력하세요");

				// 2. ProductDAO를 사용
				ProductDAO dao = new ProductDAO();
				
				// 3. ProductVO를 사용 - 가방 만들고 가져오기
				ProductVO bag = new ProductVO();
				bag.setId(id);
				bag.setName(name);
				bag.setContent(content);
				bag.setPrice(Integer.parseInt(price));
				bag.setCompany(company);
				bag.setImg(img);
				
				// 4. ProductDAO의 insert 요청
				dao.update(bag);

			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
