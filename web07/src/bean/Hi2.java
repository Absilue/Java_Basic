package bean;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebServlet("/hi2")
public class Hi2 extends HttpServlet {
	// 서블릿이 언제 만들어지고 언제 사라지는지까지를 생명주기라고 부름
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("서블릿 탄생");
		String tel = config.getInitParameter("tel");
		String email = config.getInitParameter("email");
		// 관리자한테 문자보내는 처리 추가
		System.out.println("관리자 전화번호 : " + tel + "로 문자를 보냄");
		System.out.println("관리자 이메일 : " + email + "로 문자를 보냄");
	}
	
	@Override
	public void destroy() {
		System.out.println("서블릿 파괴");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()메서드가 자동호출됨");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()메서드가 자동호출됨");
	}
}
