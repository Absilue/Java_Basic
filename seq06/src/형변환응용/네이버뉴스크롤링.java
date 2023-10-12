package 형변환응용;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버뉴스크롤링 {

	public static void main(String[] args) {
		Connection conn = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930"); //Connection
		System.out.println(conn);
		// 연결을 담당하는 객체
		try {
			Document doc = conn.get();
			// html 문서
			System.out.println(doc);
			Elements list = doc.select("span.code"); 
			// 조건에 맞는 태그들의 리스트를 객체 {태그, 태그, 태그, ...}
			// ArrayList --상속--> Elements
			// Elment == tag
			// Elments == tag 리스트 {태그, 태그, 태그, ...}
			
			//System.out.println(list.size());
			
			String code = list.get(0).text(); // 005930
			System.out.println("코드는 " + code);
			for (int i = 0; i < list.size(); i++) {
				// <span> 자동저장 끄기 <\span>
				System.out.println(list.get(i).text());
			}
			System.out.println("------------------------------");
			Elements list2 = doc.select("td.first span.blind"); 
			System.out.println(list2.size());
			// System.out.println(list2.get(0).text());
			System.out.println(list2.get(1).text());
			
			String yes = list2.get(0).text();
			String start = list2.get(1).text();
			System.out.println("전일가 >> " + yes);
			System.out.println("시작가 >> " + start);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		//연결한 사이트에서 코드를 다 가지고 온다. html문서에 대한 코드 Document
		//위험한 상황 - 외부자원 연결(cpu, file), network 
		//위험한 상황에 대해서는 상황이 발생했을 때 어떻게 처리할지를 반드시 명시해야한다. 
	}

}