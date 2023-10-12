package 형변환응용;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버크롤링 {

	public static void main(String[] args) {
		Connection conn = Jsoup.connect("http://www.naver.com"); //Connection
		System.out.println(conn);
		// 연결을 담당하는 객체
		try {
			Document doc = conn.get();
			// html 문서
			System.out.println(doc);
			Elements list = doc.select("span"); 
			//ArrayList --상속--> Elements
			System.out.println(list.size());
		} catch (IOException e) {
			e.printStackTrace();
		}
		//연결한 사이트에서 코드를 다 가지고 온다. html문서에 대한 코드 Document
		//위험한 상황 - 외부자원 연결(cpu, file), network 
		//위험한 상황에 대해서는 상황이 발생했을 때 어떻게 처리할지를 반드시 명시해야한다. 
	}

}