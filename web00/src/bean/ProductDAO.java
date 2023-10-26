package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDAO {
	
	Connection con;
	DBConnectionMgr dbcp; // null
	
	public ProductDAO() {
		try {
			dbcp = DBConnectionMgr.getInstance();
			con = dbcp.getConnection();  // 임대
		} catch (Exception e) {
			System.out.println("에러 발생");
		}
	}
	
	public void insert(String id, String name, String content, int price, String company, String img) {
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into product values (?, ?, ?, ?, ?, ?) ";

			// 해당 부품으로 만들어줘야 함
			// sql ==> PreparedStatement
			// site ==> url
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, id); // 1번 ?에 id 값을 넣어줘
			ps.setString(2, name); // 2번 ?에 name 값을 넣어줘
			ps.setString(3, content); // 3번 ?에 content 값을 넣어줘
			ps.setInt(4, price); // 4번 ?에 price 값을 넣어줘
			ps.setString(5, company); // 4번 ?에 companyl 값을 넣어줘
			ps.setString(6, img); // 4번 ?에 img 값을 넣어줘

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

	public ProductVO one(String id) {
		ProductVO bag = new ProductVO();
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "select * from product where id = ?";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, id); // 1번 ?에 id값을 넣어줘

			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			ResultSet table = ps.executeQuery();
			// table로부터 mysql로 데이터를 받아옴

			System.out.println("4. sql문 mySQL로 전송 성공");

			if (table.next()) {
				// table안에 검색결과인 row가 있는지 체크
				// 결과가 있으면 true / 없으면 false로 출력
				String id2 = table.getString("id");
				String name = table.getString("name");
				String content = table.getString("content");
				int price2 = table.getInt("price");
				String company = table.getString("company");
				String img = table.getString("img");

				System.out.println("검색을 요청한 제품 코드는 " + id2 + "입니다");
				System.out.println("검색을 요청한 제품명은 " + name + "입니다");
				System.out.println("검색을 요청한 제품 내용은 " + content + "입니다");
				System.out.println("검색을 요청한 제품 가격은 " + price2 + "입니다");
				System.out.println("검색을 요청한 제조 회사는 " + company + "입니다");
				System.out.println("검색을 요청한 제품 이미지는 " + img + "입니다");
				
				bag.setId(id);
				bag.setName(name);
				bag.setContent(content);
				bag.setPrice(price2);
				bag.setCompany(company);
				bag.setImg(img);
			} else {
				System.out.println("검색결과가 존재하지 않습니다");
			}

		} catch (Exception e) {
			e.printStackTrace(); // 에러정보를 추적해서 프린트
			System.out.println("에러 발생");
		}
		return bag;
	}

	public void insert(ProductVO bag) {

		// 1. 연결할 부품 (커넥터, driver) 설정
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 커넥터 연결 성공");

			// 2. 1번 설정을 커넥터로 db 연결하고 승인
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. product db연결 성공");

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into product values (?, ?, ?, ?, ?, ?)";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, bag.getId()); // 1번 ?에 id 값을 넣어줘
			ps.setString(2, bag.getName()); // 2번 ?에 name 값을 넣어줘
			ps.setString(3, bag.getContent()); // 3번 ?에 content 값을 넣어줘
			ps.setInt(4, bag.getPrice()); // 4번 ?에 price 값을 넣어줘
			ps.setString(5, bag.getCompany()); // 5번 ?에 company 값을 넣어줘
			ps.setString(6, bag.getImg()); // 6번 ?에 img 값을 넣어줘

			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			ps.execute();
			// table로부터 mysql로 데이터를 받아옴
			System.out.println("4. sql문 mySQL로 전송 성공");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 발생");
		}
	}
	
	public int update(ProductVO bag) {
		int result = 0;

		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "update product set name = ?, content = ?, price = ?, company = ?, img = ? where id = ? ";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, bag.getName()); 
			ps.setString(2, bag.getContent());
			ps.setInt(3, bag.getPrice());
			ps.setString(4, bag.getCompany()); 
			ps.setString(5, bag.getImg());
			ps.setString(6, bag.getId());
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
	
	public int delete(String id) {
		int result = 0;
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "delete from product where id = ?";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, id); // 1번 ?에 id 값을 넣어줘

			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			result = ps.executeUpdate();
			System.out.println("4. sql문 mySQL로 전송 성공");
			dbcp.freeConnection(con,ps);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 발생");
		}
		return result;
	}
	
	
	public ArrayList<ProductVO> list() {
		ArrayList<ProductVO> list = new ArrayList<>();
	
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "select * from product";

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
				
				ProductVO bag = new ProductVO();
				
				bag.setId(table.getString(1));
				bag.setName(table.getString(2));
				bag.setContent(table.getString(3));
				bag.setPrice(table.getInt(4));
				bag.setCompany(table.getString(5));
				bag.setImg(table.getString(6));
				
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