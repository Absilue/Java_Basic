package db연결;

public class 내용정리2 {
	// 1. 자바 프로그래밍에서 반드시 만들어주어야하는 클래스 2개
	// >> DAO, DTO(VO)
	
	// 2. DAO와 DTO(VO)의 역활은?
	// >> DAO(DB연결 처리, DML, CRUD), DTO(VO, bag역활)
	
	// 3. DB에서 하나의 행을 검색한 경우 자바의 어떤 클래스에 넣어주는가?
	// >> DTO(VO)
	
	// 4. DB에서 하나의 행을 검색한 후 자바의 특정한 클래스에 넣어주는 것을 무엇이라고 부르는가?
	// >> ORM
	
	// 5. 검색시 DB로부터 받은 것은?
	// >> Table
	
	// 6. 검색시 받은 테이블은 무엇과 무엇으로 구성되어 있는가?
	// >> 항목명 + 검색된 데이터(인스턴스)
	
	// 7. 검색결과가 없었을 때, DB로부터 받은 테이블에는 무엇이 들어있나?
	// >> 항목명
	
	// 8. table.next()는 어떤 처리를 해주는 함수인가?
	//     처리결과는 어떤 타입인가? 
	// >> 검색 결과가 있는지 체크 / boolean(true, false)
	
	// 9. JBDC 4단계는?
	// >> 드라이버 로딩 -> 연결(url, id, pw) -> sql객체 생성 -> sql객체 mysql로 전송
	
	// 10. SQL문 객체를 만들어주는 클래스는?
	// >> Connection
	
	// 11. SQL문 객체를 나타내는 클래스는?
	// >> PreparedStatement
	
	// 12. try ~ catch 구문을 쓰는 이유는?
	// >> 외부데이터 연결시 발생하는 오류에 대처하기 위해서
	// >> 오류 발생시 어떻게 대처할지 반드시 작성줘야 함
	
	// 13. integer.parseint("100")의 의미는?
	// >> String 타입인 "100"을 int 타입으로 변환
	
	// 14. 자바 프로그래밍을 3단계로 정리하시오
	// >> 화면 UI -> 처리하는 부분 -> Data 부분(DBMS)
	
	// 15. DB연결 자원해제 - RAM삭제
	// >> insert, delete, update => con.close();, ps.close();
	// >> select => con.close();, ps.close();, table.close();
	// >> try 구문 맨 끝에 넣어주면 됨
}
