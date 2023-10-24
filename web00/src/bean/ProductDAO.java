package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.MemberVO;

public class ProductDAO {
	public void insert(String id, String name, String content, int price, String company, String img) {
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
			System.out.println("2. product db연결 성공");

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

	public ProductVO one(int id) {
		ProductVO bag = new ProductVO();
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
			String sql = "select * from product where id = ?";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setInt(1, id); // 1번 ?에 id값을 넣어줘

			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			ResultSet table = ps.executeQuery();
			// table로부터 mysql로 데이터를 받아옴

			System.out.println("4. sql문 mySQL로 전송 성공");

			if (table.next()) {
				// table안에 검색결과인 row가 있는지 체크
				// 결과가 있으면 true / 없으면 false로 출력
				int id2 = table.getInt("id");
				String id3 = Integer.toString(id2);
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
				
				bag.setId(id3);
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
	
	public void update(ProductVO bag) {

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
			ps.execute();
			System.out.println("4. sql문 mySQL로 전송 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 발생");
		}
	}
}