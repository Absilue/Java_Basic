package 게시판정보;

import javax.swing.JOptionPane;

import db연결.MemberDAO;

public class 게시판정보UI테스트 {
	public static void main(String[] args) {
			String id = JOptionPane.showInputDialog("아이디 입력");
			String pw = JOptionPane.showInputDialog("비밀번호 입력");
			String name = JOptionPane.showInputDialog("이름 입력");
			String tel = JOptionPane.showInputDialog("전화번호 입력");
			
			// shop db에 member 테이블에 insert
			MemberDAO dao = new MemberDAO();
			dao.insert(id, pw, name, tel);
	}
}
