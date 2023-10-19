package 게시판정보;

import javax.swing.JOptionPane;

import db연결.MemberDAO;

public class 게시판정보UI테스트 {
	public static void main(String[] args) {
			String id = JOptionPane.showInputDialog("아이디 입력");
			String title = JOptionPane.showInputDialog("게시판 제목 입력");
			String content = JOptionPane.showInputDialog("게시판 내용 입력");
			String writer = JOptionPane.showInputDialog("게시판 작성자 입력");
			
			// shop db에 bbs 테이블에 insert
			BbsDAO dao = new BbsDAO();
			
			// dao에 전달할 데이터를 가방을 만들고, 다 넣은 다음 가방을 전달
			
			// 1. 가방 만들기
			BbsVO bag = new BbsVO();
			
			// 2. 가방에 넣기
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer);
			
			dao.insert(bag);
			//  dao.insert(id, title, content, writer);
	}
}
