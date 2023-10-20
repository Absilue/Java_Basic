package 리팩토링_member;

import javax.swing.JOptionPane;

import 리팩토링_member.MemberDAO;
import 리팩토링_member.MemberVO;

public class 회원정보UI테스트 {
	public static void main(String[] args) {
			String id = JOptionPane.showInputDialog("아이디 입력");
			String pw = JOptionPane.showInputDialog("비밀번호 입력");
			String name = JOptionPane.showInputDialog("이름 입력");
			String tel = JOptionPane.showInputDialog("전화번호 입력");
			
			// shop db에 member 테이블에 insert
			MemberDAO dao = new MemberDAO();
			
			// dao에 전달할 데이터를 가방을 만들고, 다 넣은 다음 가방을 전달
			
			// 1. 가방 만들기
			MemberVO bag = new MemberVO();
			
			// 2. 가방에 넣기
			bag.setId(id);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
			
			// 3. 가방을 전달
			dao.insert(bag);
			// dao.insert(id, pw, name, tel);
	}
}
