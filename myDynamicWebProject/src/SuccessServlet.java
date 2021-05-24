import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("��ʼ��SuccessServlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().println("<div>����doPost����<div>");
		//�Ѿ�֪������ʽ��post��
		System.out.println(req.getRequestURL());
		System.out.println(req.getRequestURI());
		System.out.println(req.getRemoteUser());
		System.out.println(req.getRemoteHost());
		System.out.println(req.getQueryString());//post�޷��鿴
		System.out.println(req.getLocalName());//����LocalHost
		System.out.println(req.getLocalAddr());
		System.out.println(req.getMethod());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().println("<div>����doGet����<div>");
	}
}
