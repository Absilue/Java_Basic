package db연결;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import 회원정보.MemberVO;

public class MemberDAO {
	// member table에 CRUD 작업을 하고 싶으면 MemberDAO를 사용하면 됨
	// DAO : db access object
	// shop db member 테이블에 접근해서 처리하는 객체

	public void insert(String id, String pw, String name, String tel) {
		// Java-DB연결 (JDBC) ==> 4단계의 과정을 거침

		// 1. 연결할 부품 (커넥터, driver) 설정
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 커넥터 연결 성공");
			// 외부 자원연결(db, network, cpu, file)을 가져올때 오류가 발생할 수 있음
			// 이때 발생할 오류를 어떻게 대처할지를 반드시 작성해야함

			// forName(패키지.대표클래스)

			// 2. 1번 설정을 커넥터로 db 연결하고 승인
			// 1) url - ip + port + db명
			// 2) id, pw
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공");

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into member values (?, ?, ?, ?) ";
			String site = "http://www.naver.com";

			// 해당 부품으로 만들어줘야 함
			// sql ==> PreparedStatement
			// site ==> url
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, id); // 1번 ?에 id 값을 넣어줘
			ps.setString(2, pw); // 2번 ?에 pw 값을 넣어줘
			ps.setString(3, name); // 3번 ?에 name 값을 넣어줘
			ps.setString(4, tel); // 4번 ?에 tel 값을 넣어줘

			System.out.println("3. sql문 생성 성공");

			// URL site = new // URL();

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			ps.execute();
			System.out.println("4. sql문 mySQL로 전송 성공");

		} catch (Exception e) {
			// Exception == error
			e.printStackTrace(); // 에러정보를 추적해서 프린트
			System.out.println("에러 발생");
		}
	}

	public void delete(String id) {

		// 1. 연결할 부품 (커넥터, driver) 설정
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 커넥터 연결 성공");

			// 2. 1번 설정을 커넥터로 db 연결하고 승인
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공");

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "delete from member where id = ?";
			String site = "http://www.naver.com";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, id); // 1번 ?에 id 값을 넣어줘

			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			ps.execute();
			System.out.println("4. sql문 mySQL로 전송 성공");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 발생");
		}
	}

	public void update(String tel, String id) {

		// 1. 연결할 부품 (커넥터, driver) 설정
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 커넥터 연결 성공");

			// 2. 1번 설정을 커넥터로 db 연결하고 승인
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공");

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "update member set tel = ? where id = ? ";
			String site = "http://www.naver.com";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, tel); // 1번 ?에 tel 값을 넣어줘
			ps.setString(2, id); // 2번 ?에 id 값을 넣어줘
			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			ps.execute();
			System.out.println("4. sql문 mySQL로 전송 성공");

		} catch (Exception e) {
			// Exception == error
			e.printStackTrace(); // 에러정보를 추적해서 프린트
			System.out.println("에러 발생");
		}
	}

	public MemberVO one(String id) {
		MemberVO bag = new MemberVO();
		// 1. 연결할 부품 (커넥터, driver) 설정
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 커넥터 연결 성공");

			// 2. 1번 설정을 커넥터로 db 연결하고 승인
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공");

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "select * from member where id = ?";
			String site = "http://www.naver.com";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, id); // 1번 ?에 id 값을 넣어줘

			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			ResultSet table = ps.executeQuery();
			// table로부터 mysql로 데이터를 받아옴

			System.out.println("4. sql문 mySQL로 전송 성공");

			if (table.next()) {
				// table안에 검색결과인 row가 있는지 체크
				// 결과가 있으면 true / 없으면 false로 출력
				String id2 = table.getString("id");
				String pw = table.getString("pw");
				String name = table.getString("name");
				String tel = table.getString("tel");
				System.out.println("검색을 요청한 id는 " + id2 + "입니다");
				System.out.println("검색을 요청한 pw는 " + pw + "입니다");
				System.out.println("검색을 요청한 name은 " + name + "입니다");
				System.out.println("검색을 요청한 tel은 " + tel + "입니다");
				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
			} else {
				System.out.println("검색결과가 존재하지 않습니다");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 발생");
		}
		return bag;
		// return 과 void는 동시에 사용 X
		// void 대신에 MemberVO 사용
	}

	public int insert(MemberVO bag) {
		int result = 0;
		// 1. 연결할 부품 (커넥터, driver) 설정
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 커넥터 연결 성공");

			// 2. 1번 설정을 커넥터로 db 연결하고 승인
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공");

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into member values (?, ?, ?, ?)";
			String site = "http://www.naver.com";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, bag.getId()); // 1번 ?에 id 값을 넣어줘
			ps.setString(2, bag.getPw()); // 2번 ?에 pw 값을 넣어줘
			ps.setString(3, bag.getName()); // 3번 ?에 name 값을 넣어줘
			ps.setString(4, bag.getTel()); // 4번 ?에 tel 값을 넣어줘

			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			result = ps.executeUpdate(); //int
			
			// table로부터 mysql로 데이터를 받아옴
			System.out.println("4. sql문 mySQL로 전송 성공");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 발생");
		}
		return result;
	}
}
