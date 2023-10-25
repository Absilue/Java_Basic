package bean;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	// member table에 CRUD 작업을 하고 싶으면 MemberDAO를 사용하면 됨
	// DAO : db access object
	// shop db member 테이블에 접근해서 처리하는 객체

	Connection con;
	// 클래스 바로 아래에 만들어주면 class 전체영역에서 사용 가능
	// 전역변수(글로벌 변수)

	DBConnectionMgr dbcp; // null
	
	// new를 이용해서 객체 생성시 class이름과 동일한 메서드가 있으면 자동 실행
	// 다른 클래스에서  private MemberDAO dao = new MemberDAO();
	// 생성자에 private을 붙여 놓으면 외부 자바파일에서 객체생성 불가능
	
	public MemberDAO() {
		// 객체 생성시 자동호출 되는 메서드(생성자)
		// JDBC 1~2단계
		
		try {
			dbcp = DBConnectionMgr.getInstance();
			con = dbcp.getConnection();  // 임대
		} catch (Exception e) {
			System.out.println("에러 발생");
		}
	}

	public MemberVO one(String id) {
		MemberVO bag = new MemberVO();
		
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "select * from member where id = ?";

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
				
			} dbcp.freeConnection(con, ps, table); // 반납

		} catch (Exception e) {
			System.out.println("에러 발생");
		}
		return bag;
		// return 과 void는 동시에 사용 X
		// void 대신에 MemberVO 사용
	}

	public void insert(String id, String pw, String name, String tel) {
		// Java-DB연결 (JDBC) ==> 4단계의 과정을 거침

		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into member values (?, ?, ?, ?) ";

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
			dbcp.freeConnection(con,ps);
		} catch (Exception e) {
			// Exception == error
			e.printStackTrace(); // 에러정보를 추적해서 프린트
			System.out.println("에러 발생");
		}
	}

	public int delete(String id) {
		int result = 0;
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "delete from member where id = ?";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, id); // 1번 ?에 id 값을 넣어줘

			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			ps.execute();
			System.out.println("4. sql문 mySQL로 전송 성공");
			dbcp.freeConnection(con,ps);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 발생");
		}
		return result;
	}

	public int update(String tel, String id) {
		int result = 0;
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "update member set tel = ? where id = ? ";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, tel); // 1번 ?에 tel 값을 넣어줘
			ps.setString(2, id); // 2번 ?에 id 값을 넣어줘
			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			result = ps.executeUpdate();
			System.out.println("4. sql문 mySQL로 전송 성공");
			dbcp.freeConnection(con,ps);
		} catch (Exception e) {
			// Exception == error
			e.printStackTrace(); // 에러정보를 추적해서 프린트
			System.out.println("에러 발생");
		}
		return result;
	}

	public int insert(MemberVO bag) {
		System.out.println(bag);
		int result = 0;
		
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into member values (?, ?, ?, ?)";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, bag.getId()); // 1번 ?에 id 값을 넣어줘
			ps.setString(2, bag.getPw()); // 2번 ?에 pw 값을 넣어줘
			ps.setString(3, bag.getName()); // 3번 ?에 name 값을 넣어줘
			ps.setString(4, bag.getTel()); // 4번 ?에 tel 값을 넣어줘

			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			result = ps.executeUpdate(); // int

			// table로부터 mysql로 데이터를 받아옴
			System.out.println("4. sql문 mySQL로 전송 성공");
			dbcp.freeConnection(con,ps);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 발생");
		}
		return result;
	}
	
	public ArrayList<MemberVO> list() {
		ArrayList<MemberVO> list = new ArrayList<>();
	
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "select * from member";

			PreparedStatement ps = con.prepareStatement(sql); //

			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			ResultSet table = ps.executeQuery();
			// table로부터 mysql로 데이터를 받아옴

			System.out.println("4. sql문 mySQL로 전송 성공");

			while (table.next()) {
				// 1. 가방을 만들기
				// 2. table에서 한행씩 꺼내서 가방에 넣기
				// 3. 데이터가 들어있는 가방을 list에 넣기
				
				MemberVO bag = new MemberVO();
				
				bag.setId(table.getString("id"));
				bag.setPw(table.getString("pw"));
				bag.setName(table.getString("name"));
				bag.setTel(table.getString("tel"));
				
				list.add(bag);
				
			} dbcp.freeConnection(con, ps, table); // 반납

		} catch (Exception e) {
			System.out.println("에러 발생");
		}
		return list;
		// return 과 void는 동시에 사용 X
		// void 대신에 MemberVO 사용
	}
}
