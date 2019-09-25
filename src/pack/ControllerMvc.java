package pack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/kbs")
public class ControllerMvc extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String str;
		try {
			str = request.getParameter("msg");
			
		} catch (Exception e) {
			str = "";
		}
//		System.out.println(str);
		
		String result, viewName;
		if (str == null || str.equals("")) {
			result = "환영합니다."; // Business Logic 수행 결과를 얻은 것을 가정
			viewName = "/WEB-INF/views/list1.jsp";
		} else if(str.equals("korea")) {
			result = "반갑습니다.";
			viewName = "/WEB-INF/views/list2.jsp";
		} else {
			result = "기타";
			viewName = "/WEB-INF/views/list3.jsp";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewName);
		request.setAttribute("result", result); // 여기서 발생한 값이 request로 넘어간다.
		dispatcher.forward(request, response); //dispatcher 찾아감. / service메서드의 parameter가 request, response이다. / java의 class는 웹 서비스하기 위해서는 forwarding 한다.
		
	}
}