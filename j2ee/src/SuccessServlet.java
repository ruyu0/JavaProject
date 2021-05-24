import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("初始化SuccessServlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().println("<div>调用doPost方法<div>");
		//已经知道请求方式是post了
		System.out.println(req.getRequestURL());
		System.out.println(req.getRequestURI());
		System.out.println(req.getRemoteUser());
		System.out.println(req.getRemoteHost());
		System.out.println(req.getQueryString());//post无法查看
		System.out.println(req.getLocalName());//不是LocalHost
		System.out.println(req.getLocalAddr());
		System.out.println(req.getMethod());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().println("<div>调用doGet方法<div>");
	}
}
