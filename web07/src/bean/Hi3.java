package bean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebServlet("/hi3")
public class Hi3 extends HttpServlet {
	// 서블릿이 언제 만들어지고 언제 사라지는지까지를 생명주기라고 부름
	
	public void init() throws ServletException {
		System.out.println("서블릿 탄생");
	}
	
	@Override
	public void destroy() {
		System.out.println("서블릿 파괴");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()메서드가 자동호출됨");
	}
	
}
