package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//DB를 접근하여 CRUD처리만 담당하는 부품
//다른 역할을 하지 않음.
public class CompanyDAO {

	// 각각의 처리를 메서드(함수)로 만들어라.
	// 가입처리
	public int insert(CompanyDTO dto) {
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 특정한 위치에 있는 드라이버 파일을 램에 읽어들여 설정
			System.out.println("1. 드라이버 설정 성공.@@@@");

			// 2. db연결 mySQL: school, oracle: xe
			String url = "jdbc:mysql://localhost:3306/shop5?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. db연결 성공.@@@@@@");

		// 3.SQL문 결정/생성
		String sql = "insert into company2 values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getName());
		ps.setString(2, dto.getAddr());
		ps.setString(3, dto.getTel());
		ps.setString(4, dto.getDomain());
		System.out.println("3.ok----------");

		// 4.DB로 SQL문 전송
		result = ps.executeUpdate(); //1
		System.out.println("4.ok----------");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("에러가 발생함.");
		}
		return result; //1, 0
		
	}
	
}