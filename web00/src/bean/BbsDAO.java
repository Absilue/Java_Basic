package bean;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BbsDAO {
	// member table에 CRUD 작업을 하고 싶으면 MemberDAO를 사용하면 됨
	// DAO : db access object
	// shop db member 테이블에 접근해서 처리하는 객체
	
	Connection con = null;
	
	public BbsDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 커넥터 연결 성공");
			// 외부 자원연결(db, network, cpu, file)을 가져올때 오류가 발생할 수 있음
			// 이때 발생할 오류를 어떻게 대처할지를 반드시 작성해야함

			// 2. 1번 설정을 커넥터로 db 연결하고 승인
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 파일을 찾을 수 없음");
		} catch (SQLException e) {
			System.out.println("mySQL 연결 문제 발생");
		}
	}

	public void insert(String title, String content, String writer) {

		// 1. 연결할 부품 (커넥터, driver) 설정
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into bbs values (null, ?, ?, ?)";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, title); // 1번 ?에 title 값을 넣어줘
			ps.setString(2, content); // 2번 ?에 content 값을 넣어줘
			ps.setString(3, writer); // 3번 ?에 writer 값을 넣어줘

			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			ps.execute();
			System.out.println("4. sql문 mySQL로 전송 성공");

		} catch (Exception e) {
			e.printStackTrace(); // 에러정보를 추적해서 프린트
			System.out.println("에러 발생");
		}
	}

	public void delete(int no) {

		// 1. 연결할 부품 (커넥터, driver) 설정
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "delete from bbs where no = ?";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setInt(1, no); // 1번 ?에 no 값을 넣어줘

			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			ps.execute();
			System.out.println("4. sql문 mySQL로 전송 성공");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 발생");
		}
	}

	public void update(String title, String content, int no) {

		// 1. 연결할 부품 (커넥터, driver) 설정
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "update bbs set title = ?, content = ? where no = ? ";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, title); // 1번 ?에 title 값을 넣어줘
			ps.setString(2, content); // 2번 ?에 content 값을 넣어줘
			ps.setInt(3, no); // 3번 ?에 no 값을 넣어줘
			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			ps.execute();
			System.out.println("4. sql문 mySQL로 전송 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 발생");
		}
	}

	public void one(int no) {

		// 1. 연결할 부품 (커넥터, driver) 설정
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "select * from bbs where no = ?";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setInt(1, no); // 1번 ?에 no값을 넣어줘

			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			ResultSet table = ps.executeQuery();
			// table로부터 mysql로 데이터를 받아옴

			System.out.println("4. sql문 mySQL로 전송 성공");

			if (table.next()) {
				// table안에 검색결과인 row가 있는지 체크
				// 결과가 있으면 true / 없으면 false로 출력
				int no2 = table.getInt("no");
				String title = table.getString("title");
				String content = table.getString("content");
				String writer = table.getString("writer");
				System.out.println("검색을 요청한 no는 " + no2 + "입니다");
				System.out.println("검색을 요청한 title은 " + title + "입니다");
				System.out.println("검색을 요청한 content는 " + content + "입니다");
				System.out.println("검색을 요청한 writer는 " + writer + "입니다");
			} else {
				System.out.println("검색결과가 존재하지 않습니다");
			}

		} catch (Exception e) {
			e.printStackTrace(); // 에러정보를 추적해서 프린트
			System.out.println("에러 발생");
		}
	}
	
	public void insert(BbsVO bag) {

		// 1. 연결할 부품 (커넥터, driver) 설정
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into bbs values (null, ?, ?, ?)";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, bag.getTitle()); // 1번 ?에 title 값을 넣어줘
			ps.setString(2, bag.getContent()); // 2번 ?에 content 값을 넣어줘
			ps.setString(3, bag.getWriter()); // 3번 ?에 writer 값을 넣어줘

			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			ps.execute();
			System.out.println("4. sql문 mySQL로 전송 성공");

		} catch (Exception e) {
			e.printStackTrace(); // 에러정보를 추적해서 프린트
			System.out.println("에러 발생");
		}
	}
}
