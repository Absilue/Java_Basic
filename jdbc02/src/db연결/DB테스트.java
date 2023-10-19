package db연결;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB테스트 {
	public static void main(String[] args) {
		// Java-DB연결 (JDBC) ==> 4단계의 과정을 거침
		
		// 1. 연결할 부품 (커넥터, driver) 설정
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 커넥터 연결 성공");
			// 외부 자원연결(db, network, cpu, file)을 가져올때 오류가 발생할 수 있음
			// 이때 발생할 오류를 어떻게 대처할지를 반드시 작성해야함
	
		// forName(패키지.대표클래스)
		
		// 2. 1번 설정을 커넥터로 db 연결하고 승인
		// 	1) url - ip + port + db명
		//		2) id, pw
		String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
		String user = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. shop db연결 성공");
		
		// 3. 2번에서 연결된 것을 가지고 sql문 생성
		String sql = "insert into member values ('star','1234','star','011') ";
		String site = "http://www.naver.com";
		
		// 해당 부품으로 만들어줘야 함
		// sql ==> PreparedStatement
		// site ==> url
		PreparedStatement ps = con.prepareStatement(sql); //
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
}
