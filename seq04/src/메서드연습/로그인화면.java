package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(450, 700);
		f.setTitle("로그인 화면");
		FlowLayout flow = new FlowLayout();
		Font font = new Font("긱블말랑이체", 1, 50);

		JLabel top = new JLabel();
		// top.setText("<<<이미지 들어가는 곳>>>");
		JLabel id1 = new JLabel();
		id1.setText("ID : ");
		JLabel pw1 = new JLabel();
		pw1.setText("PW : ");

		JTextField id2 = new JTextField(10);
		JTextField pw2 = new JTextField(10);
		// 최대 입력 가능한 글자수를 제한하는 명령어
		id2.setBackground(Color.pink);
		pw2.setBackground(Color.pink); // 배경색
		id2.setForeground(Color.black);
		id2.setForeground(Color.black); // 글자색

		JButton login = new JButton();
		login.setText("로그인");
		login.setBackground(Color.CYAN);
		login.setOpaque(true); // true 불투명
		login.setBorderPainted(false); // 테두리 없애기
		JButton reset = new JButton();
		reset.setText("리셋");
		reset.setBackground(Color.CYAN);
		reset.setOpaque(true); // true 불투명
		reset.setBorderPainted(false); // 테두리 없애기

		top.setFont(font);
		id1.setFont(font);
		id2.setFont(font);
		pw1.setFont(font);
		pw2.setFont(font);
		login.setFont(font);
		reset.setFont(font);

		f.setLayout(flow);
		ImageIcon icon1 = new ImageIcon("22.jpg");
		ImageIcon icon2 = new ImageIcon("로그인버튼.jpg");
		ImageIcon icon3 = new ImageIcon("리셋버튼.jpg");
		top.setIcon(icon1);
		f.add(top);
		f.add(id1); // 라벨
		f.add(id2); // 텍스트 필드
		f.add(pw1); // 라벨
		f.add(pw2); // 텍스트 필드
		f.add(login); // 로그인 버튼
		f.add(reset); // 리셋 버튼
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// login 버튼을 눌렀을 때 실행할 내용을 입력
				// 버튼 하나당 함수 하나로 매칭
				System.out.println("로그인 버튼을 누르셨습니다");
				
				String id3= id2.getText();
				String pw3= pw2.getText();
				
				if (id3.equals("root") && pw3.equals("1234")) {
					System.out.println("로그인 성공");
					JOptionPane.showMessageDialog(f, "로그인 성공 일기장이 열립니다");
					일기쓰기화면 diary = new 일기쓰기화면();
					diary.open();
					// 정식코드는 아닌데 주석형태로 이렇게 진행할 것이라고 적어둠
					// 가짜코드 ==> 의사코드(수도코드)
				}else {
					System.out.println("로그인 실패");
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
			}
		});
		
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// reset 버튼을 눌렀을 때 실행할 내용을 입력
				// 버튼 하나당 함수 하나로 매칭
				System.out.println("리셋 버튼을 누르셨습니다");
				id2.setText(" ");
				pw2.setText(" ");
			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// x를 눌렀을때 자바가 종료되게 명령
		f.setVisible(true);
	}

}
