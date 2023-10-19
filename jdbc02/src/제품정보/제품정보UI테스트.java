package 제품정보;

import javax.swing.JOptionPane;

import db연결.MemberDAO;

public class 제품정보UI테스트 {
	public static void main(String[] args) {
			String id = JOptionPane.showInputDialog("제품 코드 입력");
			String name = JOptionPane.showInputDialog("제품명 입력");
			String content = JOptionPane.showInputDialog("제품 내용 입력");
			String price = JOptionPane.showInputDialog("제품 가격 입력");
			String company = JOptionPane.showInputDialog("제조 회사 입력");
			String img = JOptionPane.showInputDialog("제품 이미지 입력");
			
			// shop db에 product 테이블에 insert
			ProductDAO dao = new ProductDAO();
			
			// dao에 전달할 데이터를 가방을 만들고, 다 넣은 다음 가방을 전달
			
			// 1. 가방 만들기
			ProductVO bag = new ProductVO();
			int price2 = Integer.parseInt(price);
			
			// 2. 가방에 넣기
			bag.setId(id);
			bag.setName(name);
			bag.setContent(content);
			bag.setPrice(price2);
			bag.setCompany(company);
			bag.setImg(img);
			
			// 3. 가방을 전달
			dao.insert(bag);
	}
}
