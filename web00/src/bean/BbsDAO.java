package bean;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BbsDAO {
	// member table에 CRUD 작업을 하고 싶으면 MemberDAO를 사용하면 됨
	// DAO : db access object
	// shop db member 테이블에 접근해서 처리하는 객체
	
	Connection con = null;
	
	DBConnectionMgr dbcp; // null
	
	public BbsDAO() {
		try {
			dbcp = DBConnectionMgr.getInstance();
			con = dbcp.getConnection();  // 임대
		} catch (Exception e) {
			System.out.println("에러 발생");
		}
	}

	public void insert(String title, String content, String writer) {

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

	public int delete(int no) {
		int result = 0;

		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "delete from bbs where no = ?";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setInt(1, no); // 1번 ?에 no 값을 넣어줘

			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			result = ps.executeUpdate();
			System.out.println("4. sql문 mySQL로 전송 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 발생");
		}
		return result;
	}

	public int update(String title, String content, int no) {
		int result = 0;

		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "update bbs set title = ?, content = ? where no = ? ";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, title); // 1번 ?에 title 값을 넣어줘
			ps.setString(2, content); // 2번 ?에 content 값을 넣어줘
			ps.setInt(3, no); // 3번 ?에 no 값을 넣어줘
			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			result = ps.executeUpdate();
			System.out.println("4. sql문 mySQL로 전송 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 발생");
		}
		return result;
	}

	public BbsVO one(int no) {
		BbsVO bag = new BbsVO();
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
				bag.setNo(no2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
			} else {
				System.out.println("검색결과가 존재하지 않습니다");
			}

		} catch (Exception e) {
			e.printStackTrace(); // 에러정보를 추적해서 프린트
			System.out.println("에러 발생");
		}
		return bag;
	}
	
	public void insert(BbsVO bag) {

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
	
	public ArrayList<BbsVO> list() {
		ArrayList<BbsVO> list = new ArrayList<>();
	
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "select * from bbs";

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
				
				BbsVO bag = new BbsVO();
				
				bag.setNo(table.getInt(1));
				bag.setTitle(table.getString(2));
				bag.setContent(table.getString(3));
				bag.setWriter(table.getString(4));
				
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
