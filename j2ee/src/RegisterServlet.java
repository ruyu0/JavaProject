import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		//TODO:post����������Ч,get����������Ч
//		req.setCharacterEncoding("GBK");
		//TODO:���ֻ�ȡ��������
		System.out.println("username:" + req.getParameter("username"));
		System.out.println("password:" + req.getParameterValues("password")[0]);
		Map<String, String[]> parameters = req.getParameterMap();
		System.out.println("sex:" + parameters.get("sex")[0]);
		System.out.println("hobbies:");
		for (String e : parameters.get("hobbies")) {
			//TODO:����������
			byte[] bytes = e.getBytes("iso-8859-1");
			//��������ǵ�ַ��URL�Ĳ���������,��Ϊ��ַ����utf-8����
			e = new String(bytes, "GBK");
			System.out.println(e);
		}
		//TODO:��ȡͷ����Ϣ
		Enumeration<String> headersName = req.getHeaderNames();
		while (headersName.hasMoreElements()) {
			String headerName = headersName.nextElement();
			Enumeration<String> headerValues = req.getHeaders(headerName);
			while (headerValues.hasMoreElements()) {
				System.out.println(headerName + ": " + new String(headerValues.nextElement().getBytes("iso-8859-1"), "GBK"));
				
			}
		}
		//TODO:������Ӧ��ʽ
		resp.setContentType("text/html;charset=GBK");
//		//ʵ������
//		resp.setContentType("text/aaa;charset=GBK");
		//TODO����ȡ�������ݵĸ�ʽ
		String requestType = req.getHeader("accept");
		resp.getWriter().println("<div>" + requestType + "<div>");
	}
	
	
}
