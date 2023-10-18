package 회원정보;

import javax.swing.JOptionPane;

import db연결.MemberDAO;

public class 회원정보UI테스트 {
	public static void main(String[] args) {
			String id = JOptionPane.showInputDialog("아이디 입력");
			String title = JOptionPane.showInputDialog("게시판 제목 입력");
			String content = JOptionPane.showInputDialog("게시판 내용 입력");
			String writer = JOptionPane.showInputDialog("게시판 작성자 입력");
			
			// shop db에 member 테이블에 insert
			MemberDAO dao = new MemberDAO();
			dao.insert(id, title, content, writer);
	}
}
